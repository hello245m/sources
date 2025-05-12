package com.tencent.xweb;

import android.content.Context;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.WebView;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.internal.IWebStorage;
import com.tencent.xweb.internal.IWebView;
import com.tencent.xweb.internal.IWebViewContextWrapper;
import com.tencent.xweb.internal.IWebViewCoreWrapper;
import com.tencent.xweb.internal.IWebViewDatabase;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.updater.XWalkRuntimeUpdater;
import com.tencent.xweb.xwalk.plugin.XWalkPluginUpdater;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebViewProvider implements IWebViewProvider {
    public static final String TAG = "XWebViewProvider";
    public boolean mIsDebugMode;
    public boolean mIsDebugModeReplace;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class SingletonHolder {
        public static final XWebViewProvider sInstance = null;

        public static /* synthetic */ XWebViewProvider access$000() {
        }
    }

    public static XWebViewProvider getInstance() {
    }

    private Object handleLoadLocalPackageFromFile(Object[] objArr) {
    }

    private Object handleOpenDebugActivity(Object[] objArr) {
    }

    private Object handleRunXWebCommand(Object[] objArr) {
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

    public Object handleBaseContextChanged(Object[] objArr) {
    }

    public Object handleClearScheduler() {
    }

    public Object handleEnableCheckCertificate(Object[] objArr) {
    }

    public CommandCfg.CmdHandleRet handleExecuteCmdFromConfig(Object[] objArr) {
    }

    public Object handleForceKillGpuProcess() {
    }

    public Object handleForceKillRenderProcess() {
    }

    public Object handleGetDebugView(Object[] objArr) {
    }

    public Object handleGetEmbedCoreVersion() {
    }

    public XWalkPluginUpdater handleGetPluginUpdater() {
    }

    public Object handleGetRenderSandboxProcessMemory() {
    }

    public XWalkRuntimeUpdater handleGetRuntimeUpdater() {
    }

    public Object handleHasFeature(Object[] objArr) {
    }

    public Object handleNativeTrans(Object[] objArr) {
    }

    public Object handlePreinitGpuProcess() {
    }

    public Object handlePreinitRenderProcess() {
    }

    public Object handleSetDebugModeNoReplace() {
    }

    public Object handleSetDebugModeReplace() {
    }

    public Object handleSetDebugModeReplaceNow(Object[] objArr) {
    }

    public Object handleSetForceCheckUpdate() {
    }

    public Object handleSetRecheckCommand() {
    }

    public Object handleTryLoadLocalAssetRuntime(Object[] objArr) {
    }

    public Object handleUpdateResourceLocale(Object[] objArr) {
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
}
