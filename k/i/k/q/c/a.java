package k.i.k.q.c;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import com.tencent.bugly.common.reporter.IReporter;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class a extends Handler {
    public static a f;
    public final List<Integer> a;
    public final SharedPreferences b;
    public SharedPreferences.Editor c;
    public boolean d;
    public final k.i.k.c.a.a e;

    /* renamed from: k.i.k.q.c.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class C0742a implements IReporter.ReportCallback {
        public C0742a(a aVar) {
        }

        @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
        public void onCached() {
        }

        @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
        public void onFailure(int i2, String str, int i3, int i4) {
        }

        @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
        public void onSuccess(int i2, int i3) {
        }
    }

    public static a b() {
    }

    public final List<Integer> a(long j2) {
    }

    public void c(int i2) {
    }

    public void d(int i2) {
    }

    public final void e(boolean z) {
    }

    public void f() {
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
    }
}
