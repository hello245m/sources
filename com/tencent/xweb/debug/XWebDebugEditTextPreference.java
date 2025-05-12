package com.tencent.xweb.debug;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.EditTextPreference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebDebugEditTextPreference extends EditTextPreference implements IXWebDebugPreference {
    public static final String TAG = "XWebDebugEditTextPreference";
    public String debugKey;

    public XWebDebugEditTextPreference(Context context, AttributeSet attributeSet) {
    }

    @Override // com.tencent.xweb.debug.IXWebDebugPreference
    public String getDebugKey() {
    }

    @Override // com.tencent.xweb.debug.IXWebDebugPreference
    public CommandResult onPreferenceChange(IDebugView iDebugView, Object obj) {
    }

    @Override // com.tencent.xweb.debug.IXWebDebugPreference
    public CommandResult onPreferenceClick(IDebugView iDebugView) {
    }

    public void setDebugKey(String str) {
    }
}
