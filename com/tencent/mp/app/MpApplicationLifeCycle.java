package com.tencent.mp.app;

import android.content.Context;
import android.content.res.Configuration;
import com.tencent.tinker.entry.ApplicationLifeCycle;
import k.i.d.b.a.b.b;
import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class MpApplicationLifeCycle implements ApplicationLifeCycle {
    public static final a Companion = null;
    private static final String TAG = "Mp.MpApplicationLifeCycle";
    private final android.app.Application application;
    private final b feature;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }
    }

    public MpApplicationLifeCycle(android.app.Application application) {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onBaseContextAttached(Context context) {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onCreate() {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onLowMemory() {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTerminate() {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTrimMemory(int i2) {
    }
}
