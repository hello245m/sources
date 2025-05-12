package com.tencent.xweb;

import android.os.Bundle;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebTranslateLogic {
    public static final String TAG = "XWebTranslateLogic";
    public final TranslateLogicCallback mCallback;
    public boolean mIsTipsShow;
    public boolean mIsTranslateMode;
    public final WebView mWebviewWraper;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface TranslateLogicCallback {
        void onTranslateFinish();

        void onTranslateMiscCallBack(String str, Bundle bundle);

        void onTranslateStart();

        void replaceTranslatedString(Map<String, String> map);
    }

    public XWebTranslateLogic(WebView webView, TranslateLogicCallback translateLogicCallback) {
    }

    private void trySetTranslateTipsView(boolean z, String str) {
    }

    public void onGetSampleString(Map<String, String> map) {
    }

    public void onGetTranslateString(Map<String, String> map) {
    }

    public void onPageLoadStarted() {
    }

    public void replaceTranslatedString(Bundle bundle) {
    }

    public void setIsInTranslateMode(boolean z) {
    }
}
