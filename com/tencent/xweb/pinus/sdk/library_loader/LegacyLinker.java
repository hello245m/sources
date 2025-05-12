package com.tencent.xweb.pinus.sdk.library_loader;

import com.tencent.xweb.pinus.sdk.library_loader.Linker;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class LegacyLinker extends Linker {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TAG = "LegacyLinker";

    public static native boolean nativeAddZipArchivePath(String str);

    public static native int nativeCreateMemoryFile(String str);

    public static native boolean nativeCreateSharedRelro(String str, long j2, Linker.LibInfo libInfo);

    public static native boolean nativeLoadLibrary(String str, long j2, Linker.LibInfo libInfo);

    public static native boolean nativeLoadLibraryByFd(String str, long j2, int i2, boolean z);

    public static native boolean nativeUseSharedRelro(String str, Linker.LibInfo libInfo);

    public static void useSharedRelrosLocked(Linker.LibInfo libInfo) {
    }

    @Override // com.tencent.xweb.pinus.sdk.library_loader.Linker
    public int createMemroyFile(String str) {
    }

    @Override // com.tencent.xweb.pinus.sdk.library_loader.Linker
    public void loadLibraryByFdImplLocked(String str, boolean z, int i2, boolean z2) {
    }

    @Override // com.tencent.xweb.pinus.sdk.library_loader.Linker
    public void loadLibraryImplLocked(String str, boolean z) {
    }

    @Override // com.tencent.xweb.pinus.sdk.library_loader.Linker
    public void setApkFilePath(String str) {
    }
}
