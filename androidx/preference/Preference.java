package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import j.q.j;
import j.q.l;
import java.util.List;
import java.util.Set;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class Preference implements Comparable<Preference> {
    public static final int DEFAULT_ORDER = Integer.MAX_VALUE;
    private boolean mAllowDividerAbove;
    private boolean mAllowDividerBelow;
    private boolean mBaseMethodCalled;
    private final View.OnClickListener mClickListener;
    private Context mContext;
    private Object mDefaultValue;
    private String mDependencyKey;
    private boolean mDependencyMet;
    private List<Preference> mDependents;
    private boolean mEnabled;
    private Bundle mExtras;
    private String mFragment;
    private boolean mHasId;
    private boolean mHasSingleLineTitleAttr;
    private Drawable mIcon;
    private int mIconResId;
    private boolean mIconSpaceReserved;
    private long mId;
    private Intent mIntent;
    private String mKey;
    private int mLayoutResId;
    private c mListener;
    private d mOnChangeListener;
    private e mOnClickListener;
    private int mOrder;
    private boolean mParentDependencyMet;
    private PreferenceGroup mParentGroup;
    private boolean mPersistent;
    private j.q.e mPreferenceDataStore;
    private j mPreferenceManager;
    private boolean mRequiresKey;
    private boolean mSelectable;
    private boolean mShouldDisableView;
    private boolean mSingleLineTitle;
    private CharSequence mSummary;
    private CharSequence mTitle;
    private int mViewId;
    private boolean mVisible;
    private boolean mWasDetached;
    private int mWidgetLayoutResId;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ Preference a;

        public a(Preference preference) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = null;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class a implements Parcelable.Creator<b> {
            public b a(Parcel parcel) {
            }

            public b[] b(int i2) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ b[] newArray(int i2) {
            }
        }

        public b(Parcel parcel) {
        }

        public b(Parcelable parcelable) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        void b(Preference preference);

        void f(Preference preference);

        void i(Preference preference);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface d {
        boolean onPreferenceChange(Preference preference, Object obj);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface e {
        boolean a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i2, int i3) {
    }

    private void dispatchSetInitialValue() {
    }

    private void registerDependency() {
    }

    private void registerDependent(Preference preference) {
    }

    private void setEnabledStateOnViews(View view, boolean z) {
    }

    private void tryCommit(SharedPreferences.Editor editor) {
    }

    private void unregisterDependency() {
    }

    private void unregisterDependent(Preference preference) {
    }

    public void assignParent(PreferenceGroup preferenceGroup) {
    }

    public boolean callChangeListener(Object obj) {
    }

    public final void clearWasDetached() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Preference preference) {
    }

    public void dispatchRestoreInstanceState(Bundle bundle) {
    }

    public void dispatchSaveInstanceState(Bundle bundle) {
    }

    public Preference findPreferenceInHierarchy(String str) {
    }

    public Context getContext() {
    }

    public String getDependency() {
    }

    public Bundle getExtras() {
    }

    public StringBuilder getFilterableStringBuilder() {
    }

    public String getFragment() {
    }

    public Drawable getIcon() {
    }

    public long getId() {
    }

    public Intent getIntent() {
    }

    public String getKey() {
    }

    public final int getLayoutResource() {
    }

    public d getOnPreferenceChangeListener() {
    }

    public e getOnPreferenceClickListener() {
    }

    public int getOrder() {
    }

    public PreferenceGroup getParent() {
    }

    public boolean getPersistedBoolean(boolean z) {
    }

    public float getPersistedFloat(float f) {
    }

    public int getPersistedInt(int i2) {
    }

    public long getPersistedLong(long j2) {
    }

    public String getPersistedString(String str) {
    }

    public Set<String> getPersistedStringSet(Set<String> set) {
    }

    public j.q.e getPreferenceDataStore() {
    }

    public j getPreferenceManager() {
    }

    public SharedPreferences getSharedPreferences() {
    }

    public boolean getShouldDisableView() {
    }

    public CharSequence getSummary() {
    }

    public CharSequence getTitle() {
    }

    public final int getWidgetLayoutResource() {
    }

    public boolean hasKey() {
    }

    public boolean isEnabled() {
    }

    public boolean isIconSpaceReserved() {
    }

    public boolean isPersistent() {
    }

    public boolean isSelectable() {
    }

    public final boolean isShown() {
    }

    public boolean isSingleLineTitle() {
    }

    public final boolean isVisible() {
    }

    public void notifyChanged() {
    }

    public void notifyDependencyChange(boolean z) {
    }

    public void notifyHierarchyChanged() {
    }

    public void onAttached() {
    }

    public void onAttachedToHierarchy(j jVar) {
    }

    public void onBindViewHolder(l lVar) {
    }

    public void onClick() {
    }

    public void onDependencyChanged(Preference preference, boolean z) {
    }

    public void onDetached() {
    }

    public Object onGetDefaultValue(TypedArray typedArray, int i2) {
    }

    public void onInitializeAccessibilityNodeInfo(j.g.t.r0.c cVar) {
    }

    public void onParentChanged(Preference preference, boolean z) {
    }

    public void onPrepareForRemoval() {
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
    }

    public void onSetInitialValue(Object obj) {
    }

    @Deprecated
    public void onSetInitialValue(boolean z, Object obj) {
    }

    public Bundle peekExtras() {
    }

    public void performClick(View view) {
    }

    public boolean persistBoolean(boolean z) {
    }

    public boolean persistFloat(float f) {
    }

    public boolean persistInt(int i2) {
    }

    public boolean persistLong(long j2) {
    }

    public boolean persistString(String str) {
    }

    public boolean persistStringSet(Set<String> set) {
    }

    public void requireKey() {
    }

    public void restoreHierarchyState(Bundle bundle) {
    }

    public void saveHierarchyState(Bundle bundle) {
    }

    public void setDefaultValue(Object obj) {
    }

    public void setDependency(String str) {
    }

    public void setEnabled(boolean z) {
    }

    public void setFragment(String str) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setIconSpaceReserved(boolean z) {
    }

    public void setIntent(Intent intent) {
    }

    public void setKey(String str) {
    }

    public void setLayoutResource(int i2) {
    }

    public final void setOnPreferenceChangeInternalListener(c cVar) {
    }

    public void setOnPreferenceChangeListener(d dVar) {
    }

    public void setOnPreferenceClickListener(e eVar) {
    }

    public void setOrder(int i2) {
    }

    public void setPersistent(boolean z) {
    }

    public void setPreferenceDataStore(j.q.e eVar) {
    }

    public void setSelectable(boolean z) {
    }

    public void setShouldDisableView(boolean z) {
    }

    public void setSingleLineTitle(boolean z) {
    }

    public void setSummary(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void setViewId(int i2) {
    }

    public final void setVisible(boolean z) {
    }

    public void setWidgetLayoutResource(int i2) {
    }

    public boolean shouldDisableDependents() {
    }

    public boolean shouldPersist() {
    }

    public String toString() {
    }

    public final boolean wasDetached() {
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(Preference preference) {
    }

    public void performClick() {
    }

    public void setTitle(int i2) {
    }

    public void onAttachedToHierarchy(j jVar, long j2) {
    }

    public void setIcon(int i2) {
    }

    public void setSummary(int i2) {
    }

    public Preference(Context context, AttributeSet attributeSet, int i2) {
    }

    public Preference(Context context, AttributeSet attributeSet) {
    }

    public Preference(Context context) {
    }
}
