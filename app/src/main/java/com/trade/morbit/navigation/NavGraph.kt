package com.trade.morbit.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.trade.morbit.ui.screens.HomeScreen
import com.trade.morbit.ui.screens.WebPageScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.rout

    ) {

        composable(route = Screen.Home.rout) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.WebView.rout + "?url={url}",
            arguments = listOf(navArgument("url") {
                type = NavType.StringType
                defaultValue = ""
                nullable = true
            })
        ){
            val url = it.arguments?.getString("url")
            url?.let {
                WebPageScreen(navController = navController, url = url)
            }
        }
    }
}
