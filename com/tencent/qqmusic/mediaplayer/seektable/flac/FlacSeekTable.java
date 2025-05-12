package com.tencent.qqmusic.mediaplayer.seektable.flac;

import com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.io.IOException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class FlacSeekTable implements SeekTable {
    private static final int SEEK_POINT_SIZE = 18;
    private static final byte TYPE_SEEKTABLE = 3;
    private static final byte TYPE_STREAMINFO = 0;
    private long firstFrameOffset;
    private long[] offsets;
    private long[] sampleNumbers;
    private int sampleRate;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface BlockHandler {
        boolean handle(Parsable parsable, int i2) throws IOException, InvalidBoxException;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class SeektableHandler implements BlockHandler {
        public final /* synthetic */ FlacSeekTable this$0;

        public SeektableHandler(FlacSeekTable flacSeekTable) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.BlockHandler
        public boolean handle(Parsable parsable, int i2) throws IOException, InvalidBoxException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class StreamInfoHandler implements BlockHandler {
        public final /* synthetic */ FlacSeekTable this$0;

        public StreamInfoHandler(FlacSeekTable flacSeekTable) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable.BlockHandler
        public boolean handle(Parsable parsable, int i2) throws IOException, InvalidBoxException {
        }
    }

    public FlacSeekTable(int i2) {
    }

    public static /* synthetic */ long[] access$000(FlacSeekTable flacSeekTable) {
    }

    public static /* synthetic */ long[] access$002(FlacSeekTable flacSeekTable, long[] jArr) {
    }

    public static /* synthetic */ long[] access$100(FlacSeekTable flacSeekTable) {
    }

    public static /* synthetic */ long[] access$102(FlacSeekTable flacSeekTable, long[] jArr) {
    }

    public static /* synthetic */ boolean access$200(Parsable parsable) throws IOException {
    }

    public static /* synthetic */ long access$302(FlacSeekTable flacSeekTable, long j2) {
    }

    private static int binarySearchFloor(long[] jArr, long j2, boolean z, boolean z2) {
    }

    private static boolean seekToFirstFrame(Parsable parsable) throws IOException {
    }

    private static boolean seekToFlac(Parsable parsable) throws IOException {
    }

    private static boolean walkThrough(Parsable parsable, BlockHandler... blockHandlerArr) throws IOException, InvalidBoxException {
    }

    public long[] getOffsetRangeOfSample(int i2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.SeekTable
    public void parse(IDataSource iDataSource) throws IOException, InvalidBoxException {
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.SeekTable
    public long seek(long j2) {
    }
}
