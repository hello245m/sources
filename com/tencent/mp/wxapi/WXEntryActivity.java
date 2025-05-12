package com.tencent.mp.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WXEntryActivity extends Activity implements IWXAPIEventHandler, LifecycleOwner {
    public IWXAPI a;
    public LifecycleRegistry b;

    public final void a(SendAuth.Resp resp) {
    }

    public final void b(BaseResp baseResp) {
    }

    public final void c(String str) {
    }

    public final void d(String str) {
    }

    public final void e(Intent intent) {
    }

    public final void f(String str) {
    }

    public final void g(Intent intent) {
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
    }

    public final void h(ShowMessageFromWX.Req req) {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
    }
}
