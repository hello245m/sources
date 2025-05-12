package com.tencent.tinker.loader.shareutil;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ShareResPatchInfo {
    public ArrayList<String> addRes;
    public String arscBaseCrc;
    public ArrayList<String> deleteRes;
    public HashMap<String, LargeModeInfo> largeModMap;
    public ArrayList<String> largeModRes;
    public ArrayList<String> modRes;
    public HashSet<Pattern> patterns;
    public String resArscMd5;
    public HashMap<String, File> storeRes;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class LargeModeInfo {
        public long crc;
        public File file;
        public String md5;
    }

    public static boolean checkFileInPattern(HashSet<Pattern> hashSet, String str) {
    }

    public static boolean checkResPatchInfo(ShareResPatchInfo shareResPatchInfo) {
    }

    public static Pattern convertToPatternString(String str) {
    }

    public static void parseAllResPatchInfo(String str, ShareResPatchInfo shareResPatchInfo) {
    }

    public static void parseResPatchInfoFirstLine(String str, ShareResPatchInfo shareResPatchInfo) {
    }

    public String toString() {
    }
}
