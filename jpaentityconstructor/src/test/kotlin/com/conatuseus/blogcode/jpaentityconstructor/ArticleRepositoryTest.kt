package com.conatuseus.blogcode.jpaentityconstructor

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ArticleRepositoryTest(
    @Autowired val articleRepository: ArticleRepository
) {


    @Test
    fun `lazy loading test`() {

        val article = articleRepository.findById(1L)
            .orElseThrow()


    }
}