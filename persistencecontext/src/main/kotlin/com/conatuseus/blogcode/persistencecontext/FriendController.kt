package com.conatuseus.blogcode.persistencecontext

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/friends")
class FriendController(
    private val friendService: FriendService
) {
    @PostMapping("/test")
    fun test(@RequestBody request: TestRequest): TestResponse {
        val createdAndUpdatedFriend = friendService.createAndUpdate(
            name = request.name
        )

        return TestResponse(
            friend = createdAndUpdatedFriend
        )
    }

    data class TestRequest(
        val name: String
    )

    data class TestResponse(
        val friend: Friend
    )
}