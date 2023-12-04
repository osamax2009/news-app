package com.example.loginapp.Presentation.onBording.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import com.example.loginapp.models.Page
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.loginapp.util.Dimension.MediumPadding1
import com.example.loginapp.util.Dimension.MediumPadding2
import com.example.loginapp.R
import com.example.loginapp.ui.theme.LoginappTheme


@Composable
fun OnBoardingPage(
    // using default modifier
    modifier: Modifier = Modifier,
        page : Page
) {

    //painterResource  It takes an id parameter, which specifies the resource ID of the image you want to load.
    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.6F),
            painter = painterResource(id = page.img), contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(MediumPadding1))
        Text(
            modifier = modifier.padding(horizontal = MediumPadding2),
            text = page.title,
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold)

        )
        Text(
            modifier = modifier.padding(horizontal = MediumPadding2),
            text = page.description,
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium)
        )

    }
}
@Preview(showBackground = true)
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun  OnBoardingPagePreview(){
    LoginappTheme {
        OnBoardingPage(
            page = Page(
                title = "Lorem Ipsum is simply dummy",
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                img = R.drawable.onboarding1
            )
        )
    }
}