package com.trade.morbit

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.trade.morbit.navigation.Screen
import com.trade.morbit.navigation.SetupNavGraph
import com.trade.morbit.ui.screens.HomeScreen
import com.trade.morbit.ui.screens.WebPageScreen
import com.trade.morbit.ui.theme.MorbitTheme
import com.trade.morbit.util.Constants
import com.trade.morbit.util.Constants.GOOGLE_URL

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController


    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MorbitTheme {
                    navController = rememberNavController()

                    Scaffold() {
                        // SetupNavGraph(navController = navController)
                        WebPageScreen(navController, GOOGLE_URL)
                    }

            }
        }
    }
}


