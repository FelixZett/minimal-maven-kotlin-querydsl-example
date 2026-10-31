package com.felixzett.mmkqe.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class TestEntity (
    val name: String,
    val exampleValue: Double
) {
        @Id @GeneratedValue
        val id: Int? = null
}
