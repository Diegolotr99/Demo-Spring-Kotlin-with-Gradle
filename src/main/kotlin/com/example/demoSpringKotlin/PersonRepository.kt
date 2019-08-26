package com.example.demoSpringKotlin

import org.springframework.data.repository.CrudRepository

interface PersonRepository : CrudRepository<Person, Long>