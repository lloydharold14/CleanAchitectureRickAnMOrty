package com.tkh.tech.cleanachitecturerickandmorty.domain.use_case

import com.tkh.tech.cleanachitecturerickandmorty.domain.model.CharacterDetails
import com.tkh.tech.cleanachitecturerickandmorty.domain.repository.RickAndMortyRepository


class GetCharacterDetails(
    private val repository: RickAndMortyRepository
) {
    suspend operator fun invoke(characterId: Int): Result<CharacterDetails> {

        return repository.getCharacter(characterId)
    }
}