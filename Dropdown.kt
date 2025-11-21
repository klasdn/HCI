package com.example.humancomputerinteraction

import android.widget.Button
import android.widget.ImageButton
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Dropdown(
    //navController: NavController
){
    //Remove this box-wrapper, this is just for visual display of the white background modifier
    Box(modifier = Modifier.background(color = Color.White).fillMaxSize()){
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.8f)
            .background(color = Color(0xFF18325F), shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
            .border(
                width = 3.dp, color = Color(0xFF18325F), shape = RoundedCornerShape(
                    bottomEnd = 20.dp,
                    bottomStart = 20.dp
                )
            )
        ) {
            Image(
                painter = painterResource(R.drawable.white_logo),
                contentDescription = "white_logo",
                modifier = Modifier.align(Alignment.CenterHorizontally).height(150.dp)
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 0.dp,height = 2.dp)
                        .border(width = 10.dp, color = Color.White, shape = RectangleShape)
                )
            }
            Column(modifier = Modifier.fillMaxWidth()
                .fillMaxHeight()
                ) {
                Row(modifier = Modifier.weight(1f).padding(start = 40.dp, top = 16.dp, bottom = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.upload_videos),
                        contentDescription = "upload_videos",
                        modifier = Modifier.size(40.dp)
                    )
                    TextButton(onClick = {}
                        //onNavigate()
                    ) {
                        Text("Upload Video", color = Color.White)
                    }
                }
                Row(modifier = Modifier.weight(1f).padding(horizontal = 40.dp, vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.my_videos),
                        contentDescription = "my_videos",
                        modifier = Modifier.size(40.dp)
                    )
                    TextButton(onClick = {/*navController.navigate("MyVideosScreen")*/}) {
                        Text("My Videos", color = Color.White)
                    }
                }
                Row(modifier = Modifier.weight(1f).padding(horizontal = 40.dp, vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.preview_and_export),
                        contentDescription = "preview_and_export",
                        modifier = Modifier.size(40.dp)
                    )
                    TextButton(onClick = {/*navController.navigate("PreviewVideos")*/}) {
                        Text("Preview & Export", color = Color.White)
                    }
                }
                Row(modifier = Modifier.weight(1f).padding(horizontal = 40.dp, vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.export_and_tutorial),
                        contentDescription = "Help & Tutorial",
                        modifier = Modifier.size(40.dp)
                    )
                    TextButton(onClick = {}) {
                        Text("Help & Tutorial", color = Color.White)
                    }
                }
                Row(modifier = Modifier.weight(1f).padding(horizontal = 40.dp, vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.about_us),
                        contentDescription = "about_us",
                        modifier = Modifier.size(40.dp)
                    )
                    TextButton(onClick = {}) {
                        Text("About Us", color = Color.White)
                    }
                }
                Row(modifier = Modifier.weight(1f).padding(horizontal = 40.dp, vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.feedback_or_support),
                        contentDescription = "feedback_or_support",
                        modifier = Modifier.size(40.dp)
                    )
                    TextButton(onClick = {}) {
                        Text("Feedback / Support", color = Color.White)
                    }
                }
                Row(modifier = Modifier.weight(1f).padding(horizontal = 40.dp, vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.settings),
                        contentDescription = "settings",
                        modifier = Modifier.size(40.dp)
                    )
                    TextButton(onClick = {}) {
                        Text("Account Settings", color = Color.White)
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun DropdownPreview(){
    Dropdown()
}