package com.tencent.xweb.sys;

import android.content.Context;
import com.tencent.xweb.IProfilerController;
import com.tencent.xweb.WebView;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.internal.IWebStorage;
import com.tencent.xweb.internal.IWebView;
import com.tencent.xweb.internal.IWebViewContextWrapper;
import com.tencent.xweb.internal.IWebViewCoreWrapper;
import com.tencent.xweb.internal.IWebViewDatabase;
import com.tencent.xweb.internal.IWebViewProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class SysWebFactory implements IWebViewProvider {
    public static final String TAG = "SysWebFactory";

    /* renamed from: com.tencent.xweb.sys.SysWebFactory$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements Callable<ICookieManager> {
        public final /* synthetic */ SysWebFactory this$0;

        public AnonymousClass1(SysWebFactory sysWebFactory) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ ICookieManager call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public ICookieManager call() throws Exception {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class PreIniter {
        public static final String TAG = "SysWebFactory.PreIniter";
        public static boolean mHasInited = false;
        public static Boolean sEnforceMainLooper;
        public static final AtomicBoolean sEnsureSystemWebViewGlobalLooperCalled = null;

        /* renamed from: com.tencent.xweb.sys.SysWebFactory$PreIniter$1, reason: invalid class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ WebView.PreInitCallback val$callback;

            public AnonymousClass1(WebView.PreInitCallback preInitCallback) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public static /* synthetic */ void access$200() {
        }

        public static /* synthetic */ boolean access$302(boolean z) {
        }

        public static void ensureSystemWebViewGlobalLooper() {
        }

        public static boolean hasInited() {
        }

        public static boolean isEnforceMainLooper() {
        }

        public static boolean isPreInitExecutionCompleted() {
        }

        public static synchronized void preInit(Context context, WebView.PreInitCallback preInitCallback) {
        }

        public static void setNeedEnforceMainLooper(boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class SingletonHolder {
        public static final SysWebFactory sInstance = null;

        public static /* synthetic */ SysWebFactory access$100() {
        }
    }

    public /* synthetic */ SysWebFactory(AnonymousClass1 anonymousClass1) {
    }

    public static SysWebFactory getInstance() {
    }

    public static <T> T runOnUiThreadBlocking(Callable<T> callable) throws Exception {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public void clearAllWebViewCache(Context context, boolean z) {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public void clearClientCertPreferences(Runnable runnable) {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public IWebView createWebView(WebView webView) {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public Object execute(String str, Object[] objArr) {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public String findAddress(String str) {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public ICookieManager getCookieManager() {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public IProfilerController getProfilerController() {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public IWebViewContextWrapper getWebViewContextWrapper() {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public IWebViewCoreWrapper getWebViewCoreWrapper() {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public IWebViewDatabase getWebViewDatabase(Context context) {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public IWebStorage getWebviewStorage() {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public boolean hasInitedWebViewCore() {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public boolean initWebviewCore(Context context, WebView.PreInitCallback preInitCallback) {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public Object invokeRuntimeChannel(int i2, Object[] objArr) {
    }

    @Override // com.tencent.xweb.internal.IWebViewProvider
    public boolean isSupportTranslateWebSite() {
    }

    public SysWebFactory() {
    }
}
