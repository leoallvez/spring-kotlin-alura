package io.github.leoallvez.forum.mapper

import io.github.leoallvez.forum.dto.TopicView
import io.github.leoallvez.forum.model.Topic
import org.springframework.stereotype.Component


@Component
class TopicViewMapper : Mapper<Topic, TopicView> {
    override fun map(t: Topic): TopicView {
        return TopicView(
            id = t.id,
            title = t.title,
            message = t.message,
            status = t.status,
            creationDate = t.creationDate
        )
    }
}
