package com.tencent.xweb.debug;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IXWebDebugPreference {
    String getDebugKey();

    CommandResult onPreferenceChange(IDebugView iDebugView, Object obj);

    CommandResult onPreferenceClick(IDebugView iDebugView);
}
