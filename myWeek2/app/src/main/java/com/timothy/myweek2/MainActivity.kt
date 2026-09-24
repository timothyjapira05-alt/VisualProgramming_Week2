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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
@Composable
fun soal1TugasView(
    modifier: Modifier = Modifier.fillMaxSize()
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0xFFFF69B4))
    ) {
        Row(
            modifier = Modifier
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
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column {
                Text(
                    "Hooligan",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )

                Text(
                    "BTS",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
            }

            Text(
                "❤️",
                fontSize = 25.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 15.dp)
        ) {
            Text(
                "-------------------------------------------------------------------------------------"
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("0:12")
            Text("-2:12")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "<|",
                fontSize = 25.sp
            )

            Text(
                "(||)",
                fontSize = 35.sp,
                modifier = Modifier.padding(horizontal = 40.dp)
            )

            Text(
                "|>",
                fontSize = 25.sp
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 20.dp)
                .height(250.dp)
                .background(
                    color = Color(0xFF8B2252),
                    shape = RoundedCornerShape(15.dp)
                )
                .padding(20.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                "Lyrics",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again (Ooh)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan (Ooh)\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "Man, I'm 'bout to blow a fuse (Yeah)\n" +
                        "Tongjebulleung, meori chum (Yeah)\n" +
                        "Ttwieo michinnomin deut (Uh)\n" +
                        "Me everywhere, eolssu\n" +
                        "Somebody move (Move), somebody move (Move)\n" +
                        "Dadeul moyeo hana dul (dul)\n" +
                        "I can never ever choose (Yeah)\n" +
                        "Every one o' you a muse\n" +
                        "\n" +
                        "Crowd lookin' like a campus\n" +
                        "Beat drop, urin dancin'\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "I go cuckoo crazy, loco, save me, woo\n" +
                        "Like El Cucuy, guji mal an haedo aljana, woo\n" +
                        "Hooligan, like hooligan, ttaeryeo buswo like hooligan\n" +
                        "Sigan dwaesseuni jom bikyeo jom, all clear isang mu\n" +
                        "Take you out, take you out\n" +
                        "What's the future? Where's the now?\n" +
                        "This is international\n" +
                        "Make it unforgettable\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again (Ooh)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan (Ooh)\n" +
                        "\n" +
                        "Yeah, we the mess, gonna get a bigger mop here (Bigger mop)\n" +
                        "This that K, gotta get a better pop here (Better pop)\n" +
                        "You gon' hear this one playin' 'round the clock, yeah ('Round the clock)\n" +
                        "'Round the clock, clock, clock, clock\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "[Korean:]\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again (Ooh)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan (Ooh)\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "Man, I'm 'bout to blow a fuse (Yeah)\n" +
                        "통제불능, 머리 춤 (Yeah)\n" +
                        "뛰어 미친놈인 듯 (Uh)\n" +
                        "Me everywhere, 얼쑤\n" +
                        "Somebody move (Move), somebody move (Move)\n" +
                        "다들 모여 하나 둘 (둘)\n" +
                        "I can never ever choose (Yeah)\n" +
                        "Every one o' you a muse\n" +
                        "\n" +
                        "Crowd lookin' like a campus\n" +
                        "Beat drop, 우린 dancin'\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "I go cuckoo crazy, loco, save me, woo\n" +
                        "Like El Cucuy, 굳이 말 안 해도 알잖아, woo\n" +
                        "Hooligan, like hooligan, 때려 부숴 like hooligan\n" +
                        "시간 됐으니 좀 비켜 좀, all clear 이상 무\n" +
                        "Take you out, take you out\n" +
                        "What's the future? Where's the now?\n" +
                        "This is international\n" +
                        "Make it unforgettable\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again (Ooh)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan (Ooh)\n" +
                        "\n" +
                        "Yeah, we the mess, gonna get a bigger mop here (Bigger mop)\n" +
                        "This that K, gotta get a better pop here (Better pop)\n" +
                        "You gon' hear this one playin' 'round the clock, yeah ('Round the clock)\n" +
                        "'Round the clock, clock, clock, clock\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "[English translation:]\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again (Ooh)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan (Ooh)\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "Man, I'm 'bout to blow a fuse (Yeah)\n" +
                        "Out of control, hairography (Yeah)\n" +
                        "Jumping like a crazy guy (Uh)\n" +
                        "Me everywhere, eolssu!\n" +
                        "Somebody move (Move), somebody move (Move)\n" +
                        "Gather around, one, two (Two)\n" +
                        "I can never ever choose, yeah (Yeah!)\n" +
                        "Every one o' you a muse\n" +
                        "\n" +
                        "Crowd lookin' like a campus\n" +
                        "Beat drop, we're dancin'\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "I go cuckoo crazy, loco, save me, woo\n" +
                        "Like El Cucuy, you already know without me saying it, woo\n" +
                        "Hooligan, like hooligan, break it down like hooligan\n" +
                        "The time has come, please get out of the way, all clear, all clear\n" +
                        "Take you out, take you out\n" +
                        "What's the future? Where's the now?\n" +
                        "This is international\n" +
                        "Make it unforgettable\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again (Ooh)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan (Ooh)\n" +
                        "\n" +
                        "Yeah, we the mess, gonna get a bigger mop here (Bigger mop)\n" +
                        "This that K, gotta get a better pop here (Better pop)\n" +
                        "You gon' hear this one playin' 'round the clock, yeah ('Round the clock)\n" +
                        "'Round the clock, clock, clock, clock\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\nWatch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again (Ooh)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan (Ooh)\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "Man, I'm 'bout to blow a fuse (Yeah)\n" +
                        "Tongjebulleung, meori chum (Yeah)\n" +
                        "Ttwieo michinnomin deut (Uh)\n" +
                        "Me everywhere, eolssu\n" +
                        "Somebody move (Move), somebody move (Move)\n" +
                        "Dadeul moyeo hana dul (dul)\n" +
                        "I can never ever choose (Yeah)\n" +
                        "Every one o' you a muse\n" +
                        "\n" +
                        "Crowd lookin' like a campus\n" +
                        "Beat drop, urin dancin'\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "I go cuckoo crazy, loco, save me, woo\n" +
                        "Like El Cucuy, guji mal an haedo aljana, woo\n" +
                        "Hooligan, like hooligan, ttaeryeo buswo like hooligan\n" +
                        "Sigan dwaesseuni jom bikyeo jom, all clear isang mu\n" +
                        "Take you out, take you out\n" +
                        "What's the future? Where's the now?\n" +
                        "This is international\n" +
                        "Make it unforgettable\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again (Ooh)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan (Ooh)\n" +
                        "\n" +
                        "Yeah, we the mess, gonna get a bigger mop here (Bigger mop)\n" +
                        "This that K, gotta get a better pop here (Better pop)\n" +
                        "You gon' hear this one playin' 'round the clock, yeah ('Round the clock)\n" +
                        "'Round the clock, clock, clock, clock\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "[Korean:]\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again (Ooh)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan (Ooh)\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "Man, I'm 'bout to blow a fuse (Yeah)\n" +
                        "통제불능, 머리 춤 (Yeah)\n" +
                        "뛰어 미친놈인 듯 (Uh)\n" +
                        "Me everywhere, 얼쑤\n" +
                        "Somebody move (Move), somebody move (Move)\n" +
                        "다들 모여 하나 둘 (둘)\n" +
                        "I can never ever choose (Yeah)\n" +
                        "Every one o' you a muse\n" +
                        "\n" +
                        "Crowd lookin' like a campus\n" +
                        "Beat drop, 우린 dancin'\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "I go cuckoo crazy, loco, save me, woo\n" +
                        "Like El Cucuy, 굳이 말 안 해도 알잖아, woo\n" +
                        "Hooligan, like hooligan, 때려 부숴 like hooligan\n" +
                        "시간 됐으니 좀 비켜 좀, all clear 이상 무\n" +
                        "Take you out, take you out\n" +
                        "What's the future? Where's the now?\n" +
                        "This is international\n" +
                        "Make it unforgettable\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again (Ooh)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan (Ooh)\n" +
                        "\n" +
                        "Yeah, we the mess, gonna get a bigger mop here (Bigger mop)\n" +
                        "This that K, gotta get a better pop here (Better pop)\n" +
                        "You gon' hear this one playin' 'round the clock, yeah ('Round the clock)\n" +
                        "'Round the clock, clock, clock, clock\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "[English translation:]\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again (Ooh)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan (Ooh)\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "Man, I'm 'bout to blow a fuse (Yeah)\n" +
                        "Out of control, hairography (Yeah)\n" +
                        "Jumping like a crazy guy (Uh)\n" +
                        "Me everywhere, eolssu!\n" +
                        "Somebody move (Move), somebody move (Move)\n" +
                        "Gather around, one, two (Two)\n" +
                        "I can never ever choose, yeah (Yeah!)\n" +
                        "Every one o' you a muse\n" +
                        "\n" +
                        "Crowd lookin' like a campus\n" +
                        "Beat drop, we're dancin'\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "I go cuckoo crazy, loco, save me, woo\n" +
                        "Like El Cucuy, you already know without me saying it, woo\n" +
                        "Hooligan, like hooligan, break it down like hooligan\n" +
                        "The time has come, please get out of the way, all clear, all clear\n" +
                        "Take you out, take you out\n" +
                        "What's the future? Where's the now?\n" +
                        "This is international\n" +
                        "Make it unforgettable\n" +
                        "\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again (Ooh)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan (Ooh)\n" +
                        "\n" +
                        "Yeah, we the mess, gonna get a bigger mop here (Bigger mop)\n" +
                        "This that K, gotta get a better pop here (Better pop)\n" +
                        "You gon' hear this one playin' 'round the clock, yeah ('Round the clock)\n" +
                        "'Round the clock, clock, clock, clock\n" +
                        "\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n",
                color = Color.White,
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 20.dp)
            )
        }
    }
}



    @Preview(showBackground = true, showSystemUi = true)
@Composable
fun soal1TugasPreview() {
        soal1TugasView()
    }
