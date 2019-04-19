package com.felixzett.mmkqe.repository

import com.felixzett.mmkqe.entity.TestEntity
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class TestEntityRepositoryTest {
    @Autowired
    private lateinit var testEntityRepository: TestEntityRepository

    @Before
    fun setup() {
        testEntityRepository.save(TestEntity("test", 8.0))
    }

    @Test
    fun test() {
        val testEntities = testEntityRepository.findAll()
        assertEquals(1, testEntities.count())
    }
}
