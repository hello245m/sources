package com.tencent.mobileqq.qfix.redirect.field;

import com.tencent.mobileqq.qfix.redirect.field.GCMonitor;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class PatchFieldPool implements GCMonitor.GCMonitorListener {
    private static PatchFieldPool d;
    public final Map<String, List<PatchField>> a;
    public final Map<String, PatchField> b;
    public final GCMonitor c;

    private PatchFieldPool() {
    }

    public static PatchFieldPool b() {
    }

    public final PatchField a(String str, Object obj) {
    }

    public final Object a(String str, Object obj, String str2) {
    }

    public final Object a(String str, String str2) {
    }

    @Override // com.tencent.mobileqq.qfix.redirect.field.GCMonitor.GCMonitorListener
    public final void a() {
    }
}
