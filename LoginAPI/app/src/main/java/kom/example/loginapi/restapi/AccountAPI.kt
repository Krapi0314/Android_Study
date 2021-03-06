package kom.example.loginapi.restapi

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface AccountAPI {
    @POST("api/account/login")
    fun loginRequest(@Body accountLoginRequestDTO: AccountLoginRequestDTO): Call<AccountLoginResponseDTO>

    @POST("api/account/signup")
    fun signupRequest(@Body accountSignupRequestDTO: AccountSignupRequestDTO): Call<AccountSignupResponseDTO>
}