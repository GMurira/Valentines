package com.example.valentineitemsapp.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CardColors
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.valentineitemsapp.R
import com.example.valentineitemsapp.data.CardItems
import com.example.valentineitemsapp.data.cardItems


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
        HomeScreenCards()

    }
}
/**
 * Valentine HomeScreen Cards
 */
@Composable
fun HomeScreenCards(modifier: Modifier = Modifier){
    LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 128.dp)){
        items(cardItems){
            ValentineCards(cardItem = it, onClick = { /*TODO*/ })
        }
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
 * @param cardItems contains the data that populates the card.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ValentineCards(
    cardItem: CardItems,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
        OutlinedCard(

            colors = CardDefaults.cardColors(containerColor = Color.LightGray),
            modifier = Modifier
                .padding(dimensionResource(id = R.dimen.padding_small))
                .width(160.dp)
        ) {
            CardImage(cardImg = cardItem.cardImg)
            CardContentNameAndDescription(
                description = cardItem.price
            )
            CardPricingAndRatings(
                price = cardItem.price, ratings = cardItem.rating
            )

        }
}
/**
 * Card content Image
 */
@Composable
fun CardImage(
    cardImg: Int,
    modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.padding_small))
    ) {
        Image(

            modifier = Modifier
                .size(dimensionResource(id = R.dimen.image_size))
                .clip(MaterialTheme.shapes.large),
            painter = painterResource(cardImg),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
    }
}
/**
 * Card content Name and description
 */
@Composable
fun CardContentNameAndDescription(
    description: Int,
    modifier: Modifier = Modifier
){
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.padding_small))
    ){
        Text(text = stringResource(description) )
    }
}
/**
 * Card's pricing and rating
 */
@Composable
fun CardPricingAndRatings(
    price: Int,
    ratings: Int,
    modifier: Modifier = Modifier){
    Row (
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
    ){
        Text(text = stringResource(price))
        Spacer(modifier = Modifier.weight(0.2f))
        Text(text = stringResource(ratings))
    }
}
/**
 * Valentine Card Preview
 */
@Preview
@Composable
fun ValentneCardPreview(){
    ValentineCards(cardItem =     CardItems(R.string.rating, R.drawable.bereczki_domokos_jsczq2cpnvi_unsplash, R.string.price, R.string.rating),
         onClick = { /*TODO*/ })
}
/**
 * Valentine preview
 */
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}