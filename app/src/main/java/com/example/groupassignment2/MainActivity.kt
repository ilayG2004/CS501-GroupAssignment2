package com.example.groupassignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.groupassignment2.ui.theme.GroupAssignment2Theme
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GroupAssignment2Theme {
                DemoScreen()
            }
        }
    }
}


@Composable
fun CustomText(s: String){
    Text(text=s)
}


@Composable
fun DemoScreen(){
    val textPossibilties = arrayOf("Awesome HW2 Group App", "Text just got switched!")
    var changing_text by remember{ mutableStateOf (textPossibilties[0])}
    var checked by remember{mutableStateOf(false)}
    Column() {
        CustomText(changing_text)
        Switch(
            checked = checked,
            onCheckedChange = {
                checked = it
                if (checked){
                    changing_text = textPossibilties[1]
                } else {
                    changing_text = textPossibilties[0]
                }
            }
        )
    }
}

@Preview
@Composable
fun CustomTextPreview(){
    CustomText("Awesome HW2 Group App")
}