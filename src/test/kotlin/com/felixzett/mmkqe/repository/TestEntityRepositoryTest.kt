package com.felixzett.mmkqe.repository

import com.felixzett.mmkqe.entity.TestEntity
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TestEntityRepositoryTest {
    @Autowired
    private lateinit var testEntityRepository: TestEntityRepository

    @BeforeEach
    fun setup() {
        testEntityRepository.save(TestEntity("test", 8.0))
    }

    @Test
    fun test() {
        val testEntities = testEntityRepository.findAll()
        assertEquals(1, testEntities.count())
    }
}
