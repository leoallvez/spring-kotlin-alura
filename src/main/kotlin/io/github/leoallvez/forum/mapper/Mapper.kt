package io.github.leoallvez.forum.mapper

interface Mapper<T, U> {
    fun map(t: T): U
}
