package com.tencent.tinker.loader.hotplug;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.io.IOException;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class IncrementComponentManager {
    public static final AttrTranslator<ActivityInfo> ACTIVITY_INFO_ATTR_TRANSLATOR = null;
    public static final Map<String, ActivityInfo> CLASS_NAME_TO_ACTIVITY_INFO_MAP = null;
    public static final Map<String, IntentFilter> CLASS_NAME_TO_INTENT_FILTER_MAP = null;
    public static volatile boolean sInitialized = false;
    public static String sPackageName;

    /* renamed from: com.tencent.tinker.loader.hotplug.IncrementComponentManager$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class AnonymousClass1 extends AttrTranslator<ActivityInfo> {
        @Override // com.tencent.tinker.loader.hotplug.IncrementComponentManager.AttrTranslator
        public void onInit(Context context, int i2, XmlPullParser xmlPullParser) {
        }

        @Override // com.tencent.tinker.loader.hotplug.IncrementComponentManager.AttrTranslator
        public /* bridge */ /* synthetic */ void onTranslate(Context context, int i2, String str, String str2, ActivityInfo activityInfo) {
        }

        public final int parseLaunchMode(String str) {
        }

        public final int parseScreenOrientation(String str) {
        }

        /* renamed from: onTranslate, reason: avoid collision after fix types in other method */
        public void onTranslate2(Context context, int i2, String str, String str2, ActivityInfo activityInfo) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static abstract class AttrTranslator<T_RESULT> {
        private AttrTranslator() {
        }

        public void onInit(Context context, int i2, XmlPullParser xmlPullParser) {
        }

        public abstract void onTranslate(Context context, int i2, String str, String str2, T_RESULT t_result);

        public final void translate(Context context, int i2, XmlPullParser xmlPullParser, T_RESULT t_result) {
        }

        public /* synthetic */ AttrTranslator(AnonymousClass1 anonymousClass1) {
        }
    }

    private IncrementComponentManager() {
    }

    public static /* synthetic */ String access$100() {
    }

    public static synchronized void ensureInitialized() {
    }

    public static synchronized boolean init(Context context, ShareSecurityCheck shareSecurityCheck) throws IOException {
    }

    public static boolean isIncrementActivity(String str) {
    }

    public static synchronized ActivityInfo parseActivity(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
    }

    public static synchronized void parseIntentFilter(Context context, String str, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
    }

    public static synchronized void parseMetaData(Context context, ActivityInfo activityInfo, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
    }

    public static ActivityInfo queryActivityInfo(String str) {
    }

    public static ResolveInfo resolveIntent(Intent intent) {
    }

    public static void skipCurrentTag(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
    }
}
