package com.tencent.rfix.loader.app;

import android.content.Context;
import com.tencent.rfix.loader.entity.RFixLoadResult;
import com.tencent.tinker.loader.app.TinkerApplication;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class RFixApplication extends TinkerApplication {
    public static final String DEFAULT_APPLICATION_LIKE = "com.tencent.rfix.entry.DefaultRFixApplicationLike";
    private static final String TAG = "RFixApplication";
    private static final int TINKER_FLAGS = 15;
    private static final boolean TINKER_LOAD_VERIFY_FLAG = false;
    private static final boolean TINKER_USE_DELEGATE_CLASS_LOADER = true;
    private final String delegateClassName;
    private final String mainProcessName;

    public RFixApplication() {
    }

    public void createInlineFence(Context context, String str, RFixLoadResult rFixLoadResult) {
    }

    public RFixLoadResult loadPatch(long j2, long j3) {
    }

    @Override // com.tencent.tinker.loader.app.TinkerApplication
    public void onBaseContextAttached(Context context, long j2, long j3) {
    }

    public RFixApplication(String str) {
    }

    public RFixApplication(String str, String str2) {
    }
}
