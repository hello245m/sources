package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class LifecycleRegistry extends Lifecycle {
    private int mAddingObserverCounter;
    private final boolean mEnforceMainThread;
    private boolean mHandlingEvent;
    private final WeakReference<LifecycleOwner> mLifecycleOwner;
    private boolean mNewEventOccurred;
    private FastSafeIterableMap<LifecycleObserver, ObserverWithState> mObserverMap;
    private ArrayList<Lifecycle.State> mParentStates;
    private Lifecycle.State mState;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class ObserverWithState {
        public LifecycleEventObserver mLifecycleObserver;
        public Lifecycle.State mState;

        public ObserverWithState(LifecycleObserver lifecycleObserver, Lifecycle.State state) {
        }

        public void dispatchEvent(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
    }

    private void backwardPass(LifecycleOwner lifecycleOwner) {
    }

    private Lifecycle.State calculateTargetState(LifecycleObserver lifecycleObserver) {
    }

    public static LifecycleRegistry createUnsafe(LifecycleOwner lifecycleOwner) {
    }

    @SuppressLint({"RestrictedApi"})
    private void enforceMainThreadIfNeeded(String str) {
    }

    private void forwardPass(LifecycleOwner lifecycleOwner) {
    }

    private boolean isSynced() {
    }

    public static Lifecycle.State min(Lifecycle.State state, Lifecycle.State state2) {
    }

    private void moveToState(Lifecycle.State state) {
    }

    private void popParentState() {
    }

    private void pushParentState(Lifecycle.State state) {
    }

    private void sync() {
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(LifecycleObserver lifecycleObserver) {
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State getCurrentState() {
    }

    public int getObserverCount() {
    }

    public void handleLifecycleEvent(Lifecycle.Event event) {
    }

    @Deprecated
    public void markState(Lifecycle.State state) {
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(LifecycleObserver lifecycleObserver) {
    }

    public void setCurrentState(Lifecycle.State state) {
    }

    private LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z) {
    }
}
