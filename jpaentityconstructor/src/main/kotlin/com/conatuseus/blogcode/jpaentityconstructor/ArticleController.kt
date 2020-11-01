package com.conatuseus.blogcode.jpaentityconstructor

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class ArticleController(
    private val articleRepository: ArticleRepository
) {

    @PostMapping("/article")
    fun writeArticle(@RequestBody request: ArticleRequest): ResponseEntity<ArticleResponse> {
        val savedArticle = articleRepository.save(
            Article(
                title = request.title,
                content = request.content
            )
        )


        return ResponseEntity.ok(
            ArticleResponse(
                id = savedArticle.id ?: 0,
                title = savedArticle.title,
                content = savedArticle.content
            )
        )
    }
}