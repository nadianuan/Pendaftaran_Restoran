package com.example.pendaftaranrestoran.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.pendaftaranrestoran.model.DataPendaftaran

@Dao
interface DataPendaftaranDao {
    @Query("SELECT * FROM DataPendaftaran")
    fun loadAll(): LiveData<List<DataPendaftaran>>

    @Query("SELECT * FROM DataPendaftaran WHERE id = :id")
    fun find(id: String): DataPendaftaran?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: DataPendaftaran)
    @Delete
    fun delete(item: DataPendaftaran)
}