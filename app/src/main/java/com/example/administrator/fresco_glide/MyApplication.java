package com.example.administrator.fresco_glide;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Administrator on 2016/10/26.
 */
public class MyApplication extends Application {
//"电影":"http://www.bilibili.com/index/rank/all-03-23.json"
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
