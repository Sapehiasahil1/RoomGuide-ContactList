package com.example.roomguide_contactlist

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact(
    val firstName : String,
    val lastName : String,
    val phoneNumber : String,
    @PrimaryKey
    val id : Int =0
)
