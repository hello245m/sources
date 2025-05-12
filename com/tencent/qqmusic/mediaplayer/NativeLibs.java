package com.tencent.qqmusic.mediaplayer;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class NativeLibs {
    private static final /* synthetic */ NativeLibs[] $VALUES = null;
    public static final NativeLibs FFmpeg = null;
    public static final NativeLibs QmNativeDataSource = null;
    private static final SparseArray<String> SUFFIX = null;
    private static final String TAG = "NativeLibs";
    public static final NativeLibs audioCommon = null;
    public static final NativeLibs codecFactory = null;
    public static final NativeLibs cppShared = null;
    public static final NativeLibs decoderJni = null;
    public static final NativeLibs formatDetector = null;
    public static final NativeLibs nlog = null;
    public static final NativeLibs stlportShared = null;
    public static final NativeLibs xlog = null;
    private boolean mHasLoadSoSuccess;
    private final String name;
    private final long supportedAbi;

    private NativeLibs(String str, int i2, String str2, long j2) {
    }

    public static boolean loadAll(NativeLibs... nativeLibsArr) {
    }

    private boolean loadLibrary(String str) {
    }

    public static NativeLibs valueOf(String str) {
    }

    public static NativeLibs[] values() {
    }

    public String getName() {
    }

    public boolean load() {
    }

    public boolean supportAbi(int i2) {
    }

    public static boolean loadAll(Iterable<NativeLibs> iterable) {
    }
}
