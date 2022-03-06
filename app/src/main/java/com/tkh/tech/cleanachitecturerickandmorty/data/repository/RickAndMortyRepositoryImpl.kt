package com.tkh.tech.cleanachitecturerickandmorty.data.repository

import com.tkh.tech.cleanachitecturerickandmorty.data.RickAndMortyApi
import com.tkh.tech.cleanachitecturerickandmorty.data.remote.dto.*
import com.tkh.tech.cleanachitecturerickandmorty.domain.model.CharacterDetails
import com.tkh.tech.cleanachitecturerickandmorty.domain.model.Characters
import com.tkh.tech.cleanachitecturerickandmorty.domain.repository.RickAndMortyRepository

class RickAndMortyRepositoryImpl(
    private val api: RickAndMortyApi
) : RickAndMortyRepository {
    override suspend fun getAllCharacters(): Result<List<Characters>> {
        return try {
            val characterDto = api.getCharacters()
            Result.success(
                characterDto.results.map { it.toCharacters() }
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Result.failure(e)
        }

    }

    override suspend fun getCharacter(id: Int): Result<CharacterDetails> {
        return try {
            val characterDto = api.getCharacterDetails(id)

            Result.success(
                characterDto.toCharacterDetails()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Result.failure(e)
        }

    }
}