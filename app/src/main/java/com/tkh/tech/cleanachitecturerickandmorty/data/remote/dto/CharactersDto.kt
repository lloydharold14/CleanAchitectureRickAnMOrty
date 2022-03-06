package com.tkh.tech.cleanachitecturerickandmorty.data.remote.dto

import com.tkh.tech.cleanachitecturerickandmorty.domain.model.Characters

data class CharactersDto(
    val id: Int? = null,
    val name: String,
    val species: String,
    val image: String
)

fun CharactersDto.toCharacters(): Characters {
    return Characters(
        id = id,
        name = name,
        species = species,
        image = image
    )
}
