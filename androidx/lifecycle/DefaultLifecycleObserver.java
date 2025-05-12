package androidx.lifecycle;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface DefaultLifecycleObserver extends FullLifecycleObserver {
    @Override // androidx.lifecycle.FullLifecycleObserver
    void onCreate(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onDestroy(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onPause(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onResume(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onStart(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.FullLifecycleObserver
    void onStop(LifecycleOwner lifecycleOwner);
}
