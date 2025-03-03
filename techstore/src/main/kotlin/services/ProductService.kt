package org.virtualstore.services

import org.springframework.stereotype.Service
import org.virtualstore.models.products.Product
import org.virtualstore.repositories.ProductRepository
import java.util.Optional

@Service
class ProductService(
    private val productRepository: ProductRepository
) {
    fun createProduct(product: Product){
        productRepository.save(product)
    }

    fun getAllProducts(): List<Product>{
        return productRepository.findAll()
    }

    fun getProductByName(name: String): Product?{
        return productRepository.findByName(name)
    }

    fun getProductIdByName(name: String): String? {
        val product = productRepository.findByName(name)
        return product?.id
    }

    fun getProductById(id: String): Optional<Product>{
        return productRepository.findById(id)
    }

    fun updateProduct(name: String, updatedProduct: Product) {
        try {
            val product = productRepository.findByName(name)
            if(product!=null){
                val productToUpdate = updatedProduct.copy(id=product.id)
                productRepository.save(productToUpdate)
            }
        }catch (e: Exception){
            println("Produto não encontrado")
        }
    }

    fun sellProduct(name:String, numberOfSells: Int){
        try {
            val product = productRepository.findByName(name)
            if(product!=null){
                if (product.quantity >= numberOfSells) {
                    val updatedQuantity = product.quantity - numberOfSells
                    val productToUpdate = product.copy(quantity = updatedQuantity)
                    productRepository.save(productToUpdate)
                    println("Produto vendido com sucesso!")
                } else {
                    println("Quantidade insuficiente em estoque.")
                }
            } else {
                println("Produto não encontrado.")
            }
        }catch (e: Exception){
            println("Produto não encontrado")
        }
    }

    fun deleteProduct(name: String): Boolean {
        try {
            val product = productRepository.findByName(name)
            if (product==null){
                println("Produto não encontrado")
                return false
            }
            val productId = product.id ?: return false
            productRepository.deleteById(productId)
            return true
        } catch (e:Exception){
            println("Erro ao deletar")
            return false
        }
    }
}