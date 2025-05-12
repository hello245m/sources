package com.tencent.mp.app;

import android.content.Context;
import android.content.res.Configuration;
import com.tencent.rfix.entry.DefaultRFixApplicationLike;
import com.tencent.rfix.loader.entity.RFixLoadResult;
import n.d;
import n.d0.d.h;
import n.d0.d.o;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class MpApplicationLike extends DefaultRFixApplicationLike {
    public static final a Companion = null;
    private static final String TAG = "Mp.MpApplication";
    private final d applicationLifeCycle$delegate;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b extends o implements n.d0.c.a<MpApplicationLifeCycle> {
        public final /* synthetic */ android.app.Application a;

        public b(android.app.Application application) {
        }

        public final MpApplicationLifeCycle b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ MpApplicationLifeCycle invoke() {
        }
    }

    public MpApplicationLike(android.app.Application application, RFixLoadResult rFixLoadResult) {
    }

    private final MpApplicationLifeCycle getApplicationLifeCycle() {
    }

    @Override // com.tencent.rfix.entry.DefaultRFixApplicationLike, com.tencent.rfix.entry.RFixApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onBaseContextAttached(Context context) {
    }

    @Override // com.tencent.rfix.entry.DefaultRFixApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.tencent.rfix.entry.DefaultRFixApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onCreate() {
    }

    @Override // com.tencent.rfix.entry.DefaultRFixApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onLowMemory() {
    }

    @Override // com.tencent.rfix.entry.DefaultRFixApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTerminate() {
    }

    @Override // com.tencent.rfix.entry.DefaultRFixApplicationLike, com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTrimMemory(int i2) {
    }
}
