package com.app.maffan.retrofitexample;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

/**
 * Created by maffan on 12/19/2016.
 */

public class App extends Application {

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,"user_db");
        Database database = helper.getWritableDb();
        daoSession = new DaoMaster(database).newSession();
    }

    public DaoSession getDaoSession(){
        return daoSession;
    }
}
