package com.tencent.rmonitor.base.meta;

import com.tencent.bugly.common.utils.RecyclablePool;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class InspectUUID extends RecyclablePool.Recyclable {
    public String cache;
    public String className;
    public String digest;
    public char[] uuid;
    public WeakReference<Object> weakObj;

    @Override // com.tencent.bugly.common.utils.RecyclablePool.Recyclable
    public void reset() {
    }

    public String toString() {
    }
}
