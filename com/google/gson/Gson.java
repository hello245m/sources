package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class Gson {
    public static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    public static final boolean DEFAULT_ESCAPE_HTML = true;
    public static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    public static final boolean DEFAULT_LENIENT = false;
    public static final boolean DEFAULT_PRETTY_PRINT = false;
    public static final boolean DEFAULT_SERIALIZE_NULLS = false;
    public static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    private static final TypeToken<?> NULL_KEY_SURROGATE = null;
    private final ThreadLocal<Map<TypeToken<?>, FutureTypeAdapter<?>>> calls;
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final List<TypeAdapterFactory> factories;
    private final FieldNamingStrategy fieldNamingStrategy;
    private final boolean generateNonExecutableJson;
    private final boolean htmlSafe;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    private final boolean lenient;
    private final boolean prettyPrinting;
    private final boolean serializeNulls;
    private final Map<TypeToken<?>, TypeAdapter<?>> typeTokenCache;

    /* renamed from: com.google.gson.Gson$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AnonymousClass1 extends TypeToken<Object> {
    }

    /* renamed from: com.google.gson.Gson$2, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass2 extends TypeAdapter<Number> {
        public final /* synthetic */ Gson this$0;

        public AnonymousClass2(Gson gson) {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read, reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ Number read2(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public Number read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write, reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Number number) throws IOException {
        }
    }

    /* renamed from: com.google.gson.Gson$3, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass3 extends TypeAdapter<Number> {
        public final /* synthetic */ Gson this$0;

        public AnonymousClass3(Gson gson) {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read, reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ Number read2(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public Number read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write, reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Number number) throws IOException {
        }
    }

    /* renamed from: com.google.gson.Gson$4, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AnonymousClass4 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ Number read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Number number) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Number read(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write, reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, Number number) throws IOException {
        }
    }

    /* renamed from: com.google.gson.Gson$5, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AnonymousClass5 extends TypeAdapter<AtomicLong> {
        public final /* synthetic */ TypeAdapter val$longAdapter;

        public AnonymousClass5(TypeAdapter typeAdapter) {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ AtomicLong read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read, reason: avoid collision after fix types in other method */
        public AtomicLong read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write, reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
        }
    }

    /* renamed from: com.google.gson.Gson$6, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AnonymousClass6 extends TypeAdapter<AtomicLongArray> {
        public final /* synthetic */ TypeAdapter val$longAdapter;

        public AnonymousClass6(TypeAdapter typeAdapter) {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ AtomicLongArray read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read, reason: avoid collision after fix types in other method */
        public AtomicLongArray read2(JsonReader jsonReader) throws IOException {
        }

        /* renamed from: write, reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {
        private TypeAdapter<T> delegate;

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
        }

        public void setDelegate(TypeAdapter<T> typeAdapter) {
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t2) throws IOException {
        }
    }

    public Gson() {
    }

    private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
    }

    private static TypeAdapter<AtomicLong> atomicLongAdapter(TypeAdapter<Number> typeAdapter) {
    }

    private static TypeAdapter<AtomicLongArray> atomicLongArrayAdapter(TypeAdapter<Number> typeAdapter) {
    }

    public static void checkValidFloatingPoint(double d) {
    }

    private TypeAdapter<Number> doubleAdapter(boolean z) {
    }

    private TypeAdapter<Number> floatAdapter(boolean z) {
    }

    private static TypeAdapter<Number> longAdapter(LongSerializationPolicy longSerializationPolicy) {
    }

    public Excluder excluder() {
    }

    public FieldNamingStrategy fieldNamingStrategy() {
    }

    public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
    }

    public <T> TypeAdapter<T> getAdapter(TypeToken<T> typeToken) {
    }

    public <T> TypeAdapter<T> getDelegateAdapter(TypeAdapterFactory typeAdapterFactory, TypeToken<T> typeToken) {
    }

    public boolean htmlSafe() {
    }

    public JsonReader newJsonReader(Reader reader) {
    }

    public JsonWriter newJsonWriter(Writer writer) throws IOException {
    }

    public boolean serializeNulls() {
    }

    public String toJson(Object obj) {
    }

    public JsonElement toJsonTree(Object obj) {
    }

    public String toString() {
    }

    public <T> T fromJson(String str, Type type) throws JsonSyntaxException {
    }

    public String toJson(Object obj, Type type) {
    }

    public JsonElement toJsonTree(Object obj, Type type) {
    }

    public Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map<Type, InstanceCreator<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy, List<TypeAdapterFactory> list) {
    }

    public <T> T fromJson(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
    }

    public void toJson(Object obj, Appendable appendable) throws JsonIOException {
    }

    public void toJson(Object obj, Type type, Appendable appendable) throws JsonIOException {
    }

    public <T> T fromJson(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
    }

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) throws JsonIOException, JsonSyntaxException {
    }

    public <T> TypeAdapter<T> getAdapter(Class<T> cls) {
    }

    public <T> T fromJson(JsonElement jsonElement, Class<T> cls) throws JsonSyntaxException {
    }

    public <T> T fromJson(JsonElement jsonElement, Type type) throws JsonSyntaxException {
    }

    public String toJson(JsonElement jsonElement) {
    }

    public void toJson(JsonElement jsonElement, Appendable appendable) throws JsonIOException {
    }

    public void toJson(JsonElement jsonElement, JsonWriter jsonWriter) throws JsonIOException {
    }
}
