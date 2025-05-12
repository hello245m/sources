package com.tencent.rfix.lib;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.tencent.rfix.loader.entity.RFixLoadResult;
import java.io.File;
import k.i.j.a.i.h;
import k.i.j.a.p.c;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class RFix {
    private static final String TAG = "RFix.RFix";
    private static volatile boolean sInitialized = false;

    @SuppressLint({"StaticFieldLeak"})
    private static volatile RFix sInstance;
    private final h configManager;
    private final Context context;
    private final k.i.j.a.n.a eventDispatcher;
    private c loadReporter;
    private final RFixLoadResult loadResult;
    private final RFixParams params;
    private final File patchDirectory;
    private final k.i.j.a.l.a patchDownloader;
    private final k.i.j.a.m.a patchEngine;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class b {
        public final Context a;
        public final RFixLoadResult b;
        public final RFixParams c;
        public final File d;
        public h e;
        public k.i.j.a.l.a f;
        public k.i.j.a.m.a g;
        public RFixListener h;

        public b(Context context, RFixLoadResult rFixLoadResult, RFixParams rFixParams) {
        }

        public RFix a() {
        }

        public b b(RFixListener rFixListener) {
        }

        public b c(k.i.j.a.m.a aVar) {
        }
    }

    public /* synthetic */ RFix(Context context, RFixLoadResult rFixLoadResult, RFixParams rFixParams, File file, h hVar, k.i.j.a.l.a aVar, k.i.j.a.m.a aVar2, RFixListener rFixListener, a aVar3) {
    }

    private /* synthetic */ void a(RFixLoadResult rFixLoadResult) {
    }

    public static void bind(RFix rFix) {
    }

    public static /* synthetic */ void c(String str, RFixParams rFixParams, Context context) {
    }

    public static void destroy() {
    }

    public static RFix getInstance() {
    }

    public static boolean isInitialized() {
    }

    private void onBind() {
    }

    private void processLoadReport() {
    }

    private void saveNativeLogDir(Context context, String str) {
    }

    private void saveRemoteVerifyInfo(Context context, RFixParams rFixParams, String str) {
    }

    private void setAutoVerifyParams(RFixParams rFixParams) {
    }

    public void addListener(RFixListener rFixListener) {
    }

    public /* synthetic */ void b(RFixLoadResult rFixLoadResult) {
    }

    public void cleanPatch() {
    }

    public h getConfigManager() {
    }

    public Context getContext() {
    }

    public k.i.j.a.n.a getEventDispatcher() {
    }

    public RFixLoadResult getLoadResult() {
    }

    public RFixParams getParams() {
    }

    public File getPatchDirectory() {
    }

    public k.i.j.a.l.a getPatchDownloader() {
    }

    public k.i.j.a.m.a getPatchEngine() {
    }

    public void onPatchReceived(String str) {
    }

    public void removeListener(RFixListener rFixListener) {
    }

    public void requestConfig() {
    }

    public void requestConfigAsync() {
    }

    private RFix(Context context, RFixLoadResult rFixLoadResult, RFixParams rFixParams, File file, h hVar, k.i.j.a.l.a aVar, k.i.j.a.m.a aVar2, RFixListener rFixListener) {
    }
}
