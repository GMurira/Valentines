package com.example.valentineitemsapp.ui.theme.screens

import android.media.Rating
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.valentineitemsapp.R


/**
 * Valentine Home Screen
 */
@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(id = R.dimen.padding_medium)),
        horizontalAlignment = Alignment.Start,
    ){
        Text(
            text = stringResource(id = R.string.top_Text)
        )
        Text(
            text = stringResource(id = R.string.top_Text2)
        )
    }
}

/**
 * Search bar
 */
@Composable
fun SearchBar(){

}
/**
 * Cards composable
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ValentineCards(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedCard(
            modifier = Modifier
                .padding(dimensionResource(id = R.dimen.padding_small)),
            colors = CardDefaults.cardColors(
                containerColor = Color.Cyan
            ),
            onClick = onClick
        ) {
            Image(
                painter = painterResource(R.drawable.flavien_7z0voadmu7c_unsplash),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(dimensionResource(id = R.dimen.padding_small))
                    .size(dimensionResource(id = R.dimen.image_size))
                    .clip(MaterialTheme.shapes.medium)

            )
            Text(
                text = stringResource(id = R.string.app_name,
                )
            )
            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement =Arrangement.SpaceEvenly,
                modifier = Modifier
                    .padding(dimensionResource(id = R.dimen.padding_small))

            ){
                Text(
                    text = stringResource(id = R.string.price),
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White
                    )
                Spacer(modifier = Modifier)
                Text(
                    text = stringResource(id = R.string.rating),
                    color = Color.White
                )
            }
        }
    }
}
/**
 * Valentine Card Preview
 */
@Preview
@Composable
fun ValentneCardPreview(){
    ValentineCards(onClick = { /*TODO*/ })
}
/**
 * Valentine preview
 */
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}