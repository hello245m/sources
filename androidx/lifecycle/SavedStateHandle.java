package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class SavedStateHandle {
    private static final Class[] ACCEPTABLE_CLASSES = null;
    private static final String KEYS = "keys";
    private static final String VALUES = "values";
    private final Map<String, SavingStateLiveData<?>> mLiveDatas;
    public final Map<String, Object> mRegular;
    private final SavedStateRegistry.b mSavedStateProvider;
    public final Map<String, SavedStateRegistry.b> mSavedStateProviders;

    /* renamed from: androidx.lifecycle.SavedStateHandle$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements SavedStateRegistry.b {
        public final /* synthetic */ SavedStateHandle this$0;

        public AnonymousClass1(SavedStateHandle savedStateHandle) {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle saveState() {
        }
    }

    public SavedStateHandle(Map<String, Object> map) {
    }

    public static SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
    }

    private <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z, T t2) {
    }

    private static void validateValue(Object obj) {
    }

    public void clearSavedStateProvider(String str) {
    }

    public boolean contains(String str) {
    }

    public <T> T get(String str) {
    }

    public <T> MutableLiveData<T> getLiveData(String str) {
    }

    public Set<String> keys() {
    }

    public <T> T remove(String str) {
    }

    public SavedStateRegistry.b savedStateProvider() {
    }

    public <T> void set(String str, T t2) {
    }

    public void setSavedStateProvider(String str, SavedStateRegistry.b bVar) {
    }

    public <T> MutableLiveData<T> getLiveData(String str, @SuppressLint({"UnknownNullness"}) T t2) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle mHandle;
        private String mKey;

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str, T t2) {
        }

        public void detach() {
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t2) {
        }

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str) {
        }
    }

    public SavedStateHandle() {
    }
}
