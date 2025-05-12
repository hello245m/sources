package com.tencent.xweb;

import android.content.Context;
import com.tencent.xweb.internal.IWebViewDatabase;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebWebViewDatabase implements IWebViewDatabase {
    public static final String HTTP_AUTH_DATABASE_FILE = "xweb_http_auth.db";
    public final HttpAuthDatabase mHttpAuthDatabase;

    public XWebWebViewDatabase() {
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

    public XWebWebViewDatabase(Context context) {
    }
}
