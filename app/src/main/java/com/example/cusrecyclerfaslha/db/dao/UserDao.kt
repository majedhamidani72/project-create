package com.example.cusrecyclerfaslha.db.dao

import androidx.room.Dao
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.Query
import com.example.cusrecyclerfaslha.db.DbHandler
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.internal.operators.flowable.FlowableBufferExactBoundary

@Dao
interface UserDao {

    @Insert
    fun insertUser(user:Entity)

    @get:Query("SELECTE * FROM  ${DbHandler.USER_TABLE}" )
    val getUser : Flowable<List<Entity>>
}