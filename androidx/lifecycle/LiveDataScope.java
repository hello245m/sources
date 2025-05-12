package androidx.lifecycle;

import n.a0.d;
import n.u;
import o.a.l1;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface LiveDataScope<T> {
    Object emit(T t2, d<? super u> dVar);

    Object emitSource(LiveData<T> liveData, d<? super l1> dVar);

    T getLatestValue();
}
