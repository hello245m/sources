package com.huawei.agconnect.core.service.auth;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface TokenSnapshot {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES = null;
        public static final State SIGNED_IN = null;
        public static final State SIGNED_OUT = null;
        public static final State TOKEN_INVALID = null;
        public static final State TOKEN_UPDATED = null;

        private State(String str, int i2) {
        }

        public static State valueOf(String str) {
        }

        public static State[] values() {
        }
    }

    State getState();

    String getToken();
}
