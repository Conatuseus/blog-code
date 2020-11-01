package com.conatuseus.blogcode.jpaentityconstructor

import org.springframework.data.repository.CrudRepository

interface ArticleRepository: CrudRepository<Article, Long> {

    fun findAllByIdAndContent(id:Long, content:String): List<Article>
}