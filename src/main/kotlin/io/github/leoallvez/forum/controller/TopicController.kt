package io.github.leoallvez.forum.controller

import io.github.leoallvez.forum.dto.NewTopicForm
import io.github.leoallvez.forum.dto.TopicView
import io.github.leoallvez.forum.dto.UpdateTopicForm
import io.github.leoallvez.forum.service.TopicService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topics")
class TopicController(private val service: TopicService) {

    @GetMapping
    fun list(): List<TopicView> {
        return service.list()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): TopicView {
        return service.findById(id)
    }

    @PostMapping
    fun create(@RequestBody @Valid form: NewTopicForm): TopicView {
        return service.create(form)
    }

    @PutMapping
    fun update(@RequestBody @Valid form: UpdateTopicForm): TopicView {
        return service.update(form)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        return service.delete(id)
    }
}
