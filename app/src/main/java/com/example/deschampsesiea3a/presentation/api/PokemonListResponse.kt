package com.example.deschampsesiea3a.presentation.api

import com.example.deschampsesiea3a.presentation.list.Pokemon

data class PokemonListResponse(
    val count: Int,
    val next: String,
    val results: List<Pokemon>
)