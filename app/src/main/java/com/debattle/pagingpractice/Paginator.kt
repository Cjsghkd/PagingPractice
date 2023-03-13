package com.debattle.pagingpractice

interface Paginator<Key, Item> {
    suspend fun loadNextItems()
    fun reset()
}