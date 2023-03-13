package com.example.lolassistant.domain

class GetSummonerByName(private val repository: Repository) {

    fun getSummonerByName(summonerName: String): Summoner{
        return repository.getSummonerByName(summonerName)
    }
}