package com.felixzett.mmkqe.service

import com.felixzett.mmkqe.entity.QTestEntity
import com.felixzett.mmkqe.entity.TestEntity
import com.felixzett.mmkqe.repository.TestEntityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TestEntityService @Autowired constructor(
        private val testEntityRepository: TestEntityRepository
){

    fun getTestEntityByName(name: String): TestEntity? {
        return testEntityRepository.findOne(
                QTestEntity.testEntity.name.eq(name)
        ).get()
    }
}
