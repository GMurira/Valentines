package com.example.valentineitemsapp.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.valentineitemsapp.R

/**
 * Example page Three is for demonstration of navigation in compose
 */
@Composable
fun ExamplePageThree(
    onPreviousButtonClicked: () -> Unit,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize())
    {
        Text(text = stringResource(id = R.string.page3))
        Column {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = onPreviousButtonClicked
            ) {
                Text(text = stringResource(id = R.string.previous))
            }
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = onCancelButtonClicked
            ) {
                Text(text = stringResource(id = R.string.cancel))
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun ExamplePageThreePreview(){
    ExamplePageThree(onPreviousButtonClicked = {}, onCancelButtonClicked =  {})
}