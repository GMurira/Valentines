package com.example.valentineitemsapp.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.valentineitemsapp.R


/**
 * A simple page to show navigation in compose
 */
@Composable
fun ExamplePageOne(
    onNextButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        Row {
            Text(text = stringResource(id = R.string.page1))
            Button(onClick = { /*TODO*/ }) {
                Text(text = stringResource(id = R.string.previous))
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun ExamplePageOnePreview(){
    ExamplePageOne(onNextButtonClicked = {})
}