package com.conatuseus.blogcode.persistencecontext

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDate

@Service
class FriendService(
    private val friendRepository: FriendRepository
) {
    @Transactional
    fun create(name: String) =
        friendRepository.save(Friend(
            name = name
        ))

    @Transactional
    fun updateMarryStatus(id: Long): Friend {
        val foundFriend = friendRepository.findByIdAndMarriedAtIsNull(id)
            ?: throw RuntimeException("Friend not found: friendId=$id")

//        val foundFriend = friendRepository.findById(id).orElseThrow { RuntimeException("Friend not found: friendId=$id") }

        return foundFriend.also {
            it.apply {
                marriedAt = LocalDate.now()
            }
        }
    }

    @Transactional
    fun createAndUpdate(name: String): Friend {
        val createdFriend = create(name)

        return updateMarryStatus(
            id = createdFriend.id
        )
    }
}
