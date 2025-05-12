package com.tencent.xweb.util;

import com.tencent.xweb.util.ConfigDef;
import java.io.File;
import org.w3c.dom.Element;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ConfigParser {
    public static final String CONFIG_SIGNATURE_KEY = "MHYwEAYHKoZIzj0CAQYFK4EEACIDYgAElTrKAIIFSlvo+nwaPfs/mOUwWxBMLvtZ\nLJzLBPmZsBp5JhCEf91FTaJTAnxQN77mxuzil4rN7YLV5S2h3nNOlKKfEnf4lpc4\nzsCGoyHQX0gGYYTAHPmL+qUv6MO4YMAn";
    public static final String TAG = "ConfigParser";

    public static String getConfigCheckValue(File file, int i2, String str) {
    }

    public static ConfigDef.Patch[] getPatches(Element element) {
    }

    public static ConfigDef.Config parse(String str) {
    }

    public static void parseCommand(ConfigDef.Command command, Element element) {
    }

    public static ConfigDef.Command[] parseCommandList(Element element) {
    }

    public static void parseFilter(ConfigDef.Filter filter, Element element) {
    }

    public static ConfigDef.PluginConfig parsePluginConfig(String str) {
    }

    public static void parsePluginInfos(ConfigDef.PluginConfig pluginConfig, Element element) {
    }

    public static void parseVersionInfos(ConfigDef.Config config, Element element) {
    }

    public static boolean safeGetBoolean(Element element, String str) {
    }

    public static double safeGetDouble(Element element, String str, double d) {
    }

    public static float safeGetFloat(Element element, String str, float f) {
    }

    public static int safeGetInt(Element element, String str) {
    }

    public static int safeGetIntFromHex(Element element, String str) {
    }

    public static void setVersionDes(Element element, ConfigDef.VersionDes versionDes) {
    }

    public static ConfigDef.Config parse(File file, String str) {
    }

    public static ConfigDef.PluginConfig parsePluginConfig(File file, String str) {
    }
}
