package com.eam03.practica_taller.UI.Components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable

fun InsertData(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column {

            val usuario: MutableState<String> = remember { mutableStateOf("") }
            TextField(
                value = usuario.value,
                onValueChange = {
                    usuario.value = it
                },
                maxLines = 1,
                minLines = 1,
                singleLine = true

                ,
                label = { Text("Ingrese su nombre") },
                placeholder = { Text("Nombre") },
                supportingText = { Text("Por favor, ingrese su nombre completo.") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Icono de persona"
                    )
                })

        }
        val edad: MutableState<Int> = remember { mutableStateOf(0) }
        val edadTexto = edad.value.toString()

        TextField(
            value = edadTexto,
            onValueChange = { nuevoValor ->
                // Convertir de String a Int y manejar entradas no numéricas
                edad.value = nuevoValor.toIntOrNull() ?: 0
            },
            label = { Text("Edad") },
            singleLine = true // Hace que el campo de texto sea de una sola línea
        )
        Button(onClick = { /*TODO*/ }) {
            Text("Enviar datos")

        }
    }
}

