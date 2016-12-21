package com.app.maffan.retrofitexample;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.app.maffan.retrofitexample.models.*;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import com.app.maffan.retrofitexample.models.User;

public class MainActivity extends AppCompatActivity {

    private DaoSession daoSession;
    private UserDao userDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting up database
        setupDao();

        Button fetchUserButton = (Button) findViewById(R.id.fetch_user_button);
        fetchUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText count = (EditText) findViewById(R.id.et_user_count);
                fetchUsers(Integer.parseInt(count.getText().toString()));
            }
        });
    }

    private void fetchUsers(int count) {

        RandomUserService service = ApiClient.getClient().create(RandomUserService.class);
        Call<UserList> call = service.userList(count);
        call.enqueue(new Callback<UserList>() {
            @Override
            public void onResponse(Call<UserList> call, Response<UserList> response) {
                Toast.makeText(getApplicationContext(),"Request Successful",Toast.LENGTH_SHORT).show();
                Log.d("RESPONSE", "onResponse: " + response);
                // insert users into db
                insertUsersToDb(response.body().getUsers());
            }
            @Override
            public void onFailure(Call<UserList> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Request Failed",Toast.LENGTH_SHORT).show();
                Log.d("FAIL", "onFailure: " + t.getMessage());
            }
        });


    }

    private void insertUsersToDb(List<User> users){

        for(int i = 0;i< users.size();i++){


            daoSession.insert(new com.app.maffan.retrofitexample.User(
                    null,
                    users.get(i).getName().getTitle(),
                    users.get(i).getName().getFirst(),
                    users.get(i).getName().getLast(),
                    users.get(i).getEmail(),
                    users.get(i).getDob(),
                    users.get(i).getPhone(),
                    users.get(i).getCell(),
                    users.get(i).getPicture().getThumbnail(),
                    users.get(i).getPicture().getMedium(),
                    users.get(i).getPicture().getLarge()
            ));
        }

        Toast.makeText(getApplicationContext(),"Users saved successfully",Toast.LENGTH_LONG).show();
        fetchUsersFromDb();
    }

    private void fetchUsersFromDb(){

        List<com.app.maffan.retrofitexample.User> users = userDao.loadAll();
        users.size();


    }

    private void setupDao(){

        daoSession = ((App) getApplication()).getDaoSession();
        userDao = daoSession.getUserDao();
    }

}
