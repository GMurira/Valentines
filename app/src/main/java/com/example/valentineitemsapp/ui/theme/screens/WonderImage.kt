package com.example.valentineitemsapp.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
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
            .background(MaterialTheme.colorScheme.errorContainer)
    ) {
        WonderImage(R.drawable.bereczki_domokos_jsczq2cpnvi_unsplash)
        WonderDescription(descriptionBody = R.string.publish, descriptionText = R.string.Love)
        Spacer(modifier = Modifier.weight(6f))
        WonderImageAndSwitch(switchText = R.string.price)
        Spacer(modifier = Modifier.weight(1f))
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
@Composable
fun WonderImage(
    imgSrc: Int
){
    Box(
        modifier = Modifier
            .padding(
                start = dimensionResource(id = R.dimen.padding_small),
                end = dimensionResource(id = R.dimen.padding_small),
                top = dimensionResource(id = R.dimen.padding_small),
            )
            .clip(MaterialTheme.shapes.extraLarge)
    ) {
        Image(
            painter = painterResource(imgSrc),
            contentDescription = null)
    }
}
/**
 *Wonder Image Page Name Artwork
 */
@Composable
fun WonderDescription(
    descriptionBody: Int,
    descriptionText: Int,
    modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.padding_medium))
            .fillMaxWidth()
    ){
        Text(
            text = stringResource(descriptionText),
            fontWeight = FontWeight.ExtraBold,
            style = MaterialTheme.typography.displaySmall
        )
        Text(
            text = stringResource(descriptionBody),
            fontFamily = FontFamily.SansSerif
        )
    }
}
/**
 * Wonder Image Page Switch_Button
 */
@Composable
fun WonderImageAndSwitch(
    switchText: Int
){
    var checked by remember {
        mutableStateOf(true)
    }
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .background(MaterialTheme.colorScheme.onSurface)
            .padding(
                start = dimensionResource(id = R.dimen.padding_small),
                end = dimensionResource(id = R.dimen.padding_small)
            )
            .clip(MaterialTheme.shapes.extraLarge)
            .fillMaxWidth()
    ){
        Text(
            text = stringResource(switchText),
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.displaySmall,
            color = Color.White
        )
        Spacer(modifier = Modifier.weight(1f))
        Switch(
            checked = checked,
            onCheckedChange = {
                checked = it
            })
    }
}
/**
 *Wonder Image Page Publish and Share buttons
 */
@Composable
fun WonderPageButtons(
    active: Boolean,
    buttonText: Int
){
    OutlinedButton(
        modifier = Modifier
            .padding(
                start = dimensionResource(id = R.dimen.padding_medium),
                top = dimensionResource(id = R.dimen.padding_medium),
                end = dimensionResource(id = R.dimen.padding_medium),
                bottom = dimensionResource(id = R.dimen.padding_medium)
            ),
        onClick = { /*TODO*/ },
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
 WonderPageButtons(active = true, buttonText = R.string.share)
 WonderPageButtons(active = false, buttonText = R.string.publish)
}