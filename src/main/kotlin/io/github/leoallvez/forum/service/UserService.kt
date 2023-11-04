package io.github.leoallvez.forum.service

import io.github.leoallvez.forum.model.User
import org.springframework.stereotype.Service

@Service
class UserService(private var users: List<User>) {

    init {
        users = listOf(
            User(id = 1, name = "Bete", email = "bete@gmail.com"),
            User(id = 2, name = "Maria", email = "maria@gmail.com"),
            User(id = 3, name = "Ana", email = "ana@gmail.com")
        )
    }

    fun findById(id: Long): User {
        return users.stream().filter { user -> user.id == id }.findFirst().get()
    }
}
