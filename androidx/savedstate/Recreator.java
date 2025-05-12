package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import j.t.c;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class Recreator implements GenericLifecycleObserver {
    public final c a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a implements SavedStateRegistry.b {
        public final Set<String> a;

        public a(SavedStateRegistry savedStateRegistry) {
        }

        public void a(String str) {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle saveState() {
        }
    }

    public Recreator(c cVar) {
    }

    public final void a(String str) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }
}
