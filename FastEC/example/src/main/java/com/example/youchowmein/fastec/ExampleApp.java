package com.example.youchowmein.fastec;

import android.app.Application;

/**
 * @author YouChaoMin
 * @date 2018/12/21 0:24.
 * email：1330676845@qq.com
 */
public class ExampleApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}
