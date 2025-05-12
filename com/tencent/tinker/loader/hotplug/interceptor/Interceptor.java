package com.tencent.tinker.loader.hotplug.interceptor;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class Interceptor<T_TARGET> {
    public volatile boolean mInstalled;
    public T_TARGET mTarget;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface ITinkerHotplugProxy {
    }

    public T_TARGET decorate(T_TARGET t_target) throws Throwable {
    }

    public abstract T_TARGET fetchTarget() throws Throwable;

    public abstract void inject(T_TARGET t_target) throws Throwable;

    public synchronized void install() throws InterceptFailedException {
    }

    public synchronized void uninstall() throws InterceptFailedException {
    }
}
