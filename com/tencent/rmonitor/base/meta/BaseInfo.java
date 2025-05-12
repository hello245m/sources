package com.tencent.rmonitor.base.meta;

import android.app.Application;
import android.content.SharedPreferences;
import com.tencent.bugly.common.meta.UserMeta;
import java.util.concurrent.atomic.AtomicBoolean;
import k.i.k.c.d.a;
import k.i.k.c.d.e;
import k.i.k.e.h.c;
import n.d0.d.h;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class BaseInfo {
    public static final Info Info = null;
    private static String TAG;
    public static Application app;
    public static e dbHelper;
    public static c editor;
    public static AtomicBoolean hasInit;
    public static Boolean is64Bit;
    public static JSONObject pubJson;
    public static SharedPreferences sharePreference;
    public static final UrlMeta urlMeta = null;
    public static final UserMeta userMeta = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class Info {
        private Info() {
        }

        public static /* synthetic */ void TAG$annotations() {
        }

        public final String getConfigUrl(String str) {
        }

        public final String getTAG() {
        }

        public final void initInfo() {
        }

        public final void initPubJson(String str) {
        }

        public final void initSp() {
        }

        public final void initUrl() {
        }

        public final a makeBaseDBParam() {
        }

        public final void reset() {
        }

        public final void setTAG(String str) {
        }

        public /* synthetic */ Info(h hVar) {
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
    }

    public static final /* synthetic */ void access$setTAG$cp(String str) {
    }

    public static final String getConfigUrl(String str) {
    }

    public static final String getTAG() {
    }

    public static final void initInfo() {
    }

    public static final void initPubJson(String str) {
    }

    public static final void initSp() {
    }

    public static final void initUrl() {
    }

    public static final a makeBaseDBParam() {
    }

    public static final void reset() {
    }

    public static final void setTAG(String str) {
    }
}
