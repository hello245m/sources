package com.tencent.rfix.loader.engine;

import android.content.Context;
import android.content.Intent;
import com.tencent.rfix.loader.entity.RFixLoadResult;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import java.io.File;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class TinkerPatchLoader implements IPatchLoader {
    private static final String TAG = "RFix.TinkerPatchLoader";
    private final TinkerApplication application;

    public TinkerPatchLoader(TinkerApplication tinkerApplication) {
    }

    public static String getCurrentVersion(Intent intent, Context context) {
    }

    public static File getTinkerPatchVersionDir(Intent intent, Context context) {
    }

    @Override // com.tencent.rfix.loader.engine.IPatchLoader
    public boolean cleanPatch(File file) {
    }

    public SharePatchInfo fixTinkerPatchInfo(File file) {
    }

    @Override // com.tencent.rfix.loader.engine.IPatchLoader
    public String getPatchType() {
    }

    public boolean isLoadSuccess(int i2) {
    }

    @Override // com.tencent.rfix.loader.engine.IPatchLoader
    public boolean loadPatch(RFixLoadResult rFixLoadResult) {
    }

    public void loadPatchSo(Intent intent, RFixLoadResult rFixLoadResult) throws Throwable {
    }

    public boolean needCleanPatch(boolean z, int i2) {
    }
}
