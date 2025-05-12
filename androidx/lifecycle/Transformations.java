package androidx.lifecycle;

import androidx.arch.core.util.Function;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Transformations {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* renamed from: androidx.lifecycle.Transformations$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1<X> implements Observer<X> {
        public final /* synthetic */ Function val$mapFunction;
        public final /* synthetic */ MediatorLiveData val$result;

        public AnonymousClass1(MediatorLiveData mediatorLiveData, Function function) {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(X x) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* renamed from: androidx.lifecycle.Transformations$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2<X> implements Observer<X> {
        public LiveData<Y> mSource;
        public final /* synthetic */ MediatorLiveData val$result;
        public final /* synthetic */ Function val$switchMapFunction;

        /* JADX INFO: Add missing generic type declarations: [Y] */
        /* renamed from: androidx.lifecycle.Transformations$2$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1<Y> implements Observer<Y> {
            public final /* synthetic */ AnonymousClass2 this$0;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Y y) {
            }
        }

        public AnonymousClass2(Function function, MediatorLiveData mediatorLiveData) {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(X x) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* renamed from: androidx.lifecycle.Transformations$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3<X> implements Observer<X> {
        public boolean mFirstTime;
        public final /* synthetic */ MediatorLiveData val$outputLiveData;

        public AnonymousClass3(MediatorLiveData mediatorLiveData) {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(X x) {
        }
    }

    private Transformations() {
    }

    public static <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
    }

    public static <X, Y> LiveData<Y> map(LiveData<X> liveData, Function<X, Y> function) {
    }

    public static <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, Function<X, LiveData<Y>> function) {
    }
}
