package androidx.lifecycle;

import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class ViewModel {
    private final Map<String, Object> mBagOfTags;
    private volatile boolean mCleared;

    private static void closeWithRuntimeException(Object obj) {
    }

    public final void clear() {
    }

    public <T> T getTag(String str) {
    }

    public void onCleared() {
    }

    public <T> T setTagIfAbsent(String str, T t2) {
    }
}
