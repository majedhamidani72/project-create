package com.example.cusrecyclerfaslha.remoteServer.apiRepository

import com.example.cusrecyclerfaslha.remoteServer.RetrofitService
import com.example.cusrecyclerfaslha.remoteServer.model.MainModel
import retrofit2.Call
import retrofit2.Callback
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

    fun senText(
        to:String,
        text: String
    ) {
        RetrofitService.apiService.sendRequest_feedBack(to, text).enqueue(

            object : Callback<MainModel> {

                override fun onResponse(call: Call<MainModel>, response: Response<MainModel>) {
                    if (response.isSuccessful){
                        val data = response.body() as MainModel
                    }


                }

                override fun onFailure(call: Call<MainModel>, t: Throwable) {

                }

            }

        )

    }

}
