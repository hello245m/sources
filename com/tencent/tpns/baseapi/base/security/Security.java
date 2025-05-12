package com.tencent.tpns.baseapi.base.security;

import android.content.Context;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class Security {
    private static final String TAG = "Security";
    private static boolean loadedTpnsSecuritySo = false;
    public static final String tpnsSecurityLibFullName = "libxgVipSecurity.so";
    private static final String tpnsSecurityLibName = "xgVipSecurity";

    public static boolean checkTpnsSecurityLibSo(Context context) {
    }

    public static byte[] decryptSrvData(byte[] bArr) {
    }

    public static native byte[] doDecryptSrvData(byte[] bArr);

    public static native byte[] doEncryptSrvData(byte[] bArr);

    public static byte[] encryptSrvData(byte[] bArr) {
    }

    public static native String generateLocalSocketServieNameNative(Object obj);

    public static native String getBusinessDeviceIdNative(Object obj);

    public static native String getEncryptAPKSignatureNative(Object obj);

    public static native byte[] oiSymmetryDecrypt2Byte(byte[] bArr);

    public static native byte[] oiSymmetryEncrypt2Byte(String str);

    private static String toCharsString(byte[] bArr) {
    }
}
