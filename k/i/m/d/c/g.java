package k.i.m.d.c;

import android.content.Context;
import com.tencent.tinker.loader.TinkerDexOptimizer;
import com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class g extends c {
    public static ArrayList<File> a;
    public static ArrayList<ShareDexDiffPatchInfo> b;
    public static HashMap<ShareDexDiffPatchInfo, File> c;
    public static boolean d;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class a implements TinkerDexOptimizer.ResultCallback {
        public long a;
        public final /* synthetic */ boolean[] b;
        public final /* synthetic */ List c;
        public final /* synthetic */ Throwable[] d;

        public a(boolean[] zArr, List list, Throwable[] thArr) {
        }

        @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
        public void onFailed(File file, File file2, Throwable th) {
        }

        @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
        public void onStart(File file, File file2) {
        }

        @Override // com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback
        public void onSuccess(File file, File file2, File file3) {
        }
    }

    public static boolean c(ArrayList<File> arrayList, int i2) {
    }

    public static boolean d(String str) {
    }

    public static boolean e(Context context, List<File> list, String str, File file, k.i.m.d.e.a aVar) {
    }

    public static boolean f(Context context, String str, String str2, File file, int i2) {
    }

    public static boolean g(ZipFile zipFile, ZipEntry zipEntry, File file, ShareDexDiffPatchInfo shareDexDiffPatchInfo) throws IOException {
    }

    public static boolean h(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
    }

    public static ZipEntry i(ZipEntry zipEntry, String str) {
    }

    public static boolean j(Context context, File file, String str) {
    }

    public static boolean k(Context context, String str, String str2, File file, k.i.m.d.e.a aVar) {
    }

    public static void l(ZipFile zipFile, ZipFile zipFile2, ZipEntry zipEntry, ZipEntry zipEntry2, ShareDexDiffPatchInfo shareDexDiffPatchInfo, File file) throws IOException {
    }

    public static boolean m(k.i.m.d.f.b bVar, ShareSecurityCheck shareSecurityCheck, Context context, String str, File file, k.i.m.d.e.a aVar) {
    }

    public static boolean n(File file, k.i.m.d.f.b bVar) {
    }
}
