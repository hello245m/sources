package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import n.a0.d;
import n.a0.k.a.f;
import n.a0.k.a.l;
import n.d0.c.p;
import n.d0.d.b0;
import n.u;
import o.a.f2;
import o.a.s;
import o.a.t0;
import o.a.x3.c;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements LifecycleEventObserver {
    public final /* synthetic */ t0 $$this$coroutineScope;
    public final /* synthetic */ p<t0, d<? super u>, Object> $block;
    public final /* synthetic */ Lifecycle.Event $cancelWorkEvent;
    public final /* synthetic */ s<u> $cont;
    public final /* synthetic */ b0<f2> $launchedJob;
    public final /* synthetic */ c $mutex;
    public final /* synthetic */ Lifecycle.Event $startWorkEvent;

    @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class AnonymousClass1 extends l implements p<t0, d<? super u>, Object> {
        public final /* synthetic */ p<t0, d<? super u>, Object> $block;
        public final /* synthetic */ c $mutex;
        public Object L$0;
        public Object L$1;
        public int label;

        public AnonymousClass1(c cVar, p<? super t0, ? super d<? super u>, ? extends Object> pVar, d<? super AnonymousClass1> dVar) {
        }

        @Override // n.a0.k.a.a
        public final d<u> create(Object obj, d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, d<? super u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, d<? super u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(Lifecycle.Event event, b0<f2> b0Var, t0 t0Var, Lifecycle.Event event2, s<? super u> sVar, c cVar, p<? super t0, ? super d<? super u>, ? extends Object> pVar) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }
}
