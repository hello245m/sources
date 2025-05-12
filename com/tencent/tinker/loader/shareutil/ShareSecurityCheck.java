package com.tencent.tinker.loader.shareutil;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.security.cert.Certificate;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ShareSecurityCheck {
    public static String mPublicKeyMd5;
    public final Context mContext;
    public final HashMap<String, String> metaContentMap;
    public final HashMap<String, String> packageProperties;

    public ShareSecurityCheck(Context context) {
    }

    public final boolean check(File file, Certificate[] certificateArr) {
    }

    public HashMap<String, String> getMetaContentMap() {
    }

    public HashMap<String, String> getPackagePropertiesIfPresent() {
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public final void init(Context context) {
    }

    public boolean verifyPatchMetaSignature(File file) {
    }
}
