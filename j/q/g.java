package j.q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import j.q.j;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class g extends Fragment implements j.c, j.a, j.b, DialogPreference.a {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private final d mDividerDecoration;
    private Handler mHandler;
    private boolean mHavePrefs;
    private boolean mInitDone;
    private int mLayoutResId;
    public RecyclerView mList;
    private j mPreferenceManager;
    private final Runnable mRequestFocus;
    private Runnable mSelectPreferenceRunnable;
    private Context mStyledContext;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends Handler {
        public final /* synthetic */ g a;

        public a(g gVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ g a;

        public b(g gVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements Runnable {
        public final /* synthetic */ Preference a;
        public final /* synthetic */ String b;
        public final /* synthetic */ g c;

        public c(g gVar, Preference preference, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends RecyclerView.o {
        public Drawable a;
        public int b;
        public boolean c;
        public final /* synthetic */ g d;

        public d(g gVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        }

        public void l(boolean z) {
        }

        public void m(Drawable drawable) {
        }

        public void n(int i2) {
        }

        public final boolean o(View view, RecyclerView recyclerView) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface e {
        boolean a(g gVar, Preference preference);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f {
        boolean a(g gVar, Preference preference);
    }

    /* renamed from: j.q.g$g, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface InterfaceC0167g {
        boolean a(g gVar, PreferenceScreen preferenceScreen);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h extends RecyclerView.j {
        public final RecyclerView.h a;
        public final RecyclerView b;
        public final Preference c;
        public final String d;

        public h(RecyclerView.h hVar, RecyclerView recyclerView, Preference preference, String str) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i2, int i3, Object obj) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i2, int i3, int i4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i2, int i3) {
        }

        public final void h() {
        }
    }

    private void postBindPreferences() {
    }

    private void requirePreferenceManager() {
    }

    private void scrollToPreferenceInternal(Preference preference, String str) {
    }

    private void unbindPreferences() {
    }

    public void addPreferencesFromResource(int i2) {
    }

    public void bindPreferences() {
    }

    @Override // androidx.preference.DialogPreference.a
    public Preference findPreference(CharSequence charSequence) {
    }

    public Fragment getCallbackFragment() {
    }

    public final RecyclerView getListView() {
    }

    public j getPreferenceManager() {
    }

    public PreferenceScreen getPreferenceScreen() {
    }

    public void onBindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    public RecyclerView.h onCreateAdapter(PreferenceScreen preferenceScreen) {
    }

    public RecyclerView.p onCreateLayoutManager() {
    }

    public abstract void onCreatePreferences(Bundle bundle, String str);

    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    @Override // j.q.j.a
    public void onDisplayPreferenceDialog(Preference preference) {
    }

    @Override // j.q.j.b
    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
    }

    public boolean onPreferenceTreeClick(Preference preference) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
    }

    public void onUnbindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
    }

    public void scrollToPreference(String str) {
    }

    public void setDivider(Drawable drawable) {
    }

    public void setDividerHeight(int i2) {
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
    }

    public void setPreferencesFromResource(int i2, String str) {
    }

    public void scrollToPreference(Preference preference) {
    }
}
