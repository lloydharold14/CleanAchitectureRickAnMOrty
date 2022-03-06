package com.tkh.tech.cleanachitecturerickandmorty.presentation

sealed class Screen(val route: String) {
    object CoinListScreen: Screen("character_list_screen")
    object CoinDetailScreen: Screen("character_detail_screen")
}
