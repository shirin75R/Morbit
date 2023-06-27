package com.trade.morbit.navigation

sealed class Screen (val rout:String) {
    object Home : Screen("home_screen")
    object WebView : Screen("webView_screen")

}

