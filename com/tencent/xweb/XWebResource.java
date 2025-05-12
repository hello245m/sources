package com.tencent.xweb;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebResource extends Resources {
    public static final String TAG = "XWebResource";
    public final WeakReference<Context> mWeChatContext;

    public XWebResource(Resources resources, Context context) {
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
    }
}
