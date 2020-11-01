package com.conatuseus.blogcode.jpaentityconstructor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
class JpaentityconstructorApplication

fun main(args: Array<String>) {
    runApplication<JpaentityconstructorApplication>(*args)
}
