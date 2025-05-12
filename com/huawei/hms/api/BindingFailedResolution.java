package com.huawei.hms.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.api.FailedBinderCallBack;
import com.huawei.hms.ui.AbstractDialog;
import com.huawei.hms.ui.AbstractPromptDialog;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class BindingFailedResolution implements IBridgeActivityDelegate, ServiceConnection {
    private static final Object LOCK_CONNECT_TIMEOUT_HANDLER = null;
    private static final int MSG_CONN_TIMEOUT = 2;
    private static final int MSG_SELF_DESTROY_TIMEOUT = 3;
    private static final int REQUEST_CODE = 2003;
    private static final String TAG = "BindingFailedResolution";
    private FailedBinderCallBack.BinderCallBack callBack;
    private Activity curActivity;
    private boolean isStarting;
    private Handler mConnectTimeoutHandler;
    private d promptdlg;
    private Handler selfDestroyHandler;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements Handler.Callback {
        public final /* synthetic */ BindingFailedResolution a;

        public a(BindingFailedResolution bindingFailedResolution) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements Handler.Callback {
        public final /* synthetic */ BindingFailedResolution a;

        public b(BindingFailedResolution bindingFailedResolution) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c implements AbstractDialog.Callback {
        public final /* synthetic */ BindingFailedResolution a;

        public c(BindingFailedResolution bindingFailedResolution) {
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onCancel(AbstractDialog abstractDialog) {
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onDoWork(AbstractDialog abstractDialog) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d extends AbstractPromptDialog {
        private d() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog
        public String onGetMessageString(Context context) {
        }

        @Override // com.huawei.hms.ui.AbstractDialog
        public String onGetPositiveButtonString(Context context) {
        }

        public /* synthetic */ d(a aVar) {
        }
    }

    public static /* synthetic */ void access$000(BindingFailedResolution bindingFailedResolution) {
    }

    public static /* synthetic */ void access$100(BindingFailedResolution bindingFailedResolution, int i2) {
    }

    public static /* synthetic */ void access$200(BindingFailedResolution bindingFailedResolution, boolean z) {
    }

    public static /* synthetic */ d access$402(BindingFailedResolution bindingFailedResolution, d dVar) {
    }

    private void bindCoreService(boolean z) {
    }

    private void cancelConnDelayHandle() {
    }

    private void finishBridgeActivity(int i2) {
    }

    private void fireStartResult(boolean z) {
    }

    private void noticeBindFailed() {
    }

    private void noticeBindResult(boolean z, int i2) {
    }

    private void postConnDelayHandle() {
    }

    private void selfDestroyHandle() {
    }

    private void showPromptdlg() {
    }

    private void tryStartHmsActivity(Activity activity) {
    }

    public Activity getActivity() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i2, KeyEvent keyEvent) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    public void onStartResult(boolean z) {
    }
}
