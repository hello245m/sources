package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import j.a.f;
import j.a.h.f.a;
import j.g.j.h;
import j.g.t.p;
import j.g.t.r;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ComponentActivity extends h implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, j.t.c, f, j.a.h.d {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    public final j.a.g.a mContextAwareHelper;
    private ViewModelProvider.Factory mDefaultFactory;
    private final LifecycleRegistry mLifecycleRegistry;
    private final p mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    public final j.t.b mSavedStateRegistryController;
    private ViewModelStore mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3 implements LifecycleEventObserver {
        public final /* synthetic */ ComponentActivity a;

        public AnonymousClass3(ComponentActivity componentActivity) {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass4 implements LifecycleEventObserver {
        public final /* synthetic */ ComponentActivity a;

        public AnonymousClass4(ComponentActivity componentActivity) {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass5 implements LifecycleEventObserver {
        public final /* synthetic */ ComponentActivity a;

        public AnonymousClass5(ComponentActivity componentActivity) {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ ComponentActivity a;

        public a(ComponentActivity componentActivity) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends ActivityResultRegistry {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f67i;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ a.C0109a b;
            public final /* synthetic */ b c;

            public a(b bVar, int i2, a.C0109a c0109a) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class RunnableC0001b implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ IntentSender.SendIntentException b;
            public final /* synthetic */ b c;

            public RunnableC0001b(b bVar, int i2, IntentSender.SendIntentException sendIntentException) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public b(ComponentActivity componentActivity) {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i2, j.a.h.f.a<I, O> aVar, I i3, j.g.j.d dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c {
        public static void a(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d {
        public Object a;
        public ViewModelStore b;
    }

    public ComponentActivity() {
    }

    private /* synthetic */ Bundle O0() {
    }

    private /* synthetic */ void Q0(Context context) {
    }

    public static /* synthetic */ void access$001(ComponentActivity componentActivity) {
    }

    private void initViewTreeOwners() {
    }

    public /* synthetic */ Bundle P0() {
    }

    public /* synthetic */ void R0(Context context) {
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
    }

    public void addMenuProvider(r rVar) {
    }

    public final void addOnContextAvailableListener(j.a.g.b bVar) {
    }

    public void ensureViewModelStore() {
    }

    @Override // j.a.h.d
    public final ActivityResultRegistry getActivityResultRegistry() {
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
    }

    @Override // j.g.j.h, androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
    }

    @Override // j.a.f
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
    }

    @Override // j.t.c
    public final SavedStateRegistry getSavedStateRegistry() {
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
    }

    public void invalidateMenu() {
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
    }

    @Override // j.g.j.h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
    }

    public Context peekAvailableContext() {
    }

    public final <I, O> j.a.h.c<I> registerForActivityResult(j.a.h.f.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, j.a.h.b<O> bVar) {
    }

    public void removeMenuProvider(r rVar) {
    }

    public final void removeOnContextAvailableListener(j.a.g.b bVar) {
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
    }

    public void addMenuProvider(r rVar, LifecycleOwner lifecycleOwner) {
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(r rVar, LifecycleOwner lifecycleOwner, Lifecycle.State state) {
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
    }

    public final <I, O> j.a.h.c<I> registerForActivityResult(j.a.h.f.a<I, O> aVar, j.a.h.b<O> bVar) {
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
    }

    public ComponentActivity(int i2) {
    }
}
