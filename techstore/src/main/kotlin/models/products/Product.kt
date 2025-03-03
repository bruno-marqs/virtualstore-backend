package org.virtualstore.models.products

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document

data class Product(
    @Id
    val id: String? = null,
    val name: String,
    val price: Double,
    val quantity: Int,
) {
    init {
        require(name.isNotBlank()) { "Nome do produto não pode ser vazio" }
        require(price > 0.0) { "Preço deve ser maior que zero" }
        require(quantity >= 0) { "Quantidade do produto não pode ser negativa" }
    }
}
