package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import n.d;
import n.d0.c.a;
import n.i0.b;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ViewModelLazy<VM extends ViewModel> implements d<VM> {
    private VM cached;
    private final a<ViewModelProvider.Factory> factoryProducer;
    private final a<ViewModelStore> storeProducer;
    private final b<VM> viewModelClass;

    public ViewModelLazy(b<VM> bVar, a<? extends ViewModelStore> aVar, a<? extends ViewModelProvider.Factory> aVar2) {
    }

    @Override // n.d
    public /* bridge */ /* synthetic */ Object getValue() {
    }

    public boolean isInitialized() {
    }

    @Override // n.d
    public VM getValue() {
    }
}
