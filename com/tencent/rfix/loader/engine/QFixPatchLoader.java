package com.tencent.rfix.loader.engine;

import android.app.Application;
import android.content.Context;
import com.tencent.rfix.loader.entity.RFixLoadResult;
import java.io.File;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class QFixPatchLoader implements IPatchLoader {
    private static final int ERROR_CODE_RES_LOAD = 2000;
    private static final int ERROR_CODE_SO_LOAD = 1000;
    private static final int ERROR_CODE_UNKNOWN = -100;
    private static final String TAG = "RFix.QFixPatchLoader";
    private final Application application;

    public QFixPatchLoader(Application application) {
    }

    private void configNativeLog(Context context) {
    }

    private boolean tryLoadResPatch(RFixLoadResult rFixLoadResult) {
    }

    public static boolean tryLoadSoPatch(Application application, RFixLoadResult rFixLoadResult) {
    }

    @Override // com.tencent.rfix.loader.engine.IPatchLoader
    public boolean cleanPatch(File file) {
    }

    @Override // com.tencent.rfix.loader.engine.IPatchLoader
    public String getPatchType() {
    }

    @Override // com.tencent.rfix.loader.engine.IPatchLoader
    public boolean loadPatch(RFixLoadResult rFixLoadResult) {
    }

    public boolean tryLoadDexPath(RFixLoadResult rFixLoadResult) {
    }
}
