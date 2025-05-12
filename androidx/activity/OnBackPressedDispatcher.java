package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import j.a.d;
import j.a.e;
import java.util.ArrayDeque;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class OnBackPressedDispatcher {
    public final Runnable a;
    public final ArrayDeque<e> b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, d {
        public final Lifecycle a;
        public final e b;
        public d c;
        public final /* synthetic */ OnBackPressedDispatcher d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, e eVar) {
        }

        @Override // j.a.d
        public void cancel() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements d {
        public final e a;
        public final /* synthetic */ OnBackPressedDispatcher b;

        public a(OnBackPressedDispatcher onBackPressedDispatcher, e eVar) {
        }

        @Override // j.a.d
        public void cancel() {
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
    }

    @SuppressLint({"LambdaLast"})
    public void a(LifecycleOwner lifecycleOwner, e eVar) {
    }

    public d b(e eVar) {
    }

    public void c() {
    }
}
