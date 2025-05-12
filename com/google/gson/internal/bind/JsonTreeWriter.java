package com.google.gson.internal.bind;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class JsonTreeWriter extends JsonWriter {
    private static final JsonPrimitive SENTINEL_CLOSED = null;
    private static final Writer UNWRITABLE_WRITER = null;
    private String pendingName;
    private JsonElement product;
    private final List<JsonElement> stack;

    /* renamed from: com.google.gson.internal.bind.JsonTreeWriter$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class AnonymousClass1 extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
        }
    }

    private JsonElement peek() {
    }

    private void put(JsonElement jsonElement) {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }

    public JsonElement get() {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z) throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d) throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j2) throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) throws IOException {
    }
}
