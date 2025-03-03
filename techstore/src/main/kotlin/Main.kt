package org.virtualstore

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.virtualstore.models.products.Product
import org.virtualstore.services.ProductService
import java.util.Scanner

fun main() {
    val context = AnnotationConfigApplicationContext(AppConfig::class.java)
    val productService = context.getBean(ProductService::class.java)
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Bem vindo a TechStore")
        println("Clique 1 - Para Ver todos os produtos")
        println("Clique 2 - Para Cadastrar novo produto")
        println("Clique 3 - Para Atualizar produto")
        println("Clique 4 - Para Vender um produto")
        println("Clique 5 - Para Apagar produto")
        println("Clique 6 - Para Sair")

        when (scanner.nextLine().toInt()) {
            1 -> {
                val products = productService.getAllProducts()
                products.forEach { println(it) }
            }
            2 -> {
                println("Digite o nome do produto:")
                val name = scanner.nextLine()
                println("Digite a quantidade do produto:")
                val quantity = scanner.nextLine().toInt()
                println("Digite o preço do produto:")
                val price = scanner.nextLine().toDouble()
                val product = Product(name = name, price = price, quantity = quantity)
                productService.createProduct(product)
                println("Produto cadastrado com sucesso!")
            }
            3 -> {
                println("Digite o nome do produto a ser atualizado:")
                val name = scanner.nextLine()
                println("Digite a quantidade do produto:")
                val quantity = scanner.nextLine().toInt()
                println("Digite o novo preço do produto:")
                val price = scanner.nextLine().toDouble()
                val updatedProduct = Product(name = name, price = price, quantity = quantity)
                productService.updateProduct(name, updatedProduct)
                println("Produto atualizado com sucesso!")
            }
            4 -> {
                println("Digite o nome do produto que foi vendido:")
                val name = scanner.nextLine()
                println("Digite quantos produtos foram vendidos:")
                val sells = scanner.nextLine().toInt()
                productService.sellProduct(name, sells)
                println("Produto vendido com sucesso!")
            }
            5 -> {
                println("Digite o nome do produto a ser apagado:")
                val name = scanner.nextLine()
                if (productService.deleteProduct(name)) {
                    println("Produto apagado com sucesso!")
                } else {
                    println("Produto não encontrado!")
                }
            }
            6 -> {
                println("Saindo...")
                break
            }
            else -> println("Opção inválida, tente novamente.")
        }
    }
    context.close()
}