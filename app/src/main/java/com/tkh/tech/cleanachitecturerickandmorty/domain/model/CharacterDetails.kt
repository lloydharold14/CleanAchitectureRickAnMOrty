package com.tkh.tech.cleanachitecturerickandmorty.domain.model

import com.tkh.tech.cleanachitecturerickandmorty.data.remote.dto.Location
import com.tkh.tech.cleanachitecturerickandmorty.data.remote.dto.Origin

data class CharacterDetails(
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
