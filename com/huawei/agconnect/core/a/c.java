package com.huawei.agconnect.core.a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.agconnect.core.Service;
import com.huawei.agconnect.core.ServiceRegistrar;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class c {
    private final Context a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class a implements Serializable, Comparator<Map.Entry<String, Integer>> {
        private a() {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
        }

        public int a(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
        }
    }

    public c(Context context) {
    }

    private <T extends ServiceRegistrar> T a(String str) {
    }

    private List<String> b() {
    }

    private Bundle c() {
    }

    public List<Service> a() {
    }
}
