package j.b.p;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class d extends ContextWrapper {
    public int a;
    public Resources.Theme b;
    public LayoutInflater c;
    public Configuration d;
    public Resources e;

    public d() {
    }

    public void a(Configuration configuration) {
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
    }

    public final Resources b() {
    }

    public int c() {
    }

    public final void d() {
    }

    public void e(Resources.Theme theme, int i2, boolean z) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
    }

    public d(Context context, int i2) {
    }

    public d(Context context, Resources.Theme theme) {
    }
}
