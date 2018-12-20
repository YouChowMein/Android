package com.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * @author YouChaoMin
 * @date 2018/12/20 23:56.
 * email：1330676845@qq.com
 */
public final class Latte {

    public static Configurator init(Context context){
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static WeakHashMap<String,Object> getConfigurations(){
        return Configurator.getInstance().getLatteConfigs();
    }


}
