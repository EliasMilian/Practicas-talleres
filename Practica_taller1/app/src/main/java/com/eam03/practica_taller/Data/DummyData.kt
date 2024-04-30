package com.eam03.practica_taller.Data

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.eam03.practica_taller.models.ObjectClass

val objectList: MutableState<MutableList<ObjectClass>> = mutableStateOf(mutableListOf())