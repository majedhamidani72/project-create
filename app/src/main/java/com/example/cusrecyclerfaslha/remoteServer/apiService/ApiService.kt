// ApiService.kt

import com.example.cusrecyclerfaslha.remoteServer.defaultModel.DefaultModel
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {
    @FormUrlEncoded
    @POST("email/login")
    suspend fun sendRequest(
        @Field("email") emailTest: String
    ): Response<DefaultModel>


    //برای  دریافت جزئیات صفحات
    @FormUrlEncoded
    @POST("getPageDetails")
    suspend fun getPageDetails(
        @Field("position") position: Int
    ): Response<DefaultModel>
}
