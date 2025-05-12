package com.tencent.xweb.xwalk.plugin;

import android.app.Activity;
import android.util.Pair;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.tencent.xweb.XFileSdk;
import com.tencent.xweb.util.SchedulerConfig;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public abstract class XWalkReaderBasePlugin extends XWalkPlugin {
    public static final String ACTION_CALLBACK_NAME_ON_DOUBLE_TAP = "ac_onDoubleTap";
    public static final String ACTION_CALLBACK_NAME_ON_GENERAL_CALLBACK = "ac_onGeneralCallback";
    public static final String ACTION_CALLBACK_NAME_ON_PAGE_CHANGE = "ac_onPageChange";
    public static final String ACTION_CALLBACK_NAME_ON_PAGE_COUNT_UPDATE = "ac_onPageCountUpdate";
    public static final String ACTION_CALLBACK_NAME_ON_REACH_END = "ac_onReachEnd";
    public static final String ACTION_CALLBACK_NAME_ON_SINGLE_TAP = "ac_onSingleTap";
    public static final String ACTION_CALLBACK_NAME_ON_THUMBNAIL_LOAD = "ac_onThumbnailLoad";
    public static final String ACTION_CALLBACK_NAME_ON_USER_CANCEL = "ac_onUserCancel";
    public static final String ACTION_CALLBACK_NAME_ON_USER_OPERATED = "ac_onUserOperated";
    public static final String ACTION_CALLBACK_NAME_ON_VIEW_STATUS_CHANGE = "ac_onViewStatusChange";
    public static final String ACTION_CALLBACK_PARAM_KEY_GENERAL_CALLBACK_NAME = "ac_generalCallbackName";
    public static final String ACTION_CALLBACK_PARAM_KEY_MOTION_EVENT = "ac_motionEvent";
    public static final String ACTION_CALLBACK_PARAM_KEY_PAGE_HEIGHT = "ac_pageHeight";
    public static final String ACTION_CALLBACK_PARAM_KEY_PAGE_INDEX = "ac_pageIndex";
    public static final String ACTION_CALLBACK_PARAM_KEY_PAGE_WIDTH = "ac_pageWidth";
    public static final String ACTION_CALLBACK_PARAM_KEY_THUMBNAIL = "ac_thumbnail";
    public static final String ACTION_CALLBACK_PARAM_KEY_TOTAL_COUNT = "ac_totalCount";
    public static final String ACTION_CALLBACK_PARAM_KEY_VIEW_CUR_HEIGHT = "ac_curHeight";
    public static final String ACTION_CALLBACK_PARAM_KEY_VIEW_CUR_WIDTH = "ac_curWidth";
    public static final String ACTION_CALLBACK_PARAM_KEY_VIEW_INDEX = "ac_viewIndex";
    public static final String ACTION_CALLBACK_PARAM_KEY_VIEW_TRANS_X = "ac_viewTransX";
    public static final String ACTION_CALLBACK_PARAM_KEY_VIEW_TRANS_Y = "ac_viewTransY";
    public static final String ACTION_CALLBACK_PARAM_KEY_VIEW_ZOOM = "ac_viewZoom";
    public static final String BATCH_METHOD_NAME = "batchConvert";
    public static final String DEX_DIR_NAME = "dex";
    public static final String FINISH_METHOD_NAME = "finishReadFile";
    public static final String GENERAL_INVOKE_METHOD_NAME = "generalInvoke";
    public static final String GENERAL_INVOKE_NAME = "gi_name";
    public static final String GENERAL_INVOKE_NAME_SET_DISABLE_DOUBLE_TAP = "gi_setDisableDoubleTap";
    public static final String GENERAL_INVOKE_NAME_SET_DISABLE_SCROLL = "gi_setDisableScroll";
    public static final String GENERAL_INVOKE_NAME_SET_TOUCH_EVENT = "gi_setTouchEvent";
    public static final String GENERAL_INVOKE_PARAM_KEY_DISABLE_DOUBLE_TAP = "gi_disableDoubleTap";
    public static final String GENERAL_INVOKE_PARAM_KEY_DISABLE_SCROLL = "gi_disableScroll";
    public static final String GENERAL_INVOKE_PARAM_KEY_TOUCH_EVENT = "gi_touchEvent";
    public static final String GET_SUPPORT_METHOD_NAME = "getSupportFormats";
    public static final String GET_VIEW_STATUS_METHOD_NAME = "getViewStatus";
    public static final String PARAM_KEY_BATCH_FILE_NAME = "batch_file_name";
    public static final String PARAM_KEY_BATCH_IN_DIR = "batch_in_dir";
    public static final String PARAM_KEY_BATCH_OUT_DIR = "batch_out_dir";
    public static final String PARAM_KEY_BATCH_REMAINING = "batch_remaining";
    public static final String PARAM_KEY_BATCH_SAVE_FILE = "batch_save_file";
    public static final String PARAM_KEY_CACHE_DIR = "cache_dir";
    public static final String PARAM_KEY_CONFIG_PARAM_PREFIX = "config_param_";
    public static final String PARAM_KEY_DARK_MODE = "dark_mode";
    public static final String PARAM_KEY_DISABLE_CACHE = "disable_cache";
    public static final String PARAM_KEY_DISABLE_ENCRY = "disable_encry";
    public static final String PARAM_KEY_ENV_CHANGED = "env_changed";
    public static final String PARAM_KEY_FILE_EXT = "file_ext";
    public static final String PARAM_KEY_FILE_PASSWORD = "file_password";
    public static final String PARAM_KEY_FILE_PATH = "file_path";
    public static final String PARAM_KEY_GET_INDEX = "get_index";
    public static final String PARAM_KEY_GET_X = "get_x";
    public static final String PARAM_KEY_GET_Y = "get_y";
    public static final String PARAM_KEY_GET_ZOOM = "get_zoom";
    public static final String PARAM_KEY_MEMORY_START = "memory_start";
    public static final String PARAM_KEY_PLUGIN_VERSION = "plugin_version";
    public static final String PARAM_KEY_RES_DIR = "res_dir";
    public static final String PARAM_KEY_SET_INDEX = "set_index";
    public static final String PARAM_KEY_SET_X = "set_x";
    public static final String PARAM_KEY_SET_Y = "set_y";
    public static final String PARAM_KEY_SET_ZOOM = "set_zoom";
    public static final String PARAM_KEY_STR_BUTTON_CANCEL = "str_button_cancel";
    public static final String PARAM_KEY_STR_BUTTON_CONFIRM = "str_button_confirm";
    public static final String PARAM_KEY_STR_HINT_COPIED = "str_hint_copied";
    public static final String PARAM_KEY_STR_OPERATION_COPY = "str_operation_copy";
    public static final String PARAM_KEY_STR_PASSWORD_HINT = "str_password_hint";
    public static final String PARAM_KEY_STR_PASSWORD_TITLE = "str_password_title";
    public static final String PARAM_KEY_STR_PASSWORD_WRONG = "str_password_wrong";
    public static final String PARAM_KEY_THUMBNAIL_INDEX = "thumbnail_index";
    public static final String PARAM_KEY_TIME_START = "time_start";
    public static final String PARAM_KEY_TOKEN = "token";
    public static final String PARAM_KEY_VIEW_TYPE = "view_type";
    public static final String PARAM_VALUE_VIEW_TYPE_LIST = "view_type_list";
    public static final String PARAM_VALUE_VIEW_TYPE_READER = "view_type_reader";
    public static final String READ_METHOD_NAME = "readFile";
    public static final String REQUEST_THUMBNAIL_METHOD_NAME = "requestThumbnail";
    public static final String SET_VIEW_TO_STATUS_METHOD_NAME = "setViewToStatus";
    public ValueCallback<Pair<Integer, String>> e;
    public ValueCallback<Pair<Integer, String>> f;
    public int loadedClassVersion;
    public Class loadedEnvClass;
    public Class loadedReaderClass;

    /* renamed from: com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements ValueCallback<Pair<Integer, String>> {
        public final /* synthetic */ XWalkReaderBasePlugin a;

        public AnonymousClass1(XWalkReaderBasePlugin xWalkReaderBasePlugin) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(Pair<Integer, String> pair) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(Pair<Integer, String> pair) {
        }
    }

    /* renamed from: com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements ValueCallback<Pair<Integer, String>> {
        public final /* synthetic */ XWalkReaderBasePlugin a;

        public AnonymousClass2(XWalkReaderBasePlugin xWalkReaderBasePlugin) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(Pair<Integer, String> pair) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(Pair<Integer, String> pair) {
        }
    }

    /* renamed from: com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass3 implements ValueCallback<Integer> {
        public final /* synthetic */ String a;
        public final /* synthetic */ ValueCallback b;
        public final /* synthetic */ XWalkReaderBasePlugin c;

        public AnonymousClass3(XWalkReaderBasePlugin xWalkReaderBasePlugin, String str, ValueCallback valueCallback) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(Integer num) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(Integer num) {
        }
    }

    /* renamed from: com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass4 implements ValueCallback<Integer> {
        public final /* synthetic */ String a;
        public final /* synthetic */ ValueCallback b;
        public final /* synthetic */ XWalkReaderBasePlugin c;

        public AnonymousClass4(XWalkReaderBasePlugin xWalkReaderBasePlugin, String str, ValueCallback valueCallback) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(Integer num) {
        }

        /* renamed from: onReceiveValue, reason: avoid collision after fix types in other method */
        public void onReceiveValue2(Integer num) {
        }
    }

    public static /* synthetic */ void a(XWalkReaderBasePlugin xWalkReaderBasePlugin) {
    }

    public final String b() {
    }

    public boolean batchConvert(HashMap<String, String> hashMap, Activity activity, ValueCallback<Pair<Integer, String>> valueCallback, ValueCallback<Pair<Integer, String>> valueCallback2, ValueCallback<Integer> valueCallback3) {
    }

    public final String c() {
    }

    @Override // com.tencent.xweb.xwalk.plugin.XWalkPlugin
    public void checkFiles() {
    }

    public final boolean d() {
    }

    public final void e() {
    }

    public void ensurePluginClass() throws Exception {
    }

    public void finishReadFile(HashMap<String, String> hashMap) {
    }

    public Object generalInvoke(HashMap<String, Object> hashMap) {
    }

    public abstract String getAPKPath(int i2);

    public String getDexDir(int i2) {
    }

    @Override // com.tencent.xweb.xwalk.plugin.XWalkPlugin
    public String getDownloadFullPath(int i2, boolean z) {
    }

    public abstract String getEnvClassPath();

    @Override // com.tencent.xweb.xwalk.plugin.XWalkPlugin
    public List<String> getKeyFilesPath(int i2) {
    }

    public abstract int getMinSupportRuntimeVersion(int i2);

    public abstract String getReaderClassPath();

    public XFileSdk.ViewStatus getViewStatus(HashMap<String, Object> hashMap) {
    }

    @Override // com.tencent.xweb.xwalk.plugin.XWalkPlugin
    public boolean isIgnoreForbidDownloadCode() {
    }

    public boolean isSupport(String str, boolean z) {
    }

    public void onReceiveValueProcess(ValueCallback<Integer> valueCallback, int i2) {
    }

    @Override // com.tencent.xweb.xwalk.plugin.XWalkPlugin
    public int performInstall(SchedulerConfig schedulerConfig) {
    }

    public boolean readFile(HashMap<String, String> hashMap, Activity activity, ViewGroup viewGroup, ValueCallback<Pair<String, Object>> valueCallback, ValueCallback<Integer> valueCallback2) {
    }

    public boolean requestThumbnail(HashMap<String, Object> hashMap) {
    }

    public boolean setViewToStatus(HashMap<String, Object> hashMap) {
    }

    public final String a(ClassLoader classLoader) {
    }

    public final boolean a(String str) {
    }
}
