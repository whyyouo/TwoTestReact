package com.two.anative.react.util;

import android.content.Context;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * 类说明:MyNativeModule  RN调用的方法，将其封装成一个原生模块。
 *@name LiangAn
 *@data 2016年12月07日 15:14:55
 */

public class MyNativeModule extends ReactContextBaseJavaModule {

    public Context mContext;

    public MyNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.mContext = reactContext;
    }

    @Override
    public String getName() {
        //返回的这个名字是必须的，在rn代码中需要这个名字来调用该类的方法。
        return "MyNativeModule";
    }

    //函数不能有返回值，因为被调用的原生代码是异步的，原生代码执行结束之后只能通过回调函数或者发送信息给rn那边。
    @ReactMethod
    public void rnCallNative(String msg){
        Toast.makeText(mContext,msg+"",Toast.LENGTH_SHORT).show();
    }
}
