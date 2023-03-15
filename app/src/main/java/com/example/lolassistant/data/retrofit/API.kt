package com.example.lolassistant.data.retrofit

import com.example.lolassistant.data.SummonerFromAPI
import retrofit2.http.GET
import retrofit2.http.Path

interface API  {
    @GET("https://ru.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key=")
    suspend fun getSummonerByName(@Path("summonerName") summonerName: String): SummonerFromAPI
}