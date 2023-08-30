package com.example.a19200211_20200077_cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a19200211_20200077_cuadrantecompose.ui.theme._19200211_20200077_CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _19200211_20200077_CuadranteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AplicacionCuadranteCompose()
                }
            }
        }
    }
}

@Composable
fun AplicacionCuadranteCompose() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableInformacionCard(
                titulo = "Text composable",
                descripcion = "Muestra texto y sigue las pautas recomendadas de Material Design.",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            ComposableInformacionCard(
                titulo = "Image composable",
                descripcion = "Crea un elemento composable que diseña y dibuja un objeto de clase Painter determinado.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposableInformacionCard(
                titulo = "Row composable",
                descripcion = "Un diseño composable que coloca a sus elementos secundarios en una secuencia horizontal.",
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            ComposableInformacionCard(
                titulo = "Column composable",
                descripcion = "Un diseño composable que coloca a sus elementos secundarios en una secuencia vertical.",
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}
@Composable
private fun ComposableInformacionCard(
    titulo: String,
    descripcion: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = descripcion,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AplicacionCuadranteComposePreview() {
    _19200211_20200077_CuadranteComposeTheme {
        AplicacionCuadranteCompose()
    }
}