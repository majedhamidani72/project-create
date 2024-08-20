import com.example.cusrecyclerfaslha.remoteServer.defaultModel.DefaultModel
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    // ارسال درخواست فیدبک با استفاده از متد GET
    @GET("send")
    suspend fun sendRequest_feedBack(
        @Query("to") token: String,
        @Query("text") message: String
    ): Response<String>

    // دریافت جزئیات صفحات با استفاده از متد POST
    @FormUrlEncoded
    @POST("getPageDetails")
    suspend fun getPageDetails(
        @Field("position") position: Int
    ): Response<DefaultModel>
}
