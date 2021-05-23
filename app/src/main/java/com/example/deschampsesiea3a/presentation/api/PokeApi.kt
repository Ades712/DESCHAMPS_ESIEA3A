package com.example.deschampsesiea3a.presentation.api


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {
    @GET("pokemon")
    fun getPokemonList(@Query("limit")limit : String): Call<PokemonListResponse>

    @GET("pokemon/{id}")
    fun getPokemonDetail(@Path ("id" )id : String) : Call<PokemonDetailResponse>
}
