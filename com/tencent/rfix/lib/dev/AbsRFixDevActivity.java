package com.tencent.rfix.lib.dev;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.tencent.rfix.lib.RFixListener;
import com.tencent.rfix.lib.event.ConfigEvent;
import com.tencent.rfix.lib.event.DownloadEvent;
import com.tencent.rfix.lib.event.InstallEvent;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class AbsRFixDevActivity extends Activity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, Handler.Callback, RFixListener {
    private static final int MSG_INIT = 100;

    @SuppressLint({"SdCardPath"})
    private static final String SDCARD_PATCH_PATH = "/sdcard/RFix-patch.apk";
    private static final String TAG = "RFix.AbsRFixDevActivity";
    public TextView appInfoTxt;
    public Button applyLocalPatchBtn;
    public CheckBox autoVerifyCheck;
    public Button cleanPatchBtn;
    public CheckBox disableConfigCheck;
    public EditText dummyAppVersionEdit;
    public EditText dummyUserIdEdit;
    public boolean hasAddListener;
    public boolean hasInitViews;
    public StringBuilder logContents;
    public TextView logInfoTxt;
    public TextView patchInfoTxt;
    public Button requestConfigBtn;
    public Button reservedBtn1;
    public Button reservedBtn2;
    public Button restartAppBtn;
    public CheckBox testEnvCheck;
    public Handler uiHandler;

    private /* synthetic */ void a(boolean z, ConfigEvent configEvent, int i2) {
    }

    private /* synthetic */ void c(boolean z, DownloadEvent downloadEvent, int i2) {
    }

    private /* synthetic */ void e(boolean z, InstallEvent installEvent) {
    }

    private void savePropToFile() {
    }

    @SuppressLint({"SimpleDateFormat"})
    public void addLogInfo(String str) {
    }

    public void applyLocalPath() {
    }

    public /* synthetic */ void b(boolean z, ConfigEvent configEvent, int i2) {
    }

    public void cleanPatch() {
    }

    public /* synthetic */ void d(boolean z, DownloadEvent downloadEvent, int i2) {
    }

    public /* synthetic */ void f(boolean z, InstallEvent installEvent) {
    }

    public String getAppInfo() {
    }

    public String getLoadResult() {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
    }

    public void initDebugViews() {
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.tencent.rfix.lib.RFixListener
    public void onConfig(boolean z, int i2, ConfigEvent configEvent) {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onDestroy() {
    }

    @Override // com.tencent.rfix.lib.RFixListener
    public void onDownload(boolean z, int i2, DownloadEvent downloadEvent) {
    }

    @Override // com.tencent.rfix.lib.RFixListener
    public void onInstall(boolean z, int i2, InstallEvent installEvent) {
    }

    @Override // android.app.Activity
    public void onPause() {
    }

    public void onReservedBtn1Click() {
    }

    public void onReservedBtn2Click() {
    }

    public void requestConfig() {
    }

    public void restartApp() {
    }
}
