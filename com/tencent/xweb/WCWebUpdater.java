package com.tencent.xweb;

import android.content.Context;
import com.tencent.xweb.xwalk.plugin.XWalkPluginUpdateListener;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WCWebUpdater {
    public static final String TAG = "WCWebUpdater";
    public static final String XWEB_UPDATER_START_CHECK_TYPE = "UpdaterCheckType";
    public static final String XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY = "5";
    public static final String XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL = "4";
    public static final String XWEB_UPDATER_START_CHECK_TYPE_FORCE_CHECK = "2";
    public static final String XWEB_UPDATER_START_CHECK_TYPE_FORCE_DOWNLOAD = "3";
    public static final String XWEB_UPDATER_START_CHECK_TYPE_NOTIFY = "1";
    public static final String XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN = "6";
    public static final String XWEB_UPDATER_START_CHECK_TYPE_TIMER = "0";
    public static IWebviewUpdater a;
    public static IWebviewPluginUpdater b;

    /* renamed from: com.tencent.xweb.WCWebUpdater$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ HashMap b;

        public AnonymousClass1(Context context, HashMap hashMap) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface IWebviewPluginUpdater extends IWebviewUpdater {
        void cancelPluginUpdate();

        void setPluginOnlyOneToUpdate(String str, XWalkPluginUpdateListener xWalkPluginUpdateListener);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface IWebviewUpdater {
        boolean isBusy();

        boolean needCheckUpdate();

        void startCheck(Context context, HashMap<String, String> hashMap);
    }

    public static /* synthetic */ void a(Context context, HashMap hashMap) {
    }

    public static void b() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void checkConfigUpdate(Context context) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void checkNeedDownload() {
    }

    public static int getCheckUpdateTimeThreshold() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isBusy() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean needCheckUpdate(boolean z) {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void startCheck(Context context, HashMap<String, String> hashMap) {
    }

    public static void tryEmbedInstall() {
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void tryStartDownload() {
    }

    public static boolean a() {
    }

    public static void b(Context context, HashMap<String, String> hashMap) {
    }
}
