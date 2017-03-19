package com.sh.zsh.code;

import android.app.Application;

import com.sh.zsh.code.baidumap_sdk.BaiduMapHelper;

/**
 * Created by zhush on 2017/2/23.
 * E-mail 405086805@qq.com
 * PS
 */
public class MyApplication  extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * 初始化百度地图
         */
        BaiduMapHelper.init(this);
    }
}
