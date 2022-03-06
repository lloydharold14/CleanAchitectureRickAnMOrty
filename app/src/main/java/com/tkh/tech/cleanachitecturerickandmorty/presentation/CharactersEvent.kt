package com.tkh.tech.cleanachitecturerickandmorty.presentation

sealed class CharactersEvent {
    object OnCharacterClicked : CharactersEvent()
    object OnBackArrowPressed : CharactersEvent()
}
