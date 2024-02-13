package com.example.valentineitemsapp.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.valentineitemsapp.R
/**
 * Enum class with its enum constants defining routes
 */
enum class ValentineScreen{
    ValentineApp,
    WonderImage,
    Home,
}
/**
 * Valentine App
 */
@Composable
fun ValentineApp() {
    Scaffold (
        topBar = { ValentineTopAppBar() },
        bottomBar = { ValentineBottomAppBar() },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Favorite, contentDescription = null)
            }
        }
    ){it
        HomeScreen()
        NavHost(
            navController = navController,
            startDestination = ValentineScreen.Home.name,
            modifier = Modifier.padding(it)
        ){
            composable(route = ValentineScreen.Home.name){
                ValentineApp()
            }
            composable(route = ValentineScreen.WonderImage.name){
                WonderImagePage()
            }
            composable(route = ValentineScreen.ValentineApp.name){
                ValentineApp()
            }
        }
    }
}
/**
 * Valentine Top App and Bottom App Bar
 */
@Composable
fun ValentineTopAppBar() {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier  = Modifier
            .fillMaxWidth()
            .background(color = Color.DarkGray)
            .padding(dimensionResource(id = R.dimen.padding_medium))
    ){
        IconButton(
            onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
        }
        Text(
            text = stringResource(id =R.string.Love),
            fontWeight = FontWeight.ExtraBold,
            style = MaterialTheme.typography.displaySmall
        )
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.Settings, contentDescription = null)
        }
    }
}
@Composable
fun ValentineBottomAppBar() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.LightGray),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.Email, contentDescription = null)
        }
        IconButton(onClick = { /*TODO*/ }) {
           Icon(imageVector =  Icons.Default.AddCircle, contentDescription = null)
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.Call, contentDescription = null)
        }
    }
}
/**
 * Valentine App preview
 */
@Preview(showBackground = true)
@Composable
fun ValentineAppPreview(modifier: Modifier = Modifier){
    ValentineApp()
}
/**
 * Valentine top app bar preview
 */
@Preview(showBackground = true)
@Composable
fun ValentineTopAppBarPreview(){
    ValentineTopAppBar()
}

/**
 * Valentine bottom app preview
 */
@Preview(showBackground = true)
@Composable
fun ValentineBottomAppPreview(){
    ValentineBottomAppBar()
}