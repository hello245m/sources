package com.tencent.tinker.loader.shareutil;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class ShareElfFile implements Closeable {
    public ElfHeader elfHeader;
    public final FileInputStream fis;
    public ProgramHeader[] programHeaders;
    public SectionHeader[] sectionHeaders;
    public final Map<String, SectionHeader> sectionNameToHeaderMap;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ElfHeader {
        public final byte[] eIndent;
        public final short ePhEntSize;
        public final short ePhNum;
        public final long ePhOff;
        public final short eShEntSize;
        public final short eShNum;
        public final long eShOff;
        public final short eShStrNdx;
        public final int eVersion;

        public /* synthetic */ ElfHeader(FileChannel fileChannel, AnonymousClass1 anonymousClass1) throws IOException {
        }

        public ElfHeader(FileChannel fileChannel) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class ProgramHeader {
        public /* synthetic */ ProgramHeader(ByteBuffer byteBuffer, int i2, AnonymousClass1 anonymousClass1) throws IOException {
        }

        public ProgramHeader(ByteBuffer byteBuffer, int i2) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class SectionHeader {
        public final int shName;
        public String shNameStr;
        public final long shOffset;
        public final long shSize;

        public /* synthetic */ SectionHeader(ByteBuffer byteBuffer, int i2, AnonymousClass1 anonymousClass1) throws IOException {
        }

        public SectionHeader(ByteBuffer byteBuffer, int i2) throws IOException {
        }
    }

    public ShareElfFile(File file) throws IOException {
    }

    public static /* synthetic */ void access$300(int i2, int i3, int i4, String str) throws IOException {
    }

    public static void assertInRange(int i2, int i3, int i4, String str) throws IOException {
    }

    public static int getFileTypeByMagic(File file) throws IOException {
    }

    public static String readCString(ByteBuffer byteBuffer) {
    }

    public static void readUntilLimit(FileChannel fileChannel, ByteBuffer byteBuffer, String str) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public ByteBuffer getSection(SectionHeader sectionHeader) throws IOException {
    }
}
