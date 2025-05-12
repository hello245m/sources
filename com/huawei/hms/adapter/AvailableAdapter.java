package com.huawei.hms.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.adapter.sysobs.SystemObserver;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class AvailableAdapter {
    public final int a;
    public AvailableCallBack b;
    public boolean c;
    public SystemObserver d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface AvailableCallBack {
        void onComplete(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements SystemObserver {
        public final /* synthetic */ AvailableAdapter a;

        public a(AvailableAdapter availableAdapter) {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onNoticeResult(int i2) {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onSolutionResult(Intent intent, String str) {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onUpdateResult(int i2) {
        }
    }

    public AvailableAdapter(int i2) {
    }

    public static /* synthetic */ AvailableCallBack a(AvailableAdapter availableAdapter) {
    }

    public final void b(Context context) {
    }

    public int checkHuaweiMobileServicesForUpdate(Context context) {
    }

    public int isHuaweiMobileServicesAvailable(Context context) {
    }

    public boolean isUserNoticeError(int i2) {
    }

    public boolean isUserResolvableError(int i2) {
    }

    public void setCalledBySolutionInstallHms(boolean z) {
    }

    public void startNotice(Activity activity, AvailableCallBack availableCallBack) {
    }

    public void startResolution(Activity activity, AvailableCallBack availableCallBack) {
    }

    public final int a(Context context) {
    }

    public final void a(Activity activity, AvailableCallBack availableCallBack) {
    }

    public final boolean a(Activity activity) {
    }

    public final AvailableCallBack a() {
    }
}
