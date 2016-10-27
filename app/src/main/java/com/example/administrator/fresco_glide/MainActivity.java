package com.example.administrator.fresco_glide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.fresco_glide.apiRequset.ApiRequestHelper;
import com.example.administrator.fresco_glide.entity.AllareasRankInfo;
import com.facebook.drawee.view.SimpleDraweeView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private SimpleDraweeView mPic;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPic = (SimpleDraweeView) findViewById(R.id.pic);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  ApiRequestHelper.getAllareasRankApi().getAllareasRanks("all-03-23.json")
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<AllareasRankInfo>() {
                            @Override
                            public void onCompleted() {
                                Toast.makeText(getApplicationContext(), "onCompleted", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onError(Throwable e) {
                                Toast.makeText(getApplicationContext(), "onError" + e.toString(), Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }

                            @Override
                            public void onNext(AllareasRankInfo allareasRankInfo) {
                                Toast.makeText(getApplicationContext(), "onNext", Toast.LENGTH_SHORT).show();
                                if (allareasRankInfo != null) {
                                    allareasRankInfo.getRank().getList().get(0).getPic();
                                    mPic.setImageURI(allareasRankInfo.getRank().getList().get(0).getPic());
                                }
                            }
                        });*/

                ApiRequestHelper.getAllareasRankApi().getAllareasRanks("all-03-23.json")
                        .subscribeOn(Schedulers.io())
                        .map(new Func1<AllareasRankInfo, String>() {
                            @Override
                            public String call(AllareasRankInfo allareasRankInfo) {
                                Log.d(TAG, allareasRankInfo.getRank().getList().get(0).getPic());
                                return allareasRankInfo.getRank().getList().get(0).getPic();
                            }
                        })
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<String>() {
                            @Override
                            public void onCompleted() {
                                Toast.makeText(getApplicationContext(), "onCompleted", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onError(Throwable e) {
                                Toast.makeText(getApplicationContext(), "onError: " + e.toString(), Toast.LENGTH_SHORT).show();
                                Log.d(TAG, "onError: " + e.toString());
                            }

                            @Override
                            public void onNext(String s) {
                                Toast.makeText(getApplicationContext(), "onNext" + s, Toast.LENGTH_SHORT).show();
                                if (!TextUtils.isEmpty(s))
                                    mPic.setImageURI(s);
                            }
                        });
            }
        });

    }
}
