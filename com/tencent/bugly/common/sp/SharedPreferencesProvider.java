package com.tencent.bugly.common.sp;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class SharedPreferencesProvider implements ISharedPreferencesProvider {
    private static final String TAG = "SharedPreferencesProvider";
    private static SharedPreferencesProvider instance;
    private SharedPreferences multiProcessSP;
    private ISharedPreferencesProvider proxy;

    private SharedPreferencesProvider() {
    }

    public static SharedPreferencesProvider getInstance() {
    }

    public SharedPreferences getMultiProcessSP(Context context) {
    }

    @Override // com.tencent.bugly.common.sp.ISharedPreferencesProvider
    public SharedPreferences getSharedPreferences(Context context, String str, boolean z) {
    }

    public void setProvider(ISharedPreferencesProvider iSharedPreferencesProvider) {
    }
}
