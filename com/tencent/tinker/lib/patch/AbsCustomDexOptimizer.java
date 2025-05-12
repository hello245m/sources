package com.tencent.tinker.lib.patch;

import android.content.Context;
import com.tencent.tinker.anno.Keep;
import com.tencent.tinker.loader.TinkerDexOptimizer;
import java.io.File;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class AbsCustomDexOptimizer extends TinkerDexOptimizer.OptimizeWorker {
    private static final String TAG = "Tinker.AbsCustomDexOptimizer";

    public AbsCustomDexOptimizer(Context context, File file, File file2, boolean z, boolean z2, String str, TinkerDexOptimizer.ResultCallback resultCallback) {
    }

    public abstract void customDexOptimize(String str, String str2) throws Throwable;

    public void originalDexOptimize(String str, String str2) throws Throwable {
    }

    @Override // com.tencent.tinker.loader.TinkerDexOptimizer.OptimizeWorker
    public boolean run() {
    }

    public void triggerPMDexOptOnDemand(Context context, String str, String str2) throws Exception {
    }
}
