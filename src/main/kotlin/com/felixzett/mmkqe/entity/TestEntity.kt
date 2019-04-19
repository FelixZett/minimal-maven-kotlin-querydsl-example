package com.felixzett.mmkqe.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class TestEntity (
        val name: String,
        val value: Double
) {
        @Id @GeneratedValue
        val id: Int? = null
}
