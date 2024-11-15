package com.pjurado.ejemploejercicioexamen.ui.listaScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pjurado.ejemploejercicioexamen.model.Tarea
import com.pjurado.ejemploejercicioexamen.model.repositoryTareas

@Composable
fun ListaScreen(onNuevaTarea: () -> Unit){
    val listaTareas = repositoryTareas.getTareas()
    Column(
        modifier = Modifier.fillMaxSize().padding(8.dp)
    ) {
        Button(
            onClick = { onNuevaTarea() }
        ) {
            Text(text = "Agregar tarea")
        }
        Spacer(modifier = Modifier.height(8.dp))
        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ) {
            items(listaTareas) { tarea ->
                TareaItem(tarea = tarea)
            }
        }
    }
}

@Composable
fun TareaItem(tarea: Tarea){
    // Aquí se muestra la información de la tarea
    Card(
        modifier = Modifier.fillMaxWidth().padding(8.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row{
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(text = tarea.nombre, fontSize = 20.sp)
                Text(text = tarea.descripcion)
            }
            Checkbox(
                checked = tarea.estaCompletado,
                onCheckedChange = { /*TODO*/ }
            )
        }
    }
}