package com.tencent.xweb;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.tencent.xweb.WebView;
import com.tencent.xweb.util.ConfigDef;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CommandCfg {
    public static int a = 0;
    public static String b = "";
    public static CommandCfg c;
    public Map<String, Object> sMapCommandConfigs;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class CmdHandleRet {
        public Object handleRet;
        public boolean handled;
    }

    public static synchronized CommandCfg getInstance() {
    }

    public static synchronized void resetCommandCfg() {
    }

    public final boolean a(SharedPreferences sharedPreferences) {
    }

    public synchronized void applyCommand(ConfigDef.Command[] commandArr, String str) {
    }

    @SuppressLint({"NewApi"})
    public synchronized void applyCommandInternal(ConfigDef.Command[] commandArr, String str, boolean z) {
    }

    public synchronized void clearOldCommandConfigs(Map<String, Object> map, SharedPreferences sharedPreferences) {
    }

    public WebView.FullscreenVideoKind convertFullscreenVideo(String str) {
    }

    public WebView.WebViewKind convertWebType(String str) {
    }

    public Map<String, String> deserializeMap(String str) {
    }

    public Map<String, String> deserializeMapOld(String str) {
    }

    public synchronized String dumpCmds() {
    }

    public synchronized void forkSectionBToSectionAIfNeed() {
    }

    public String getAbstractInfo() {
    }

    public int getChildProcessStartTimeOutCount() {
    }

    public int getChildProcessStartTimeOutThreshold() {
    }

    public synchronized String getCmd(String str) {
    }

    public synchronized boolean getCmdAsBoolean(String str, String str2, boolean z) {
    }

    public synchronized int getCmdAsInt(String str, String str2, int i2) {
    }

    public synchronized String getCmdAsString(String str, String str2, String str3) {
    }

    public int getCmdFetchConfigPeriodMills() {
    }

    public synchronized String getCmdInternal(String str, String str2) {
    }

    public synchronized Map<String, String> getCommandMap(String str) {
    }

    public String getConfigVersion() {
    }

    public boolean getDisableChildProcessStartCrashCount() {
    }

    public boolean getDisableChildProcessStartTimeOut() {
    }

    public boolean getEnableCheckStorage() {
    }

    public boolean getEnableThirdAppReport() {
    }

    public String getEnabledTraceCategory(String str) {
    }

    public boolean getFullscreenVideoEnableInitChannelsTryRuntime() {
    }

    public boolean getFullscreenVideoEnableMute() {
    }

    public boolean getFullscreenVideoEnableSpeed() {
    }

    public boolean getFullscreenVideoEnableSysTryRuntime() {
    }

    public WebView.FullscreenVideoKind getFullscreenVideoKind(String str) {
    }

    public String getLogTag() {
    }

    public int getMMWebViewDowngradeMode() {
    }

    public SharedPreferences getSharePreferenceForCommandConfig() {
    }

    public SharedPreferences getSharePreferenceForCommandConfigLatest() {
    }

    public int getSupportMultiProcessMinApkVersion() {
    }

    public int getTraceRatioInTenThousand(String str) {
    }

    public WebView.WebViewKind getWebKind(String str) {
    }

    public int getWebViewModeCommandForAppBrand() {
    }

    public int getWebViewModeCommandForMM() {
    }

    public boolean getWxdkDowngrade() {
    }

    public synchronized void initCommandConfigs() {
    }

    public boolean isForbidRecheckCmd(String str) {
    }

    public String[] parseOpValue(String str) {
    }

    public synchronized void saveCommandConfigs(String str, Map<String, Object> map) {
    }

    public String serializeMap(Map<String, String> map) {
    }

    public void setCommandForTest(String str, String str2) {
    }

    public synchronized void applyCommand(ConfigDef.Command[] commandArr, String str, boolean z) {
    }

    public synchronized Map<String, String> getCommandMap(String str, Map<String, Object> map) {
    }

    public boolean applyCommand(ConfigDef.Command command, Map<String, Object> map, String[] strArr) {
    }

    public synchronized String getCmd(String str, String str2) {
    }
}
