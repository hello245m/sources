package com.tencent.rfix.loader.engine;

import android.app.Application;
import com.tencent.rfix.loader.entity.RFixLoadResult;
import java.io.File;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RedirectPatchLoader implements IPatchLoader {
    private static final int ERROR_CODE_UNKNOWN = -100;
    private static final String TAG = "RFix.RedirectPatchLoader";
    private final Application application;

    public RedirectPatchLoader(Application application) {
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
