package com.example.administrator.fresco_glide.apiRequset;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/10/26.
 */
public class ApiRequestHelper {
    private static final String APP_BASE_URL = "http://www.bilibili.com/index/rank/";
    private static OkHttpClient mOkHttpClient;
    static{
       mOkHttpClient = new OkHttpClient();
    }
    public static AllareasRankService getAllareasRankApi()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APP_BASE_URL)
                .client(mOkHttpClient)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(AllareasRankService.class);
    }
}
