package com.tencent.qqmusic.mediaplayer.seektable.mpeg4;

import com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Co64;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Mdhd;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stco;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsc;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsz;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stts;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class Mp4SeekTable implements SeekTable {
    private final Map<String, IMpeg4Box> essentialStblChunkMap;
    private final Mdhd mdhd;

    /* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class AnonymousClass1 implements Function1<HashSet<String>, Boolean> {
        public final /* synthetic */ Mp4SeekTable this$0;

        public AnonymousClass1(Mp4SeekTable mp4SeekTable) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable.Function1
        public /* bridge */ /* synthetic */ Boolean call(HashSet<String> hashSet) {
        }

        /* renamed from: call, reason: avoid collision after fix types in other method */
        public Boolean call2(HashSet<String> hashSet) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface Function1<T, R> {
        R call(T t2);
    }

    public static /* synthetic */ boolean access$000(HashSet hashSet) {
    }

    private static void chunkOfSample(Stsc stsc, int i2, int[] iArr) {
    }

    private static boolean needMoreChunks(HashSet<String> hashSet) {
    }

    private static long offset64OfChunk(Co64 co64, int i2) {
    }

    private static int offsetOfChunk(Stco stco, int i2) {
    }

    private static int offsetOfSampleInChunk(Stsz stsz, int i2, int i3) {
    }

    private static void parseChunks(Parsable parsable, Map<String, IMpeg4Box> map, Function1<HashSet<String>, Boolean> function1) throws IOException, InvalidBoxException {
    }

    private static int sampleOfTime(Stts stts, int i2) {
    }

    private long seekInternal(int i2) {
    }

    private static IMpeg4Box seekTo(Parsable parsable, String str) throws IOException, InvalidBoxException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.SeekTable
    public void parse(IDataSource iDataSource) throws IOException, InvalidBoxException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.SeekTable
    public long seek(long j2) {
    }
}
