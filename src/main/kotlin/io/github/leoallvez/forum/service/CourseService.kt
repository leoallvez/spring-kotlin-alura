package io.github.leoallvez.forum.service

import io.github.leoallvez.forum.model.Course
import org.springframework.stereotype.Service

@Service
class CourseService(private var courses: List<Course> = listOf()) {

    init {
        courses = listOf(
            Course(id = 1, name = "Kotlin", category = "Back-end"),
            Course(id = 2, name = "Java", category = "Back-end"),
            Course(id = 3, name = "HTML e CSS", category = "Front-end")
        )
    }

    fun findById(id: Long): Course {
        return courses.stream().filter { course -> course.id == id }.findFirst().get()
    }
}
