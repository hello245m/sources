package com.huawei.agconnect.config.impl;

import android.content.Context;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.config.LazyInputStream;
import java.io.InputStream;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class c extends AGConnectServicesConfig {
    private final Context a;
    private final String b;
    private LazyInputStream c;
    private volatile d d;
    private final Object e;
    private AGCRoutePolicy f;
    private final Map<String, String> g;
    private volatile e h;

    /* renamed from: com.huawei.agconnect.config.impl.c$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AnonymousClass1 extends LazyInputStream {
        public final /* synthetic */ InputStream a;

        public AnonymousClass1(Context context, InputStream inputStream) {
        }

        @Override // com.huawei.agconnect.config.LazyInputStream
        public InputStream get(Context context) {
        }
    }

    public c(Context context, String str) {
    }

    private static LazyInputStream a(Context context, InputStream inputStream) {
    }

    private static String a(String str) {
    }

    private void a() {
    }

    private String b(String str) {
    }

    private void b() {
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public boolean getBoolean(String str) {
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public boolean getBoolean(String str, boolean z) {
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public Context getContext() {
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getIdentifier() {
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public int getInt(String str) {
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public int getInt(String str, int i2) {
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getPackageName() {
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public AGCRoutePolicy getRoutePolicy() {
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str) {
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str, String str2) {
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void overlayWith(LazyInputStream lazyInputStream) {
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void overlayWith(InputStream inputStream) {
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void setParam(String str, String str2) {
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void setRoutePolicy(AGCRoutePolicy aGCRoutePolicy) {
    }
}
