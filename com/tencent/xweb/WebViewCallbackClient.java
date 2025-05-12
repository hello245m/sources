package com.tencent.xweb;

import android.view.View;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface WebViewCallbackClient {
    void onContentHeightChanged(int i2);

    void onOverScrolled(int i2, int i3, boolean z, boolean z2, View view);

    void onScrollChanged(int i2, int i3, int i4, int i5, View view);

    boolean overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, View view);
}
