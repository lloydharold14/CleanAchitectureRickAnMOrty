package com.tkh.tech.cleanachitecturerickandmorty.data.remote.dto

data class RickAndMortyDto(
    val info: Info,
    val results: List<CharactersDto>
)