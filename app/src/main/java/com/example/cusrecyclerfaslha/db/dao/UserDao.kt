package com.example.cusrecyclerfaslha.db.dao

import androidx.room.*
import com.example.cusrecyclerfaslha.db.DbHandler
import com.example.cusrecyclerfaslha.db.model.EntitiUser
import io.reactivex.rxjava3.core.Flowable

@Dao
interface UserDao {

    @Insert
    fun insertUser(user: EntitiUser)

    @Query("SELECT * FROM ${DbHandler.USER_TABLE}")
    fun getUser(): Flowable<List<EntitiUser>>

    @Update
    fun updateUser(vararg user: EntitiUser)

    @Delete
    fun deleteUsers(vararg user: EntitiUser)


    @Query("DELETE FROM ${DbHandler.USER_TABLE}")
    fun deleteAll()
}
