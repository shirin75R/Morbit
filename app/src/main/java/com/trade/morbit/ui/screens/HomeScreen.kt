package com.trade.morbit.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.trade.morbit.R
import com.trade.morbit.navigation.Screen
import com.trade.morbit.ui.component.IconBox
import com.trade.morbit.util.Constants.GOOGLE_URL

@Composable
fun HomeScreen(navController: NavHostController) {

    IconBox(
        image = painterResource(id = R.drawable.store),
        title = stringResource(id = R.string.google_icon_name),
        onClick = onBoxClick(
            navController = navController,
            url = GOOGLE_URL
        )
    )
}


@Composable
fun onBoxClick(navController: NavController, url: String): () -> Unit =
    { navController.navigate(route = Screen.WebView.rout + "?url=${url}") }
