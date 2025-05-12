package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String[] COLUMNS = null;
    private static final File DEVICE_ROOT = null;
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private static final HashMap<String, b> sCache = null;
    private int mResourceId;
    private b mStrategy;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a {
        public static File[] a(Context context) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        File a(Uri uri);

        Uri b(File file);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c implements b {
        public final String a;
        public final HashMap<String, File> b;

        public c(String str) {
        }

        @Override // androidx.core.content.FileProvider.b
        public File a(Uri uri) {
        }

        @Override // androidx.core.content.FileProvider.b
        public Uri b(File file) {
        }

        public void c(String str, File file) {
        }
    }

    public FileProvider() {
    }

    private static File buildPath(File file, String... strArr) {
    }

    private static String[] copyOf(String[] strArr, int i2) {
    }

    public static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, ProviderInfo providerInfo, int i2) {
    }

    private static b getPathStrategy(Context context, String str, int i2) {
    }

    public static Uri getUriForFile(Context context, String str, File file) {
    }

    private static int modeToMode(String str) {
    }

    private static b parsePathStrategy(Context context, String str, int i2) throws IOException, XmlPullParserException {
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
    }

    public FileProvider(int i2) {
    }

    private static Object[] copyOf(Object[] objArr, int i2) {
    }

    @SuppressLint({"StreamFiles"})
    public static Uri getUriForFile(Context context, String str, File file, String str2) {
    }
}
