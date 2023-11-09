package io.github.leoallvez.forum.service

import io.github.leoallvez.forum.dto.NewTopicForm
import io.github.leoallvez.forum.dto.TopicView
import io.github.leoallvez.forum.dto.UpdateTopicForm
import io.github.leoallvez.forum.mapper.TopicFormMapper
import io.github.leoallvez.forum.mapper.TopicViewMapper
import io.github.leoallvez.forum.model.Topic
import org.springframework.stereotype.Service

@Service
class TopicService(
    private var topics: List<Topic> = listOf(),
    private val topicViewMapper: TopicViewMapper,
    private val topicFormMapper: TopicFormMapper
) {

    fun list(): List<TopicView> {
        return topics.map { topic -> topicViewMapper.map(topic) }
    }

    fun findById(id: Long): TopicView {
        val topic = findTopicById(id)
        return topicViewMapper.map(topic)
    }

    fun create(form: NewTopicForm): TopicView {
        val topic = topicFormMapper.map(form)
        topic.id = topics.size.toLong() + 1
        topics = topics.plus(topic)
        return topicViewMapper.map(topic)
    }

    fun update(form: UpdateTopicForm): TopicView {
        val topicOld = findTopicById(form.id)
        val topicNew = topicOld.copy(title = form.title, message = form.message)
        topics = topics.minus(topicOld).plus(topicNew)
        return topicViewMapper.map(topicNew)
    }

    private fun findTopicById(id: Long): Topic {
        return topics.stream().filter { topic -> topic.id == id }.findFirst().get()
    }

    fun delete(id: Long) {
        val topic = findTopicById(id)
        topics = topics.minus(topic)
    }
}
