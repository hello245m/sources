package com.tencent.xweb.xwalk.plugin;

import java.io.File;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class XWalkPluginPatchConfigParser {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class PluginPatchConfig {
        public String originalFileName;
        public String patchFileName;
        public int patchType;
        public int type;

        public boolean isTypeAdd() {
        }

        public boolean isTypeModify() {
        }

        public boolean isTypeRemove() {
        }

        public String toString() {
        }
    }

    public static List<PluginPatchConfig> getPluginPatchConfigList(File file) {
    }
}
