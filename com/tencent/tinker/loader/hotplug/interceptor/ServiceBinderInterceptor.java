package com.tencent.tinker.loader.hotplug.interceptor;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Set;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ServiceBinderInterceptor extends Interceptor<IBinder> {
    public static Method sGetServiceMethod;
    public static Field sSCacheField;
    public static Class<?> sServiceManagerClazz;
    public final Context mBaseContext;
    public final BinderInvocationHandler mBinderInvocationHandler;
    public final String mServiceName;

    /* renamed from: com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 extends ClassLoader {
        public final /* synthetic */ Set val$uniqueCls;

        public AnonymousClass1(Set set) {
        }

        @Override // java.lang.ClassLoader
        public Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface BinderInvocationHandler {
        Object invoke(Object obj, Method method, Object[] objArr) throws Throwable;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class FakeClientBinderHandler implements InvocationHandler {
        public final BinderInvocationHandler mBinderInvocationHandler;
        public final IBinder mOriginalClientBinder;

        public FakeClientBinderHandler(IBinder iBinder, BinderInvocationHandler binderInvocationHandler) {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class FakeInterfaceHandler implements InvocationHandler {
        public final BinderInvocationHandler mBinderInvocationHandler;
        public final IBinder mOriginalClientBinder;
        public final IInterface mOriginalInterface;

        public FakeInterfaceHandler(IInterface iInterface, IBinder iBinder, BinderInvocationHandler binderInvocationHandler) {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        }
    }

    public ServiceBinderInterceptor(Context context, String str, BinderInvocationHandler binderInvocationHandler) {
    }

    public static /* synthetic */ Class[] access$000(Class cls) {
    }

    public static /* synthetic */ Object access$100(Class[] clsArr, InvocationHandler invocationHandler) {
    }

    public static <T> T createProxy(Class<?>[] clsArr, InvocationHandler invocationHandler) {
    }

    public static void fixAMSBinderCache(IBinder iBinder) throws Throwable {
    }

    public static void fixPMSBinderCache(Context context, IBinder iBinder) throws Throwable {
    }

    public static Class<?>[] getAllInterfacesThroughDeriveChain(Class<?> cls) {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    public /* bridge */ /* synthetic */ IBinder decorate(IBinder iBinder) throws Throwable {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    public /* bridge */ /* synthetic */ IBinder fetchTarget() throws Throwable {
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    public /* bridge */ /* synthetic */ void inject(IBinder iBinder) throws Throwable {
    }

    /* renamed from: decorate, reason: avoid collision after fix types in other method */
    public IBinder decorate2(IBinder iBinder) throws Throwable {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tinker.loader.hotplug.interceptor.Interceptor
    public IBinder fetchTarget() throws Throwable {
    }

    /* renamed from: inject, reason: avoid collision after fix types in other method */
    public void inject2(IBinder iBinder) throws Throwable {
    }
}
