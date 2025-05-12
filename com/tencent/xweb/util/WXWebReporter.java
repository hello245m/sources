package com.tencent.xweb.util;

import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewReporterInterface;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class WXWebReporter {
    public static final String APPBRAND_PRELOAD_LINK = "https://servicewechat.com/preload/page-frame.html";
    public static final int APPBRAND_SCENE = 0;
    public static final String APPBRAND_URL_PREFIX = "https://servicewechat.com/";
    public static final int APPBRAND_WEBVIEW_SCENE = 3;
    public static final int CHECK_XWALK_FILE_CRUPPTED = 63;
    public static final int CHECK_XWALK_FILE_CRUPPTED_AT_FIRST_TIME = 64;
    public static final int CHECK_XWALK_NO_FILE_CONFIG = 78;
    public static final int CHECK_XWALK_NO_RES_CONFIG = 79;
    public static final int CHECK_XWALK_RES_CRUPPTED = 76;
    public static final int CHECK_XWALK_RES_CRUPPTED_AT_FIRST_TIME = 77;
    public static final int CLEAR_OLD_XWALK_FAILED = 66;
    public static final int CLEAR_OLD_XWALK_SUC = 65;
    public static final int E_ACFUN_VIDEO = 3;
    public static final int E_BILI_VIDEO = 2;
    public static final int E_LE_VIDEO = 1;
    public static final int E_QQ_VIDEO = 0;
    public static final int KEY_FREQ_COPY_DEX_SUC = 249;
    public static final int KEY_FREQ_FIND_DEX_CORUPPT = 253;
    public static final int KEY_FREQ_LOAD_CORE_FAILED = 252;
    public static final int KEY_FREQ_LOAD_FAILED_15_TIMES = 243;
    public static final int KEY_FREQ_NEW_FAILED_15_TIMES = 245;
    public static final int KEY_FREQ_NEW_WEB_FAILED = 247;
    public static final int KEY_FREQ_REMOVE_DEX_FAILED = 250;
    public static final int KEY_FREQ_REMOVE_OPT_DEX_FAILED = 255;
    public static final int KEY_FREQ_REMOVE_OPT_DEX_SUC = 254;
    public static final int KEY_GEN_OPT_DEX_FAILED = 251;
    public static final int KEY_LOAD_FAILED_CANT_FIX = 244;
    public static final int KEY_NEW_FAILED_CANT_FIX = 246;
    public static final int KEY_SET_DATA_SUFFIX_INVOKE_METHOD_FAILED = 232;
    public static final int KEY_SET_DATA_SUFFIX_LOCK_FILE_FAILED = 230;
    public static final int KEY_SET_DATA_SUFFIX_LOCK_FILE_FAILED_2 = 231;
    public static final int KEY_TRY_FIX_DEX_FAILED = 248;
    public static final int LOAD_SO_32_RUNTIME_USE_64_SO = 193;
    public static final int LOAD_SO_64_RUNTIME_USE_32_SO = 194;
    public static final int LOAD_SO_CPU_BUILD_NOT_MATCH = 191;
    public static final int LOAD_SO_EXCEPTION = 192;
    public static final int LOAD_SO_LINK_ERR_OTHER = 195;
    public static final String MP_BRIDGE_PREFIX = "http://mp.weixinbridge.com/";
    public static final String MP_LIST_URL_HTTPS_PREFIX = "https://servicewechat.com/preload/";
    public static final int MP_SCENE = 1;
    public static final String MP_URL_HTTPS_PREFIX = "https://mp.weixin.qq.com/";
    public static final String MP_URL_PREFIX = "http://mp.weixin.qq.com/";
    public static final int OUT_LINK_SCENE = 2;
    public static final int WXWEB_67_IDKEY_ID = 938;
    public static final int WXWEB_FIND_XWALK_CRASH = 61;
    public static final int WXWEB_GET_MMKV_CALLBACK_IS_NULL = 177;
    public static final int WXWEB_GET_MMKV_FROM_CALLBACK_FAILED = 176;
    public static final int WXWEB_GET_REFLECT_MMKV_INVOKE_FAILED = 179;
    public static final int WXWEB_GET_REFLECT_MMKV_METHED_FAILED = 178;
    public static final int WXWEB_IDKEY_APK_DOWNLOAD = 9;
    public static final int WXWEB_IDKEY_APK_DOWNLOAD_COST = 12;
    public static final int WXWEB_IDKEY_APK_DOWNLOAD_FAILED = 10;
    public static final int WXWEB_IDKEY_APK_DOWNLOAD_SUCCESS = 11;
    public static final int WXWEB_IDKEY_APPBRAND_UV_START = 73;
    public static final int WXWEB_IDKEY_APPLY_PATCH = 14;
    public static final int WXWEB_IDKEY_APPLY_PATCH_COST = 17;
    public static final int WXWEB_IDKEY_APPLY_PATCH_FAILED = 15;
    public static final int WXWEB_IDKEY_APPLY_PATCH_SUCCESS = 16;
    public static final int WXWEB_IDKEY_CHECKFILELIST_ERROR = 33;
    public static final int WXWEB_IDKEY_CHECK_UPDATECONFIG_FAILED = 60;
    public static final int WXWEB_IDKEY_CONFIG_CHECK_MD5_ERROR = 34;
    public static final int WXWEB_IDKEY_CONFIG_DOWNLOAD = 20;
    public static final int WXWEB_IDKEY_CONFIG_DOWNLOAD_COST = 23;
    public static final int WXWEB_IDKEY_CONFIG_DOWNLOAD_FAILED = 21;
    public static final int WXWEB_IDKEY_CONFIG_DOWNLOAD_SUCCESS = 22;
    public static final int WXWEB_IDKEY_CONFIG_PARSE_ERROR = 35;
    public static final int WXWEB_IDKEY_CONFIG_SIGNATURE_NOT_MATCH = 95;
    public static final int WXWEB_IDKEY_CREATE_WEBVIEW_FAILED_FINAL = 87;
    public static final int WXWEB_IDKEY_CREATE_WEBVIEW_FAILED_SYS = 84;
    public static final int WXWEB_IDKEY_CREATE_WEBVIEW_FAILED_X5 = 85;
    public static final int WXWEB_IDKEY_CREATE_WEBVIEW_FAILED_XWALK = 86;
    public static final int WXWEB_IDKEY_DEBUG_LINK_ALL = 224;
    public static final int WXWEB_IDKEY_DEBUG_LINK_FROM_WEB = 223;
    public static final int WXWEB_IDKEY_DECOMPRESS_ERROR = 32;
    public static final int WXWEB_IDKEY_FR_AUDIO_ID = 1900;
    public static final int WXWEB_IDKEY_FR_CACHE_HIT = 192;
    public static final int WXWEB_IDKEY_FR_ERR_DISABLE_PASSWORD = 167;
    public static final int WXWEB_IDKEY_FR_ERR_DOWNLOAD_CANCEL = 165;
    public static final int WXWEB_IDKEY_FR_ERR_DOWNLOAD_OR_INSTALL_FAILED = 166;
    public static final int WXWEB_IDKEY_FR_ERR_FILE_NOT_EXIST = 156;
    public static final int WXWEB_IDKEY_FR_ERR_FILE_NOT_SUPPORT = 157;
    public static final int WXWEB_IDKEY_FR_ERR_FORBID_DOWNLOAD_CODE = 151;
    public static final int WXWEB_IDKEY_FR_ERR_INVOKE_ERROR = 153;
    public static final int WXWEB_IDKEY_FR_ERR_PASSWORD_ERROR = 162;
    public static final int WXWEB_IDKEY_FR_ERR_PLUGIN_INIT_ERROR = 154;
    public static final int WXWEB_IDKEY_FR_ERR_PLUGIN_NOT_INSTALLED = 152;
    public static final int WXWEB_IDKEY_FR_ERR_PLUGIN_WRONG_PARAM = 155;
    public static final int WXWEB_IDKEY_FR_ERR_SO_ERROR = 163;
    public static final int WXWEB_IDKEY_FR_ERR_TASK_EXIST = 158;
    public static final int WXWEB_IDKEY_FR_ERR_TASK_PREPARE_ERROR = 159;
    public static final int WXWEB_IDKEY_FR_ERR_TASK_RUN_ERROR = 160;
    public static final int WXWEB_IDKEY_FR_ERR_VERSION_TOO_OLD = 161;
    public static final int WXWEB_IDKEY_FR_ERR_VIEW_DESTROY = 164;
    public static final int WXWEB_IDKEY_FR_EXCEL_ID = 1070;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD = 78;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_CONFIG_DOWNLOAD_FAILED = 85;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_CONFIG_PARSE_FAILED = 86;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_NO_AVAILABLE_UPDATE = 88;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_NO_NEED_TO_FETCH_CONFIG = 83;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_NO_NETWORK = 82;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_NO_PLUGIN_IN_CONFIG = 87;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_OTHERS_IS_UPDATING = 84;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_PLUGIN_ONLY_DOWNLOAD_ERROR = 90;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_PLUGIN_ONLY_INSTALL_ERROR = 91;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_PLUGIN_UPDATE_ERROR = 89;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_START_FAILED = 80;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_SUCCESS = 79;
    public static final int WXWEB_IDKEY_FR_EXPLICIT_DOWNLOAD_USER_CANCEL = 81;
    public static final int WXWEB_IDKEY_FR_EXTEND_OTHER_PV = 9;
    public static final int WXWEB_IDKEY_FR_EXTEND_OTHER_UV = 11;
    public static final int WXWEB_IDKEY_FR_EXTEND_QQBROWSER_PV = 17;
    public static final int WXWEB_IDKEY_FR_EXTEND_QQBROWSER_UV = 19;
    public static final int WXWEB_IDKEY_FR_EXTEND_SIZE_G_10_L_20 = 25;
    public static final int WXWEB_IDKEY_FR_EXTEND_SIZE_G_20_L_50 = 26;
    public static final int WXWEB_IDKEY_FR_EXTEND_SIZE_G_50 = 27;
    public static final int WXWEB_IDKEY_FR_EXTEND_SIZE_L_10 = 24;
    public static final int WXWEB_IDKEY_FR_EXTEND_X5_FAIL = 15;
    public static final int WXWEB_IDKEY_FR_EXTEND_X5_PV = 5;
    public static final int WXWEB_IDKEY_FR_EXTEND_X5_UV = 7;
    public static final int WXWEB_IDKEY_FR_EXTEND_XWEB_FAIL = 13;
    public static final int WXWEB_IDKEY_FR_EXTEND_XWEB_PV = 1;
    public static final int WXWEB_IDKEY_FR_EXTEND_XWEB_UV = 3;
    public static final int WXWEB_IDKEY_FR_EXTEND_XWEB_X5_ALL_FAIL = 39;
    public static final int WXWEB_IDKEY_FR_LAST_TASK_EXIST = 191;
    public static final int WXWEB_IDKEY_FR_OFFICE_EXCEL_ID = 1879;
    public static final int WXWEB_IDKEY_FR_OFFICE_ID = 1544;
    public static final int WXWEB_IDKEY_FR_OFFICE_POWERPOINT_ID = 1880;
    public static final int WXWEB_IDKEY_FR_OFFICE_WORD_ID = 1891;
    public static final int WXWEB_IDKEY_FR_OTHER_PV = 8;
    public static final int WXWEB_IDKEY_FR_OTHER_UV = 10;
    public static final int WXWEB_IDKEY_FR_PASSWORD_RETRY_EXCEED_LIMIT = 73;
    public static final int WXWEB_IDKEY_FR_PDF_ID = 1071;
    public static final int WXWEB_IDKEY_FR_PLUGIN_CHECK_FAIL = 63;
    public static final int WXWEB_IDKEY_FR_PLUGIN_DOWNLOAD = 60;
    public static final int WXWEB_IDKEY_FR_PLUGIN_DOWNLOAD_FAIL = 62;
    public static final int WXWEB_IDKEY_FR_PLUGIN_DOWNLOAD_SUC = 61;
    public static final int WXWEB_IDKEY_FR_PLUGIN_FILE_DAMAGED = 66;
    public static final int WXWEB_IDKEY_FR_PLUGIN_INSTALL_FAIL = 65;
    public static final int WXWEB_IDKEY_FR_PLUGIN_MENU_OPENBY_OTHER_CLICK = 68;
    public static final int WXWEB_IDKEY_FR_PLUGIN_MENU_SEND_CLICK = 67;
    public static final int WXWEB_IDKEY_FR_PLUGIN_PATCH_APPLY_FAIL = 57;
    public static final int WXWEB_IDKEY_FR_PLUGIN_PATCH_CHECK_FAIL = 55;
    public static final int WXWEB_IDKEY_FR_PLUGIN_PATCH_DOWNLOAD = 51;
    public static final int WXWEB_IDKEY_FR_PLUGIN_PATCH_DOWNLOAD_FAIL = 54;
    public static final int WXWEB_IDKEY_FR_PLUGIN_PATCH_DOWNLOAD_SUC = 52;
    public static final int WXWEB_IDKEY_FR_PLUGIN_PATCH_INSTALL_FAIL = 59;
    public static final int WXWEB_IDKEY_FR_POWERPOINT_ID = 1068;
    public static final int WXWEB_IDKEY_FR_QQBROWSER_PV = 16;
    public static final int WXWEB_IDKEY_FR_QQBROWSER_UV = 18;
    public static final int WXWEB_IDKEY_FR_READ_ENCRYPTED_FILE = 70;
    public static final int WXWEB_IDKEY_FR_READ_ENCRYPTED_FILE_SUCCESS = 71;
    public static final int WXWEB_IDKEY_FR_SIZE_G_10_L_20 = 21;
    public static final int WXWEB_IDKEY_FR_SIZE_G_20_L_50 = 22;
    public static final int WXWEB_IDKEY_FR_SIZE_G_50 = 23;
    public static final int WXWEB_IDKEY_FR_SIZE_L_10 = 20;
    public static final int WXWEB_IDKEY_FR_TXT_ID = 1889;
    public static final int WXWEB_IDKEY_FR_USING_APKVERSION_MAX = 150;
    public static final int WXWEB_IDKEY_FR_USING_APKVERSION_MIN = 100;
    public static final int WXWEB_IDKEY_FR_WORD_ID = 1069;
    public static final int WXWEB_IDKEY_FR_WRONG_IMG_SIZE = 190;
    public static final int WXWEB_IDKEY_FR_WRONG_PASSWORD = 72;
    public static final int WXWEB_IDKEY_FR_X5_FAIL = 14;
    public static final int WXWEB_IDKEY_FR_X5_PV = 4;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_CMD = 42;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_CONTEXT_ERROR = 48;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_FILE_NOT_SUPPORT = 47;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_FORBID_DOWNLOAD_CODE = 44;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_FORCE = 41;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_HARDCODE = 40;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_INNER_ERROR = 49;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_PLUGIN_NOT_INSTALLED = 45;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_PLUGIN_TOO_OLD = 46;
    public static final int WXWEB_IDKEY_FR_X5_SCENE_RECENT_CRASH = 43;
    public static final int WXWEB_IDKEY_FR_X5_TO_XWEB = 76;
    public static final int WXWEB_IDKEY_FR_X5_TO_XWEB_XWEB_FAILED = 77;
    public static final int WXWEB_IDKEY_FR_X5_UV = 6;
    public static final int WXWEB_IDKEY_FR_XWEB_FAIL = 12;
    public static final int WXWEB_IDKEY_FR_XWEB_PV = 0;
    public static final int WXWEB_IDKEY_FR_XWEB_SCENE_MINIQB_ERROR = 50;
    public static final int WXWEB_IDKEY_FR_XWEB_TO_X5 = 74;
    public static final int WXWEB_IDKEY_FR_XWEB_TO_X5_X5_FAILED = 75;
    public static final int WXWEB_IDKEY_FR_XWEB_UV = 2;
    public static final int WXWEB_IDKEY_FR_XWEB_X5_ALL_FAIL = 38;
    public static final int WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD = 185;
    public static final int WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_FAILED = 187;
    public static final int WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_SUCCESS = 186;
    public static final int WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED = 188;
    public static final int WXWEB_IDKEY_FULL_SCREEN_JS_USE_DEFAULT = 190;
    public static final int WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD = 189;
    public static final int WXWEB_IDKEY_ID = 577;
    public static final int WXWEB_IDKEY_INIT_CORE_FAILED_FINAL = 83;
    public static final int WXWEB_IDKEY_INIT_CORE_FAILED_SYS = 80;
    public static final int WXWEB_IDKEY_INIT_CORE_FAILED_X5 = 81;
    public static final int WXWEB_IDKEY_INIT_CORE_FAILED_XWALK = 82;
    public static final int WXWEB_IDKEY_LOCAL_TO_OVERSEA = 197;
    public static final int WXWEB_IDKEY_OVERSEA_TO_LOCAL = 198;
    public static final int WXWEB_IDKEY_PATCHMODE_ADDFILE_ERROR = 40;
    public static final int WXWEB_IDKEY_PATCHMODE_CHECKFILELIST_ERROR = 36;
    public static final int WXWEB_IDKEY_PATCHMODE_COPYFROMBASE_ERROR = 39;
    public static final int WXWEB_IDKEY_PATCHMODE_DECOMPRESS_ERROR = 37;
    public static final int WXWEB_IDKEY_PATCHMODE_NOCONFIG_ERROR = 38;
    public static final int WXWEB_IDKEY_PATCHMODE_REMOVEFILE_ERROR = 41;
    public static final int WXWEB_IDKEY_PATCH_DOWNLOAD = 25;
    public static final int WXWEB_IDKEY_PATCH_DOWNLOAD_COST = 28;
    public static final int WXWEB_IDKEY_PATCH_DOWNLOAD_FAILED = 26;
    public static final int WXWEB_IDKEY_PATCH_DOWNLOAD_SUCCESS = 27;
    public static final int WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD = 181;
    public static final int WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED = 183;
    public static final int WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS = 182;
    public static final int WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED = 184;
    public static final int WXWEB_IDKEY_PLUGIN_UPDATE_START = 180;
    public static final int WXWEB_IDKEY_RECHECK_CHECK_FILE_ERROR = 92;
    public static final int WXWEB_IDKEY_RECHECK_UPDATE_CONFIG = 68;
    public static final int WXWEB_IDKEY_REVERT_NO_OLD_FAILED_ = 91;
    public static final int WXWEB_IDKEY_REVERT_TONEAR_SUC = 90;
    public static final int WXWEB_IDKEY_REVERT_TOTARGET_SUC = 89;
    public static final int WXWEB_IDKEY_START_CHECK_UPDATE = 88;
    public static final int WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE = 199;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_ACFUN_ENTER_FULLSCREEN = 162;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_ACFUN_HOOK = 154;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_BILI_ENTER_FULLSCREEN = 161;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_BILI_HOOK = 153;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_LE_ENTER_FULLSCREEN = 160;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_LE_HOOK = 152;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_LOAD = 46;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_LOAD_COST = 49;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_LOAD_FAILED = 47;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_LOAD_SUCCESS = 48;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_ONSHOWCUSTOMVIEW = 56;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL = 57;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE = 58;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO = 59;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_QQ_ENTER_FULLSCREEN = 159;
    public static final int WXWEB_IDKEY_SYSWEBVIEW_QQ_HOOK = 151;
    public static final int WXWEB_IDKEY_TOOLS_UV_START = 70;
    public static final int WXWEB_IDKEY_USER_FORCE_CHECK_UPDATE = 93;
    public static final int WXWEB_IDKEY_USER_FORCE_DOWNLOAD = 94;
    public static final int WXWEB_IDKEY_USING_APKVERSION_MAX = 150;
    public static final int WXWEB_IDKEY_USING_APKVERSION_MIN = 100;
    public static final int WXWEB_IDKEY_USING_SYS_DAILY = 97;
    public static final int WXWEB_IDKEY_USING_X5_DAILY = 98;
    public static final int WXWEB_IDKEY_USING_XWALK_DAILY = 99;
    public static final int WXWEB_IDKEY_WEBVIEW_LOAD = 0;
    public static final int WXWEB_IDKEY_WEBVIEW_LOAD_COST = 3;
    public static final int WXWEB_IDKEY_WEBVIEW_LOAD_FAILED = 1;
    public static final int WXWEB_IDKEY_WEBVIEW_LOAD_SUCCESS = 2;
    public static final int WXWEB_IDKEY_WXWEBVIEW_ACFUN_ENTER_FULLSCREEN = 166;
    public static final int WXWEB_IDKEY_WXWEBVIEW_ACFUN_HOOK = 158;
    public static final int WXWEB_IDKEY_WXWEBVIEW_BILI_ENTER_FULLSCREEN = 165;
    public static final int WXWEB_IDKEY_WXWEBVIEW_BILI_HOOK = 157;
    public static final int WXWEB_IDKEY_WXWEBVIEW_JS_EXCEPTION = 167;
    public static final int WXWEB_IDKEY_WXWEBVIEW_LE_ENTER_FULLSCREEN = 164;
    public static final int WXWEB_IDKEY_WXWEBVIEW_LE_HOOK = 156;
    public static final int WXWEB_IDKEY_WXWEBVIEW_LOAD = 4;
    public static final int WXWEB_IDKEY_WXWEBVIEW_LOAD_COST = 7;
    public static final int WXWEB_IDKEY_WXWEBVIEW_LOAD_FAILED = 5;
    public static final int WXWEB_IDKEY_WXWEBVIEW_LOAD_SUCCESS = 6;
    public static final int WXWEB_IDKEY_WXWEBVIEW_ONSHOWCUSTOMVIEW_FULLSCREEN = 52;
    public static final int WXWEB_IDKEY_WXWEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL = 53;
    public static final int WXWEB_IDKEY_WXWEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE = 54;
    public static final int WXWEB_IDKEY_WXWEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO = 55;
    public static final int WXWEB_IDKEY_WXWEBVIEW_QQ_ENTER_FULLSCREEN = 163;
    public static final int WXWEB_IDKEY_WXWEBVIEW_QQ_HOOK = 155;
    public static final int WXWEB_IDKEY_X5WEBVIEW_LOAD = 42;
    public static final int WXWEB_IDKEY_X5WEBVIEW_LOAD_COST = 45;
    public static final int WXWEB_IDKEY_X5WEBVIEW_LOAD_FAILED = 43;
    public static final int WXWEB_IDKEY_X5WEBVIEW_LOAD_SUCCESS = 44;
    public static final int WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW = 168;
    public static final int WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL = 169;
    public static final int WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE = 174;
    public static final int WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO = 175;
    public static final int WXWEB_IDKEY_X86_FORCE_SYS = 69;
    public static final int WXWEB_KVSTAT_ID = 15003;
    public static final int WXWEB_KVSTAT_STAGE_CODE_END = 1;
    public static final int WXWEB_KVSTAT_STAGE_CODE_START = 0;
    public static final int WXWEB_KV_CONFIG_DOWNLOAD = 15123;
    public static final int WXWEB_KV_CORE_PROVIDER_OPENFILE = 15625;
    public static final int WXWEB_KV_CORE_UPDATE_FROM_PROVIDER = 15626;
    public static final int WXWEB_KV_FR_ACTION = 25696;
    public static final int WXWEB_KV_FR_ACTION_TYPE_CLICK_COPY = 5;
    public static final int WXWEB_KV_FR_ACTION_TYPE_CLICK_EDIT = 6;
    public static final int WXWEB_KV_FR_ACTION_TYPE_DOUBLE_CLICK = 2;
    public static final int WXWEB_KV_FR_ACTION_TYPE_LONG_PRESS = 4;
    public static final int WXWEB_KV_FR_ACTION_TYPE_OPEN = 1;
    public static final int WXWEB_KV_FR_ACTION_TYPE_SCALE = 3;
    public static final int WXWEB_KV_FR_ACTION_TYPE_SHOW_BOTTOM_BAR = 51;
    public static final int WXWEB_KV_FR_COST = 17564;
    public static final int WXWEB_KV_FR_ERROR_CODE = 17566;
    public static final int WXWEB_KV_FR_EXCEPTION = 17565;
    public static final int WXWEB_KV_FR_FILE_INFO = 17562;
    public static final int WXWEB_KV_FR_OPEN_FILE = 25414;
    public static final int WXWEB_KV_FR_OPEN_FILE_RET = 25415;
    public static final int WXWEB_KV_FR_X5_SCENE = 17563;
    public static final int WXWEB_KV_PLUGIN_CONFIG_UPDATE = 26264;
    public static final int WXWEB_KV_PLUGIN_UPDATE = 15718;
    public static final int WXWEB_KV_PLUGIN_UPDATE_NEW = 26265;
    public static final int WXWEB_KV_RUNTIME_PATCH_DOWNLOAD = 15124;
    public static final int WXWEB_XWALK_CORE_CRASH_DAILY = 62;
    public static final int WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED = 226;
    public static final int WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS = 228;
    public static final int WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC = 227;
    public static final int WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED = 220;
    public static final int WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS = 222;
    public static final int WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_TEST_SYS_SUC = 221;
    public static final int WXXWEB_PRE_DOWN_ARM32_SCHEDULED = 236;
    public static final int WXXWEB_PRE_DOWN_ARM32_SUC = 238;
    public static final int WXXWEB_PRE_DOWN_ARM64_SCHEDULED = 237;
    public static final int WXXWEB_PRE_DOWN_ARM64_SUC = 239;
    public static final int WXXWEB_PRE_DOWN_MATCHED = 240;
    public static final int WX_WEB_67_IDKEY_WXWEBVIEW_CLASSCIRCULARITYERROR = 90;
    public static final int WX_WEB_67_IDKEY_WXWEBVIEW_EXCEPTION = 91;
    public static final int WX_WEB_67_IDKEY_WXWEBVIEW_RUNTIMEEXCEPTION = 89;
    public static final int WX_WEB_67_IDKEY_WXWEBVIEW_TRANSLATE_GET_SAMPLE_STRING_PER_DAY = 103;
    public static boolean a = false;
    public static WebViewReporterInterface b = null;
    public static boolean c = false;
    public static String sStrModule = "";

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ID1367KeyDef {
        public static final int ID = 1367;
        public static final int KEY_REPORT_DEVICE32 = 253;
        public static final int KEY_REPORT_DEVICE64 = 254;
        public static final int KEY_REPORT_INSTALLED_NO_VER = 251;
        public static final int KEY_REPORT_INSTALLED_VER_MIN = 0;
        public static final int KEY_REPORT_PREDOWN_NO_VER = 252;
        public static final int KEY_REPORT_PREDOWN_VER_MIN = 100;
        public static final int KEY_REPORT_RUNTIME64 = 255;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ID1511KeyDef {
        public static final int ID = 1511;
        public static final int KEY_MAIN_CFG_START = 0;
        public static final int KEY_PLUG_CFG_START = 100;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ID1749KeyDef {
        public static final int ID = 1749;
        public static final int KEY_ALL_KINDS_FPS_DISABLED_FROM_CLIENT = 3;
        public static final int KEY_ALL_KINDS_FPS_ENABLED_FROM_CLIENT = 2;
        public static final int KEY_CHANNEL_GET_CLASSLOADER_FAIL = 50;
        public static final int KEY_CHANNEL_INIT_CORE_BRIDGE_FAIL = 51;
        public static final int KEY_CHANNEL_INIT_LOG_CHANNEL_FAIL = 54;
        public static final int KEY_CHANNEL_INIT_NORMAL_CHANNEL = 61;
        public static final int KEY_CHANNEL_INIT_NORMAL_CHANNEL_SUCCESS = 62;
        public static final int KEY_CHANNEL_INIT_NOTIFY_CHANNEL_FAIL = 52;
        public static final int KEY_CHANNEL_INIT_RUNTIME_TO_SDK_CHANNEL_FAIL = 53;
        public static final int KEY_CHANNEL_INIT_STANDALONE_CHANNEL = 59;
        public static final int KEY_CHANNEL_INIT_STANDALONE_CHANNEL_SUCCESS = 60;
        public static final int KEY_CHANNEL_INVALID_VERSION = 49;
        public static final int KEY_CHANNEL_LOAD_NATIVE_LIBRARY_FAIL = 55;
        public static final int KEY_CHANNEL_NATIVE_LIBRARY_NOT_MATCH = 56;
        public static final int KEY_CHANNEL_NOT_SUPPORT_STANDALONE_MODE = 58;
        public static final int KEY_CHANNEL_SET_STANDALONE_MODE_FAIL = 57;
        public static final int KEY_CLEAN_PREDOWN_CORE = 85;
        public static final int KEY_COMMAND_CONFIG_SECTION_A_B_NOT_READY = 46;
        public static final int KEY_COMMAND_CONFIG_SECTION_A_READY = 47;
        public static final int KEY_COMMAND_CONFIG_SECTION_B_READY = 48;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_PINUS = 33;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_PINUS_FAILED = 37;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_PINUS_FAILED_FINALLY = 41;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_SYS = 30;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_SYS_FAILED = 34;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_SYS_FAILED_FINALLY = 38;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_X5 = 31;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_X5_FAILED = 35;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_X5_FAILED_FINALLY = 39;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_XWALK = 32;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_XWALK_FAILED = 36;
        public static final int KEY_CREATE_WEBVIEW_WITHOUT_INIT_XWALK_FAILED_FINALLY = 40;
        public static final int KEY_CREATE_WEBVIEW_WITH_INIT_PINUS_FAILED_FINALLY = 45;
        public static final int KEY_CREATE_WEBVIEW_WITH_INIT_SYS_FAILED_FINALLY = 42;
        public static final int KEY_CREATE_WEBVIEW_WITH_INIT_X5_FAILED_FINALLY = 43;
        public static final int KEY_CREATE_WEBVIEW_WITH_INIT_XWALK_FAILED_FINALLY = 44;
        public static final int KEY_DOWNLOAD_RUNTIME_WHEN_NO_UIN = 20;
        public static final int KEY_EMBED_INSTALL_FIND_SO_FAIL = 25;
        public static final int KEY_EMBED_INSTALL_FIND_SO_IN_APK = 26;
        public static final int KEY_EMBED_INSTALL_FIND_SO_NOT_IN_APK = 27;
        public static final int KEY_FPS_PROFILE_FORCE_DISABLED_FROM_CLIENT = 1;
        public static final int KEY_FPS_PROFILE_FORCE_ENABLED_FROM_CLIENT = 0;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_MUTE = 7;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_SPEED = 8;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_SPEED_05 = 9;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_SPEED_075 = 10;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_SPEED_10 = 11;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_SPEED_15 = 12;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_SPEED_20 = 13;
        public static final int KEY_FULLSCREEN_VIDEO_CLICK_SPEED_30 = 14;
        public static final int KEY_FULLSCREEN_VIDEO_ENTER_SYS = 5;
        public static final int KEY_FULLSCREEN_VIDEO_ENTER_X5 = 6;
        public static final int KEY_FULLSCREEN_VIDEO_ENTER_XWEB = 4;
        public static final int KEY_FULLSCREEN_VIDEO_INIT_CHANNEL_FAILED = 19;
        public static final int KEY_FULLSCREEN_VIDEO_RUNTIME_OTHERS = 16;
        public static final int KEY_FULLSCREEN_VIDEO_RUNTIME_PINUS = 18;
        public static final int KEY_FULLSCREEN_VIDEO_RUNTIME_XWALK = 17;
        public static final int KEY_FULLSCREEN_VIDEO_SDK = 15;
        public static final int KEY_INIT_VIDEO_INTERFACE_FAIL_OTHERS = 63;
        public static final int KEY_INIT_VIDEO_INTERFACE_FAIL_PINUS = 65;
        public static final int KEY_INIT_VIDEO_INTERFACE_FAIL_XWALK = 64;
        public static final int KEY_INSTALL_RUNTIME_WHEN_NO_UIN = 21;
        public static final int KEY_IP_TYPE_CHANGED = 28;
        public static final int KEY_ON_PROXY_OVERRIDE_REVERSE_BYPASS_FAILED = 87;
        public static final int KEY_ON_PROXY_OVERRIDE_REVERSE_BYPASS_SUCCESS = 86;
        public static final int KEY_ON_SET_PROXY_OVERRIDE_FAILED = 84;
        public static final int KEY_ON_SET_PROXY_OVERRIDE_SUCCESS = 83;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_RUNTIME_PINUS = 82;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_RUNTIME_SYS = 79;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_RUNTIME_X5 = 80;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_RUNTIME_XWALK = 81;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_SDK_PINUS = 78;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_SDK_SYS = 75;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_SDK_X5 = 76;
        public static final int KEY_ON_SHOW_CUSTOM_VIEW_SDK_XWALK = 77;
        public static final int KEY_PINUS_CORE_INIT_CANCEL = 73;
        public static final int KEY_PINUS_CORE_INIT_FAILED = 72;
        public static final int KEY_PINUS_CORE_INIT_FINISH = 74;
        public static final int KEY_PINUS_CORE_INIT_START = 71;
        public static final int KEY_REFLECT_INIT_CLASS = 23;
        public static final int KEY_REFLECT_INIT_METHOD = 24;
        public static final int KEY_REFLECT_INIT_OBJECT = 22;
        public static final int KEY_USER_TYPE_CHANGED_GRAYVALUE = 29;
        public static final int KEY_WEBVIEW_REINIT_XWEB = 66;
        public static final int KEY_XWALK_CORE_INIT_CANCEL = 69;
        public static final int KEY_XWALK_CORE_INIT_FAILED = 68;
        public static final int KEY_XWALK_CORE_INIT_FINISH = 70;
        public static final int KEY_XWALK_CORE_INIT_START = 67;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ID903KeyDef {
        public static final int DANGERTIME_NOT_UPDATE = 148;
        public static final int DONOW_UPDATE_FUTURE_DAY_SCHE = 147;
        public static final int EMBED_INSTALLER_FAILED_COPY_FILE = 126;
        public static final int EMBED_INSTALLER_FAILED_EXP = 128;
        public static final int EMBED_INSTALLER_SUC = 127;
        public static final int FETCH_CONFIG_BEFORE_UPDATE = 159;
        public static final int HYBRID_INSTALL_COPY_FILE_ERROR_NOT_FOUND = 133;
        public static final int HYBRID_INSTALL_COPY_FILE_FAILED = 135;
        public static final int HYBRID_INSTALL_FILE_MD5_NOT_MATCH = 134;
        public static final int HYBRID_INSTALL_UNZIP_FAILED = 132;
        public static final int HYBRID_INSTALL_ZIP_FAILED = 136;
        public static final int ID = 903;
        public static final int KEY_PVUV_APPBRAND_START = 48;
        public static final int KEY_PVUV_MM_START = 30;
        public static final int KEY_PVUV_SUPPORT_START = 54;
        public static final int KEY_PVUV_TOOLS_MP_START = 42;
        public static final int KEY_PVUV_TOOLS_START = 36;
        public static final int KEY_PV_APPBRAND_PRELOAD = 102;
        public static final int KEY_PV_APPBRAND_X5_WRAP_SYS = 72;
        public static final int KEY_PV_MM_X5_WRAP_SYS = 74;
        public static final int KEY_PV_OFFSET = 0;
        public static final int KEY_PV_SUPPORT_X5_WRAP_SYS = 73;
        public static final int KEY_PV_TOOLS_MP_LINK = 103;
        public static final int KEY_PV_TOOLS_X5_WRAP_SYS = 70;
        public static final int KEY_PV_URL_DISPATCH_BLACKLIST = 121;
        public static final int KEY_TEMP_USE_100_REPORT_0 = 0;
        public static final int KEY_TEMP_USE_100_REPORT_1 = 1;
        public static final int KEY_TEMP_USE_100_REPORT_10 = 10;
        public static final int KEY_TEMP_USE_100_REPORT_11 = 11;
        public static final int KEY_TEMP_USE_100_REPORT_2 = 2;
        public static final int KEY_TEMP_USE_100_REPORT_3 = 3;
        public static final int KEY_TEMP_USE_100_REPORT_4 = 4;
        public static final int KEY_TEMP_USE_100_REPORT_5 = 5;
        public static final int KEY_TEMP_USE_100_REPORT_6 = 6;
        public static final int KEY_TEMP_USE_100_REPORT_7 = 7;
        public static final int KEY_TEMP_USE_100_REPORT_8 = 8;
        public static final int KEY_TEMP_USE_100_REPORT_9 = 9;
        public static final int KEY_UV_APPBRAND_X5_WRAP_SYS = 77;
        public static final int KEY_UV_MM_X5_WRAP_SYS = 79;
        public static final int KEY_UV_OFFSET = 3;
        public static final int KEY_UV_SUPPORT_X5_WRAP_SYS = 78;
        public static final int KEY_UV_TOOLS_X5_WRAP_SYS = 75;
        public static final int LIB_INSTALL_COPY_FILE_ERROR_NOT_FOUND = 129;
        public static final int LIB_INSTALL_COPY_FILE_FAILED = 131;
        public static final int LIB_INSTALL_FILE_MD5_NOT_MATCH = 130;
        public static final int PAST_DAY_SCHEDULE_ABANDON = 146;
        public static final int SCHEDULE_REPLACED = 149;
        public static final int TRIGER_UPDATER_AFTER_CONFIG = 160;
        public static final int UPDATE_ADD_BY_CONFIG = 151;
        public static final int UPDATE_ADD_BY_FORWARD = 161;
        public static final int UPDATE_ADD_BY_TIME_RANGE = 162;
        public static final int UPDATE_CUT_BY_CONFIG = 150;
        public static final int UPDATE_FREE_UPDATE = 153;
        public static final int UPDATE_NEED_UPDATE_NO_CORE = 157;
        public static final int UPDATE_NO_SCHEDULE = 155;
        public static final int UPDATE_PARSE_RELEASE_DATE_FAILED = 158;
        public static final int UPDATE_SCHEDULE_TO_NEXT_DAY = 156;
        public static final int UPDATE_SHOULD_UPDATE = 152;
        public static final int UPDATE_SHOULD_UPDATE_BY_DEFAULT = 154;
        public static final int UPDATE_SPEED_CONFIG_PARSE_FAILED = 163;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class KVBuilder {
        public StringBuilder a;
        public int b;

        public KVBuilder(int i2) {
        }

        public KVBuilder append(int i2, Object obj) {
        }

        public String doReportKV() {
        }

        public KVBuilder append(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class KVDef {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static class KVXwebInitCoreFailed {
            public static int ABI_32 = 1;
            public static int ABI_64 = 2;
            public static int ERRTYPE_LOADCORE = 1;
            public static int ERRTYPE_NEW_INSTANCE = 2;
            public static int ID = 19307;
        }
    }

    public static int a() {
    }

    public static String generateSessionId() {
    }

    public static WebView.WebViewKind getStatWebKind() {
    }

    public static int getUrlType(String str) {
    }

    public static boolean hasInit() {
    }

    public static void idkeyForPair(int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    public static void idkeyReport(long j2, int i2) {
    }

    public static void invokeRuntimeChannelClassCircularityError() {
    }

    public static void invokeRuntimeChannelException() {
    }

    public static void invokeRuntimeChannelRuntimeException() {
    }

    public static boolean isXWebCoreContentProviderKey(int i2) {
    }

    public static void onAllKindsFpsProfileDisabledFromClient() {
    }

    public static void onAllKindsFpsProfileEnabledFromClient() {
    }

    public static void onCfgDownload(String str, boolean z) {
    }

    public static void onCheckUpdateConfigFailed() {
    }

    public static void onClickFullscreenVideoMute() {
    }

    public static void onClickFullscreenVideoSpeed() {
    }

    public static void onClickFullscreenVideoSpeed05() {
    }

    public static void onClickFullscreenVideoSpeed075() {
    }

    public static void onClickFullscreenVideoSpeed10() {
    }

    public static void onClickFullscreenVideoSpeed15() {
    }

    public static void onClickFullscreenVideoSpeed20() {
    }

    public static void onClickFullscreenVideoSpeed30() {
    }

    public static void onConfigDownload() {
    }

    public static void onConfigDownloadFailed() {
    }

    public static void onConfigDownloadSuccess(long j2) {
    }

    public static void onCreateWebviewFailed(WebView.WebViewKind webViewKind) {
    }

    public static void onCreateWebviewFailedFinally() {
    }

    public static void onFpsProfileForceDisabledFromClient() {
    }

    public static void onFpsProfileForceEnabledFromClient() {
    }

    public static void onFullScreenJSUseDefault() {
    }

    public static void onFullScreenJSUseDownload() {
    }

    public static void onInitCoreFailed(WebView.WebViewKind webViewKind) {
    }

    public static void onInitCoreFailedFinally() {
    }

    public static void onJSException() {
    }

    public static void onJustCrashed(WebView.WebViewKind webViewKind) {
    }

    public static void onPatchApply() {
    }

    public static void onPatchApplyFailed() {
    }

    public static void onPatchApplySuccess(long j2) {
    }

    public static void onPatchDownload() {
    }

    public static void onPatchDownloadFailed() {
    }

    public static void onPatchDownloadSuccess(long j2) {
    }

    public static void onPluginCheckFailed(String str, boolean z) {
    }

    public static void onPluginConfigDownload() {
    }

    public static void onPluginConfigDownloadFailed() {
    }

    public static void onPluginConfigDownloadSuccess() {
    }

    public static void onPluginConfigParseFailed() {
    }

    public static void onPluginDamaged(String str) {
    }

    public static void onPluginDoPatchFailed(String str) {
    }

    public static void onPluginDownload(String str, boolean z) {
    }

    public static void onPluginDownloadFailed(String str, boolean z) {
    }

    public static void onPluginDownloadSuccess(String str, boolean z) {
    }

    public static void onPluginInstallFailed(String str, boolean z) {
    }

    public static void onPluginMenuOpenByOtherClick(String str) {
    }

    public static void onPluginMenuSendClick(String str) {
    }

    public static void onRuntimeDownload() {
    }

    public static void onRuntimeDownloadFailed() {
    }

    public static void onRuntimeDownloadSuccess(long j2) {
    }

    public static void onSpecialVideoEnterFullscreen(int i2, boolean z) {
    }

    public static void onSpecialVideoHook(int i2, boolean z) {
    }

    public static void onStartCheckPluginUpdate() {
    }

    public static void onStartCheckUpdate() {
    }

    public static void onSysWebViewOnShowCustomView() {
    }

    public static void onSysWebViewOnShowCustomViewSpecial() {
    }

    public static void onSysWebViewOnShowCustomViewSpecialNative() {
    }

    public static void onSysWebViewOnShowCustomViewSpecialNativeVideo() {
    }

    public static void onSysWebviewLoad() {
    }

    public static void onSysWebviewLoadFailed() {
    }

    public static void onSysWebviewLoadSuccess(long j2) {
    }

    public static void onUseCoreFailed(WebView.WebViewKind webViewKind, int i2) {
    }

    public static void onWXWebviewLoad(String str) {
    }

    public static void onWXWebviewLoadFailed() {
    }

    public static void onWXWebviewLoadSuccess(long j2) {
    }

    public static void onWebviewCoreUsed(WebView.WebViewKind webViewKind) {
    }

    public static void onWebviewLoad(String str) {
    }

    public static void onWebviewLoadFailed() {
    }

    public static void onWebviewLoadSuccess(long j2) {
    }

    public static void onX5WebViewOnShowCustomViewSpecialNativeVideo() {
    }

    public static void onXWWebViewOnShowCustomViewFullscreen() {
    }

    public static void onXWWebViewOnShowCustomViewSpecial() {
    }

    public static void onXWWebViewOnShowCustomViewSpecialNative() {
    }

    public static void onXWWebViewOnShowCustomViewSpecialNativeVideo() {
    }

    public static void reportCoreInstalled() {
    }

    public static void reportDaily(int i2, int i3) {
    }

    public static synchronized void reportPVNew(String str, WebView webView) {
    }

    public static void reportUVNew() {
    }

    public static void reportWebViewOnShowCustomView(WebView.WebViewKind webViewKind, boolean z, String str) {
    }

    public static void reportWithLog(long j2, long j3, long j4) {
    }

    public static void reportXFilesAction(String str, String str2, String str3, int i2, int i3) {
    }

    public static void setCurrentModule(String str) {
    }

    public static void setKVLog(int i2, String str) {
    }

    public static void setMostPrefferdCore(WebView.WebViewKind webViewKind) {
    }

    public static void setReporterCallback(WebViewReporterInterface webViewReporterInterface) {
    }

    public static void idkeyReport(long j2, long j3, long j4) {
    }
}
