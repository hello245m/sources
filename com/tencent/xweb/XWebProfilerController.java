package com.tencent.xweb;

import java.util.concurrent.ConcurrentMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebProfilerController implements IProfilerController {
    public static final String TAG = "XWebProfilerController";
    public boolean mHasProfileInit;
    public final ConcurrentMap<String, IProfileResultCallback> mResultCallbackMap;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class Holder {
        public static final XWebProfilerController INSTANCE = null;

        public static /* synthetic */ XWebProfilerController access$000() {
        }
    }

    public /* synthetic */ XWebProfilerController(AnonymousClass1 anonymousClass1) {
    }

    private void dispatchResultNG(Object obj) {
    }

    public static XWebProfilerController getInstance() {
    }

    private boolean setNeedResultForwardToSdk(boolean z, String str) {
    }

    @Override // com.tencent.xweb.IProfilerController
    public void forceEnableFrameCostProfile(boolean z) {
    }

    @Override // com.tencent.xweb.IProfilerController
    public void forceFlushCategory(String str) {
    }

    @Override // com.tencent.xweb.IProfilerController
    public void initProfile() {
    }

    public void onProfileStop(Object obj) {
    }

    @Override // com.tencent.xweb.IProfilerController
    public void setAllKindsFpsProfileEnable(boolean z) {
    }

    @Override // com.tencent.xweb.IProfilerController
    public void setProfileConfig(String str, int i2, int i3, boolean z) {
    }

    @Override // com.tencent.xweb.IProfilerController
    public boolean setProfileResultCallback(String str, IProfileResultCallback iProfileResultCallback) {
    }

    public XWebProfilerController() {
    }
}
