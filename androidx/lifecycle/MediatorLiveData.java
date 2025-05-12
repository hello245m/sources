package androidx.lifecycle;

import androidx.arch.core.internal.SafeIterableMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class MediatorLiveData<T> extends MutableLiveData<T> {
    private SafeIterableMap<LiveData<?>, Source<?>> mSources;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class Source<V> implements Observer<V> {
        public final LiveData<V> mLiveData;
        public final Observer<? super V> mObserver;
        public int mVersion;

        public Source(LiveData<V> liveData, Observer<? super V> observer) {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(V v) {
        }

        public void plug() {
        }

        public void unplug() {
        }
    }

    public <S> void addSource(LiveData<S> liveData, Observer<? super S> observer) {
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
    }

    public <S> void removeSource(LiveData<S> liveData) {
    }
}
