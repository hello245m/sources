package com.tencent.xweb.util;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.xweb.debug.CommandResult;
import com.tencent.xweb.debug.DebugCommand;
import com.tencent.xweb.debug.ICommandHandler;
import com.tencent.xweb.debug.IDebugView;
import java.util.HashSet;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWebCommandHandler {
    public static final String BUNDLE_KEY_COMMAND = "command";
    public static final String BUNDLE_KEY_SOURCE = "source";
    public static final String COMMAND_APPBRAND_WEBVIEW_MODE = "appbrand_webview_mode";
    public static final String COMMAND_BROWSER_NATIVE_CRASH = "browser_native_crash";
    public static final String COMMAND_CHECK_FILES = "check_files";
    public static final String COMMAND_CHECK_PLUGIN_UPDATE = "check_plugin_update";
    public static final String COMMAND_CHECK_UPDATE = "check_update";
    public static final String COMMAND_CHECK_UPDATE_OLD = "check_xwalk_update";
    public static final String COMMAND_CLEAN_DOWNLOAD_ZIP = "clean_download_zip";
    public static final String COMMAND_CLEAR_ALL_PLUGIN = "clear_all_plugin";
    public static final String COMMAND_CLEAR_ALL_VERSION = "clear_all_version";
    public static final String COMMAND_CLEAR_CACHE = "clear_cache";
    public static final String COMMAND_CLEAR_CONFIG_COMMANDS = "clear_config_commands";
    public static final String COMMAND_CLEAR_CONFIG_TIMESTAMP = "clear_config_timestamp";
    public static final String COMMAND_CLEAR_CONFIG_TIMESTAMP_OLD = "clear_config_time_stamp";
    public static final String COMMAND_CLEAR_OLD_VERSION = "clear_old_version";
    public static final String COMMAND_CLEAR_SAVED_PAGE = "clear_saved_page";
    public static final String COMMAND_CLEAR_SCHEDULE = "clear_schedule";
    public static final String COMMAND_CLEAR_TEST_SETTING = "clear_test_setting";
    public static final String COMMAND_DELETE_ORIGIN = "delete_origin";
    public static final String COMMAND_DISABLE_FILE_READER_CACHE = "disable_file_reader_cache";
    public static final String COMMAND_DISABLE_FILE_READER_CRASH_DETECT = "disable_file_reader_crash_detect";
    public static final String COMMAND_ENABLE_CHECK_STORAGE = "enable_check_storage";
    public static final String COMMAND_ENABLE_CHECK_THREAD = "enable_check_thread";
    public static final String COMMAND_ENABLE_FORBID_DOWNLOAD_CODE = "enable_forbid_download_code";
    public static final String COMMAND_ENABLE_NEW_DEBUG_PAGE = "enable_new_debug_page";
    public static final String COMMAND_ENABLE_REMOTE_DEBUG = "enable_remote_debug";
    public static final String COMMAND_ENABLE_REMOTE_DEBUG_OLD = "inspector";
    public static final String COMMAND_ENABLE_SHOW_FPS = "enable_show_fps";
    public static final String COMMAND_ENABLE_SHOW_FPS_OLD = "show_fps";
    public static final String COMMAND_ENABLE_SHOW_SAVE_PAGE = "enable_show_save_page";
    public static final String COMMAND_ENABLE_SHOW_SAVE_PAGE_OLD = "save_page";
    public static final String COMMAND_ENABLE_SHOW_VERSION = "enable_show_version";
    public static final String COMMAND_ENABLE_TEST_BASE_CONFIG = "enable_test_base_config";
    public static final String COMMAND_FORCE_USE_OFFICE_READER = "set_force_use_office_reader";
    public static final String COMMAND_GPU_JAVA_CRASH = "gpu_java_crash";
    public static final String COMMAND_GPU_NATIVE_CRASH = "gpu_native_crash";
    public static final String COMMAND_IGNORE_CRASH_WATCH = "ignore_crash_watch";
    public static final String COMMAND_IGNORE_CRASH_WATCH_OLD = "ignore_crashwatch";
    public static final String COMMAND_INSTALL_EMBED_PLUGIN = "install_embed_plugin";
    public static final String COMMAND_KILL_ALL_PROCESS = "kill_all_process";
    public static final String COMMAND_KILL_GPU_PROCESS = "kill_gpu_process";
    public static final String COMMAND_KILL_RENDER_PROCESS = "kill_render_process";
    public static final String COMMAND_KILL_TOOLS_PROCESS = "kill_tools_process";
    public static final String COMMAND_LOAD_CACHE_PACKAGE = "load_cache_package";
    public static final String COMMAND_LOAD_CACHE_PACKAGE_OLD = "load_local_xwalk";
    public static final String COMMAND_LOAD_SAVED_PAGE = "load_saved_page";
    public static final String COMMAND_LOAD_SDCARD_PACKAGE = "load_sdcard_package";
    public static final String COMMAND_MM_WEBVIEW_MODE = "mm_webview_mode";
    public static final String COMMAND_RECHECK_CONFIG_COMMANDS = "recheck_config_commands";
    public static final String COMMAND_RENDER_NATIVE_CRASH = "render_native_crash";
    public static final String COMMAND_RESET_CRASH_COUNT = "reset_crash_count";
    public static final String COMMAND_RESET_WEBVIEW_KIND = "reset_webview_kind";
    public static final String COMMAND_RESET_WEBVIEW_KIND_SYS = "reset_webview_kind_sys";
    public static final String COMMAND_RESET_WEBVIEW_KIND_XWEB = "reset_webview_kind_xweb";
    public static final String COMMAND_REVERT_TO_APK = "revert_to_apk";
    public static final String COMMAND_SET_APK_VERSION = "set_apk_version";
    public static final String COMMAND_SET_APK_VERSION_OLD = "set_apkver";
    public static final String COMMAND_SET_APPBRAND_CONFIG = "set_appbrand_config";
    public static final String COMMAND_SET_CONFIG_URL = "set_config_url";
    public static final String COMMAND_SET_DARK_MODE = "set_dark_mode";
    public static final String COMMAND_SET_GRAY_VALUE = "set_gray_value";
    public static final String COMMAND_SET_GRAY_VALUE_OLD = "set_grayvalue";
    public static final String COMMAND_SET_MM_CONFIG = "set_mm_config";
    public static final String COMMAND_SET_PLUGIN_CONFIG_URL = "set_plugin_config_url";
    public static final String COMMAND_SET_TOOLS_CONFIG = "set_tools_config";
    public static final String COMMAND_SET_TOOLS_CONFIG_OLD = "set_web_config";
    public static final String COMMAND_SHOW_WEBVIEW_VERSION = "show_webview_version";
    public static final String TAG = "XWebCommandHandler";
    public static final String XWEB_DEBUG_URL = "debugxweb.qq.com";
    public static final String XWEB_DEBUG_URL_PREFIX = "http://debugxweb.qq.com/?";
    public static HashSet<DebugCommand> sDebugCommandSet;

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$10, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass10 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$11, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass11 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$12, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass12 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$13, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass13 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$14, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass14 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$15, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass15 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$16, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass16 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$17, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass17 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$18, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass18 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$19, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass19 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass2 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$20, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass20 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$21, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass21 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$22, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass22 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$23, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass23 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$24, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass24 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$25, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass25 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$26, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass26 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$27, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass27 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$28, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass28 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$29, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass29 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass3 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$30, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass30 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$31, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass31 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$32, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass32 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$33, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass33 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$34, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass34 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$35, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass35 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$36, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass36 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$37, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass37 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$38, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass38 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$39, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass39 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass4 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$40, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass40 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$41, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass41 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$42, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass42 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$43, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass43 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$44, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass44 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$45, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass45 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$46, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass46 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$47, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass47 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$48, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass48 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$49, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass49 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass5 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$50, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass50 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$51, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass51 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$52, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass52 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$53, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass53 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$54, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass54 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$55, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass55 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$56, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass56 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$6, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass6 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$7, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass7 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$8, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass8 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    /* renamed from: com.tencent.xweb.util.XWebCommandHandler$9, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass9 implements ICommandHandler {
        @Override // com.tencent.xweb.debug.ICommandHandler
        public CommandResult handleCommand(Context context, Uri uri, IDebugView iDebugView) {
        }
    }

    public static /* synthetic */ boolean access$000(Context context, IDebugView iDebugView, String str) {
    }

    public static DebugCommand findDebugCommand(String str) {
    }

    public static CommandResult handleCommand(Bundle bundle, IDebugView iDebugView) {
    }

    public static void registerDebugCommand(String str, String str2, boolean z, ICommandHandler iCommandHandler) {
    }

    public static boolean setDarkMode(Context context, IDebugView iDebugView, String str) {
    }

    public static boolean shouldHandleCommand(String str) {
    }

    public static void registerDebugCommand(String str, boolean z, ICommandHandler iCommandHandler) {
    }
}
