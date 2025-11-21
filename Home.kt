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
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Home(
    navController: NavController
){
    var textWidth by remember { mutableStateOf(0) }
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(color = Color.White)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(
                color = Color(0xFF18325F),
                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)
            )
            .border(
                color = Color(0xFF18325F),
                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp),
                width = 0.dp
            )) {
            Spacer(modifier = Modifier.padding(8.dp))
            IconButton(onClick = {navController.navigate("Dropdown")}
                ) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "",
                    tint = Color.White,
                    modifier = Modifier
                        .size(100.dp)

                )
            }
            Spacer(modifier = Modifier.weight(0.60f))
            Image(
                painter = painterResource(R.drawable.white_logo),
                contentDescription = "white_logo",
                modifier = Modifier
                    .width(125.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
        }
        Text(
            "Welcome To InSync!",
            fontSize = 32.sp,
            fontWeight = FontWeight(1000),
            modifier = Modifier.padding(0.dp, 16.dp).onGloballyPositioned { coordinates ->
                textWidth = coordinates.size.width
            }
        )
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(with(LocalDensity.current) {textWidth.toDp()}, 100.dp)
                .background(color = Color(0xFF18325F), shape = RoundedCornerShape(20.dp))
                .border(width = 0.dp, color = Color(0xFF18325F), shape = RoundedCornerShape(20.dp))
                .weight(1f)
        ){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = {}, modifier = Modifier.fillMaxWidth().size(80.dp)) {
                    Image(painter = painterResource(R.drawable.upload_videos), contentDescription = "upload videos")
                }
                Spacer(modifier = Modifier.padding(0.dp, 8.dp))
                Text("Upload Videos", color = Color.White, fontWeight = FontWeight(1000), fontSize = 24.sp)
            }
        }
        Spacer(modifier = Modifier.padding(0.dp, 16.dp))
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(with(LocalDensity.current) {textWidth.toDp()}, 100.dp)
                .background(color = Color(0xFF18325F), shape = RoundedCornerShape(20.dp))
                .border(width = 0.dp, color = Color(0xFF18325F), shape = RoundedCornerShape(20.dp))
                .weight(1f)
        ){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = {}, modifier = Modifier.fillMaxWidth().size(80.dp)) {
                    Image(painter = painterResource(R.drawable.my_videos), contentDescription = "")
                }
                Spacer(modifier = Modifier.padding(0.dp, 8.dp))
                Text("My Videos", color = Color.White, fontWeight = FontWeight(1000), fontSize = 24.sp)
            }
        }
        Spacer(modifier = Modifier.padding(0.dp, 16.dp))
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(with(LocalDensity.current) {textWidth.toDp()}, 100.dp)
                .background(color = Color(0xFF18325F), shape = RoundedCornerShape(20.dp))
                .border(width = 0.dp, color = Color(0xFF18325F), shape = RoundedCornerShape(20.dp))
                .weight(1f)
        ){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = {}, modifier = Modifier.fillMaxWidth().size(80.dp)) {
                    Image(
                        painter = painterResource(R.drawable.export_and_tutorial),
                        contentDescription = "export_and_tutorial",
                        modifier = Modifier.size(200.dp)
                    )
                }
                Spacer(modifier = Modifier.padding(0.dp, 8.dp))
                Text("Help & Tutorial", color = Color.White, fontWeight = FontWeight(1000), fontSize = 24.sp)
            }
        }
        Spacer(modifier = Modifier.weight(0.6f))
    }
}

@Preview
@Composable
fun HomePreview(){
}