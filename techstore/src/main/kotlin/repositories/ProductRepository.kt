package org.virtualstore.repositories


import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import org.virtualstore.models.products.Product

@Repository
interface ProductRepository : MongoRepository<Product, String> {
    fun findByName(name: String): Product?
}
