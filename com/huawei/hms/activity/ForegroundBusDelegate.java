package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.ForegroundInnerHeader;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ForegroundBusDelegate implements IBridgeActivityDelegate {
    public static final String HMS_FOREGROUND_REQ_BODY = "HMS_FOREGROUND_REQ_BODY";
    public static final String HMS_FOREGROUND_REQ_HEADER = "HMS_FOREGROUND_REQ_HEADER";
    public static final String HMS_FOREGROUND_REQ_INNER = "HMS_FOREGROUND_REQ_INNER";
    public static final String HMS_FOREGROUND_RESP_HEADER = "HMS_FOREGROUND_RESP_HEADER";
    public static final String INNER_PKG_NAME = "INNER_PACKAGE_NAME";
    private RequestHeader a;
    private String b;
    private ForegroundInnerHeader c;
    private ResponseHeader d;
    private WeakReference<Activity> e;
    private boolean f;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class MyAvailableCallBack implements AvailableAdapter.AvailableCallBack {
        public final /* synthetic */ ForegroundBusDelegate a;

        private MyAvailableCallBack(ForegroundBusDelegate foregroundBusDelegate) {
        }

        @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
        public void onComplete(int i2) {
        }

        public /* synthetic */ MyAvailableCallBack(ForegroundBusDelegate foregroundBusDelegate, AnonymousClass1 anonymousClass1) {
        }
    }

    public static /* synthetic */ void a(ForegroundBusDelegate foregroundBusDelegate) {
    }

    private BusResponseCallback b(String str) {
    }

    private void c() {
    }

    private void d() {
    }

    private void e() {
    }

    private void f() {
    }

    private Activity g() {
    }

    private void h() {
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

    public static /* synthetic */ void a(ForegroundBusDelegate foregroundBusDelegate, int i2, String str) {
    }

    private void b() {
    }

    private void a(int i2, Intent intent) {
    }

    private void a(int i2, String str) {
    }

    private static void a(Activity activity, AvailableAdapter availableAdapter, AvailableAdapter.AvailableCallBack availableCallBack) {
    }

    private void a() {
    }

    private void a(String str) {
    }
}
