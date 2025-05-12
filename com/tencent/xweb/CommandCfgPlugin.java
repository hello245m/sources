package com.tencent.xweb;

import android.content.SharedPreferences;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.util.ConfigDef;
import java.util.HashMap;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class CommandCfgPlugin extends CommandCfg {
    public static final String C_STR_CMD_AUDIO_PLAYER_STRATEGY_PREFIX = "audio_player_strategy_";
    public static final String C_STR_CMD_DISABLE_FILE_READER_X_5_PREFIX = "disable_fr_x5_";
    public static final String C_STR_CMD_DOWNLOAD_WHEN_NOT_INSTALL = "download_when_not_install";
    public static final String C_STR_CMD_DOWNLOAD_WHEN_PLUGIN_ERROR = "download_when_plugin_error";
    public static final String C_STR_CMD_DOWNLOAD_WHEN_X_5_FAIL = "download_when_x5_fail";
    public static final String C_STR_CMD_FILE_READER_PREFIX = "fr_";
    public static final String C_STR_CMD_MAX_DOWNLOAD_COUNT_WHEN_PLUGIN_ERROR = "max_download_count_when_plugin_error";
    public static final String C_STR_CMD_PLUGIN_PARAM_PREFIX = "param_";
    public static final String C_STR_CMD_SET_PLUGIN_CONFIG_PERIOD = "setPluginConfigPeriod";
    public static final String C_STR_CMD_USE_OFFICE_READER_PREFIX = "use_office_reader_";
    public static final String C_STR_CMD_X_FILES_HIDE_BOTTOM_BAR = "xfiles_hide_bottom_bar";
    public static final String C_STR_CMD_X_FILES_HIDE_CUSTOM_MENU = "xfiles_hide_custom_menu";
    public static final int DEFAULT_MAX_DOWNLOAD_COUNT_WHEN_PLUGIN_ERROR = 2;
    public static CommandCfgPlugin d;

    public static FileReaderHelper.ReaderType convertFileReader(String str) {
    }

    public static FileReaderHelper.UseOfficeReader convertUseOfficeReader(String str) {
    }

    public static synchronized CommandCfgPlugin getInstance() {
    }

    public static synchronized void resetCommandCfgPlugin() {
    }

    public final String a() {
    }

    @Override // com.tencent.xweb.CommandCfg
    public void applyCommandInternal(ConfigDef.Command[] commandArr, String str, boolean z) {
    }

    public boolean canDownloadWhenNotInstall(boolean z) {
    }

    public boolean canDownloadWhenPluginError(boolean z) {
    }

    public boolean canDownloadWhenX5Fail(boolean z) {
    }

    public FileReaderHelper.AudioPlayerStrategy getAudioPlayerStrategy(String str) {
    }

    public HashMap<String, String> getCmdPluginParam(String str) {
    }

    public int getCmdPluginUpdatePeriod() {
    }

    public FileReaderHelper.UseOfficeReader getCmdUseOfficeReader(String str, String str2) {
    }

    public FileReaderHelper.ReaderType getFileReaderType(String str, String str2) {
    }

    @Override // com.tencent.xweb.CommandCfg
    public String getLogTag() {
    }

    public int getMaxDownloadCountWhenPluginError() {
    }

    @Override // com.tencent.xweb.CommandCfg
    public SharedPreferences getSharePreferenceForCommandConfig() {
    }

    @Override // com.tencent.xweb.CommandCfg
    public SharedPreferences getSharePreferenceForCommandConfigLatest() {
    }

    public boolean isDisableFileReaderX5(String str) {
    }

    public boolean isXFilesHideBottomBar() {
    }

    public boolean isXFilesHideCustomMenu() {
    }

    public FileReaderHelper.UseOfficeReader getCmdUseOfficeReader(String str) {
    }

    public FileReaderHelper.ReaderType getFileReaderType(String str) {
    }
}
