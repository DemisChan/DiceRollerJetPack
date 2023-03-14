package com.example.DiceRollerJetPack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Button
import androidx.compose.foundation.Image
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.DiceRollerJetPack.ui.theme.DiceRollerJetPackTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerJetPackTheme{
                DiceRollerApp()
            }
        }


    }

    @Composable
    fun DiceWithButtonImage(modifier: Modifier = Modifier) {
        modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Image(painter = painterResource(id = R.drawable.dice_1), contentDescription = "1")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { /*TODO*/ }) {
                Text(text = stringResource(id = R.string.roll))
            }
        }
    }

    @Preview
    @Composable
    fun DiceRollerApp(){
        DiceWithButtonImage(Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center))
    }
}