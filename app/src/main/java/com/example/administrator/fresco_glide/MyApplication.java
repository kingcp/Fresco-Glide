package com.example.administrator.fresco_glide;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/10/26.
 */
public class MyApplication extends Application {
//"电影":"http://www.bilibili.com/index/rank/all-03-23.json"
    private final static String BASE_URL = "http://www.bilibili.com";
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
