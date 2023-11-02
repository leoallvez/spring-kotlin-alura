package io.github.leoallvez.forum.model

data class User(
    val id: Long? = null,
    val name: String,
    val email: String,
    val password: String
)
