package com.example.valentineitemsapp.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.valentineitemsapp.R


/**
 * Example page two for demonstartion purposes only
 */
@Composable
fun ExamplePageTwo(modifier: Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = stringResource(id = R.string.page2))
    }
}
@Preview(showBackground = true)
@Composable
fun ExamplePageTwoPreview(){
    ExamplePageTwo()
}