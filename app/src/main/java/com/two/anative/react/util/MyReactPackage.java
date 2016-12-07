package com.two.anative.react.util;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 类说明:ReactPackage包管理器
 *@name LiangAn
 *@data 2016年12月7日 14:43:29
 */
public class MyReactPackage implements ReactPackage{
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        //将我们创建的MyNativeModule类添加进原生模块列表中
        List<NativeModule> moduleList = new ArrayList<>();
        moduleList.add(new MyNativeModule(reactContext));
        return moduleList;
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        //返回值需要修改
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        //返回值需要修改
        return Collections.emptyList();
    }
}
