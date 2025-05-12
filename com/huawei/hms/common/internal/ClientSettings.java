package com.huawei.hms.common.internal;

import android.app.Activity;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ClientSettings {
    private String a;
    private String b;
    private List<Scope> c;
    private String d;
    private List<String> e;
    private String f;
    private SubAppInfo g;
    private WeakReference<Activity> h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f631i;

    /* renamed from: j, reason: collision with root package name */
    private String f632j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f633k;

    public ClientSettings(String str, String str2, List<Scope> list, String str3, List<String> list2) {
    }

    public List<String> getApiName() {
    }

    public String getAppID() {
    }

    public String getClientClassName() {
    }

    public String getClientPackageName() {
    }

    public Activity getCpActivity() {
    }

    public String getCpID() {
    }

    public String getInnerHmsPkg() {
    }

    public List<Scope> getScopes() {
    }

    public SubAppInfo getSubAppID() {
    }

    public boolean isHasActivity() {
    }

    public boolean isUseInnerHms() {
    }

    public void setApiName(List<String> list) {
    }

    public void setAppID(String str) {
    }

    public void setClientClassName(String str) {
    }

    public void setClientPackageName(String str) {
    }

    public void setCpActivity(Activity activity) {
    }

    public void setCpID(String str) {
    }

    public void setInnerHmsPkg(String str) {
    }

    public void setScopes(List<Scope> list) {
    }

    public void setSubAppId(SubAppInfo subAppInfo) {
    }

    public void setUseInnerHms(boolean z) {
    }

    public ClientSettings(String str, String str2, List<Scope> list, String str3, List<String> list2, SubAppInfo subAppInfo) {
    }
}
