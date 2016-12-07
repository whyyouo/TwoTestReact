package com.two.anative.react.app;

import android.app.Application;

import com.facebook.react.BuildConfig;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.two.anative.react.util.MyReactPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 类说明:ReactNative学习  ReactApplication
 *@name LiangAn
 *@data 2016年12月07日 15:14:55
 */

public class MainApplication extends Application implements ReactApplication{
    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(MainApplication.this) {
        @Override
        protected boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            //将我们创建的包管理器给添加进来
            return Arrays.<ReactPackage>asList(new MainReactPackage(),new MyReactPackage());
        }
    };
    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }
}
