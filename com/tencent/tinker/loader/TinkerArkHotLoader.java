package com.tencent.tinker.loader;

import android.annotation.TargetApi;
import android.content.Intent;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareArkHotDiffPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.util.HashSet;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class TinkerArkHotLoader {
    public static HashSet<ShareArkHotDiffPatchInfo> arkHotApkInfo;
    public static boolean isArkHotRuning;

    private TinkerArkHotLoader() {
    }

    public static boolean checkComplete(String str, ShareSecurityCheck shareSecurityCheck, Intent intent) {
    }

    @TargetApi(14)
    public static boolean loadTinkerArkHot(TinkerApplication tinkerApplication, String str, Intent intent) {
    }
}
