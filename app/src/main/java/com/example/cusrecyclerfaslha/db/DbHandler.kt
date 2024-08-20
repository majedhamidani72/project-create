package com.example.cusrecyclerfaslha.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cusrecyclerfaslha.db.dao.UserDao
import com.example.cusrecyclerfaslha.db.model.EntitiUser

@Database(
    entities = [EntitiUser::class],
    version = DbHandler.DATABASE_VERSION
)
abstract class DbHandler : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        private const val DATABASE_NAME = "user_database"
        const val DATABASE_VERSION = 1
        const val USER_TABLE = "user_table"

        private var INSTANCE: DbHandler? = null

        fun getDatabase(context: Context): DbHandler {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    DbHandler::class.java,
                    DATABASE_NAME
                )
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return INSTANCE!!
        }
    }
}
