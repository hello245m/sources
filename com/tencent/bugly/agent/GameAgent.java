package com.tencent.bugly.agent;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class GameAgent {
    private static final String CLASS_COCOS_ACTIVITY = "org.cocos2dx.lib.Cocos2dxActivity";
    private static final String CLASS_UNITY_PLAYER = "com.unity3d.player.UnityPlayer";
    public static final int GAME_TYPE_COCOS = 1;
    public static final int GAME_TYPE_UNITY = 2;
    public static final int GAME_TYPE_UNKNOWN = 0;
    private static final int LOG_LEVEL_DEBUG = 1;
    private static final int LOG_LEVEL_ERROR = 4;
    private static final int LOG_LEVEL_INFO = 2;
    private static final int LOG_LEVEL_VERBOSE = 0;
    private static final int LOG_LEVEL_WARN = 3;
    private static final String LOG_TAG = "CrashReport-GameAgent";
    private static final int TYPE_COCOS2DX_JS_CRASH = 5;
    private static final int TYPE_COCOS2DX_LUA_CRASH = 6;
    private static final int TYPE_U3D_CRASH = 4;
    private static final String VERSION = "3.2";
    private static boolean hasGuessed = false;
    private static WeakReference<Activity> sActivity = null;
    private static WeakReference<Context> sContext = null;
    private static k.i.c.a.a sCrashHandleListener = null;
    private static int sGameType = 0;
    private static Handler sHandler = null;
    private static boolean sIsDebug = false;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements Runnable {
        public final /* synthetic */ String a;

        public a(String str) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b implements Runnable {
        public final /* synthetic */ String a;

        public b(String str) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c implements Runnable {
        public final /* synthetic */ int a;

        public c(int i2) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public d(String str, String str2) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class f implements Runnable {
        public final /* synthetic */ String a;

        public f(String str) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class g implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ boolean e;

        public g(int i2, String str, String str2, String str3, boolean z) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ boolean e;

        public h(int i2, String str, String str2, String str3, boolean z) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class i implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;

        public i(String str, String str2, String str3, boolean z) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class j implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        public j(Context context, String str, long j2) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class k implements Runnable {
        public final /* synthetic */ String a;

        public k(String str) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class l implements Runnable {
        public final /* synthetic */ String a;

        public l(String str) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class m implements Runnable {
        public final /* synthetic */ String a;

        public m(String str) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class n {
        public static Object a(String str, String str2) {
        }

        public static Object b(String str, String str2, Class<?>... clsArr) {
        }
    }

    public static void SetCrashHandlerListener(k.i.c.a.a aVar) {
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ boolean b() {
    }

    public static /* synthetic */ k.i.c.a.a c() {
    }

    public static /* synthetic */ Context d() {
    }

    private static void delayExit(long j2) {
    }

    public static /* synthetic */ void e() {
    }

    private static void exitApplication() {
    }

    private static Activity getActivity() {
    }

    private static Context getApplicationContext() {
    }

    public static Activity getCocosActivity() {
    }

    public static Activity getUnityActivity() {
    }

    public static String getVersion() {
    }

    private static Activity guessActivity() {
    }

    private static void initCrashReport(String str, String str2, String str3, String str4, long j2) {
    }

    private static void postCocosJsException(int i2, String str, String str2, String str3, boolean z) {
    }

    private static void postCocosLuaException(int i2, String str, String str2, String str3, boolean z) {
    }

    public static void postException(int i2, String str, String str2, String str3, boolean z) {
    }

    private static void postUnityException(String str, String str2, String str3, boolean z) {
    }

    public static void printLog(String str) {
    }

    public static void putUserData(String str, String str2) {
    }

    public static void removeUserData(String str) {
    }

    private static void runTaskInUiThread(Runnable runnable) {
    }

    public static void setAppChannel(String str) {
    }

    public static void setAppVersion(String str) {
    }

    public static void setDeviceModel(String str) {
    }

    public static void setDumpFilePath(String str) {
    }

    public static void setGameType(int i2) {
    }

    public static void setLog(int i2, String str, String str2) {
    }

    public static void setLogEnable(boolean z) {
    }

    public static void setSdkConfig(String str, String str2) {
    }

    public static void setUserId(String str) {
    }

    public static void setUserSceneTag(int i2) {
    }

    private static void printLog(int i2, String str) {
    }
}
