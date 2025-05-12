package com.jeremyliao.liveeventbus.core;

import android.os.Handler;
import androidx.lifecycle.ExternalLiveData;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.ipc.receiver.LebIpcReceiver;
import com.jeremyliao.liveeventbus.logger.Logger;
import com.jeremyliao.liveeventbus.logger.LoggerManager;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class LiveEventBusCore {
    private boolean autoClear;
    private final Map<String, LiveEvent<Object>> bus;
    private final Config config;
    public final InnerConsole console;
    private boolean isRegisterReceiver;
    private boolean lifecycleObserverAlwaysActive;
    private LoggerManager logger;
    private final Map<String, ObservableConfig> observableConfigs;
    private LebIpcReceiver receiver;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class InnerConsole {
        public final /* synthetic */ LiveEventBusCore this$0;

        public InnerConsole(LiveEventBusCore liveEventBusCore) {
        }

        private int getActiveCount(LiveData liveData) {
        }

        private int getObserverCount(LiveData liveData) {
        }

        private String getObserverInfo(LiveData liveData) {
        }

        public String getBaseInfo() {
        }

        public String getBusInfo() {
        }

        public String getConsoleInfo() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class LiveEvent<T> implements Observable<T> {
        private final String key;
        private final LiveEvent<T>.LifecycleLiveData<T> liveData;
        private final Handler mainHandler;
        private final Map<Observer, ObserverWrapper<T>> observerMap;
        public final /* synthetic */ LiveEventBusCore this$0;

        /* renamed from: com.jeremyliao.liveeventbus.core.LiveEventBusCore$LiveEvent$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ LiveEvent this$1;
            public final /* synthetic */ boolean val$foreground;
            public final /* synthetic */ boolean val$onlyInApp;
            public final /* synthetic */ Object val$value;

            public AnonymousClass1(LiveEvent liveEvent, Object obj, boolean z, boolean z2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.jeremyliao.liveeventbus.core.LiveEventBusCore$LiveEvent$2, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ LiveEvent this$1;
            public final /* synthetic */ Observer val$observer;
            public final /* synthetic */ LifecycleOwner val$owner;

            public AnonymousClass2(LiveEvent liveEvent, LifecycleOwner lifecycleOwner, Observer observer) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.jeremyliao.liveeventbus.core.LiveEventBusCore$LiveEvent$3, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass3 implements Runnable {
            public final /* synthetic */ LiveEvent this$1;
            public final /* synthetic */ Observer val$observer;
            public final /* synthetic */ LifecycleOwner val$owner;

            public AnonymousClass3(LiveEvent liveEvent, LifecycleOwner lifecycleOwner, Observer observer) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.jeremyliao.liveeventbus.core.LiveEventBusCore$LiveEvent$4, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass4 implements Runnable {
            public final /* synthetic */ LiveEvent this$1;
            public final /* synthetic */ Observer val$observer;

            public AnonymousClass4(LiveEvent liveEvent, Observer observer) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.jeremyliao.liveeventbus.core.LiveEventBusCore$LiveEvent$5, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass5 implements Runnable {
            public final /* synthetic */ LiveEvent this$1;
            public final /* synthetic */ Observer val$observer;

            public AnonymousClass5(LiveEvent liveEvent, Observer observer) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.jeremyliao.liveeventbus.core.LiveEventBusCore$LiveEvent$6, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class AnonymousClass6 implements Runnable {
            public final /* synthetic */ LiveEvent this$1;
            public final /* synthetic */ Observer val$observer;

            public AnonymousClass6(LiveEvent liveEvent, Observer observer) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class LifecycleLiveData<T> extends ExternalLiveData<T> {
            private final String key;
            public final /* synthetic */ LiveEvent this$1;

            public LifecycleLiveData(LiveEvent liveEvent, String str) {
            }

            private boolean autoClear() {
            }

            private boolean lifecycleObserverAlwaysActive() {
            }

            @Override // androidx.lifecycle.ExternalLiveData
            public Lifecycle.State observerActiveLevel() {
            }

            @Override // androidx.lifecycle.LiveData
            public void removeObserver(Observer<? super T> observer) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class PostLifeValueTask implements Runnable {
            private Object newValue;
            private LifecycleOwner owner;
            public final /* synthetic */ LiveEvent this$1;

            public PostLifeValueTask(LiveEvent liveEvent, Object obj, LifecycleOwner lifecycleOwner) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class PostValueTask implements Runnable {
            private Object newValue;
            public final /* synthetic */ LiveEvent this$1;

            public PostValueTask(LiveEvent liveEvent, Object obj) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public LiveEvent(LiveEventBusCore liveEventBusCore, String str) {
        }

        public static /* synthetic */ LifecycleLiveData access$1000(LiveEvent liveEvent) {
        }

        public static /* synthetic */ void access$1500(LiveEvent liveEvent, Object obj) {
        }

        public static /* synthetic */ void access$200(LiveEvent liveEvent, Object obj, boolean z, boolean z2) {
        }

        public static /* synthetic */ void access$300(LiveEvent liveEvent, LifecycleOwner lifecycleOwner, Observer observer) {
        }

        public static /* synthetic */ void access$400(LiveEvent liveEvent, LifecycleOwner lifecycleOwner, Observer observer) {
        }

        public static /* synthetic */ void access$500(LiveEvent liveEvent, Observer observer) {
        }

        public static /* synthetic */ void access$600(LiveEvent liveEvent, Observer observer) {
        }

        public static /* synthetic */ void access$700(LiveEvent liveEvent, Observer observer) {
        }

        private void broadcastInternal(T t2, boolean z, boolean z2) {
        }

        private void observeForeverInternal(Observer<T> observer) {
        }

        private void observeInternal(LifecycleOwner lifecycleOwner, Observer<T> observer) {
        }

        private void observeStickyForeverInternal(Observer<T> observer) {
        }

        private void observeStickyInternal(LifecycleOwner lifecycleOwner, Observer<T> observer) {
        }

        private void postInternal(T t2) {
        }

        private void removeObserverInternal(Observer<T> observer) {
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        @Deprecated
        public void broadcast(T t2) {
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observe(LifecycleOwner lifecycleOwner, Observer<T> observer) {
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observeForever(Observer<T> observer) {
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observeSticky(LifecycleOwner lifecycleOwner, Observer<T> observer) {
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void observeStickyForever(Observer<T> observer) {
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void post(T t2) {
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postAcrossApp(T t2) {
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postAcrossProcess(T t2) {
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postDelay(T t2, long j2) {
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postOrderly(T t2) {
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void removeObserver(Observer<T> observer) {
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void broadcast(T t2, boolean z, boolean z2) {
        }

        @Override // com.jeremyliao.liveeventbus.core.Observable
        public void postDelay(LifecycleOwner lifecycleOwner, T t2, long j2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class ObserverWrapper<T> implements Observer<T> {
        private final Observer<T> observer;
        private boolean preventNextEvent;
        public final /* synthetic */ LiveEventBusCore this$0;

        public ObserverWrapper(LiveEventBusCore liveEventBusCore, Observer<T> observer) {
        }

        public static /* synthetic */ boolean access$902(ObserverWrapper observerWrapper, boolean z) {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(T t2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class SingletonHolder {
        private static final LiveEventBusCore DEFAULT_BUS = null;

        private SingletonHolder() {
        }

        public static /* synthetic */ LiveEventBusCore access$100() {
        }
    }

    public /* synthetic */ LiveEventBusCore(AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ Map access$1100(LiveEventBusCore liveEventBusCore) {
    }

    public static /* synthetic */ Map access$1200(LiveEventBusCore liveEventBusCore) {
    }

    public static /* synthetic */ boolean access$1300(LiveEventBusCore liveEventBusCore) {
    }

    public static /* synthetic */ boolean access$1400(LiveEventBusCore liveEventBusCore) {
    }

    public static /* synthetic */ boolean access$1600(LiveEventBusCore liveEventBusCore) {
    }

    public static /* synthetic */ LoggerManager access$800(LiveEventBusCore liveEventBusCore) {
    }

    public static LiveEventBusCore get() {
    }

    public Config config() {
    }

    public void enableLogger(boolean z) {
    }

    public void registerReceiver() {
    }

    public void setAutoClear(boolean z) {
    }

    public void setLifecycleObserverAlwaysActive(boolean z) {
    }

    public void setLogger(Logger logger) {
    }

    public synchronized <T> Observable<T> with(String str, Class<T> cls) {
    }

    private LiveEventBusCore() {
    }

    public ObservableConfig config(String str) {
    }
}
