package androidx.lifecycle;

import n.a0.d;
import n.a0.k.a.f;
import n.a0.k.a.l;
import n.d0.c.p;
import n.u;
import o.a.t0;

@f(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class CoroutineLiveDataKt$addDisposableSource$2 extends l implements p<t0, d<? super EmittedSource>, Object> {
    public final /* synthetic */ LiveData<T> $source;
    public final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;
    public int label;

    /* renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class AnonymousClass1<T> implements Observer {
        public final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;

        public AnonymousClass1(MediatorLiveData<T> mediatorLiveData) {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(T t2) {
        }
    }

    public CoroutineLiveDataKt$addDisposableSource$2(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, d<? super CoroutineLiveDataKt$addDisposableSource$2> dVar) {
    }

    @Override // n.a0.k.a.a
    public final d<u> create(Object obj, d<?> dVar) {
    }

    @Override // n.d0.c.p
    public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, d<? super EmittedSource> dVar) {
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(t0 t0Var, d<? super EmittedSource> dVar) {
    }

    @Override // n.a0.k.a.a
    public final Object invokeSuspend(Object obj) {
    }
}
