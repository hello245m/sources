package j.b.k;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.savedstate.SavedStateRegistry;
import j.b.p.b;
import j.g.j.r;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class d extends FragmentActivity implements e, r.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private f mDelegate;
    private Resources mResources;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements SavedStateRegistry.b {
        public final /* synthetic */ d a;

        public a(d dVar) {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle saveState() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements j.a.g.b {
        public final /* synthetic */ d a;

        public b(d dVar) {
        }

        @Override // j.a.g.b
        public void a(Context context) {
        }
    }

    public d() {
    }

    private void initDelegate() {
    }

    private void initViewTreeOwners() {
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
    }

    @Override // j.g.j.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
    }

    public f getDelegate() {
    }

    public j.b.k.b getDrawerToggleDelegate() {
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
    }

    public j.b.k.a getSupportActionBar() {
    }

    @Override // j.g.j.r.a
    public Intent getSupportParentActivityIntent() {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    public void onCreateSupportNavigateUpTaskStack(r rVar) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
    }

    public void onNightModeChanged(int i2) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
    }

    public void onPrepareSupportNavigateUpTaskStack(r rVar) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }

    @Override // j.b.k.e
    public void onSupportActionModeFinished(j.b.p.b bVar) {
    }

    @Override // j.b.k.e
    public void onSupportActionModeStarted(j.b.p.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i2) {
    }

    @Override // j.b.k.e
    public j.b.p.b onWindowStartingSupportActionMode(b.a aVar) {
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i2) {
    }

    public void setSupportActionBar(Toolbar toolbar) {
    }

    @Deprecated
    public void setSupportProgress(int i2) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
    }

    public j.b.p.b startSupportActionMode(b.a aVar) {
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
    }

    public void supportNavigateUpTo(Intent intent) {
    }

    public boolean supportRequestWindowFeature(int i2) {
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
    }

    public d(int i2) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
    }
}
