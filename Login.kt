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
fun Login(
    navController: NavController
){
    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }
    var confirmPassword by remember { mutableStateOf("") }
    var emailAddress by remember { mutableStateOf("") }
    var isChecked by remember { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)) {
        Column(
            modifier = Modifier
                .background(color = Color(0xFFE0E0E0), shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                .fillMaxWidth()
                .fillMaxHeight(0.75f)
                .padding(24.dp, 24.dp)
        ) {
            Text("Create Your Account", fontSize = 24.sp, fontWeight = FontWeight(1000), color = Color.Black)
            Spacer(modifier = Modifier.padding(horizontal = 0.dp, vertical = 8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Or Continue With", fontWeight = FontWeight(800), color = Color.Black)
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "Google",
                    modifier = Modifier
                        .size(40.dp)
                        .clickable {}
                        .padding(horizontal = 0.dp, vertical = 8.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "Facebook",
                    modifier = Modifier
                        .size(40.dp)
                        .clickable {}
                        .padding(horizontal = 0.dp, vertical = 8.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.github),
                    contentDescription = "Github",
                    modifier = Modifier
                        .size(40.dp)
                        .clickable {}
                        .padding(horizontal = 0.dp, vertical = 8.dp)
                )
            }
            Spacer(modifier = Modifier.padding(horizontal = 0.dp, vertical = 16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    contentAlignment = Alignment.CenterEnd,
                    modifier = Modifier
                        .weight(weight = 0.4f)
                ) {
                    Box(
                        modifier = Modifier
                            .size(width = 160.dp, height = 4.dp)
                            .border(width = 10.dp, color = Color.Black, shape = RectangleShape)
                    )
                }
                Text("OR", modifier = Modifier.weight(weight = 0.2f), textAlign = TextAlign.Center, color = Color.Black)
                Box(
                    contentAlignment = Alignment.CenterStart,
                    modifier = Modifier
                        .weight(weight = 0.4f)
                ) {
                    Box(
                        modifier = Modifier
                            .size(width = 160.dp, height = 4.dp)
                            .border(width = 10.dp, color = Color.Black, shape = RectangleShape)
                    )
                }
            }
            Spacer(modifier = Modifier.padding(horizontal = 0.dp, vertical = 8.dp))
            TextField(
                value = userName,
                onValueChange = { newText -> userName = newText },
                placeholder = { Text("Name", color = Color.Black, fontSize = 16.sp) },
                singleLine = true,
                //Disable this so that the textfield can be seen or not be transparent
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 0.dp, height = 2.dp)
                        .border(width = 2.dp, color = Color.Black, shape = RectangleShape)
                )
            }
            Spacer(modifier = Modifier.padding(horizontal = 0.dp, vertical = 8.dp))
            TextField(
                value = emailAddress,
                onValueChange = { newText -> emailAddress = newText },
                placeholder = { Text("Email Address", color = Color.Black, fontSize = 16.sp) },
                singleLine = true,
                //Disable this so that the textfield can be seen or not be transparent
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth(1f)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 0.dp, height = 2.dp)
                        .border(width = 10.dp, color = Color.Black, shape = RectangleShape)
                )
            }
            Spacer(modifier = Modifier.padding(horizontal = 0.dp, vertical = 8.dp))
            TextField(
                value = password,
                onValueChange = { newText -> password = newText },
                placeholder = { Text("Password", color = Color.Black, fontSize = 16.sp) },
                singleLine = true,
                //Disable this so that the textfield can be seen or not be transparent
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth(1f)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 0.dp, height = 2.dp)
                        .border(width = 10.dp, color = Color.Black, shape = RectangleShape)
                )
            }
            Spacer(modifier = Modifier.padding(horizontal = 0.dp, vertical = 8.dp))
            TextField(
                value = confirmPassword,
                onValueChange = { newText -> confirmPassword = newText },
                placeholder = {
                    Text(
                        "Confirm Password",
                        color = Color.Black,
                        fontSize = 16.sp
                    )
                },
                trailingIcon = {
                    val image = if (showPassword)
                        painterResource(R.drawable.dontsee)
                    else
                        painterResource(R.drawable.see)

                    val description = if (showPassword) "Hide password" else "Show password"

                    IconButton(onClick = { showPassword = !showPassword }) {
                        Image(painter = image, contentDescription = description)
                    }
                },
                singleLine = true,
                //Disable this so that the textfield can be seen or not be transparent
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth(1f)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 0.dp, height = 2.dp)
                        .border(width = 10.dp, color = Color.Black, shape = RectangleShape)
                )
            }
            Spacer(modifier = Modifier.padding(horizontal = 0.dp, vertical = 8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = isChecked,
                    onCheckedChange = { isChecked = it }
                )
                Text(
                    "I agree to the Terms & Conditions", color = Color.Black
                )
            }
            Box(contentAlignment = Alignment.Center, modifier =  Modifier.fillMaxWidth()){
                Box(
                    modifier = Modifier
                        .offset(4.dp, 4.dp) // <- shadow layer offset
                        .background(Color(0xFF000000), RoundedCornerShape(8.dp)) // <- translucent black shadow
                        .size(width = 100.dp, height = 48.dp)
                )
                Button(
                    onClick = {navController.navigate("Home")},
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF2052A9),
                    ),
                    //modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Text("Sign Up", color = Color.Black)
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text("Already have an account?", color = Color.Black)
                TextButton(
                    onClick = { /* Handle click */ },
                    enabled = true,
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.defaultMinSize(minWidth = 0.dp, minHeight = 0.dp)
                ) {
                    Text("LOGIN", color = Color(0xFF57BD6A))
                }
            }
        }
    }
}

@Preview
@Composable
fun LoginPreview(){
}