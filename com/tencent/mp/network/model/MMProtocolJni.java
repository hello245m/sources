package com.tencent.mp.network.model;

import com.tencent.mp.util.pointers.PByteArray;
import com.tencent.mp.util.pointers.PInt;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class MMProtocolJni {
    private static final String TAG = "Mp.base.MMProtocolJni";
    private static ThreadLocal<String> openIdThreadLocal;
    private static ThreadLocal<Integer> packTypeThreadLocal;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a extends ThreadLocal<Integer> {
        public Integer a() {
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ Integer initialValue() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class b extends ThreadLocal<String> {
        public String a() {
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ String initialValue() {
        }
    }

    private MMProtocolJni() {
    }

    public static native byte[] aesEncrypt(byte[] bArr, byte[] bArr2);

    public static native boolean pack(byte[] bArr, byte[] bArr2, PByteArray pByteArray, byte[] bArr3, byte[] bArr4, String str, int i2, int i3, int i4, byte[] bArr5, byte[] bArr6, boolean z, boolean z2, int i5, boolean z3);

    public static native boolean setClientPackVersion(int i2);

    public static void setOpenId(String str) {
    }

    public static void setPackType(int i2) {
    }

    public static PByteArray toNewPkgDataBuf(byte[] bArr, byte[] bArr2) {
    }

    public static native boolean unpack(PByteArray pByteArray, byte[] bArr, byte[] bArr2, PByteArray pByteArray2, PInt pInt, PInt pInt2, boolean z);
}
