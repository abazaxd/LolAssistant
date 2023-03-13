package com.example.lolassistant.domain

class GetGamesList(private val repository: Repository) {

    fun getGamesList(): List<Match>{
        return  repository.getGamesList()
    }
}