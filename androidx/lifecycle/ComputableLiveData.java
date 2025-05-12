package androidx.lifecycle;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class ComputableLiveData<T> {
    public final AtomicBoolean mComputing;
    public final Executor mExecutor;
    public final AtomicBoolean mInvalid;
    public final Runnable mInvalidationRunnable;
    public final LiveData<T> mLiveData;
    public final Runnable mRefreshRunnable;

    /* renamed from: androidx.lifecycle.ComputableLiveData$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends LiveData<T> {
        public final /* synthetic */ ComputableLiveData this$0;

        public AnonymousClass1(ComputableLiveData computableLiveData) {
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
        }
    }

    /* renamed from: androidx.lifecycle.ComputableLiveData$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ ComputableLiveData this$0;

        public AnonymousClass2(ComputableLiveData computableLiveData) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.lifecycle.ComputableLiveData$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ ComputableLiveData this$0;

        public AnonymousClass3(ComputableLiveData computableLiveData) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public ComputableLiveData() {
    }

    public abstract T compute();

    public LiveData<T> getLiveData() {
    }

    public void invalidate() {
    }

    public ComputableLiveData(Executor executor) {
    }
}
