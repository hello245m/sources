package com.tencent.xweb;

import android.content.Context;
import android.content.Intent;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class FileReaderHelper {
    public static final String AAC_EXT = "aac";
    public static final String[] ALL_FILE_FORMATS = null;
    public static final String[] AUDIO_FILE_FORMATS = null;
    public static final int CAN_EXPLICIT_INSTALL_FALSE_FORBID_DOWNLOAD = -2;
    public static final int CAN_EXPLICIT_INSTALL_FALSE_FORBID_EXPLICIT_DOWNLOAD = -3;
    public static final int CAN_EXPLICIT_INSTALL_FALSE_PARAM_INVALID = -1;
    public static final int CAN_EXPLICIT_INSTALL_TRUE_CAN_DOWNLOAD = 1;
    public static final int CAN_EXPLICIT_INSTALL_TRUE_FORBID_DOWNLOAD_CAN_TRY_EMBED = 2;
    public static final int CAN_EXPLICIT_INSTALL_TRUE_FORBID_EXPLICIT_DOWNLOAD_CAN_TRY_EMBED = 3;
    public static final String DOCX_EXT = "docx";
    public static final String DOC_EXT = "doc";
    public static final String DPS_EXT = "dps";
    public static final String ERROR_MSG_DISABLE_PASSWORD = "disable_password";
    public static final String ERROR_MSG_DOWNLOAD_CANCEL = "download_cancel";
    public static final String ERROR_MSG_DOWNLOAD_CONFIG_DOWNLOAD_FAILED = "download_config_download_failed";
    public static final String ERROR_MSG_DOWNLOAD_CONFIG_PARSE_FAILED = "download_config_parse_failed";
    public static final String ERROR_MSG_DOWNLOAD_NO_AVAILABLE_UPDATE = "download_no_available_update";
    public static final String ERROR_MSG_DOWNLOAD_NO_NEED_TO_FETCH_CONFIG = "download_no_need_to_fetch_config";
    public static final String ERROR_MSG_DOWNLOAD_NO_NETWORK = "download_no_network";
    public static final String ERROR_MSG_DOWNLOAD_NO_PLUGIN_IN_CONFIG = "download_no_plugin_in_config";
    public static final String ERROR_MSG_DOWNLOAD_OTHERS_IS_UPDATING = "download_others_is_updating";
    public static final String ERROR_MSG_DOWNLOAD_PLUGIN_ONLY_DOWNLOAD_ERROR = "download_plugin_only_download_error";
    public static final String ERROR_MSG_DOWNLOAD_PLUGIN_ONLY_INSTALL_ERROR = "download_plugin_only_install_error";
    public static final String ERROR_MSG_DOWNLOAD_PLUGIN_UPDATE_ERROR = "download_plugin_update_error";
    public static final String ERROR_MSG_DOWNLOAD_START_FAILED = "download_start_failed";
    public static final String ERROR_MSG_FILE_NOT_EXIST = "file_not_exist";
    public static final String ERROR_MSG_FILE_NOT_SUPPORT = "file_not_support";
    public static final String ERROR_MSG_FORBID_DOWNLOAD_CODE = "forbid_download_code";
    public static final String ERROR_MSG_INIT_ERROR = "init_error";
    public static final String ERROR_MSG_INVOKE_ERROR = "invoke_error";
    public static final String ERROR_MSG_MINIQB_INIT_ERROR_DEFAULT = "miniqb_init_error_default";
    public static final String ERROR_MSG_MINIQB_INIT_ERROR_DISABLE = "miniqb_init_error_disable";
    public static final String ERROR_MSG_MINIQB_INIT_ERROR_FAILED = "miniqb_init_error_failed";
    public static final String ERROR_MSG_MINIQB_INIT_ERROR_NOT_SUPPORT = "miniqb_init_error_not_support";
    public static final String ERROR_MSG_MINIQB_INIT_ERROR_NOT_SUPPORT_64 = "miniqb_init_error_not_support_64";
    public static final String ERROR_MSG_MINIQB_INIT_ERROR_PARAM = "miniqb_init_error_param";
    public static final String ERROR_MSG_MINIQB_OPEN_ERROR = "miniqb_open_error";
    public static final String ERROR_MSG_PASSWORD_ERROR = "password_error";
    public static final String ERROR_MSG_PLUGIN_NOT_INSTALLED = "plugin_not_installed";
    public static final String ERROR_MSG_QB_ERROR = "qb_error";
    public static final String ERROR_MSG_SO_ERROR = "so_error";
    public static final String ERROR_MSG_SUCCESS = "success";
    public static final String ERROR_MSG_TASK_EXIST = "task_exist";
    public static final String ERROR_MSG_TASK_PREPARE_ERROR = "task_prepare_error";
    public static final String ERROR_MSG_TASK_RUN_ERROR = "task_run_error";
    public static final String ERROR_MSG_THIRD_ERROR = "third_error";
    public static final String ERROR_MSG_UNKNOWN = "unknown";
    public static final String ERROR_MSG_VERSION_TOO_OLD = "version_too_old";
    public static final String ERROR_MSG_VIEW_DESTROY = "view_destroy";
    public static final String ERROR_MSG_WRONG_PARAM = "wrong_param";
    public static final int ERR_CANT_OPEN = -102;
    public static final int ERR_NONE = 0;
    public static final String ET_EXT = "et";
    public static final String EXPLICIT_DOWNLOAD_SCENE_INVOKE_ERROR = "invoke_error";
    public static final String EXPLICIT_DOWNLOAD_SCENE_NONE = "none";
    public static final String EXPLICIT_DOWNLOAD_SCENE_NOT_INSTALL = "not_install";
    public static final String EXPLICIT_DOWNLOAD_SCENE_SO_ERROR = "so_error";
    public static final String M4A_EXT = "m4a";
    public static final String MP3_EXT = "mp3";
    public static final String[] OFFICE_READER_FORMATS = null;
    public static final String OPEN_FILE_FROM_CMD = "cmd";
    public static final String OPEN_FILE_FROM_DEFAULT = "default";
    public static final String OPEN_FILE_FROM_FORCE = "force";
    public static final String OPEN_FILE_FROM_HARDCODE = "hardcode";
    public static final String OPEN_FILE_FROM_MINIQB_ERROR = "miniqb_error";
    public static final String OPEN_FILE_FROM_UNKNOWN = "unknown";
    public static final String OPEN_FILE_FROM_XFILE_CONTEXT_ERROR = "xfile_context_error";
    public static final String OPEN_FILE_FROM_XFILE_FORBID_DOWNLOAD = "xfile_forbid_download";
    public static final String OPEN_FILE_FROM_XFILE_INNER_ERROR = "xfile_inner_error";
    public static final String OPEN_FILE_FROM_XFILE_NOT_INSTALLED = "xfile_not_installed";
    public static final String OPEN_FILE_FROM_XFILE_NOT_SUPPORT = "xfile_not_support";
    public static final String OPEN_FILE_FROM_XFILE_RECENT_CRASH = "xfile_recent_crash";
    public static final String OPEN_FILE_FROM_XFILE_TOO_OLD = "xfile_too_old";
    public static String OPEN_X5_SCENE_STR = "open_x5_from_scene";
    public static final String PDF_EXT = "pdf";
    public static final String PPTX_EXT = "pptx";
    public static final String PPT_EXT = "ppt";
    public static final String QQ_BROWSER = "QQBROWSER";
    public static final String READER_TYPE_MINIQB = "miniqb";
    public static final String READER_TYPE_QB = "qb";
    public static final String READER_TYPE_THIRD_PREFIX = "third_";
    public static final String READER_TYPE_UNKNOWN = "unknown";
    public static final String READER_TYPE_XFilesAudioPlayer = "XFilesAudioPlayer";
    public static final String THIRD_APP = "THIRDAPP";
    public static final String TXT_EXT = "txt";
    public static final String WAV_EXT = "wav";
    public static final String WPS_EXT = "wps";
    public static final String XLSX_EXT = "xlsx";
    public static final String XLS_EXT = "xls";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class AudioPlayerStrategy {
        public static final /* synthetic */ AudioPlayerStrategy[] a = null;
        public static final AudioPlayerStrategy auto = null;
        public static final AudioPlayerStrategy sysfirst = null;
        public static final AudioPlayerStrategy sysonly = null;
        public static final AudioPlayerStrategy tpfirst = null;
        public static final AudioPlayerStrategy tponly = null;

        public AudioPlayerStrategy(String str, int i2) {
        }

        public static AudioPlayerStrategy valueOf(String str) {
        }

        public static AudioPlayerStrategy[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class ReaderType {
        public static final ReaderType NONE = null;
        public static final ReaderType X5 = null;
        public static final ReaderType XWEB = null;
        public static final /* synthetic */ ReaderType[] a = null;

        public ReaderType(String str, int i2) {
        }

        public static ReaderType valueOf(String str) {
        }

        public static ReaderType[] values() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ReportTarget {
        public int a;
        public boolean b;

        public ReportTarget(int i2, boolean z) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class UseOfficeReader {
        public static final /* synthetic */ UseOfficeReader[] a = null;
        public static final UseOfficeReader no = null;
        public static final UseOfficeReader none = null;
        public static final UseOfficeReader yes = null;

        public UseOfficeReader(String str, int i2) {
        }

        public static UseOfficeReader valueOf(String str) {
        }

        public static UseOfficeReader[] values() {
        }
    }

    public static void a(Intent intent, int i2) {
    }

    public static boolean b(String str) {
    }

    public static int canExplicitInstall(XWalkReaderBasePlugin xWalkReaderBasePlugin, boolean z, int i2) {
    }

    public static String convertOpenFileFrom(int i2) {
    }

    public static String convertX5ErrorCodeToMsg(int i2, boolean z) {
    }

    public static String convertXWebErrorCodeToMsg(int i2) {
    }

    public static long getCurrentProcessMemory(Context context) {
    }

    public static int getOpenFileFrom(HashMap<String, String> hashMap) {
    }

    public static int getOpenFileScene(HashMap<String, String> hashMap) {
    }

    public static XWalkPlugin getPlugin(String str) {
    }

    public static ReaderType getReaderType(String str, boolean z, Intent intent) {
    }

    public static boolean getUseOfficeReader(String str, boolean z) {
    }

    public static boolean isAudioFormat(String str) {
    }

    public static void reportDownloadErrorCode(String str, int i2) {
    }

    public static void reportException(String str, int i2, String str2, Throwable th) {
    }

    public static void reportExplicitInstall(String str) {
    }

    public static void reportExplicitInstallStartFailed(String str) {
    }

    public static long reportFileSize(String str, String str2) {
    }

    public static void reportOpenFile(OpenFileReportData openFileReportData) {
    }

    public static void reportOpenFileRet(OpenFileReportData openFileReportData) {
    }

    public static void reportPVUV(String str, String str2) {
    }

    public static void reportReadByX5Scene(String str, int i2) {
    }

    public static void reportX5ErrorCode(String str, int i2, boolean z, int i3, Context context, OpenFileReportData openFileReportData) {
    }

    public static void reportXWebErrorCode(String str, int i2, int i3, Context context, OpenFileReportData openFileReportData) {
    }

    public static ReportTarget a(String str) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class OpenFileReportData {
        public int errorCode;
        public String errorMsg;
        public String explicitDownloadScene;
        public String fileExt;
        public long fileSizeMB;
        public String from;
        public long memoryCost;
        public long memoryEnd;
        public long memoryStart;
        public String module;
        public String platform;
        public String readerType;
        public int scene;
        public long timeCost;
        public long timeEnd;
        public long timeStart;
        public int version;

        public OpenFileReportData(int i2, String str, long j2, String str2, int i3, String str3) {
        }

        public final String a(String str) {
        }

        public String getStringOpenFile() {
        }

        public String getStringOpenFileRet() {
        }

        public void markEnd(Context context, int i2, String str) {
        }

        public void markStart(Context context) {
        }

        public void markEnd(long j2, long j3, int i2, String str) {
        }

        public void markStart(long j2, long j3) {
        }
    }

    public static void a(String str, int i2) {
    }
}
