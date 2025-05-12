package com.tencent.rfix.lib.config;

import android.content.Context;
import androidx.annotation.Keep;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class PatchConfig {
    private static final String KEY_CLIENT_INFO = "key_client_info";
    private static final String KEY_CONFIG_ID = "key_config_id";
    private static final String KEY_CONFIG_TYPE = "key_config_type";
    private static final String KEY_COOKIE = "key_cookie";
    private static final String KEY_PATCH_MD5 = "key_patch_md5";
    private static final String KEY_PATCH_PROCESS = "key_patch_process";
    private static final String KEY_PATCH_URL = "key_patch_url";
    private static final String RFIX_PATCH_CONFIG = "rfix_patch_config";
    private static final String TAG = "RFix.PatchConfig";
    public String clientInfo;
    public int configId;
    public int configType;
    public String cookie;
    public String patchMD5;
    public String patchProcess;
    public String patchUrl;

    public static PatchConfig loadPatchConfig(Context context) {
    }

    public static void savePatchConfig(Context context, PatchConfig patchConfig) {
    }

    public boolean isValid() {
    }

    public String toString() {
    }
}
