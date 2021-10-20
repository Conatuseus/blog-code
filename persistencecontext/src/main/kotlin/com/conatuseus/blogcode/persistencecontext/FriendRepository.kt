package com.conatuseus.blogcode.persistencecontext

import org.springframework.data.jpa.repository.JpaRepository

interface FriendRepository: JpaRepository<Friend, Long> {
    fun findByIdAndMarriedAtIsNull(id: Long): Friend?
}