package com.tencent.tinker.lib.patch;

import android.content.Context;
import com.tencent.tinker.anno.Keep;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipFile;
import k.i.m.d.c.e;
import k.i.m.d.f.b;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class AbsCustomDiffPatcher {
    public static final String CUSTOM_META_FILE = "assets/custom_meta.txt";
    private static final String TAG = "Tinker.AbsCustomDiffPatcher";

    private boolean checkOldFile(ZipFile zipFile, e eVar) {
    }

    private boolean checkPatchFile(ZipFile zipFile, e eVar) {
    }

    private boolean checkRecoveredFile(String str, e eVar, File file) throws Exception {
    }

    private boolean recoverInternal(b bVar, Context context, String str, ZipFile zipFile, ZipFile zipFile2, List<e> list) throws Exception {
    }

    public abstract boolean customPatch(Context context, e eVar, InputStream inputStream, InputStream inputStream2, File file) throws Exception;

    public abstract InputStream getOldFileStream(Context context, File file, ZipFile zipFile, e eVar);

    public boolean patchBSDiff(InputStream inputStream, InputStream inputStream2, File file) throws Exception {
    }

    public boolean patchDexDiff(InputStream inputStream, InputStream inputStream2, File file) throws Exception {
    }

    public boolean recover(b bVar, ShareSecurityCheck shareSecurityCheck, Context context, String str, File file) {
    }
}
