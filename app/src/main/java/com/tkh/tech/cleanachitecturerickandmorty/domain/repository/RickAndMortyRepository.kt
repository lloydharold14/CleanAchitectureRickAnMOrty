package com.tkh.tech.cleanachitecturerickandmorty.domain.repository


import com.tkh.tech.cleanachitecturerickandmorty.domain.model.CharacterDetails
import com.tkh.tech.cleanachitecturerickandmorty.domain.model.Characters

interface RickAndMortyRepository {

    suspend fun getAllCharacters(): Result<List<Characters>>

    suspend fun getCharacter(id: Int): Result<CharacterDetails>
}