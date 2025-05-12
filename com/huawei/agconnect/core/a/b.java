package com.huawei.agconnect.core.a;

import android.content.Context;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.AGConnectOptionsBuilder;
import com.huawei.agconnect.CustomAuthProvider;
import com.huawei.agconnect.CustomCredentialsProvider;
import com.huawei.agconnect.JsonProcessingFactory;
import com.huawei.agconnect.core.Service;
import com.huawei.agconnect.core.service.auth.AuthProvider;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.OnTokenListener;
import com.huawei.agconnect.core.service.auth.Token;
import java.util.List;
import java.util.Map;
import k.e.b.a.f;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class b extends AGConnectInstance {
    private static List<Service> a;
    private static final Object b = null;
    private static final Map<String, AGConnectInstance> c = null;
    private static String d;
    private final AGConnectOptions e;
    private final d f;
    private final d g;

    /* renamed from: com.huawei.agconnect.core.a.b$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AnonymousClass1 implements JsonProcessingFactory.JsonProcessor {
        @Override // com.huawei.agconnect.JsonProcessingFactory.JsonProcessor
        public String processOption(AGConnectOptions aGConnectOptions) {
        }
    }

    /* renamed from: com.huawei.agconnect.core.a.b$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AnonymousClass2 implements JsonProcessingFactory.JsonProcessor {
        @Override // com.huawei.agconnect.JsonProcessingFactory.JsonProcessor
        public String processOption(AGConnectOptions aGConnectOptions) {
        }
    }

    /* renamed from: com.huawei.agconnect.core.a.b$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AnonymousClass3 implements JsonProcessingFactory.JsonProcessor {
        @Override // com.huawei.agconnect.JsonProcessingFactory.JsonProcessor
        public String processOption(AGConnectOptions aGConnectOptions) {
        }
    }

    /* renamed from: com.huawei.agconnect.core.a.b$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass4 implements CredentialsProvider {
        public final /* synthetic */ CustomCredentialsProvider a;
        public final /* synthetic */ b b;

        public AnonymousClass4(b bVar, CustomCredentialsProvider customCredentialsProvider) {
        }

        @Override // com.huawei.agconnect.core.service.auth.CredentialsProvider
        public f<Token> getTokens() {
        }

        @Override // com.huawei.agconnect.core.service.auth.CredentialsProvider
        public f<Token> getTokens(boolean z) {
        }
    }

    /* renamed from: com.huawei.agconnect.core.a.b$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass5 implements AuthProvider {
        public final /* synthetic */ CustomAuthProvider a;
        public final /* synthetic */ b b;

        public AnonymousClass5(b bVar, CustomAuthProvider customAuthProvider) {
        }

        @Override // com.huawei.agconnect.core.service.auth.AuthProvider
        public void addTokenListener(OnTokenListener onTokenListener) {
        }

        @Override // com.huawei.agconnect.core.service.auth.AuthProvider
        public f<Token> getTokens() {
        }

        @Override // com.huawei.agconnect.core.service.auth.AuthProvider
        public f<Token> getTokens(boolean z) {
        }

        @Override // com.huawei.agconnect.core.service.auth.AuthProvider
        public String getUid() {
        }

        @Override // com.huawei.agconnect.core.service.auth.AuthProvider
        public void removeTokenListener(OnTokenListener onTokenListener) {
        }
    }

    public b(AGConnectOptions aGConnectOptions) {
    }

    public static AGConnectInstance a() {
    }

    public static AGConnectInstance a(AGConnectOptions aGConnectOptions) {
    }

    private static AGConnectInstance a(AGConnectOptions aGConnectOptions, boolean z) {
    }

    public static AGConnectInstance a(String str) {
    }

    public static synchronized void a(Context context) {
    }

    private static synchronized void a(Context context, AGConnectOptions aGConnectOptions) {
    }

    public static synchronized void a(Context context, AGConnectOptionsBuilder aGConnectOptionsBuilder) {
    }

    private static void b() {
    }

    private static void b(Context context, AGConnectOptionsBuilder aGConnectOptionsBuilder) {
    }

    private static void c() {
    }

    public void a(CustomAuthProvider customAuthProvider) {
    }

    public void a(CustomCredentialsProvider customCredentialsProvider) {
    }

    @Override // com.huawei.agconnect.AGConnectInstance
    public Context getContext() {
    }

    @Override // com.huawei.agconnect.AGConnectInstance
    public String getIdentifier() {
    }

    @Override // com.huawei.agconnect.AGConnectInstance
    public AGConnectOptions getOptions() {
    }

    @Override // com.huawei.agconnect.AGConnectInstance
    public <T> T getService(Class<? super T> cls) {
    }
}
