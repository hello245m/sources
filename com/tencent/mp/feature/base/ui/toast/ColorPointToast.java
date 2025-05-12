package com.tencent.mp.feature.base.ui.toast;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.WeakHashMap;
import n.d0.d.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ColorPointToast implements DefaultLifecycleObserver {

    /* renamed from: k, reason: collision with root package name */
    public static final a f1324k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final WeakHashMap<Context, ColorPointToast> f1325l = null;
    public final Context a;
    public final LifecycleOwner b;
    public CharSequence c;
    public int d;
    public long e;
    public final WindowManager f;
    public final View g;
    public final WindowManager.LayoutParams h;

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f1326i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f1327j;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public static /* synthetic */ ColorPointToast c(a aVar, Context context, LifecycleOwner lifecycleOwner, int i2, int i3, long j2, int i4, Object obj) {
        }

        public static /* synthetic */ ColorPointToast d(a aVar, Context context, LifecycleOwner lifecycleOwner, CharSequence charSequence, int i2, long j2, int i3, Object obj) {
        }

        public final ColorPointToast a(Context context, LifecycleOwner lifecycleOwner, int i2, int i3, long j2) {
        }

        public final ColorPointToast b(Context context, LifecycleOwner lifecycleOwner, CharSequence charSequence, int i2, long j2) {
        }
    }

    public ColorPointToast(Context context, LifecycleOwner lifecycleOwner, CharSequence charSequence, int i2, long j2) {
    }

    public /* synthetic */ ColorPointToast(Context context, LifecycleOwner lifecycleOwner, CharSequence charSequence, int i2, long j2, h hVar) {
    }

    public static final /* synthetic */ WeakHashMap a() {
    }

    public static /* synthetic */ void b(ColorPointToast colorPointToast) {
    }

    public static final void c(ColorPointToast colorPointToast) {
    }

    public final void d(CharSequence charSequence) {
    }

    public final void e() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
    }
}
