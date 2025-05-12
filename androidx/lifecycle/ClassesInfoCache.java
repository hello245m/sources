package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class ClassesInfoCache {
    private static final int CALL_TYPE_NO_ARG = 0;
    private static final int CALL_TYPE_PROVIDER = 1;
    private static final int CALL_TYPE_PROVIDER_WITH_EVENT = 2;
    public static ClassesInfoCache sInstance;
    private final Map<Class<?>, CallbackInfo> mCallbackMap;
    private final Map<Class<?>, Boolean> mHasLifecycleMethods;

    @Deprecated
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class CallbackInfo {
        public final Map<Lifecycle.Event, List<MethodReference>> mEventToHandlers;
        public final Map<MethodReference, Lifecycle.Event> mHandlerToEvent;

        public CallbackInfo(Map<MethodReference, Lifecycle.Event> map) {
        }

        private static void invokeMethodsForEvent(List<MethodReference> list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
        }

        public void invokeCallbacks(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
        }
    }

    @Deprecated
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class MethodReference {
        public final int mCallType;
        public final Method mMethod;

        public MethodReference(int i2, Method method) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public void invokeCallback(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
        }
    }

    private CallbackInfo createInfo(Class<?> cls, Method[] methodArr) {
    }

    private Method[] getDeclaredMethods(Class<?> cls) {
    }

    private void verifyAndPutHandler(Map<MethodReference, Lifecycle.Event> map, MethodReference methodReference, Lifecycle.Event event, Class<?> cls) {
    }

    public CallbackInfo getInfo(Class<?> cls) {
    }

    public boolean hasLifecycleMethods(Class<?> cls) {
    }
}
