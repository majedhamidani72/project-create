package com.example.cusrecyclerfaslha.db.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cusrecyclerfaslha.db.DbHandler

@Entity(tableName = DbHandler.USER_TABLE)
data class EntitiUser(

@PrimaryKey(autoGenerate = true) val id:Int = 0,
@ColumnInfo val name: String,
@ColumnInfo val phone:String
)
