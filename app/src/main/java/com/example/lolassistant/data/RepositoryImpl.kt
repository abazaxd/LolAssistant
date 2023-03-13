package com.example.lolassistant.data

import com.example.lolassistant.domain.Match
import com.example.lolassistant.domain.Repository
import com.example.lolassistant.domain.Summoner

object RepositoryImpl: Repository {
    override fun getGamesList(): List<Match> {
        TODO("Not yet implemented")
    }

    override fun getMatchByMatchId(matchId: Int): Match {
        TODO("Not yet implemented")
    }

    override fun getSummonerByName(summonerName: String): Summoner {
        TODO("Not yet implemented")
    }
}