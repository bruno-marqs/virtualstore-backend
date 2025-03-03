package org.virtualstore

import com.mongodb.client.MongoClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@ComponentScan(basePackages = ["org.virtualstore"])
@EnableMongoRepositories(basePackages = ["org.virtualstore.repositories"])
class AppConfig{
    @Bean
    fun mongoTemplate(): MongoTemplate {
        val mongoClient = MongoClients.create("mongodb://localhost:27017/techstore")
        return MongoTemplate(mongoClient, "techstore")
    }
}