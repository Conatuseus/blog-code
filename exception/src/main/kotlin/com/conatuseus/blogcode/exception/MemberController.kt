package com.conatuseus.blogcode.exception

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberController(
    private val memberService: MemberService
) {

    @PostMapping
    fun create(@RequestBody request: MemberCreateRequest): MemberResponse {
        val createdMember = memberService.save(
            loginId = request.loginId,
            name = request.name
        )

        return MemberResponse(
            member = createdMember.toDto()
        )
    }

    data class MemberCreateRequest(
        val loginId: String,
        val name: String
    )

    data class MemberResponse(
        val member: MemberDto
    )
}