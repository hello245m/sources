package com.tencent.rfix.entry;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import com.tencent.rfix.loader.entity.RFixLoadResult;
import com.tencent.tinker.entry.ApplicationLike;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class RFixApplicationLike extends ApplicationLike {
    private static final String TAG = "RFix.RFixApplicationLike";
    private final RFixLoadResult loadResult;

    public RFixApplicationLike(Application application, RFixLoadResult rFixLoadResult) {
    }

    private boolean initializeTinker(ApplicationLike applicationLike) {
    }

    public RFixLoadResult getLoadResult() {
    }

    @Override // com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onBaseContextAttached(Context context) {
    }
}
