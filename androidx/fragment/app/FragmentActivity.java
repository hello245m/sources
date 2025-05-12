package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import j.a.f;
import j.a.h.d;
import j.g.j.c;
import j.k.d.h;
import j.k.d.j;
import j.k.d.m;
import j.k.d.q;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class FragmentActivity extends ComponentActivity implements c.e, c.g {
    public static final String FRAGMENTS_TAG = "android:support:fragments";
    public boolean mCreated;
    public final LifecycleRegistry mFragmentLifecycleRegistry;
    public final h mFragments;
    public boolean mResumed;
    public boolean mStopped;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements SavedStateRegistry.b {
        public final /* synthetic */ FragmentActivity a;

        public a(FragmentActivity fragmentActivity) {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle saveState() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements j.a.g.b {
        public final /* synthetic */ FragmentActivity a;

        public b(FragmentActivity fragmentActivity) {
        }

        @Override // j.a.g.b
        public void a(Context context) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends j<FragmentActivity> implements ViewModelStoreOwner, f, d, q {
        public final /* synthetic */ FragmentActivity e;

        public c(FragmentActivity fragmentActivity) {
        }

        @Override // j.k.d.q
        public void a(m mVar, Fragment fragment) {
        }

        @Override // j.k.d.j, j.k.d.f
        public View c(int i2) {
        }

        @Override // j.k.d.j, j.k.d.f
        public boolean d() {
        }

        @Override // j.a.h.d
        public ActivityResultRegistry getActivityResultRegistry() {
        }

        @Override // androidx.lifecycle.LifecycleOwner
        public Lifecycle getLifecycle() {
        }

        @Override // j.a.f
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        public ViewModelStore getViewModelStore() {
        }

        @Override // j.k.d.j
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        }

        @Override // j.k.d.j
        public /* bridge */ /* synthetic */ FragmentActivity i() {
        }

        @Override // j.k.d.j
        public LayoutInflater j() {
        }

        @Override // j.k.d.j
        public boolean l(Fragment fragment) {
        }

        @Override // j.k.d.j
        public boolean m(String str) {
        }

        @Override // j.k.d.j
        public void p() {
        }

        public FragmentActivity q() {
        }
    }

    public FragmentActivity() {
    }

    private void init() {
    }

    private static boolean markState(m mVar, Lifecycle.State state) {
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public m getSupportFragmentManager() {
    }

    @Deprecated
    public j.n.a.a getSupportLoaderManager() {
    }

    public void markFragmentsCreated() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
    }

    @Override // android.app.Activity
    public void onDestroy() {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
    }

    @Override // android.app.Activity
    public void onPause() {
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Override // android.app.Activity
    public void onPostResume() {
    }

    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    @Override // android.app.Activity
    public void onResume() {
    }

    public void onResumeFragments() {
    }

    @Override // android.app.Activity
    public void onStart() {
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
    }

    @Override // android.app.Activity
    public void onStop() {
    }

    public void setEnterSharedElementCallback(j.g.j.q qVar) {
    }

    public void setExitSharedElementCallback(j.g.j.q qVar) {
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
    }

    public void supportFinishAfterTransition() {
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
    }

    public void supportPostponeEnterTransition() {
    }

    public void supportStartPostponedEnterTransition() {
    }

    @Override // j.g.j.c.g
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i2) {
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
    }

    public FragmentActivity(int i2) {
    }
}
