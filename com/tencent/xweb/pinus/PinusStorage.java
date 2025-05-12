package com.tencent.xweb.pinus;

import android.webkit.ValueCallback;
import com.tencent.xweb.internal.IWebStorage;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PinusStorage implements IWebStorage {
    public static final String TAG = "PinusStorage";

    @Override // com.tencent.xweb.internal.IWebStorage
    public void deleteAllData() {
    }

    @Override // com.tencent.xweb.internal.IWebStorage
    public void deleteOrigin(String str) {
    }

    @Override // com.tencent.xweb.internal.IWebStorage
    public void getOrigins(ValueCallback<Map> valueCallback) {
    }

    @Override // com.tencent.xweb.internal.IWebStorage
    public void getQuotaForOrigin(String str, ValueCallback<Long> valueCallback) {
    }

    @Override // com.tencent.xweb.internal.IWebStorage
    public void getUsageForOrigin(String str, ValueCallback<Long> valueCallback) {
    }

    @Override // com.tencent.xweb.internal.IWebStorage
    public void setQuotaForOrigin(String str, long j2) {
    }
}
