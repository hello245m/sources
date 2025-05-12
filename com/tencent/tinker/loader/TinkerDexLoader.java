package com.tencent.tinker.loader;

import android.content.Intent;
import com.tencent.tinker.loader.TinkerDexOptimizer;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class TinkerDexLoader {
    public static final ArrayList<ShareDexDiffPatchInfo> LOAD_DEX_LIST = null;
    public static HashSet<ShareDexDiffPatchInfo> classNDexInfo;
    public static boolean isVmArt;

    /* renamed from: com.tencent.tinker.loader.TinkerDexLoader$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 implements TinkerDexOptimizer.ResultCallback {
        public long start;
        public final /* synthetic */ boolean[] val$parallelOTAResult;
        public final /* synthetic */ Throwable[] val$parallelOTAThrowable;

        public AnonymousClass1(boolean[] zArr, Throwable[] thArr) {
        }

        @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
        public void onFailed(File file, File file2, Throwable th) {
        }

        @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
        public void onStart(File file, File file2) {
        }

        @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
        public void onSuccess(File file, File file2, File file3) {
        }
    }

    private TinkerDexLoader() {
    }

    public static boolean checkComplete(String str, ShareSecurityCheck shareSecurityCheck, String str2, Intent intent) {
    }

    public static void deleteOutOfDateOATFile(String str) {
    }

    public static String getInfoMd5(ShareDexDiffPatchInfo shareDexDiffPatchInfo) {
    }

    public static boolean isJustArtSupportDex(ShareDexDiffPatchInfo shareDexDiffPatchInfo) {
    }

    public static boolean loadTinkerJars(TinkerApplication tinkerApplication, String str, String str2, Intent intent, boolean z, boolean z2) {
    }
}
