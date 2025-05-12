package com.tencent.bugly.common.reporter.builder;

import android.content.Context;
import com.tencent.bugly.common.constants.PluginName;
import com.tencent.bugly.common.meta.UserMeta;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class ReportDataBuilder {
    public static final String KEY_64_BIT_FLAG = "is64bit";
    public static final String KEY_ACCOUNT_ID = "account_id";
    public static final String KEY_APP_KEY = "app_key";
    public static final String KEY_APP_VERSION = "app_version";
    public static final String KEY_APP_VERSION_MODE = "app_version_mode";
    public static final String KEY_ATTRIBUTES = "Attributes";
    public static final String KEY_BASE_TYPE = "base_type";
    public static final String KEY_BIZ_EXTEND_INFO = "biz_extend_info";
    public static final String KEY_BODY = "Body";
    public static final String KEY_BRAND = "brand";
    public static final String KEY_BUILD_NUMBER = "build_number";
    public static final String KEY_BUNDLE_ID = "bundle_id";
    public static final String KEY_CLIENT_IDENTIFY = "client_identify";
    public static final String KEY_EVENT_TIME = "event_time";
    public static final String KEY_EXTEND_INFO = "extend_info";
    public static final String KEY_FULL_OS_VERSION = "full_os_version";
    public static final String KEY_HARDWARE_OS = "hardware_os";
    public static final String KEY_LAUNCH_ID = "launch_id";
    public static final String KEY_MODEL = "model";
    public static final String KEY_OPERATION_LOG = "operation_log";
    public static final String KEY_OS_VERSION = "os_version";
    public static final String KEY_PLATFORM = "platform";
    public static final String KEY_PROCESS_LAUNCH_ID = "process_launch_id";
    public static final String KEY_PROCESS_NAME = "process_name";
    public static final String KEY_PRODUCT_ID = "product_id";
    public static final String KEY_RESOURCE = "Resource";
    public static final String KEY_SDK_VERSION = "sdk_version";
    public static final String KEY_SUB_TYPE = "sub_type";
    public static final String KEY_UNIQUE_ID = "unique_id";
    public static final String KEY_USER_CUSTOM = "user_custom";
    private static final String LINKER = "-";
    private static final long ONE_SECOND_IN_MS = 1000;
    private static final HashMap<String, Integer> PLUGIN_ID_MAP = null;
    private static final HashMap<Integer, String> PLUGIN_NAME_MAP = null;
    private static final String TAG = "Bugly_RDataBuilder";

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface BaseType {
        public static final String BATTERY = "battery";
        public static final String DB = "db";
        public static final String DEVICE = "device";
        public static final String IO = "io";
        public static final String LAUNCH = "launch";
        public static final String LOOPER = "looper";
        public static final String MEMORY = "memory";
        public static final String METRIC = "metric";
        public static final String RESOURCE = "resource";
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface SubType extends PluginName {
    }

    public static String getBundleId(Context context) {
    }

    public static String getClientIdentify(UserMeta userMeta) {
    }

    public static int getPluginFromParam(JSONObject jSONObject) {
    }

    public static String getPluginName(int i2) {
    }

    private static void initPluginIdMap() {
    }

    private static void initPluginNameMap() {
    }

    public static JSONObject makeParam(Context context, String str, String str2, UserMeta userMeta) {
    }

    public static JSONObject makeResource(UserMeta userMeta) {
    }
}
