package com.felixzett.mmkqe.repository

import com.felixzett.mmkqe.entity.TestEntity
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.CrudRepository

interface TestEntityRepository:
        CrudRepository<TestEntity, Int>,
        QuerydslPredicateExecutor<TestEntity>
