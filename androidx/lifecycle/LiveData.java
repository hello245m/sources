package androidx.lifecycle;

import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class LiveData<T> {
    public static final Object NOT_SET = null;
    public static final int START_VERSION = -1;
    public int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    public final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper> mObservers;
    public volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    /* renamed from: androidx.lifecycle.LiveData$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ LiveData this$0;

        public AnonymousClass1(LiveData liveData) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper {
        public final /* synthetic */ LiveData this$0;

        public AlwaysActiveObserver(LiveData liveData, Observer<? super T> observer) {
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean shouldBeActive() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements LifecycleEventObserver {
        public final LifecycleOwner mOwner;
        public final /* synthetic */ LiveData this$0;

        public LifecycleBoundObserver(LiveData liveData, LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public void detachObserver() {
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean isAttachedTo(LifecycleOwner lifecycleOwner) {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean shouldBeActive() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public abstract class ObserverWrapper {
        public boolean mActive;
        public int mLastVersion;
        public final Observer<? super T> mObserver;
        public final /* synthetic */ LiveData this$0;

        public ObserverWrapper(LiveData liveData, Observer<? super T> observer) {
        }

        public void activeStateChanged(boolean z) {
        }

        public void detachObserver() {
        }

        public boolean isAttachedTo(LifecycleOwner lifecycleOwner) {
        }

        public abstract boolean shouldBeActive();
    }

    public LiveData(T t2) {
    }

    public static void assertMainThread(String str) {
    }

    private void considerNotify(LiveData<T>.ObserverWrapper observerWrapper) {
    }

    public void changeActiveCounter(int i2) {
    }

    public void dispatchingValue(LiveData<T>.ObserverWrapper observerWrapper) {
    }

    public T getValue() {
    }

    public int getVersion() {
    }

    public boolean hasActiveObservers() {
    }

    public boolean hasObservers() {
    }

    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
    }

    public void observeForever(Observer<? super T> observer) {
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t2) {
    }

    public void removeObserver(Observer<? super T> observer) {
    }

    public void removeObservers(LifecycleOwner lifecycleOwner) {
    }

    public void setValue(T t2) {
    }

    public LiveData() {
    }
}
