package com.tkh.tech.cleanachitecturerickandmorty.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tkh.tech.cleanachitecturerickandmorty.domain.use_case.CharactersUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val charactersUseCases: CharactersUseCases
) : ViewModel() {

    var state by mutableStateOf(CharactersListState())
        private set


    init {
        getCharacters()
    }

    fun OnEvent(event: CharactersEvent) {

        when (event) {
            is CharactersEvent.OnCharacterClicked -> {

            }
        }
    }


    private fun getCharacters() {

        viewModelScope.launch {
            charactersUseCases.getAllCharacters().onSuccess { characters ->
                state = state.copy(
                    charactersList = characters,
                    isLoading = false,
                    error = ""
                )

            }
                .onFailure {
                    state = state.copy(
                        isLoading = false,
                        charactersList = emptyList(),
                        error = "An unexpected error occured"
                    )
                }
        }


    }

}