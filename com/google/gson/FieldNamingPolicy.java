package com.google.gson;

import java.lang.reflect.Field;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class FieldNamingPolicy implements FieldNamingStrategy {
    private static final /* synthetic */ FieldNamingPolicy[] $VALUES = null;
    public static final FieldNamingPolicy IDENTITY = null;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DASHES = null;
    public static final FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES = null;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE = null;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES = null;

    /* renamed from: com.google.gson.FieldNamingPolicy$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public enum AnonymousClass1 extends FieldNamingPolicy {
        public AnonymousClass1(String str, int i2) {
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
        }
    }

    /* renamed from: com.google.gson.FieldNamingPolicy$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public enum AnonymousClass2 extends FieldNamingPolicy {
        public AnonymousClass2(String str, int i2) {
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
        }
    }

    /* renamed from: com.google.gson.FieldNamingPolicy$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public enum AnonymousClass3 extends FieldNamingPolicy {
        public AnonymousClass3(String str, int i2) {
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
        }
    }

    /* renamed from: com.google.gson.FieldNamingPolicy$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public enum AnonymousClass4 extends FieldNamingPolicy {
        public AnonymousClass4(String str, int i2) {
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
        }
    }

    /* renamed from: com.google.gson.FieldNamingPolicy$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public enum AnonymousClass5 extends FieldNamingPolicy {
        public AnonymousClass5(String str, int i2) {
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
        }
    }

    private FieldNamingPolicy(String str, int i2) {
    }

    private static String modifyString(char c, String str, int i2) {
    }

    public static String separateCamelCase(String str, String str2) {
    }

    public static String upperCaseFirstLetter(String str) {
    }

    public static FieldNamingPolicy valueOf(String str) {
    }

    public static FieldNamingPolicy[] values() {
    }

    public /* synthetic */ FieldNamingPolicy(String str, int i2, AnonymousClass1 anonymousClass1) {
    }
}
