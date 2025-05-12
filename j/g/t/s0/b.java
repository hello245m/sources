package j.g.t.s0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class b {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends InputConnectionWrapper {
        public final /* synthetic */ c a;

        public a(InputConnection inputConnection, boolean z, c cVar) {
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        }
    }

    /* renamed from: j.g.t.s0.b$b, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C0146b extends InputConnectionWrapper {
        public final /* synthetic */ c a;

        public C0146b(InputConnection inputConnection, boolean z, c cVar) {
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        boolean a(j.g.t.s0.c cVar, int i2, Bundle bundle);
    }

    @Deprecated
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, c cVar) {
    }

    public static boolean b(String str, Bundle bundle, c cVar) {
    }
}
