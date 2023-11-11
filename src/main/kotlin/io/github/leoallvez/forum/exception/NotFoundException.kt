package io.github.leoallvez.forum.exception

class NotFoundException(
    message: String? = "Topic not found"
) : RuntimeException(message)
