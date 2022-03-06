package com.tkh.tech.cleanachitecturerickandmorty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tkh.tech.cleanachitecturerickandmorty.ui.theme.CleanAchitectureRickAnMOrtyTheme
import com.tkh.tech.cleanachitecturerickandmorty.presentation.CharacterdetailsScreen
import com.tkh.tech.cleanachitecturerickandmorty.presentation.CharactersScreen
import com.tkh.tech.cleanachitecturerickandmorty.presentation.Screen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanAchitectureRickAnMOrtyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.CoinListScreen.route
                    ) {
                        composable(
                            route = Screen.CoinListScreen.route
                        ) {
                            CharactersScreen(navController)
                        }
                        composable(
                            route = Screen.CoinDetailScreen.route + "/{characterId}"
                        ) {
                            CharacterdetailsScreen()
                        }
                    }
                }
            }
        }
    }
}

