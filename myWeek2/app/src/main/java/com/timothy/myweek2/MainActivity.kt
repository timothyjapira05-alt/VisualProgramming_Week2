package com.timothy.myweek2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale
@Composable
fun soal1TugasView(
    modifier: Modifier = Modifier.fillMaxSize()
){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0xFFFF69B4))
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .padding(20.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("v", fontWeight = FontWeight.Bold, fontSize = 24.sp)
            Text("Liked Songs", fontWeight = FontWeight.Bold, fontSize = 24.sp)
            Text("...", fontWeight = FontWeight.Bold, fontSize = 24.sp)

        }
        Row(
            modifier = Modifier
                .padding(horizontal = 30.dp)
                .padding(bottom = 20.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.screenshot_2026_09_24_202254),
                "foto",
                modifier = Modifier.size(300.dp),

            )
        }
        Column(modifier = Modifier.weight(1f)) {
            Row() {
                Text(
                    "Hooligan",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                )
            }
            Row() {
                Text(
                    "BTS", fontWeight = FontWeight.Bold, fontSize = 15.sp,
                )
            }
        }
        Column(
            modifier = Modifier.weight(1f), horizontalAlignment = Alignment.End
        ) {
            Text(
                "❤️", color = Color.White
            )
        }
    }
    Row(modifier = Modifier.padding(horizontal = 20.dp)) {
        Text(
            "-------------------------------------------------------------------------------------",
            color = Color.White
        )

    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun soal1TugasPreview(){
    soal1TugasView()
}
