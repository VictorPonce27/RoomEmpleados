package com.delnortedevs.starterroomempleados.dao

import androidx.room.*
import com.delnortedevs.starterroomempleados.model.Empleado
import kotlinx.coroutines.selects.select


@Dao
interface EmpleadoDao {
    @Query("SELECT * FROM Empleado order by nombre ASC")
    fun getALl(): List<Empleado>

    @Query("SELECT * FROM Empleado where nombre=:nombre")
    fun getByName(nombre: String): Empleado

    @Insert
    fun insertEmpleado(empleado: Empleado): Long

    @Update
    fun updateEmpleado(empleado: Empleado): Int

    @Delete
    fun deleteEmpleado(empleado: Empleado): Int

}