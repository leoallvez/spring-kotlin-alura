package io.github.leoallvez.forum.mapper

import io.github.leoallvez.forum.dto.NewTopicForm
import io.github.leoallvez.forum.model.Topic
import io.github.leoallvez.forum.service.CourseService
import io.github.leoallvez.forum.service.UserService
import org.springframework.stereotype.Component

@Component
class TopicFormMapper(
    private val courseService: CourseService,
    private val userService: UserService,
) : Mapper<NewTopicForm, Topic> {

    override fun map(t: NewTopicForm): Topic {
        return Topic(
            title = t.title,
            message = t.message,
            course = courseService.findById(t.courseId),
            author = userService.findById(t.authorId)
        )
    }

}
