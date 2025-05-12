package com.tencent.rfix.loader.res;

import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ResourcePatchInfo {
    public static final int BUFFER_SIZE = 16384;
    public static final String RES_ADD = "add:";
    public static final String RES_ARSC = "resources.arsc";
    public static final String RES_CONFIG_TITLE = "resources.meta";
    public static final String RES_DEL = "del:";
    public static final String RES_FINAL_NAME = "resources.apk";
    public static final String RES_LARGE_MOD = "large modify:";
    public static final String RES_MANIFEST = "AndroidManifest.xml";
    public static final String RES_MOD = "modify:";
    public static final String RES_OUTPUT_DIR = "res_tmp";
    public static final String RES_PATCH_TITLE = "resources.zip";
    public static final String RES_PATTERN_TITLE = "pattern:";
    private static final String TAG = "ResourcePatchInfo";
    public Set<String> addRes;
    public String baseArscCrc;
    public Set<String> delRes;
    public String expectedResPatchMd5;
    public String finalArscMd5;
    public Set<String> largeModifyRes;
    public Map<String, LargeModeInfo> largeModifyResMap;
    public Set<String> modifyRes;
    public Set<Pattern> patterns;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class LargeModeInfo {
        public long crc;
        public File file;
        public String md5;

        public String toString() {
        }
    }

    private ResourcePatchInfo() {
    }

    private static Pattern convertToPatternString(String str) {
    }

    public static ResourcePatchInfo parseAllResPatch(File file) {
    }

    private static int parseLargeMod(String str, String[] strArr, int i2, ResourcePatchInfo resourcePatchInfo) {
    }

    private static int parsePattern(String str, String[] strArr, int i2, ResourcePatchInfo resourcePatchInfo) {
    }

    private static int parseSection(String str, String[] strArr, int i2, Set<String> set) {
    }

    private static void parseTitle(ResourcePatchInfo resourcePatchInfo, String str) {
    }

    private static String readFile(File file) {
    }

    public String toString() {
    }

    private static ResourcePatchInfo parseAllResPatch(String str) {
    }
}
