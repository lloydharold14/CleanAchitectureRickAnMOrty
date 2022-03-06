package com.tkh.tech.cleanachitecturerickandmorty.data

import com.tkh.tech.cleanachitecturerickandmorty.data.remote.dto.CharacterDetailsDto
import com.tkh.tech.cleanachitecturerickandmorty.data.remote.dto.RickAndMortyDto
import retrofit2.http.GET
import retrofit2.http.Path

interface RickAndMortyApi {

    @GET("character")
    suspend fun getCharacters(): RickAndMortyDto

    @GET("character/{characterId}")
    suspend fun getCharacterDetails(@Path("characterId") id: Int): CharacterDetailsDto
}