package com.tkh.tech.cleanachitecturerickandmorty.data.remote.dto

import com.tkh.tech.cleanachitecturerickandmorty.domain.model.CharacterDetails

data class CharacterDetailsDto(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int? = null,
    val image: String,
    val location: Location,
    val name: String,
    val origin: Origin,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)

fun CharacterDetailsDto.toCharacterDetails(): CharacterDetails{
    return CharacterDetails(
        created = created,
        episode = episode,
        gender = gender,
        image = image,
        location = location,
        name = name,
        origin = origin,
        species = species,
        status = status,
        type = type,
        url = url
    )
}