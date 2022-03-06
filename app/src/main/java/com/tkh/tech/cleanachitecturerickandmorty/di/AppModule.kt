package com.tkh.tech.cleanachitecturerickandmorty.di

import com.tkh.tech.cleanachitecturerickandmorty.core.Constants
import com.tkh.tech.cleanachitecturerickandmorty.data.RickAndMortyApi
import com.tkh.tech.cleanachitecturerickandmorty.data.repository.RickAndMortyRepositoryImpl
import com.tkh.tech.cleanachitecturerickandmorty.domain.repository.RickAndMortyRepository
import com.tkh.tech.cleanachitecturerickandmorty.domain.use_case.CharactersUseCases
import com.tkh.tech.cleanachitecturerickandmorty.domain.use_case.GetAllCharacters
import com.tkh.tech.cleanachitecturerickandmorty.domain.use_case.GetCharacterDetails
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApi(): RickAndMortyApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RickAndMortyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(api: RickAndMortyApi): RickAndMortyRepository {
        return RickAndMortyRepositoryImpl(
            api = api
        )
    }

    @Provides
    @Singleton
    fun provideCharactersUseCases(repository: RickAndMortyRepository): CharactersUseCases {
        return CharactersUseCases(
            getAllCharacters = GetAllCharacters(repository),
            getCharacterDetails = GetCharacterDetails(repository)
        )
    }
}