package com.example.humancomputerinteraction

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SignIn(
    navController: NavController
) {
    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Box(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxSize()){
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Box(modifier = Modifier.size(height = 300.dp, width = 400.dp).background(color = Color.White)) {}
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Substitute for logo, can be changed later on",
                    modifier = Modifier.size(256.dp), alignment = Alignment.Center
                )
            }
            Spacer(modifier = Modifier.padding(horizontal = 0.dp, vertical = 48.dp))
            TextField(
                value = userName,
                onValueChange = { newText -> userName = newText },
                placeholder = {Text("Username", color = Color.Black, fontSize = 16.sp)},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Email"
                    )
                },
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent),
                modifier = Modifier.fillMaxWidth(0.8f).align(Alignment.CenterHorizontally)
            )
            //Alam ko na unprofessional ito pero anyways, ginawa ko ito para sa outline sa baba
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Box(
                    modifier = Modifier
                        .size(width = 315.dp,height = 5.dp)
                        .border(width = 10.dp, color = Color.Black, shape = RectangleShape)
                )
            }
            Spacer(modifier = Modifier.padding(vertical = 16.dp))
            TextField(
                value = password,
                onValueChange = { newText -> password = newText },
                placeholder = { Text("Password", color = Color.Black, fontSize = 16.sp) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Password"
                    )
                },
                //Disable this so that the textfield can be seen or not be transparent
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent),
                modifier = Modifier.fillMaxWidth(0.8f).align(Alignment.CenterHorizontally)
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth(1f)
            ){
                Box(
                    modifier = Modifier
                        .size(width = 315.dp,height = 5.dp)
                        .border(width = 10.dp, color = Color.Black, shape = RectangleShape)
                )
            }
            Spacer(modifier = Modifier.padding(horizontal = 0.dp, vertical =  8.dp))
            Row(modifier = Modifier.fillMaxWidth(0.92f), horizontalArrangement = Arrangement.End) {
                TextButton(onClick = {navController.navigate("Home")}) {
                    Text("Login", color = Color.Black, fontSize = 16.sp)
                }
            }
            Row(modifier =  Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                TextButton(onClick =  {}) {
                    Text("Forgot Password?", color = Color.Black, fontSize = 16.sp)
                }
                Text("|", fontSize = 32.sp, modifier = Modifier)
                TextButton(onClick = {navController.navigate("SignIn")}) {
                    Text("Sign-up", color = Color.Black, fontSize = 16.sp)
                }
            }
        }
    }
}


@Composable
@Preview
fun SignInPreview(){
}