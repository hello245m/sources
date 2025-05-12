package k.b.a;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.io.InputStream;
import java.lang.reflect.Method;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class k extends ImageView {
    public static Method c;
    public h a;
    public g b;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends AsyncTask<Integer, Integer, h> {
        public Context a;
        public int b;
        public final /* synthetic */ k c;

        public b(k kVar, Context context, int i2) {
        }

        public h a(Integer... numArr) {
        }

        public void b(h hVar) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ h doInBackground(Integer[] numArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(h hVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c extends AsyncTask<InputStream, Integer, h> {
        public final /* synthetic */ k a;

        public c(k kVar) {
        }

        public h a(InputStream... inputStreamArr) {
        }

        public void b(h hVar) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ h doInBackground(InputStream[] inputStreamArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(h hVar) {
        }

        public /* synthetic */ c(k kVar, a aVar) {
        }
    }

    public k(Context context) {
    }

    public static /* synthetic */ h a(k kVar, h hVar) {
    }

    public static /* synthetic */ void b(k kVar) {
    }

    private void setFromString(String str) {
    }

    public final void c() {
    }

    public final boolean d(String str) {
    }

    public final boolean e(Uri uri) {
    }

    public final void f() {
    }

    public void setCSS(String str) {
    }

    public void setImageAsset(String str) {
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
    }

    public void setSVG(h hVar) {
    }
}
