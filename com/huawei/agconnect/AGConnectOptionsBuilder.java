package com.huawei.agconnect;

import android.content.Context;
import com.huawei.agconnect.core.Service;
import com.huawei.agconnect.core.service.auth.AuthProvider;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.OnTokenListener;
import com.huawei.agconnect.core.service.auth.Token;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import k.e.b.a.f;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class AGConnectOptionsBuilder {
    private static final String API_KEY_PATH = "/client/api_key";
    private static final String APP_ID_PATH = "/client/app_id";
    private static final String CLIENT_ID_PATH = "/client/client_id";
    private static final String CLIENT_SECRET_PATH = "/client/client_secret";
    private static final String CP_ID_PATH = "/client/cp_id";
    private static final String PRODUCT_ID_PATH = "/client/product_id";
    private final Map<String, String> customConfigMap;
    private final List<Service> customServices;
    private InputStream inputStream;
    private String packageName;
    private AGCRoutePolicy routePolicy;

    /* renamed from: com.huawei.agconnect.AGConnectOptionsBuilder$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 implements CredentialsProvider {
        public final /* synthetic */ AGConnectOptionsBuilder this$0;
        public final /* synthetic */ CustomCredentialsProvider val$provider;

        public AnonymousClass1(AGConnectOptionsBuilder aGConnectOptionsBuilder, CustomCredentialsProvider customCredentialsProvider) {
        }

        @Override // com.huawei.agconnect.core.service.auth.CredentialsProvider
        public f<Token> getTokens() {
        }

        @Override // com.huawei.agconnect.core.service.auth.CredentialsProvider
        public f<Token> getTokens(boolean z) {
        }
    }

    /* renamed from: com.huawei.agconnect.AGConnectOptionsBuilder$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 implements AuthProvider {
        public final /* synthetic */ AGConnectOptionsBuilder this$0;
        public final /* synthetic */ CustomAuthProvider val$provider;

        public AnonymousClass2(AGConnectOptionsBuilder aGConnectOptionsBuilder, CustomAuthProvider customAuthProvider) {
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

    public AGConnectOptions build(Context context) {
    }

    public AGConnectOptions build(Context context, String str) {
    }

    public Map<String, String> getCustomConfigMap() {
    }

    public InputStream getInputStream() {
    }

    public AGCRoutePolicy getRoutePolicy() {
    }

    public AGConnectOptionsBuilder setApiKey(String str) {
    }

    public AGConnectOptionsBuilder setAppId(String str) {
    }

    public AGConnectOptionsBuilder setCPId(String str) {
    }

    public AGConnectOptionsBuilder setClientId(String str) {
    }

    public AGConnectOptionsBuilder setClientSecret(String str) {
    }

    public AGConnectOptionsBuilder setCustomAuthProvider(CustomAuthProvider customAuthProvider) {
    }

    public AGConnectOptionsBuilder setCustomCredentialProvider(CustomCredentialsProvider customCredentialsProvider) {
    }

    public AGConnectOptionsBuilder setCustomValue(String str, String str2) {
    }

    public AGConnectOptionsBuilder setInputStream(InputStream inputStream) {
    }

    public AGConnectOptionsBuilder setPackageName(String str) {
    }

    public AGConnectOptionsBuilder setProductId(String str) {
    }

    public AGConnectOptionsBuilder setRoutePolicy(AGCRoutePolicy aGCRoutePolicy) {
    }
}
