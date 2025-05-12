package com.jeremyliao.liveeventbus.core;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface Observable<T> {
    @Deprecated
    void broadcast(T t2);

    void broadcast(T t2, boolean z, boolean z2);

    void observe(LifecycleOwner lifecycleOwner, Observer<T> observer);

    void observeForever(Observer<T> observer);

    void observeSticky(LifecycleOwner lifecycleOwner, Observer<T> observer);

    void observeStickyForever(Observer<T> observer);

    void post(T t2);

    void postAcrossApp(T t2);

    void postAcrossProcess(T t2);

    void postDelay(LifecycleOwner lifecycleOwner, T t2, long j2);

    void postDelay(T t2, long j2);

    void postOrderly(T t2);

    void removeObserver(Observer<T> observer);
}
