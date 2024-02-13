package com.practice.simplemvvm.domain.repository

import com.practice.simplemvvm.domain.model.User

interface Repository {
    suspend fun getData(): List<User>
}