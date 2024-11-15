package com.pjurado.ejemploejercicioexamen.model

object repositoryTareas {
    var listaTareas: List<Tarea> = ((1..10).map {
        Tarea(
            nombre = "Tarea $it",
            descripcion = "Descripción de la tarea $it",
            estaCompletado = it % 2 == 0
        )
    })

    fun getTareas() = listaTareas

    fun addTarea(tarea: Tarea){
        listaTareas = listaTareas + tarea
    }
}