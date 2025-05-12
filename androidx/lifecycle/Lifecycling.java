package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;
    private static Map<Class<?>, Integer> sCallbackCache;
    private static Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> sClassToAdapters;

    /* renamed from: androidx.lifecycle.Lifecycling$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements GenericLifecycleObserver {
        public final /* synthetic */ LifecycleEventObserver val$observer;

        public AnonymousClass1(LifecycleEventObserver lifecycleEventObserver) {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }
    }

    private Lifecycling() {
    }

    private static GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
    }

    private static Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> cls) {
    }

    public static String getAdapterName(String str) {
    }

    @Deprecated
    public static GenericLifecycleObserver getCallback(Object obj) {
    }

    private static int getObserverConstructorType(Class<?> cls) {
    }

    private static boolean isLifecycleParent(Class<?> cls) {
    }

    public static LifecycleEventObserver lifecycleEventObserver(Object obj) {
    }

    private static int resolveObserverCallbackType(Class<?> cls) {
    }
}
