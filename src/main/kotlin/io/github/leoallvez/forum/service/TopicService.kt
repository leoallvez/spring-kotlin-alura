package io.github.leoallvez.forum.service

import io.github.leoallvez.forum.model.Course
import io.github.leoallvez.forum.model.Topic
import io.github.leoallvez.forum.model.User
import org.springframework.stereotype.Service

@Service
class TopicService(private var topics: List<Topic>) {

    init {
        val course = Course(
            id = 1,
            name = "Kotlin",
            category = "Programming"
        )
        val user = User(
            id = 1,
            name = "Leo",
            email = "leoallvez@gmail.com"
        )
        val topic1 = Topic(
            id = 1,
            title = "Kotlin doubts 1",
            message = "Kotlin Variables 1",
            course = course,
            author = user
        )
        val topic2 = Topic(
            id = 2,
            title = "Kotlin doubts 2",
            message = "Kotlin Variables 2",
            course = course,
            author = user
        )
        val topic3 = Topic(
            id = 3,
            title = "Kotlin doubts 3",
            message = "Kotlin Variables 3",
            course = course,
            author = user
        )
        topics = listOf(topic1, topic2, topic3)
    }

    fun list(): List<Topic> {
        return topics
    }

    fun findById(id: Long): Topic {
        return topics.stream().filter { t -> t.id == id }.findFirst().get()
    }

}
