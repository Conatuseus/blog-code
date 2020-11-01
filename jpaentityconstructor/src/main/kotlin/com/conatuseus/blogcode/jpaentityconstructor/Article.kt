package com.conatuseus.blogcode.jpaentityconstructor

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class Article(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column
    val title: String,

    @Column
    val content: String,

    @OneToMany(mappedBy = "article")
    val contributors: List<Contributor> = arrayListOf()
)