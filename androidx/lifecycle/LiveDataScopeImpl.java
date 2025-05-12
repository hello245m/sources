package androidx.lifecycle;

import n.a0.d;
import n.a0.g;
import n.u;
import o.a.l1;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    private final g coroutineContext;
    private CoroutineLiveData<T> target;

    public LiveDataScopeImpl(CoroutineLiveData<T> coroutineLiveData, g gVar) {
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emit(T t2, d<? super u> dVar) {
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emitSource(LiveData<T> liveData, d<? super l1> dVar) {
    }

    @Override // androidx.lifecycle.LiveDataScope
    public T getLatestValue() {
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_ktx_release() {
    }

    public final void setTarget$lifecycle_livedata_ktx_release(CoroutineLiveData<T> coroutineLiveData) {
    }
}
