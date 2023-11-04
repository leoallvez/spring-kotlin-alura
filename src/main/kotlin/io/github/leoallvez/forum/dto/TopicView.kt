package io.github.leoallvez.forum.dto

import io.github.leoallvez.forum.model.TopicStatus
import java.time.LocalDateTime

data class TopicView(
    val id: Long? = null,
    val title: String,
    val message: String,
    val status: TopicStatus,
    val creationDate: LocalDateTime
)
