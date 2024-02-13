package com.practice.simplemvvm.data.repository

import com.practice.simplemvvm.data.mapper.toUser
import com.practice.simplemvvm.data.remote.Api
import com.practice.simplemvvm.domain.model.User
import com.practice.simplemvvm.domain.repository.Repository

class RepositoryImpl(
    val api: Api
): Repository {
    override suspend fun getData(): List<User> {
        return api.getData().map { it.toUser() }
    }
}