package com.example.deschampsesiea3a.presentation.api

import com.example.deschampsesiea3a.presentation.list.Pokemon

data class PokemonResponse(
    val count: Int,
    val next: String,
    val results: List<Pokemon>
)