package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ImmLeaksCleaner implements LifecycleEventObserver {
    public static int b;
    public static Field c;
    public static Field d;
    public static Field e;
    public Activity a;

    public ImmLeaksCleaner(Activity activity) {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }
}
