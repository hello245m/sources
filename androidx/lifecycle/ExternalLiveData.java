package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ExternalLiveData<T> extends MutableLiveData<T> {
    public static final int START_VERSION = -1;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class ExternalLifecycleBoundObserver extends LiveData<T>.LifecycleBoundObserver {
        public final /* synthetic */ ExternalLiveData this$0;

        public ExternalLifecycleBoundObserver(ExternalLiveData externalLiveData, LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        }

        @Override // androidx.lifecycle.LiveData.LifecycleBoundObserver, androidx.lifecycle.LiveData.ObserverWrapper
        public boolean shouldBeActive() {
        }
    }

    private Object callMethodPutIfAbsent(Object obj, Object obj2) throws Exception {
    }

    private Object getFieldObservers() throws Exception {
    }

    @Override // androidx.lifecycle.LiveData
    public int getVersion() {
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
    }

    public Lifecycle.State observerActiveLevel() {
    }
}
