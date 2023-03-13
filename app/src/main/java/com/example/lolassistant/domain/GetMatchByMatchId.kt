package com.example.lolassistant.domain

class GetMatchByMatchId(private val repository: Repository) {

    fun getMatchByMatchId(matchId: Int): Match{
        return repository.getMatchByMatchId(matchId)
    }
}