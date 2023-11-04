package io.github.leoallvez.forum.dto

data class NewTopicForm(
    val title: String,
    val message: String,
    val courseId: Long,
    val authorId: Long
)
