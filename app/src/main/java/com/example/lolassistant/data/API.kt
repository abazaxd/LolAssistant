package com.example.lolassistant.data

import retrofit2.Call
import retrofit2.http.GET

interface API  {

    @GET("https://ru.api.riotgames.com/lol/summoner/v4/summoners/by-name/AYAYO?api_key=RGAPI-fb56ad62-aa7c-415b-9cad-9b61ed2de413")
    suspend fun getSummonerByName(): SummonerFromAPI
}