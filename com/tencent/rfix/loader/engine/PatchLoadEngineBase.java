package com.tencent.rfix.loader.engine;

import android.app.Application;
import android.content.Context;
import com.tencent.rfix.loader.entity.RFixLoadResult;
import com.tencent.rfix.loader.entity.RFixPatchInfo;
import com.tencent.rfix.loader.utils.RFixConstants;
import java.io.File;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PatchLoadEngineBase implements IPatchLoadEngine {
    private static final String TAG = "RFix.PatchLoadEngineBase";
    public Application application;
    public PatchLoadCleaner cleaner;
    public Map<String, IPatchLoader> loaders;

    public PatchLoadEngineBase(Application application) {
    }

    private RFixConstants.CheckError checkPatchVersion(String str, RFixLoadResult rFixLoadResult) {
    }

    public RFixConstants.CheckError checkPatch(RFixLoadResult rFixLoadResult) {
    }

    public RFixConstants.CheckError checkPatchInfo(String str, RFixLoadResult rFixLoadResult) {
    }

    public RFixConstants.CheckError checkPatchLoader(RFixLoadResult rFixLoadResult) {
    }

    public RFixConstants.CheckError checkPatchSafeMode(String str, RFixLoadResult rFixLoadResult) {
    }

    public RFixConstants.CheckError checkPatchVerified(Context context, RFixLoadResult rFixLoadResult) {
    }

    public boolean checkProcessEnable(Context context, RFixLoadResult rFixLoadResult) {
    }

    public void checkUnfinishedPatchInstall(String str) {
    }

    public void cleanPatch(File file, File file2, RFixPatchInfo rFixPatchInfo) {
    }

    @Override // com.tencent.rfix.loader.engine.IPatchLoadEngine
    public IPatchLoader getLoader(String str) {
    }

    public void initLoaders() {
    }

    public boolean loadPatch(RFixLoadResult rFixLoadResult) {
    }

    public boolean needCleanPatch(Context context, RFixPatchInfo rFixPatchInfo) {
    }

    @Override // com.tencent.rfix.loader.engine.IPatchLoadEngine
    public boolean registerLoader(IPatchLoader iPatchLoader) {
    }

    public void tryCleanInvalidPatch(RFixLoadResult rFixLoadResult) {
    }

    @Override // com.tencent.rfix.loader.engine.IPatchLoadEngine
    public RFixLoadResult tryLoadPatch() {
    }

    public void tryLoadPatchInternal(RFixLoadResult rFixLoadResult) {
    }
}
