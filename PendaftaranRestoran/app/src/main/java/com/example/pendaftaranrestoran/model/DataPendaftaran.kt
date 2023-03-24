package com.example.pendaftaranrestoran.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DataPendaftaran(
    @PrimaryKey val id: String,
    val nama: String,
    val email: String,
    val alamat: String,
    val perusahaan: String,
)