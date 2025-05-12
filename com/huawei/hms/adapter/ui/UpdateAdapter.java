package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.update.ui.UpdateBean;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class UpdateAdapter implements IBridgeActivityDelegate {
    public WeakReference<Activity> a;
    public Context b;
    public int c;
    public UpdateBean d;
    public boolean e;

    public static Object invokeMethod(String str, String str2, Object[] objArr) {
    }

    public final boolean a(Intent intent, Activity activity) {
    }

    public final Activity b() {
    }

    public final void c() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i2, KeyEvent keyEvent) {
    }

    public final void a(Intent intent) {
    }

    public final void a() {
    }

    public final boolean a(Context context, String str, int i2) {
    }
}
