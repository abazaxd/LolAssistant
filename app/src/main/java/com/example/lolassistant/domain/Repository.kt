package com.example.lolassistant.domain

interface Repository {

    fun getGamesList(): List<Match>

    fun getMatchByMatchId(matchId: Int): Match

    fun getSummonerByName(summonerName: String): Summoner
}