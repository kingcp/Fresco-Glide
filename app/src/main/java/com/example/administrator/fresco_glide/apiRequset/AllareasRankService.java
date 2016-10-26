package com.example.administrator.fresco_glide.apiRequset;

import com.example.administrator.fresco_glide.entity.AllareasRankInfo;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Administrator on 2016/10/26.
 */
public interface AllareasRankService {

    @GET("index/rank/{type}")
    Observable<AllareasRankInfo> getAllareasRanks(@Path("type") String type);
}
