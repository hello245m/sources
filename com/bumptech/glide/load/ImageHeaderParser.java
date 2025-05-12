package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k.a.a.p.p.a0.b;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface ImageHeaderParser {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class ImageType {
        private static final /* synthetic */ ImageType[] $VALUES = null;
        public static final ImageType GIF = null;
        public static final ImageType JPEG = null;
        public static final ImageType PNG = null;
        public static final ImageType PNG_A = null;
        public static final ImageType RAW = null;
        public static final ImageType UNKNOWN = null;
        public static final ImageType WEBP = null;
        public static final ImageType WEBP_A = null;
        public final boolean a;

        public ImageType(String str, int i2, boolean z) {
        }

        public static ImageType valueOf(String str) {
        }

        public static ImageType[] values() {
        }

        public boolean hasAlpha() {
        }
    }

    ImageType a(InputStream inputStream) throws IOException;

    ImageType b(ByteBuffer byteBuffer) throws IOException;

    int c(InputStream inputStream, b bVar) throws IOException;
}
