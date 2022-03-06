package com.tkh.tech.cleanachitecturerickandmorty.presentation

import com.tkh.tech.cleanachitecturerickandmorty.domain.model.Characters

data class CharactersListState(
    val isLoading: Boolean = false,
    val charactersList: List<Characters> = emptyList(),
    val error: String = ""
)