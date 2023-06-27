package com.trade.morbit.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.trade.morbit.navigation.Screen
import com.trade.morbit.util.Constants.GOOGLE_URL

@Composable
fun HomeScreen(navController: NavHostController) {

    navController.navigate(route = Screen.WebView.rout + "?url=${GOOGLE_URL}")

}
