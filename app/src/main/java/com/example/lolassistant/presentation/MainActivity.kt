package com.example.lolassistant.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.coroutineScope
import androidx.lifecycle.lifecycleScope
import com.example.lolassistant.data.API
import com.example.lolassistant.data.SummonerFromAPI
import com.example.lolassistant.data.retrofit.RetrofitClient
import com.example.lolassistant.presentation.theme.LolAssistantTheme
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val retrofit = RetrofitClient.getClient()
        val api = retrofit.create(API::class.java)
        lifecycleScope.launch {
            var text = api.getSummonerByName().name
            setContent {
                LolAssistantTheme {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        Greeting(text)
                    }
                }
            }
        }


//        setContent {
//            LolAssistantTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting(text.name)
//                }
//            }
//        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = name)
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LolAssistantTheme {
        Greeting("abc")
    }
}