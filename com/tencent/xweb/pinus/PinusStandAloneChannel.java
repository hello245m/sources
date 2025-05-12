package com.tencent.xweb.pinus;

import com.tencent.xweb.pinus.sdk.PSLogChannelListener;
import com.tencent.xweb.pinus.sdk.PSNotifyChannelListener;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PinusStandAloneChannel {
    public static final int LOADED_ARCH_NOT_MATCH = -1;
    public static final int LOADED_BY_RUNTIME = 1;
    public static final int LOADED_BY_SDK = 0;
    public static final String TAG = "PinusStandAloneChannel";
    public Boolean isSupportLoadXWebLibraryInRuntime;
    public ClassLoader mClassLoader;
    public long mFirstGetClassLoaderCostTime;
    public boolean mHasInited;
    public boolean mInitedResult;

    /* renamed from: com.tencent.xweb.pinus.PinusStandAloneChannel$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements PSNotifyChannelListener {
        public final /* synthetic */ PinusStandAloneChannel this$0;

        public AnonymousClass1(PinusStandAloneChannel pinusStandAloneChannel) {
        }

        @Override // com.tencent.xweb.pinus.sdk.PSNotifyChannelListener
        public void onNotifyCallBackChannel(int i2, Object[] objArr) {
        }
    }

    /* renamed from: com.tencent.xweb.pinus.PinusStandAloneChannel$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements PSLogChannelListener {
        public final /* synthetic */ PinusStandAloneChannel this$0;

        public AnonymousClass2(PinusStandAloneChannel pinusStandAloneChannel) {
        }

        private String resetLogFileByInfo(String str) {
        }

        private String resetLogTagByFile(String str) {
        }

        @Override // com.tencent.xweb.pinus.sdk.PSLogChannelListener
        public void onLogMessage(int i2, String str, int i3, String str2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class SingletonHolder {
        public static final PinusStandAloneChannel sInstance = null;
    }

    public /* synthetic */ PinusStandAloneChannel(AnonymousClass1 anonymousClass1) {
    }

    private boolean checkCoreApk() {
    }

    public static PinusStandAloneChannel getInstance() {
    }

    private boolean initCoreBridge() {
    }

    private boolean initLogChannel() {
    }

    private boolean initNotifyChannel() {
    }

    private boolean initRuntimeToSdkChannel() {
    }

    private boolean isSupportStandAloneMode() {
    }

    private boolean loadNativeLibrary() {
    }

    private boolean loadNativeLibraryBySDK() {
    }

    private boolean loadNativeLibraryDefault() {
    }

    private void loadNativeLibraryInternal() throws RuntimeException {
    }

    private boolean setStandAloneMode(boolean z) {
    }

    private boolean supportLoadXWebLibraryInRuntimeInner(ClassLoader classLoader) {
    }

    public Class<?> getBridgeClass(String str) {
    }

    public synchronized ClassLoader getClassLoader() {
    }

    public boolean hasFeature(int i2) {
    }

    public synchronized boolean initChannels(boolean z, boolean z2) {
    }

    public boolean invokeNativeChannel(int i2, Object[] objArr) {
    }

    public Object invokeRuntimeChannel(int i2, Object[] objArr) {
    }

    public boolean supportLoadXWebLibraryInRuntime(ClassLoader classLoader) {
    }

    public PinusStandAloneChannel() {
    }
}
