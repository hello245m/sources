package androidx.lifecycle;

import n.a0.d;
import n.a0.g;
import n.d0.c.a;
import n.d0.c.p;
import n.d0.d.h;
import n.d0.d.o;
import n.u;
import o.a.l1;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {
    private BlockRunner<T> blockRunner;
    private EmittedSource emittedSource;

    /* renamed from: androidx.lifecycle.CoroutineLiveData$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class AnonymousClass1 extends o implements a<u> {
        public final /* synthetic */ CoroutineLiveData<T> this$0;

        public AnonymousClass1(CoroutineLiveData<T> coroutineLiveData) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public /* synthetic */ CoroutineLiveData(g gVar, long j2, p pVar, int i2, h hVar) {
    }

    public static final /* synthetic */ void access$setBlockRunner$p(CoroutineLiveData coroutineLiveData, BlockRunner blockRunner) {
    }

    public final Object clearSource$lifecycle_livedata_ktx_release(d<? super u> dVar) {
    }

    public final Object emitSource$lifecycle_livedata_ktx_release(LiveData<T> liveData, d<? super l1> dVar) {
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onActive() {
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onInactive() {
    }

    public CoroutineLiveData(g gVar, long j2, p<? super LiveDataScope<T>, ? super d<? super u>, ? extends Object> pVar) {
    }
}
