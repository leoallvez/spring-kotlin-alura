package io.github.leoallvez.forum.controller

import io.github.leoallvez.forum.model.Topic
import io.github.leoallvez.forum.service.TopicService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topics")
class TopicController(private val service: TopicService) {

    @GetMapping
    fun list(): List<Topic> {
        return service.list()
    }
}
