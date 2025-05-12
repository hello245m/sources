package com.tencent.xweb;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ProxyConfig {
    public static final String MATCH_ALL_SCHEMES = "*";
    public static final String MATCH_HTTP = "http";
    public static final String MATCH_HTTPS = "https";
    public List<ProxyRule> a;
    public List<String> b;
    public boolean c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class Builder {
        public List<ProxyRule> a;
        public List<String> b;
        public boolean c;

        public Builder() {
        }

        public final List<String> a() {
        }

        public Builder addBypassRule(String str) {
        }

        public Builder addDirect(String str) {
        }

        public Builder addProxyRule(String str) {
        }

        public final List<ProxyRule> b() {
        }

        public ProxyConfig build() {
        }

        public Builder bypassSimpleHostnames() {
        }

        public final boolean c() {
        }

        public Builder removeImplicitRules() {
        }

        public Builder setReverseBypassEnabled(boolean z) {
        }

        public Builder addDirect() {
        }

        public Builder addProxyRule(String str, String str2) {
        }

        public Builder(ProxyConfig proxyConfig) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public @interface ProxyScheme {
    }

    public ProxyConfig(List<ProxyRule> list, List<String> list2, boolean z) {
    }

    public List<String> getBypassRules() {
    }

    public List<ProxyRule> getProxyRules() {
    }

    public boolean isReverseBypassEnabled() {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class ProxyRule {
        public String a;
        public String b;

        public ProxyRule(String str, String str2) {
        }

        public String getSchemeFilter() {
        }

        public String getUrl() {
        }

        public ProxyRule(String str) {
        }
    }
}
