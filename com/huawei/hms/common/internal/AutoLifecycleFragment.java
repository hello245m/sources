package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.api.HuaweiApiClient;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class AutoLifecycleFragment extends Fragment {
    private final SparseArray<a> a;
    private boolean b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a {
        public final HuaweiApiClient a;

        public a(int i2, HuaweiApiClient huaweiApiClient) {
        }

        public void a() {
        }
    }

    public static AutoLifecycleFragment getInstance(Activity activity) {
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Fragment
    public void onStart() {
    }

    @Override // android.app.Fragment
    public void onStop() {
    }

    public void startAutoMange(int i2, HuaweiApiClient huaweiApiClient) {
    }

    public void stopAutoManage(int i2) {
    }
}
