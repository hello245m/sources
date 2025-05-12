package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class TypeAdapter<T> {

    /* renamed from: com.google.gson.TypeAdapter$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class AnonymousClass1 extends TypeAdapter<T> {
        public final /* synthetic */ TypeAdapter this$0;

        public AnonymousClass1(TypeAdapter typeAdapter) {
        }

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t2) throws IOException {
        }
    }

    public final T fromJson(Reader reader) throws IOException {
    }

    public final T fromJsonTree(JsonElement jsonElement) {
    }

    public final TypeAdapter<T> nullSafe() {
    }

    public abstract T read(JsonReader jsonReader) throws IOException;

    public final void toJson(Writer writer, T t2) throws IOException {
    }

    public final JsonElement toJsonTree(T t2) {
    }

    public abstract void write(JsonWriter jsonWriter, T t2) throws IOException;

    public final T fromJson(String str) throws IOException {
    }

    public final String toJson(T t2) {
    }
}
