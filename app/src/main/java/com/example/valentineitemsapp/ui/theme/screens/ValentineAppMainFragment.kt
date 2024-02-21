package com.example.valentineitemsapp.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.valentineitemsapp.R

/**
 * Enum class with its enum constants defining routes
 */
enum class ValentineScreen{
    ValentineApp,
    WonderImage,
    Home,
    ExamplePage2,
    ExamplePage3,
    ExamplePage1
}
/**
 * Valentine App
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ValentineApp() {

    Scaffold (
        topBar = {
                 Column {
                     ValentineTopAppBar()
                 }
        },
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
            composable(route = ValentineScreen.ExamplePage1.name){
                ExamplePageOne(
                    modifier = Modifier.fillMaxSize(),
                    onNextButtonClicked = {
                        navController.navigate(ValentineScreen.ExamplePage2.name)
                    }
                )
            }
            composable(route = ValentineScreen.ExamplePage2.name){
                ExamplePageTwo(
                    modifier = Modifier.fillMaxSize()

                )
            }
            composable(route = ValentineScreen.ExamplePage3.name){
                ExamplePageThree(
                    modifier = Modifier.fillMaxSize()


                )
            }
            composable(route = ValentineScreen.Home.name){
                ValentineApp()
            }
        }
    }
}

/**
 * Valentine Embedded search bar
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmbeddedSearch(modifier: Modifier = Modifier){
    var searchText by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false)}
    androidx.compose.material3.SearchBar(
        query = searchText,
        onQueryChange = {
            searchText = it
        },
        onSearch = {
            active = false
        },
        active =  active,
        onActiveChange = {
            active = true
        },
        placeholder = {
            Text(text = stringResource(id = R.string.search_Bar_text))
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        },
        trailingIcon = {
            Icon(imageVector = Icons.Default.Clear, contentDescription = null)
        }
    ){

    }
}
/**
 * Surface behind the serach bar
 */
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//private fun TopAppBarSurface(
//    modifier: Modifier = Modifier,
//    colors: TopAppBarColors = TopAppBarDefaults.topAppBarColors(),
//    scrollBehavior: TopAppBarScrollBehavior? = null,
//    content: @Composable () -> Unit
//    ){
//    val colorTransitionFraction = scrollBehavior?.state?.overlappedFraction ?: 0f
//    val fraction = if (colorTransitionFraction > 0.01f) 1f else 0f
//    val appBarContainerColor by animateColorAsState(
//        targetValue = lerp(
//            colors.containerColor,
//            colors.scrolledContainerColor,
//            FastOutLinearInEasing.transform(fraction),
//        ),
//        animationSpec = spring(stiffness = Spring.StiffnessMediumLow),
//        label = "TopBarSurfaceContainerColorAnimation",
//    )
//    Surface(
//        modifier = Modifier.fillMaxWidth(),
//        color = appBarContainerColor,
//        content = content
//    )
//}
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
 * Valentine search app bar
 */
@Preview(showBackground = true)
@Composable
fun EmbeddedSearchBarPreview(){
    EmbeddedSearch()
}
/**
 * Valentine App preview
 */
@Preview(showBackground = true)
@Composable
fun ValentineAppPreview(modifier: Modifier = Modifier){
    //ValentineApp()
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