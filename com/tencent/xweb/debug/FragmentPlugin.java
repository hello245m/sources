package com.tencent.xweb.debug;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.preference.Preference;
import j.q.g;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class FragmentPlugin extends g implements Preference.d {
    public static final String TAG = "FragmentPlugin";
    public final IDebugView mDebugView;
    public final FragmentHelper mFragmentHelper;
    public String mOfficeReaderFormat;
    public String mTargetPluginName;
    public final String strCurRelease;
    public final String strCurTestCustom;
    public final String strCurTestDefault;

    /* renamed from: com.tencent.xweb.debug.FragmentPlugin$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements DialogInterface.OnClickListener {
        public final /* synthetic */ FragmentPlugin this$0;

        public AnonymousClass1(FragmentPlugin fragmentPlugin) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public FragmentPlugin(IDebugView iDebugView) {
    }

    private void refreshPreferenceSetPluginConfigUrl() {
    }

    private void refreshPreferenceSwitchPluginConfigUrl() {
    }

    private void refreshPreferences() {
    }

    private void showFileReaderTypeInfo() {
    }

    private boolean switchPluginConfigUrl(Preference preference) {
    }

    @Override // j.q.g
    public void onCreatePreferences(Bundle bundle, String str) {
    }

    @Override // androidx.preference.Preference.d
    public boolean onPreferenceChange(Preference preference, Object obj) {
    }

    @Override // j.q.g, j.q.j.c
    public boolean onPreferenceTreeClick(Preference preference) {
    }
}
