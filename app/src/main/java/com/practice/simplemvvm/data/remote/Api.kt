package com.practice.simplemvvm.data.remote

interface Api {
    fun getData(): List<UserDto>
}