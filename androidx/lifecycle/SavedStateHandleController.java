package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import j.t.c;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class SavedStateHandleController implements LifecycleEventObserver {
    public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
    private final SavedStateHandle mHandle;
    private boolean mIsAttached;
    private final String mKey;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements LifecycleEventObserver {
        public final /* synthetic */ Lifecycle val$lifecycle;
        public final /* synthetic */ SavedStateRegistry val$registry;

        public AnonymousClass1(Lifecycle lifecycle, SavedStateRegistry savedStateRegistry) {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class OnRecreation implements SavedStateRegistry.a {
        @Override // androidx.savedstate.SavedStateRegistry.a
        public void onRecreated(c cVar) {
        }
    }

    public SavedStateHandleController(String str, SavedStateHandle savedStateHandle) {
    }

    public static void attachHandleIfNeeded(ViewModel viewModel, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
    }

    public static SavedStateHandleController create(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, String str, Bundle bundle) {
    }

    private static void tryToAddRecreator(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
    }

    public void attachToLifecycle(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
    }

    public SavedStateHandle getHandle() {
    }

    public boolean isAttached() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }
}
