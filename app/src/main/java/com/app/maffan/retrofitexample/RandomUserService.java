package com.app.maffan.retrofitexample;


import com.app.maffan.retrofitexample.models.*;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import com.app.maffan.retrofitexample.models.User;
public interface RandomUserService {

    @GET("api/")
    Call<UserList> userList(@Query("results") int number);

    @POST
    Call<User> createUser(@Field("first_name")String firstName, @Field("last_name") String lastName);

}
