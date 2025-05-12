package com.tencent.xweb.debug;

import android.content.Context;
import com.tencent.xweb.WebView;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public interface IDebugView {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface Callback {
        void onDebugViewClosed();
    }

    void addCallback(Callback callback);

    Context getContext();

    WebView getWebView();

    boolean handleCommandResult(Context context, CommandResult commandResult);

    boolean onInterceptTestUrl(String str);

    void refreshAbstractView();

    void refreshDebugView();

    void refreshFpsView();

    void refreshSavePageView();

    void refreshVersionView();

    void removeCallback(Callback callback);

    boolean shouldInterceptUrl(String str);
}
