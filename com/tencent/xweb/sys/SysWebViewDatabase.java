package com.tencent.xweb.sys;

import android.content.Context;
import android.webkit.WebViewDatabase;
import com.tencent.xweb.internal.IWebViewDatabase;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SysWebViewDatabase implements IWebViewDatabase {
    public final WebViewDatabase mDatabase;

    public SysWebViewDatabase() {
    }

    @Override // com.tencent.xweb.internal.IWebViewDatabase
    @Deprecated
    public void clearFormData() {
    }

    @Override // com.tencent.xweb.internal.IWebViewDatabase
    public void clearHttpAuthUsernamePassword() {
    }

    @Override // com.tencent.xweb.internal.IWebViewDatabase
    @Deprecated
    public void clearUsernamePassword() {
    }

    @Override // com.tencent.xweb.internal.IWebViewDatabase
    public String[] getHttpAuthUsernamePassword(String str, String str2) {
    }

    @Override // com.tencent.xweb.internal.IWebViewDatabase
    @Deprecated
    public boolean hasFormData() {
    }

    @Override // com.tencent.xweb.internal.IWebViewDatabase
    public boolean hasHttpAuthUsernamePassword() {
    }

    @Override // com.tencent.xweb.internal.IWebViewDatabase
    @Deprecated
    public boolean hasUsernamePassword() {
    }

    @Override // com.tencent.xweb.internal.IWebViewDatabase
    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
    }

    public SysWebViewDatabase(Context context) {
    }
}
