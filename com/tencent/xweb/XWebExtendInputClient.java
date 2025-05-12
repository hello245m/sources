package com.tencent.xweb;

import android.os.ResultReceiver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.ValueCallback;
import com.tencent.xweb.compatible.PinusAdaptClient;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebExtendInputClient extends PinusAdaptClient {
    public static final String TAG = "XWebExtendInputClient";

    public XWebExtendInputClient(XWebExtendInterface xWebExtendInterface) {
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
    }

    public int getToolBarHeight(int i2) {
    }

    @Override // com.tencent.xweb.compatible.PinusAdaptClient
    public void initPSWebView(com.tencent.xweb.pinus.sdk.WebView webView) {
    }

    public void onExtraInfoChanged(String str) {
    }

    public boolean onHideKeyboard(String str, InputConnection inputConnection) {
    }

    public void onKeyboardHeightChanged(boolean z, int i2, boolean z2) {
    }

    public boolean onShowKeyboard(String str, String str2, InputConnection inputConnection, ResultReceiver resultReceiver) {
    }

    public boolean onShowKeyboardConfig(String str, int i2, int i3, String str2, int i4, int i5, EditorInfo editorInfo) {
    }

    public boolean performEditorAction(int i2) {
    }
}
