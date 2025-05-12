package androidx.lifecycle;

import n.a0.d;
import n.d0.c.a;
import n.d0.c.p;
import n.u;
import o.a.f2;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class BlockRunner<T> {
    private final p<LiveDataScope<T>, d<? super u>, Object> block;
    private f2 cancellationJob;
    private final CoroutineLiveData<T> liveData;
    private final a<u> onDone;
    private f2 runningJob;
    private final t0 scope;
    private final long timeoutInMs;

    public BlockRunner(CoroutineLiveData<T> coroutineLiveData, p<? super LiveDataScope<T>, ? super d<? super u>, ? extends Object> pVar, long j2, t0 t0Var, a<u> aVar) {
    }

    public static final /* synthetic */ p access$getBlock$p(BlockRunner blockRunner) {
    }

    public static final /* synthetic */ CoroutineLiveData access$getLiveData$p(BlockRunner blockRunner) {
    }

    public static final /* synthetic */ a access$getOnDone$p(BlockRunner blockRunner) {
    }

    public static final /* synthetic */ f2 access$getRunningJob$p(BlockRunner blockRunner) {
    }

    public static final /* synthetic */ long access$getTimeoutInMs$p(BlockRunner blockRunner) {
    }

    public static final /* synthetic */ void access$setRunningJob$p(BlockRunner blockRunner, f2 f2Var) {
    }

    public final void cancel() {
    }

    public final void maybeRun() {
    }
}
