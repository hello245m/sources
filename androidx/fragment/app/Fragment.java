package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.arch.core.util.Function;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import j.g.j.q;
import j.k.d.b0;
import j.k.d.d0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, j.t.c {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = null;
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public i mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    private boolean mCalled;
    public j.k.d.m mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    public ViewModelProvider.Factory mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public j.k.d.m mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public j.k.d.j<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public LifecycleRegistry mLifecycleRegistry;
    public Lifecycle.State mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<k> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public j.t.b mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public b0 mViewLifecycleOwner;
    public MutableLiveData<LifecycleOwner> mViewLifecycleOwnerLiveData;
    public String mWho;

    /* renamed from: androidx.fragment.app.Fragment$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass5 implements LifecycleEventObserver {
        public final /* synthetic */ Fragment a;

        public AnonymousClass5(Fragment fragment) {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Runnable {
        public final /* synthetic */ Fragment a;

        public a(Fragment fragment) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Runnable {
        public final /* synthetic */ Fragment a;

        public b(Fragment fragment) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements Runnable {
        public final /* synthetic */ d0 a;

        public c(Fragment fragment, d0 d0Var) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d extends j.k.d.f {
        public final /* synthetic */ Fragment a;

        public d(Fragment fragment) {
        }

        @Override // j.k.d.f
        public View c(int i2) {
        }

        @Override // j.k.d.f
        public boolean d() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements Function<Void, ActivityResultRegistry> {
        public final /* synthetic */ Fragment a;

        public e(Fragment fragment) {
        }

        public ActivityResultRegistry a(Void r3) {
        }

        @Override // androidx.arch.core.util.Function
        public /* bridge */ /* synthetic */ ActivityResultRegistry apply(Void r1) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f implements Function<Void, ActivityResultRegistry> {
        public final /* synthetic */ ActivityResultRegistry a;

        public f(Fragment fragment, ActivityResultRegistry activityResultRegistry) {
        }

        public ActivityResultRegistry a(Void r1) {
        }

        @Override // androidx.arch.core.util.Function
        public /* bridge */ /* synthetic */ ActivityResultRegistry apply(Void r1) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class g extends k {
        public final /* synthetic */ Function a;
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ j.a.h.f.a c;
        public final /* synthetic */ j.a.h.b d;
        public final /* synthetic */ Fragment e;

        public g(Fragment fragment, Function function, AtomicReference atomicReference, j.a.h.f.a aVar, j.a.h.b bVar) {
        }

        @Override // androidx.fragment.app.Fragment.k
        public void a() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h<I> extends j.a.h.c<I> {
        public final /* synthetic */ AtomicReference a;

        public h(Fragment fragment, AtomicReference atomicReference, j.a.h.f.a aVar) {
        }

        @Override // j.a.h.c
        public void b(I i2, j.g.j.d dVar) {
        }

        @Override // j.a.h.c
        public void c() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class i {
        public View a;
        public Animator b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        /* renamed from: i, reason: collision with root package name */
        public ArrayList<String> f243i;

        /* renamed from: j, reason: collision with root package name */
        public ArrayList<String> f244j;

        /* renamed from: k, reason: collision with root package name */
        public Object f245k;

        /* renamed from: l, reason: collision with root package name */
        public Object f246l;

        /* renamed from: m, reason: collision with root package name */
        public Object f247m;

        /* renamed from: n, reason: collision with root package name */
        public Object f248n;

        /* renamed from: o, reason: collision with root package name */
        public Object f249o;

        /* renamed from: p, reason: collision with root package name */
        public Object f250p;

        /* renamed from: q, reason: collision with root package name */
        public Boolean f251q;

        /* renamed from: r, reason: collision with root package name */
        public Boolean f252r;

        /* renamed from: s, reason: collision with root package name */
        public q f253s;

        /* renamed from: t, reason: collision with root package name */
        public q f254t;
        public float u;
        public View v;
        public boolean w;
        public l x;
        public boolean y;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class j extends RuntimeException {
        public j(String str, Exception exc) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class k {
        public k() {
        }

        public abstract void a();

        public /* synthetic */ k(a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface l {
        void a();

        void b();
    }

    public Fragment() {
    }

    private i ensureAnimationInfo() {
    }

    private int getMinimumMaxLifecycleState() {
    }

    private void initLifecycle() {
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
    }

    private <I, O> j.a.h.c<I> prepareCallInternal(j.a.h.f.a<I, O> aVar, Function<Void, ActivityResultRegistry> function, j.a.h.b<O> bVar) {
    }

    private void registerOnPreAttachListener(k kVar) {
    }

    public void callStartTransitionListener(boolean z) {
    }

    public j.k.d.f createFragmentContainer() {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final boolean equals(Object obj) {
    }

    public Fragment findFragmentByWho(String str) {
    }

    public String generateActivityResultKey() {
    }

    public final FragmentActivity getActivity() {
    }

    public boolean getAllowEnterTransitionOverlap() {
    }

    public boolean getAllowReturnTransitionOverlap() {
    }

    public View getAnimatingAway() {
    }

    public Animator getAnimator() {
    }

    public final Bundle getArguments() {
    }

    public final j.k.d.m getChildFragmentManager() {
    }

    public Context getContext() {
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
    }

    public int getEnterAnim() {
    }

    public Object getEnterTransition() {
    }

    public q getEnterTransitionCallback() {
    }

    public int getExitAnim() {
    }

    public Object getExitTransition() {
    }

    public q getExitTransitionCallback() {
    }

    public View getFocusedView() {
    }

    @Deprecated
    public final j.k.d.m getFragmentManager() {
    }

    public final Object getHost() {
    }

    public final int getId() {
    }

    public final LayoutInflater getLayoutInflater() {
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
    }

    @Deprecated
    public j.n.a.a getLoaderManager() {
    }

    public int getNextTransition() {
    }

    public final Fragment getParentFragment() {
    }

    public final j.k.d.m getParentFragmentManager() {
    }

    public boolean getPopDirection() {
    }

    public int getPopEnterAnim() {
    }

    public int getPopExitAnim() {
    }

    public float getPostOnViewCreatedAlpha() {
    }

    public Object getReenterTransition() {
    }

    public final Resources getResources() {
    }

    @Deprecated
    public final boolean getRetainInstance() {
    }

    public Object getReturnTransition() {
    }

    @Override // j.t.c
    public final SavedStateRegistry getSavedStateRegistry() {
    }

    public Object getSharedElementEnterTransition() {
    }

    public Object getSharedElementReturnTransition() {
    }

    public ArrayList<String> getSharedElementSourceNames() {
    }

    public ArrayList<String> getSharedElementTargetNames() {
    }

    public final String getString(int i2) {
    }

    public final String getTag() {
    }

    @Deprecated
    public final Fragment getTargetFragment() {
    }

    @Deprecated
    public final int getTargetRequestCode() {
    }

    public final CharSequence getText(int i2) {
    }

    @Deprecated
    public boolean getUserVisibleHint() {
    }

    public View getView() {
    }

    public LifecycleOwner getViewLifecycleOwner() {
    }

    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
    }

    public final int hashCode() {
    }

    public void initState() {
    }

    public final boolean isAdded() {
    }

    public final boolean isDetached() {
    }

    public final boolean isHidden() {
    }

    public boolean isHideReplaced() {
    }

    public final boolean isInBackStack() {
    }

    public final boolean isInLayout() {
    }

    public final boolean isMenuVisible() {
    }

    public boolean isPostponed() {
    }

    public final boolean isRemoving() {
    }

    public final boolean isRemovingParent() {
    }

    public final boolean isResumed() {
    }

    public final boolean isStateSaved() {
    }

    public final boolean isVisible() {
    }

    public void noteStateNotSaved() {
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    public void onAttach(Context context) {
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
    }

    public void onCreate(Bundle bundle) {
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) {
    }

    public Animator onCreateAnimator(int i2, boolean z, int i3) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
    }

    public void onDetach() {
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
    }

    public void performActivityCreated(Bundle bundle) {
    }

    public void performAttach() {
    }

    public void performConfigurationChanged(Configuration configuration) {
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
    }

    public void performCreate(Bundle bundle) {
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    public void performDestroy() {
    }

    public void performDestroyView() {
    }

    public void performDetach() {
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
    }

    public void performLowMemory() {
    }

    public void performMultiWindowModeChanged(boolean z) {
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
    }

    public void performOptionsMenuClosed(Menu menu) {
    }

    public void performPause() {
    }

    public void performPictureInPictureModeChanged(boolean z) {
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
    }

    public void performPrimaryNavigationFragmentChanged() {
    }

    public void performResume() {
    }

    public void performSaveInstanceState(Bundle bundle) {
    }

    public void performStart() {
    }

    public void performStop() {
    }

    public void performViewCreated() {
    }

    public void postponeEnterTransition() {
    }

    public final <I, O> j.a.h.c<I> registerForActivityResult(j.a.h.f.a<I, O> aVar, j.a.h.b<O> bVar) {
    }

    public void registerForContextMenu(View view) {
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i2) {
    }

    public final FragmentActivity requireActivity() {
    }

    public final Bundle requireArguments() {
    }

    public final Context requireContext() {
    }

    @Deprecated
    public final j.k.d.m requireFragmentManager() {
    }

    public final Object requireHost() {
    }

    public final Fragment requireParentFragment() {
    }

    public final View requireView() {
    }

    public void restoreChildFragmentState(Bundle bundle) {
    }

    public final void restoreViewState(Bundle bundle) {
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
    }

    public void setAnimatingAway(View view) {
    }

    public void setAnimations(int i2, int i3, int i4, int i5) {
    }

    public void setAnimator(Animator animator) {
    }

    public void setArguments(Bundle bundle) {
    }

    public void setEnterSharedElementCallback(q qVar) {
    }

    public void setEnterTransition(Object obj) {
    }

    public void setExitSharedElementCallback(q qVar) {
    }

    public void setExitTransition(Object obj) {
    }

    public void setFocusedView(View view) {
    }

    public void setHasOptionsMenu(boolean z) {
    }

    public void setHideReplaced(boolean z) {
    }

    public void setInitialSavedState(m mVar) {
    }

    public void setMenuVisibility(boolean z) {
    }

    public void setNextTransition(int i2) {
    }

    public void setOnStartEnterTransitionListener(l lVar) {
    }

    public void setPopDirection(boolean z) {
    }

    public void setPostOnViewCreatedAlpha(float f2) {
    }

    public void setReenterTransition(Object obj) {
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
    }

    public void setReturnTransition(Object obj) {
    }

    public void setSharedElementEnterTransition(Object obj) {
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
    }

    public void setSharedElementReturnTransition(Object obj) {
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i2) {
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
    }

    public void startPostponedEnterTransition() {
    }

    public String toString() {
    }

    public void unregisterForContextMenu(View view) {
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = null;
        public final Bundle a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a implements Parcelable.ClassLoaderCreator<m> {
            public m a(Parcel parcel) {
            }

            public m b(Parcel parcel, ClassLoader classLoader) {
            }

            public m[] c(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ m createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        public m(Bundle bundle) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public m(Parcel parcel, ClassLoader classLoader) {
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
    }

    public final String getString(int i2, Object... objArr) {
    }

    public final void postponeEnterTransition(long j2, TimeUnit timeUnit) {
    }

    public final <I, O> j.a.h.c<I> registerForActivityResult(j.a.h.f.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, j.a.h.b<O> bVar) {
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
    }

    @Deprecated
    public void onAttach(Activity activity) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
    }

    private void restoreViewState() {
    }

    public Fragment(int i2) {
    }
}
