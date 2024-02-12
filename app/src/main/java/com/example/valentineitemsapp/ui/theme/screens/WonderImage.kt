package com.example.valentineitemsapp.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.valentineitemsapp.R

/**
 * Wonder Image Page composable
 */
@Composable
fun WonderImagePage(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row (
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ){
            WonderPageButtons(active = false, buttonText = R.string.publish)
            WonderPageButtons(active = true, buttonText = R.string.share)
        }
    }
}
/**
 * WonderImagePage --Image
 */

/**
 *Wonder Image Page Name Artwork
 */

/**
 * Wonder Image Page Switch_Button
 */

/**
 *Wonder Image Page Publish and Share buttons
 */
@Composable
fun WonderPageButtons(
    active: Boolean,
    buttonText: Int,
    modifier: Modifier = Modifier){
    OutlinedButton(onClick = { /*TODO*/ },
        colors = if (active){
            ButtonDefaults.buttonColors(
                containerColor = Color.Yellow,
                contentColor = Color.Black
            )
        }else{
            ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            )
        }
        ) {
        Text(text = stringResource(buttonText))
    }
}
/**
 * Wonder Image Page preview
 */
@Preview(showBackground = true)
@Composable
fun WonderImagePagePreview(){
    WonderImagePage()
}
/**
 * Wonder Image page buttons Preview
 */
@Preview(showBackground = true)
@Composable
fun WonderImageButtonsPreview(){
    //WonderPageButtons()
}