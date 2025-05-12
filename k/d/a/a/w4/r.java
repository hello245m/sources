package k.d.a.a.w4;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface r extends o {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a {
        r createDataSource();
    }

    void c(o0 o0Var);

    void close() throws IOException;

    Uri getUri();

    long h(v vVar) throws IOException;

    Map<String, List<String>> j();
}
