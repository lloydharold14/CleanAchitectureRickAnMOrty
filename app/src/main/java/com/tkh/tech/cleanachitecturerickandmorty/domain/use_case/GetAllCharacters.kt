package com.tkh.tech.cleanachitecturerickandmorty.domain.use_case

import com.tkh.tech.cleanachitecturerickandmorty.domain.model.Characters
import com.tkh.tech.cleanachitecturerickandmorty.domain.repository.RickAndMortyRepository

class GetAllCharacters(
    private val repository: RickAndMortyRepository
) {

    suspend operator fun invoke(): Result<List<Characters>> {

        return repository.getAllCharacters()
    }

}