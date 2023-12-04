package com.example.loginapp.Presentation.screens.onBording

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalProvider
import com.example.loginapp.Presentation.onBording.components.OnBoardingPage
import com.example.loginapp.models.pages

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen(){
    Column(modifier = Modifier.fillMaxSize()) {
        val pagerState = rememberPagerState(initialPage = 2)
       val  buttonState = remember {
           derivedStateOf {
               when (pagerState.currentPage){
                   0 -> listOf("","Next")
                   1-> listOf("back","Next")
                   2 -> listOf("back","Get Started")
                   else -> listOf("","")
               }
           }
       }
        HorizontalPager(state = pagerState , pageCount = pages.size) {
                index -> OnBoardingPage(page = pages[index] )
            }
    }
}