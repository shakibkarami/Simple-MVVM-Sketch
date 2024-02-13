package com.practice.simplemvvm.data.mapper

import com.practice.simplemvvm.data.remote.UserDto
import com.practice.simplemvvm.domain.model.User

fun UserDto.toUser(): User{
    return User(
        name = name ?: "Not Available"
    )
}