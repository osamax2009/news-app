package com.example.loginapp.Presentation.onBording.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginapp.R
import com.example.loginapp.ui.theme.textColorPrimary

@Composable
fun NormalText(value: String){

    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
            fontSize = 24.sp ,
            fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        color =  com.example.loginapp.ui.theme.textColorPrimary,
        textAlign = TextAlign.Center
    )
}

@Composable
fun HeadingTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ), color = colorResource(id = R.color.textColorPrimary),
        textAlign = TextAlign.Center
    )
}


//@Composable
//fun MyTextField(labelValue : String ){
//    val textValue = remember {
//        mutableStateOf("")
//    }
//
//    OutlinedTextField(
//        label = { Text(text = labelValue) },
//        value = textValue,
//        colors = TextFieldDefaults.outlinedTextFieldColors(
//            focusedBorderColor = textColorPrimary,
//            focusedLabelColor = textColorPrimary,
//            cursorColor = textColorPrimary
//        ),
//        keyboardOptions = KeyboardOptions(),
//        value = textValue.value,
//        onValueChange ={
//            textValue.value = it
//        }
//    )
//}
