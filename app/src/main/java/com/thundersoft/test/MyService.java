package com.thundersoft.test;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MyService extends Service {

    protected MyService.MyBinder mBind;// = new MyBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBind;
    }

    public class MyBinder extends Binder{

        public MyService getMyservce(){
            return MyService.this;
        }
    }


}
