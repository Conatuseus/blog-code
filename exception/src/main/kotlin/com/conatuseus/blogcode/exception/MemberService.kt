package com.conatuseus.blogcode.exception

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {

    @Transactional
    fun save(loginId: String, name: String): Member{
        val savedMember = memberRepository.save(
            Member(
                loginId = loginId,
                name = name
            )
        )

        val file = File("test.txt")
        val fileWriter = FileWriter(file)
        val bufferedWriter = BufferedWriter(fileWriter)
        bufferedWriter.write(getContents(loginId, name))

        bufferedWriter.close()
        fileWriter.close()
        return savedMember
    }

    private fun getContents(loginId: String, name: String) =
        "로그인 id: $loginId\n, 이름: $name"
}