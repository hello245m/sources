package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class Streams {
    private Streams() {
    }

    public static JsonElement parse(JsonReader jsonReader) throws JsonParseException {
    }

    public static void write(JsonElement jsonElement, JsonWriter jsonWriter) throws IOException {
    }

    public static Writer writerForAppendable(Appendable appendable) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class AppendableWriter extends Writer {
        private final Appendable appendable;
        private final CurrentWrite currentWrite;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static class CurrentWrite implements CharSequence {
            public char[] chars;

            @Override // java.lang.CharSequence
            public char charAt(int i2) {
            }

            @Override // java.lang.CharSequence
            public int length() {
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i2, int i3) {
            }
        }

        public AppendableWriter(Appendable appendable) {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) throws IOException {
        }

        @Override // java.io.Writer
        public void write(int i2) throws IOException {
        }
    }
}
