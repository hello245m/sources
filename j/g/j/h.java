package j.g.j;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import j.g.t.m;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class h extends Activity implements LifecycleOwner, m.a {
    private j.d.g<Class<? extends a>, a> mExtraDataMap;
    private LifecycleRegistry mLifecycleRegistry;

    @Deprecated
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a {
    }

    private static boolean shouldSkipDump(String[] strArr) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
    }

    @Deprecated
    public <T extends a> T getExtraData(Class<T> cls) {
    }

    public Lifecycle getLifecycle() {
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Deprecated
    public void putExtraData(a aVar) {
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
    }

    @Override // j.g.t.m.a
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
    }
}
