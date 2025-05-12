package com.tencent.rfix.loader.storage;

import android.content.Context;
import java.io.File;
import java.util.Properties;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RFixPreferencesManager {
    private static final String LOCK_SUFFIX = ".lock";
    private static final String TAG = "RFix.PreferencesManager";

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class BaseEditor implements Editor {
        public Context a;
        public String b;
        public Properties c;

        public BaseEditor(Context context, String str) {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Editor
        public void commit() {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Editor
        public void putBoolean(String str, boolean z) {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Editor
        public void putInt(String str, int i2) {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Editor
        public void putString(String str, String str2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class BasePreferences implements Preferences {
        public final Properties a;

        public BasePreferences(Properties properties) {
        }

        public static boolean a(String str, Properties properties, boolean z) {
        }

        public static int b(String str, Properties properties, int i2) {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Preferences
        public boolean getBoolean(String str) {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Preferences
        public int getInt(String str) {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Preferences
        public String getString(String str) {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Preferences
        public boolean getBoolean(String str, boolean z) {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Preferences
        public int getInt(String str, int i2) {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Preferences
        public String getString(String str, String str2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface Editor {
        void commit();

        void putBoolean(String str, boolean z);

        void putInt(String str, int i2);

        void putString(String str, String str2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class EmptyPreferences implements Preferences {
        private EmptyPreferences() {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Preferences
        public boolean getBoolean(String str) {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Preferences
        public boolean getBoolean(String str, boolean z) {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Preferences
        public int getInt(String str) {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Preferences
        public int getInt(String str, int i2) {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Preferences
        public String getString(String str) {
        }

        @Override // com.tencent.rfix.loader.storage.RFixPreferencesManager.Preferences
        public String getString(String str, String str2) {
        }

        public /* synthetic */ EmptyPreferences(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface Preferences {
        boolean getBoolean(String str);

        boolean getBoolean(String str, boolean z);

        int getInt(String str);

        int getInt(String str, int i2);

        String getString(String str);

        String getString(String str, String str2);
    }

    public static /* synthetic */ File access$100(Context context) {
    }

    public static Editor edit(Context context, String str) {
    }

    private static File getDirFile(Context context) {
    }

    public static Preferences load(Context context, String str) {
    }
}
