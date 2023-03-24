package com.example.pendaftaranrestoran.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pendaftaranrestoran.model.DataPendaftaran

@Database(entities = [DataPendaftaran::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun DataPendaftaranDao(): DataPendaftaranDao
}