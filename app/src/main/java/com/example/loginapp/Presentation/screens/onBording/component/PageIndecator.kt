package com.example.loginapp.Presentation.screens.onBording.component

import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.example.loginapp.models.pages
import com.example.loginapp.ui.theme.Pink80
import com.example.loginapp.util.Dimension.IndicatorSize
import kotlin.text.Typography.times


@Composable
fun PageIndicator(
    modifier: Modifier = Modifier,
    pageSize : Int,
    selectedPage :Int,
    selectedColor:Color  =  MaterialTheme.colorScheme.primary,
    unselectedColor: Color = Pink80
) {
    Row(modifier =modifier, horizontalArrangement = Arrangement.SpaceBetween){
        repeat(times = pageSize){
            page -> Box(
                modifier = Modifier
                .size(IndicatorSize)
                    .clip(CircleShape)
                    .background(color = if (page == selectedPage)
                        selectedColor else unselectedColor)
            )
        }
    }

}
