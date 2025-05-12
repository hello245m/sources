package j.k.d;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class b0 implements HasDefaultViewModelProviderFactory, j.t.c, ViewModelStoreOwner {
    public final Fragment a;
    public final ViewModelStore b;
    public ViewModelProvider.Factory c;
    public LifecycleRegistry d;
    public j.t.b e;

    public b0(Fragment fragment, ViewModelStore viewModelStore) {
    }

    public void a(Lifecycle.Event event) {
    }

    public void b() {
    }

    public boolean c() {
    }

    public void d(Bundle bundle) {
    }

    public void e(Bundle bundle) {
    }

    public void f(Lifecycle.State state) {
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
    }

    @Override // j.t.c
    public SavedStateRegistry getSavedStateRegistry() {
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
    }
}
