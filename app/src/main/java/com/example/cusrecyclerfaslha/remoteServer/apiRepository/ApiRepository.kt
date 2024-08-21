package com.example.cusrecyclerfaslha.remoteServer.apiRepository

import com.example.cusrecyclerfaslha.remoteServer.RetrofitService
import com.example.cusrecyclerfaslha.remoteServer.model.MainModel
import retrofit2.Response

class ApiRepository private constructor() {

    companion object {
        private var apiRepository: ApiRepository? = null

        val instance: ApiRepository
            get() {
                if (apiRepository == null) apiRepository = ApiRepository()
                return apiRepository!!
            }
    }

    // تغییر به suspend
    suspend fun sendText(to: String, text: String): Response<MainModel> {
        return RetrofitService.apiService.sendRequest_feedBack(to, text)
    }
}
