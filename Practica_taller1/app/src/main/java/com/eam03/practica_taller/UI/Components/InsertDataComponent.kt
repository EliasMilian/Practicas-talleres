package com.eam03.practica_taller.UI.Components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable

fun InsertData() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column {

            val usuario: MutableState<String> = remember { mutableStateOf("") }
            val hidden: MutableState<Boolean> = remember {
                mutableStateOf(true)
            }
            TextField(
                value = usuario.value,
                onValueChange = {
                    usuario.value = it
                },
                maxLines = 1,
                minLines = 1,
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    disabledTextColor = Color.Black,
                    errorTextColor = Color.Black,
                    focusedContainerColor = Color.Black,
                    unfocusedContainerColor = Color.White,
                    disabledContainerColor = Color.Black,
                    errorContainerColor = Color.Red,
                    cursorColor = Color.Black,
                    errorCursorColor = Color.Black,
                    focusedIndicatorColor = Color.Black,
                    unfocusedIndicatorColor = Color.Black,
                    disabledIndicatorColor = Color.Black,
                    errorIndicatorColor = Color.Black,
                    focusedLeadingIconColor = Color.Black,
                    unfocusedLeadingIconColor = Color.Black,
                    disabledLeadingIconColor = Color.Black,
                    errorLeadingIconColor = Color.Black,
                    focusedTrailingIconColor = Color.Black,
                    unfocusedTrailingIconColor = Color.Black,
                    disabledTrailingIconColor = Color.Black,
                    errorTrailingIconColor = Color.Black,
                    focusedLabelColor = Color.Black,
                    unfocusedLabelColor = Color.Black,
                    disabledLabelColor = Color.Black,
                    errorLabelColor = Color.Black,
                    focusedPlaceholderColor = Color.Black,
                    unfocusedPlaceholderColor = Color.Black,
                    disabledPlaceholderColor = Color.Black,
                    errorPlaceholderColor = Color.Black,
                    focusedSupportingTextColor = Color.Black,
                    unfocusedSupportingTextColor = Color.White,
                    disabledSupportingTextColor = Color.Black,
                    errorSupportingTextColor = Color.Black,
                    focusedPrefixColor = Color.Black,
                    unfocusedPrefixColor = Color.White,
                    disabledPrefixColor = Color.Black,
                    errorPrefixColor = Color.Black,
                    focusedSuffixColor = Color.Black,
                    unfocusedSuffixColor = Color.White,
                    disabledSuffixColor = Color.Black,
                    errorSuffixColor = Color.Black
                ),
                label = { Text("Ingrese su nombre") },
                placeholder = { Text("Nombre") },
                supportingText = { Text("Por favor, ingrese su nombre completo.") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Icono de persona"
                    )
                },
                isError = false,
                keyboardActions = KeyboardActions(
                    onNext = {},
                    onDone = {},
                    onGo = {},
                    onPrevious = {},
                    onSearch = {},
                    onSend = {}
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),


                readOnly = false
            )
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
