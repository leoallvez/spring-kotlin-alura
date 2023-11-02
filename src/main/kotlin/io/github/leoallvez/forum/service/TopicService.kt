package io.github.leoallvez.forum.service

import io.github.leoallvez.forum.model.Course
import io.github.leoallvez.forum.model.Topic
import io.github.leoallvez.forum.model.User
import org.springframework.stereotype.Service

@Service
class TopicService {

    fun list(): List<Topic> {
        val topic = Topic(
            id = 1,
            title = "Kotlin doubts",
            message = "Kotlin Variables",
            course = Course(
                id = 1,
                name = "Kotlin",
                category = "Programming"
            ),
            author = User(
                id = 1,
                name = "Leo",
                email = "leoallvez@gmail.com"
            )
        )
        return listOf(topic, topic, topic, topic)
    }

}