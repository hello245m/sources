package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class BridgeActivity extends Activity {
    public static final String EXTRA_DELEGATE_CLASS_NAME = "intent.extra.DELEGATE_CLASS_OBJECT";
    public static final String EXTRA_DELEGATE_UPDATE_INFO = "intent.extra.update.info";
    public static final String EXTRA_INTENT = "intent.extra.intent";
    public static final String EXTRA_IS_FULLSCREEN = "intent.extra.isfullscreen";
    public static final String EXTRA_RESULT = "intent.extra.RESULT";
    public static final int b = 0;
    public IBridgeActivityDelegate a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements View.OnApplyWindowInsetsListener {
        public final /* synthetic */ ViewGroup a;

        public a(BridgeActivity bridgeActivity, ViewGroup viewGroup) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        }
    }

    public static void a(Window window, boolean z) {
    }

    public static Intent getIntentStartBridgeActivity(Activity activity, String str) {
    }

    public static void setFullScreenWindowLayoutInDisplayCutout(Window window) {
    }

    public final boolean b() {
    }

    public final void c() {
    }

    @Override // android.app.Activity
    public void finish() {
    }

    @Override // android.app.Activity
    public Intent getIntent() {
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onDestroy() {
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
    }

    public static Intent getIntentStartBridgeActivity(Context context, String str) {
    }

    public final void a() {
    }

    public static int a(String str, int i2) {
    }
}
