package com.conatuseus.blogcode.exception

class MemberDto(
    val id: Long,
    val loginId: String,
    val name: String
)

fun Member.toDto() = MemberDto(this.id, this.loginId, this.name)