import com.example.cusrecyclerfaslha.remoteServer.defaultModel.DefaultModel
import com.example.cusrecyclerfaslha.remoteServer.model.MainModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    // ارسال درخواست فیدبک با استفاده از متد GET
    @GET("send")
     fun sendRequest_feedBack(
        @Query("to") token: String,
        @Query("text") txt: String
    ): Call<MainModel>

    // دریافت جزئیات صفحات با استفاده از متد POST
    @FormUrlEncoded
    @POST("getPageDetails")
    suspend fun getPageDetails(
        @Field("position") position: Int
    ): Response<DefaultModel>
}
