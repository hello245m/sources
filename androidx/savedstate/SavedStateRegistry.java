package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.Recreator;
import j.t.c;

@SuppressLint({"RestrictedApi"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class SavedStateRegistry {
    public SafeIterableMap<String, b> a;
    public Bundle b;
    public boolean c;
    public Recreator.a d;
    public boolean e;

    /* renamed from: androidx.savedstate.SavedStateRegistry$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements GenericLifecycleObserver {
        public final /* synthetic */ SavedStateRegistry a;

        public AnonymousClass1(SavedStateRegistry savedStateRegistry) {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        void onRecreated(c cVar);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        Bundle saveState();
    }

    public Bundle a(String str) {
    }

    public void b(Lifecycle lifecycle, Bundle bundle) {
    }

    public void c(Bundle bundle) {
    }

    public void d(String str, b bVar) {
    }

    public void e(Class<? extends a> cls) {
    }
}
