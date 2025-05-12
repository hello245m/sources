package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k.d.c.b0;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class x2 extends k.d.c.z<x2, a> implements Object {
    public static final int ALL_VIDEO_MASSSEND_DATA_FIELD_NUMBER = 6;
    public static final int ALL_VIDEO_PLAYED_YESTERDAY_FIELD_NUMBER = 5;
    public static final int ALL_VIDEO_STAT_SOURCE_FIELD_NUMBER = 4;
    public static final int ALL_VIDEO_STAT_TENDENCY_FIELD_NUMBER = 3;
    public static final int ALL_VIDEO_STAT_YESTERDAY_FIELD_NUMBER = 2;
    public static final int BASE_RESP_FIELD_NUMBER = 1;
    private static final x2 DEFAULT_INSTANCE = null;
    public static final int ONE_VIDEO_DETAIL_FIELD_NUMBER = 11;
    public static final int ONE_VIDEO_PLAY_DURATION_FIELD_NUMBER = 10;
    public static final int ONE_VIDEO_STAT_FIELD_NUMBER = 7;
    public static final int ONE_VIDEO_STAT_SOURCE_FIELD_NUMBER = 9;
    public static final int ONE_VIDEO_STAT_TENDENCY_FIELD_NUMBER = 8;
    private static volatile k.d.c.b1<x2> PARSER;
    private f allVideoMasssendData_;
    private f allVideoPlayedYesterday_;
    private h allVideoStatSource_;
    private i allVideoStatTendency_;
    private b allVideoStatYesterday_;
    private k0 baseResp_;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private c oneVideoDetail_;
    private d oneVideoPlayDuration_;
    private h oneVideoStatSource_;
    private i oneVideoStatTendency_;
    private e oneVideoStat_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<x2, a> implements Object {
        public /* synthetic */ a(q0 q0Var) {
        }

        public a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class b extends k.d.c.z<b, a> implements Object {
        public static final int DATE_FIELD_NUMBER = 1;
        private static final b DEFAULT_INSTANCE = null;
        private static volatile k.d.c.b1<b> PARSER = null;
        public static final int PLAY_PV_FIELD_NUMBER = 2;
        public static final int SHARE_PV_FIELD_NUMBER = 3;
        public static final int WATCH_PV_FIELD_NUMBER = 4;
        private int bitField0_;
        private int date_;
        private int playPv_;
        private int sharePv_;
        private int watchPv_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<b, a> implements Object {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        private b() {
        }

        public static /* synthetic */ b access$88700() {
        }

        public static /* synthetic */ void access$88800(b bVar, int i2) {
        }

        public static /* synthetic */ void access$88900(b bVar) {
        }

        public static /* synthetic */ void access$89000(b bVar, int i2) {
        }

        public static /* synthetic */ void access$89100(b bVar) {
        }

        public static /* synthetic */ void access$89200(b bVar, int i2) {
        }

        public static /* synthetic */ void access$89300(b bVar) {
        }

        public static /* synthetic */ void access$89400(b bVar, int i2) {
        }

        public static /* synthetic */ void access$89500(b bVar) {
        }

        private void clearDate() {
        }

        private void clearPlayPv() {
        }

        private void clearSharePv() {
        }

        private void clearWatchPv() {
        }

        public static b getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static b parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<b> parser() {
        }

        private void setDate(int i2) {
        }

        private void setPlayPv(int i2) {
        }

        private void setSharePv(int i2) {
        }

        private void setWatchPv(int i2) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public int getDate() {
        }

        public int getPlayPv() {
        }

        public int getSharePv() {
        }

        public int getWatchPv() {
        }

        public boolean hasDate() {
        }

        public boolean hasPlayPv() {
        }

        public boolean hasSharePv() {
        }

        public boolean hasWatchPv() {
        }

        public static a newBuilder(b bVar) {
        }

        public static b parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static b parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static b parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        public static b parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static b parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static b parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static b parseFrom(InputStream inputStream) throws IOException {
        }

        public static b parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static b parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static b parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class c extends k.d.c.z<c, a> implements Object {
        public static final int COVER_FIELD_NUMBER = 2;
        private static final c DEFAULT_INSTANCE = null;
        private static volatile k.d.c.b1<c> PARSER = null;
        public static final int URL_FIELD_NUMBER = 3;
        public static final int VID_FIELD_NUMBER = 1;
        private int bitField0_;
        private String cover_;
        private String url_;
        private String vid_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<c, a> implements Object {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        private c() {
        }

        public static /* synthetic */ c access$91500() {
        }

        public static /* synthetic */ void access$91600(c cVar, String str) {
        }

        public static /* synthetic */ void access$91700(c cVar) {
        }

        public static /* synthetic */ void access$91800(c cVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$91900(c cVar, String str) {
        }

        public static /* synthetic */ void access$92000(c cVar) {
        }

        public static /* synthetic */ void access$92100(c cVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$92200(c cVar, String str) {
        }

        public static /* synthetic */ void access$92300(c cVar) {
        }

        public static /* synthetic */ void access$92400(c cVar, k.d.c.i iVar) {
        }

        private void clearCover() {
        }

        private void clearUrl() {
        }

        private void clearVid() {
        }

        public static c getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static c parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static c parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<c> parser() {
        }

        private void setCover(String str) {
        }

        private void setCoverBytes(k.d.c.i iVar) {
        }

        private void setUrl(String str) {
        }

        private void setUrlBytes(k.d.c.i iVar) {
        }

        private void setVid(String str) {
        }

        private void setVidBytes(k.d.c.i iVar) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public String getCover() {
        }

        public k.d.c.i getCoverBytes() {
        }

        public String getUrl() {
        }

        public k.d.c.i getUrlBytes() {
        }

        public String getVid() {
        }

        public k.d.c.i getVidBytes() {
        }

        public boolean hasCover() {
        }

        public boolean hasUrl() {
        }

        public boolean hasVid() {
        }

        public static a newBuilder(c cVar) {
        }

        public static c parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static c parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static c parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        public static c parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static c parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static c parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static c parseFrom(InputStream inputStream) throws IOException {
        }

        public static c parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static c parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static c parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class d extends k.d.c.z<d, a> implements Object {
        private static final d DEFAULT_INSTANCE = null;
        public static final int LIST_FIELD_NUMBER = 1;
        private static volatile k.d.c.b1<d> PARSER;
        private b0.i<b> list_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<d, a> implements Object {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class b extends k.d.c.z<b, a> implements c {
            private static final b DEFAULT_INSTANCE = null;
            private static volatile k.d.c.b1<b> PARSER = null;
            public static final int PLAY_DURATION_FIELD_NUMBER = 1;
            public static final int PLAY_PV_PERCENTAGE_FIELD_NUMBER = 2;
            private int bitField0_;
            private float playDuration_;
            private int playPvPercentage_;

            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
            public static final class a extends z.b<b, a> implements c {
                public /* synthetic */ a(q0 q0Var) {
                }

                public a() {
                }
            }

            private b() {
            }

            public static /* synthetic */ b access$97600() {
            }

            public static /* synthetic */ void access$97700(b bVar, float f) {
            }

            public static /* synthetic */ void access$97800(b bVar) {
            }

            public static /* synthetic */ void access$97900(b bVar, int i2) {
            }

            public static /* synthetic */ void access$98000(b bVar) {
            }

            private void clearPlayDuration() {
            }

            private void clearPlayPvPercentage() {
            }

            public static b getDefaultInstance() {
            }

            public static a newBuilder() {
            }

            public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
            }

            public static b parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
            }

            public static k.d.c.b1<b> parser() {
            }

            private void setPlayDuration(float f) {
            }

            private void setPlayPvPercentage(int i2) {
            }

            @Override // k.d.c.z
            public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
            }

            public float getPlayDuration() {
            }

            public int getPlayPvPercentage() {
            }

            public boolean hasPlayDuration() {
            }

            public boolean hasPlayPvPercentage() {
            }

            public static a newBuilder(b bVar) {
            }

            public static b parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
            }

            public static b parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
            }

            public static b parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
            }

            public static b parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
            }

            public static b parseFrom(byte[] bArr) throws k.d.c.c0 {
            }

            public static b parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
            }

            public static b parseFrom(InputStream inputStream) throws IOException {
            }

            public static b parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
            }

            public static b parseFrom(k.d.c.j jVar) throws IOException {
            }

            public static b parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public interface c extends k.d.c.t0 {
        }

        private d() {
        }

        public static /* synthetic */ d access$98200() {
        }

        public static /* synthetic */ void access$98300(d dVar, int i2, b bVar) {
        }

        public static /* synthetic */ void access$98400(d dVar, b bVar) {
        }

        public static /* synthetic */ void access$98500(d dVar, int i2, b bVar) {
        }

        public static /* synthetic */ void access$98600(d dVar, Iterable iterable) {
        }

        public static /* synthetic */ void access$98700(d dVar) {
        }

        public static /* synthetic */ void access$98800(d dVar, int i2) {
        }

        private void addAllList(Iterable<? extends b> iterable) {
        }

        private void addList(b bVar) {
        }

        private void clearList() {
        }

        private void ensureListIsMutable() {
        }

        public static d getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static d parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static d parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<d> parser() {
        }

        private void removeList(int i2) {
        }

        private void setList(int i2, b bVar) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public b getList(int i2) {
        }

        public int getListCount() {
        }

        public List<b> getListList() {
        }

        public c getListOrBuilder(int i2) {
        }

        public List<? extends c> getListOrBuilderList() {
        }

        public static a newBuilder(d dVar) {
        }

        public static d parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static d parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static d parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        private void addList(int i2, b bVar) {
        }

        public static d parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static d parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static d parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static d parseFrom(InputStream inputStream) throws IOException {
        }

        public static d parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static d parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static d parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class e extends k.d.c.z<e, a> implements g {
        public static final int DATE_FIELD_NUMBER = 2;
        private static final e DEFAULT_INSTANCE = null;
        public static final int MASSSEND_TIME_FIELD_NUMBER = 7;
        private static volatile k.d.c.b1<e> PARSER = null;
        public static final int PLAY_PV_FIELD_NUMBER = 4;
        public static final int PLAY_UV_FIELD_NUMBER = 5;
        public static final int SHARE_PV_FIELD_NUMBER = 6;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int VID_FIELD_NUMBER = 1;
        private int bitField0_;
        private int date_;
        private int masssendTime_;
        private int playPv_;
        private int playUv_;
        private int sharePv_;
        private String title_;
        private String vid_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<e, a> implements g {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        private e() {
        }

        public static /* synthetic */ e access$89700() {
        }

        public static /* synthetic */ void access$89800(e eVar, String str) {
        }

        public static /* synthetic */ void access$89900(e eVar) {
        }

        public static /* synthetic */ void access$90000(e eVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$90100(e eVar, int i2) {
        }

        public static /* synthetic */ void access$90200(e eVar) {
        }

        public static /* synthetic */ void access$90300(e eVar, String str) {
        }

        public static /* synthetic */ void access$90400(e eVar) {
        }

        public static /* synthetic */ void access$90500(e eVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$90600(e eVar, int i2) {
        }

        public static /* synthetic */ void access$90700(e eVar) {
        }

        public static /* synthetic */ void access$90800(e eVar, int i2) {
        }

        public static /* synthetic */ void access$90900(e eVar) {
        }

        public static /* synthetic */ void access$91000(e eVar, int i2) {
        }

        public static /* synthetic */ void access$91100(e eVar) {
        }

        public static /* synthetic */ void access$91200(e eVar, int i2) {
        }

        public static /* synthetic */ void access$91300(e eVar) {
        }

        private void clearDate() {
        }

        private void clearMasssendTime() {
        }

        private void clearPlayPv() {
        }

        private void clearPlayUv() {
        }

        private void clearSharePv() {
        }

        private void clearTitle() {
        }

        private void clearVid() {
        }

        public static e getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static e parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static e parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<e> parser() {
        }

        private void setDate(int i2) {
        }

        private void setMasssendTime(int i2) {
        }

        private void setPlayPv(int i2) {
        }

        private void setPlayUv(int i2) {
        }

        private void setSharePv(int i2) {
        }

        private void setTitle(String str) {
        }

        private void setTitleBytes(k.d.c.i iVar) {
        }

        private void setVid(String str) {
        }

        private void setVidBytes(k.d.c.i iVar) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public int getDate() {
        }

        public int getMasssendTime() {
        }

        public int getPlayPv() {
        }

        public int getPlayUv() {
        }

        public int getSharePv() {
        }

        public String getTitle() {
        }

        public k.d.c.i getTitleBytes() {
        }

        public String getVid() {
        }

        public k.d.c.i getVidBytes() {
        }

        public boolean hasDate() {
        }

        public boolean hasMasssendTime() {
        }

        public boolean hasPlayPv() {
        }

        public boolean hasPlayUv() {
        }

        public boolean hasSharePv() {
        }

        public boolean hasTitle() {
        }

        public boolean hasVid() {
        }

        public static a newBuilder(e eVar) {
        }

        public static e parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static e parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static e parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        public static e parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static e parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static e parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static e parseFrom(InputStream inputStream) throws IOException {
        }

        public static e parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static e parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static e parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class f extends k.d.c.z<f, a> implements Object {
        public static final int DATA_DATE_FIELD_NUMBER = 3;
        private static final f DEFAULT_INSTANCE = null;
        public static final int LIST_FIELD_NUMBER = 1;
        private static volatile k.d.c.b1<f> PARSER = null;
        public static final int TOTAL_FIELD_NUMBER = 2;
        private int bitField0_;
        private int dataDate_;
        private b0.i<e> list_;
        private int total_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<f, a> implements Object {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        private f() {
        }

        public static /* synthetic */ f access$92600() {
        }

        public static /* synthetic */ void access$92700(f fVar, int i2, e eVar) {
        }

        public static /* synthetic */ void access$92800(f fVar, e eVar) {
        }

        public static /* synthetic */ void access$92900(f fVar, int i2, e eVar) {
        }

        public static /* synthetic */ void access$93000(f fVar, Iterable iterable) {
        }

        public static /* synthetic */ void access$93100(f fVar) {
        }

        public static /* synthetic */ void access$93200(f fVar, int i2) {
        }

        public static /* synthetic */ void access$93300(f fVar, int i2) {
        }

        public static /* synthetic */ void access$93400(f fVar) {
        }

        public static /* synthetic */ void access$93500(f fVar, int i2) {
        }

        public static /* synthetic */ void access$93600(f fVar) {
        }

        private void addAllList(Iterable<? extends e> iterable) {
        }

        private void addList(e eVar) {
        }

        private void clearDataDate() {
        }

        private void clearList() {
        }

        private void clearTotal() {
        }

        private void ensureListIsMutable() {
        }

        public static f getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static f parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static f parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<f> parser() {
        }

        private void removeList(int i2) {
        }

        private void setDataDate(int i2) {
        }

        private void setList(int i2, e eVar) {
        }

        private void setTotal(int i2) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public int getDataDate() {
        }

        public e getList(int i2) {
        }

        public int getListCount() {
        }

        public List<e> getListList() {
        }

        public g getListOrBuilder(int i2) {
        }

        public List<? extends g> getListOrBuilderList() {
        }

        public int getTotal() {
        }

        public boolean hasDataDate() {
        }

        public boolean hasTotal() {
        }

        public static a newBuilder(f fVar) {
        }

        public static f parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static f parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static f parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        private void addList(int i2, e eVar) {
        }

        public static f parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static f parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static f parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static f parseFrom(InputStream inputStream) throws IOException {
        }

        public static f parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static f parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static f parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public interface g extends k.d.c.t0 {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class h extends k.d.c.z<h, a> implements Object {
        private static final h DEFAULT_INSTANCE = null;
        public static final int LIST_FIELD_NUMBER = 1;
        private static volatile k.d.c.b1<h> PARSER;
        private b0.i<b> list_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<h, a> implements Object {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class b extends k.d.c.z<b, a> implements c {
            private static final b DEFAULT_INSTANCE = null;
            private static volatile k.d.c.b1<b> PARSER = null;
            public static final int PLAY_PV_FIELD_NUMBER = 1;
            public static final int SCENE_FIELD_NUMBER = 3;
            public static final int SHARE_PV_FIELD_NUMBER = 2;
            private int bitField0_;
            private int playPv_;
            private int scene_;
            private int sharePv_;

            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
            public static final class a extends z.b<b, a> implements c {
                public /* synthetic */ a(q0 q0Var) {
                }

                public a() {
                }
            }

            private b() {
            }

            public static /* synthetic */ b access$96000() {
            }

            public static /* synthetic */ void access$96100(b bVar, int i2) {
            }

            public static /* synthetic */ void access$96200(b bVar) {
            }

            public static /* synthetic */ void access$96300(b bVar, int i2) {
            }

            public static /* synthetic */ void access$96400(b bVar) {
            }

            public static /* synthetic */ void access$96500(b bVar, int i2) {
            }

            public static /* synthetic */ void access$96600(b bVar) {
            }

            private void clearPlayPv() {
            }

            private void clearScene() {
            }

            private void clearSharePv() {
            }

            public static b getDefaultInstance() {
            }

            public static a newBuilder() {
            }

            public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
            }

            public static b parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
            }

            public static k.d.c.b1<b> parser() {
            }

            private void setPlayPv(int i2) {
            }

            private void setScene(int i2) {
            }

            private void setSharePv(int i2) {
            }

            @Override // k.d.c.z
            public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
            }

            public int getPlayPv() {
            }

            public int getScene() {
            }

            public int getSharePv() {
            }

            public boolean hasPlayPv() {
            }

            public boolean hasScene() {
            }

            public boolean hasSharePv() {
            }

            public static a newBuilder(b bVar) {
            }

            public static b parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
            }

            public static b parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
            }

            public static b parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
            }

            public static b parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
            }

            public static b parseFrom(byte[] bArr) throws k.d.c.c0 {
            }

            public static b parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
            }

            public static b parseFrom(InputStream inputStream) throws IOException {
            }

            public static b parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
            }

            public static b parseFrom(k.d.c.j jVar) throws IOException {
            }

            public static b parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public interface c extends k.d.c.t0 {
        }

        private h() {
        }

        public static /* synthetic */ h access$96800() {
        }

        public static /* synthetic */ void access$96900(h hVar, int i2, b bVar) {
        }

        public static /* synthetic */ void access$97000(h hVar, b bVar) {
        }

        public static /* synthetic */ void access$97100(h hVar, int i2, b bVar) {
        }

        public static /* synthetic */ void access$97200(h hVar, Iterable iterable) {
        }

        public static /* synthetic */ void access$97300(h hVar) {
        }

        public static /* synthetic */ void access$97400(h hVar, int i2) {
        }

        private void addAllList(Iterable<? extends b> iterable) {
        }

        private void addList(b bVar) {
        }

        private void clearList() {
        }

        private void ensureListIsMutable() {
        }

        public static h getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static h parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static h parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<h> parser() {
        }

        private void removeList(int i2) {
        }

        private void setList(int i2, b bVar) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public b getList(int i2) {
        }

        public int getListCount() {
        }

        public List<b> getListList() {
        }

        public c getListOrBuilder(int i2) {
        }

        public List<? extends c> getListOrBuilderList() {
        }

        public static a newBuilder(h hVar) {
        }

        public static h parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static h parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static h parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        private void addList(int i2, b bVar) {
        }

        public static h parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static h parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static h parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static h parseFrom(InputStream inputStream) throws IOException {
        }

        public static h parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static h parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static h parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class i extends k.d.c.z<i, a> implements Object {
        private static final i DEFAULT_INSTANCE = null;
        public static final int LIST_FIELD_NUMBER = 1;
        private static volatile k.d.c.b1<i> PARSER;
        private b0.i<b> list_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<i, a> implements Object {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class b extends k.d.c.z<b, a> implements c {
            public static final int DATE_FIELD_NUMBER = 1;
            private static final b DEFAULT_INSTANCE = null;
            private static volatile k.d.c.b1<b> PARSER = null;
            public static final int PLAY_PV_FIELD_NUMBER = 2;
            public static final int PLAY_UV_FIELD_NUMBER = 3;
            public static final int SCENE_FIELD_NUMBER = 6;
            public static final int SHARE_PV_FIELD_NUMBER = 4;
            public static final int SHARE_UV_FIELD_NUMBER = 5;
            private int bitField0_;
            private int date_;
            private int playPv_;
            private int playUv_;
            private int scene_;
            private int sharePv_;
            private int shareUv_;

            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
            public static final class a extends z.b<b, a> implements c {
                public /* synthetic */ a(q0 q0Var) {
                }

                public a() {
                }
            }

            private b() {
            }

            public static /* synthetic */ b access$93800() {
            }

            public static /* synthetic */ void access$93900(b bVar, int i2) {
            }

            public static /* synthetic */ void access$94000(b bVar) {
            }

            public static /* synthetic */ void access$94100(b bVar, int i2) {
            }

            public static /* synthetic */ void access$94200(b bVar) {
            }

            public static /* synthetic */ void access$94300(b bVar, int i2) {
            }

            public static /* synthetic */ void access$94400(b bVar) {
            }

            public static /* synthetic */ void access$94500(b bVar, int i2) {
            }

            public static /* synthetic */ void access$94600(b bVar) {
            }

            public static /* synthetic */ void access$94700(b bVar, int i2) {
            }

            public static /* synthetic */ void access$94800(b bVar) {
            }

            public static /* synthetic */ void access$94900(b bVar, int i2) {
            }

            public static /* synthetic */ void access$95000(b bVar) {
            }

            private void clearDate() {
            }

            private void clearPlayPv() {
            }

            private void clearPlayUv() {
            }

            private void clearScene() {
            }

            private void clearSharePv() {
            }

            private void clearShareUv() {
            }

            public static b getDefaultInstance() {
            }

            public static a newBuilder() {
            }

            public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
            }

            public static b parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
            }

            public static k.d.c.b1<b> parser() {
            }

            private void setDate(int i2) {
            }

            private void setPlayPv(int i2) {
            }

            private void setPlayUv(int i2) {
            }

            private void setScene(int i2) {
            }

            private void setSharePv(int i2) {
            }

            private void setShareUv(int i2) {
            }

            @Override // k.d.c.z
            public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
            }

            public int getDate() {
            }

            public int getPlayPv() {
            }

            public int getPlayUv() {
            }

            public int getScene() {
            }

            public int getSharePv() {
            }

            public int getShareUv() {
            }

            public boolean hasDate() {
            }

            public boolean hasPlayPv() {
            }

            public boolean hasPlayUv() {
            }

            public boolean hasScene() {
            }

            public boolean hasSharePv() {
            }

            public boolean hasShareUv() {
            }

            public static a newBuilder(b bVar) {
            }

            public static b parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
            }

            public static b parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
            }

            public static b parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
            }

            public static b parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
            }

            public static b parseFrom(byte[] bArr) throws k.d.c.c0 {
            }

            public static b parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
            }

            public static b parseFrom(InputStream inputStream) throws IOException {
            }

            public static b parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
            }

            public static b parseFrom(k.d.c.j jVar) throws IOException {
            }

            public static b parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public interface c extends k.d.c.t0 {
        }

        private i() {
        }

        public static /* synthetic */ i access$95200() {
        }

        public static /* synthetic */ void access$95300(i iVar, int i2, b bVar) {
        }

        public static /* synthetic */ void access$95400(i iVar, b bVar) {
        }

        public static /* synthetic */ void access$95500(i iVar, int i2, b bVar) {
        }

        public static /* synthetic */ void access$95600(i iVar, Iterable iterable) {
        }

        public static /* synthetic */ void access$95700(i iVar) {
        }

        public static /* synthetic */ void access$95800(i iVar, int i2) {
        }

        private void addAllList(Iterable<? extends b> iterable) {
        }

        private void addList(b bVar) {
        }

        private void clearList() {
        }

        private void ensureListIsMutable() {
        }

        public static i getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static i parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static i parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<i> parser() {
        }

        private void removeList(int i2) {
        }

        private void setList(int i2, b bVar) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public b getList(int i2) {
        }

        public int getListCount() {
        }

        public List<b> getListList() {
        }

        public c getListOrBuilder(int i2) {
        }

        public List<? extends c> getListOrBuilderList() {
        }

        public static a newBuilder(i iVar) {
        }

        public static i parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static i parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static i parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        private void addList(int i2, b bVar) {
        }

        public static i parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static i parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static i parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static i parseFrom(InputStream inputStream) throws IOException {
        }

        public static i parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static i parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static i parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    private x2() {
    }

    public static /* synthetic */ void access$100000(x2 x2Var, h hVar) {
    }

    public static /* synthetic */ void access$100100(x2 x2Var, h hVar) {
    }

    public static /* synthetic */ void access$100200(x2 x2Var) {
    }

    public static /* synthetic */ void access$100300(x2 x2Var, f fVar) {
    }

    public static /* synthetic */ void access$100400(x2 x2Var, f fVar) {
    }

    public static /* synthetic */ void access$100500(x2 x2Var) {
    }

    public static /* synthetic */ void access$100600(x2 x2Var, f fVar) {
    }

    public static /* synthetic */ void access$100700(x2 x2Var, f fVar) {
    }

    public static /* synthetic */ void access$100800(x2 x2Var) {
    }

    public static /* synthetic */ void access$100900(x2 x2Var, e eVar) {
    }

    public static /* synthetic */ void access$101000(x2 x2Var, e eVar) {
    }

    public static /* synthetic */ void access$101100(x2 x2Var) {
    }

    public static /* synthetic */ void access$101200(x2 x2Var, i iVar) {
    }

    public static /* synthetic */ void access$101300(x2 x2Var, i iVar) {
    }

    public static /* synthetic */ void access$101400(x2 x2Var) {
    }

    public static /* synthetic */ void access$101500(x2 x2Var, h hVar) {
    }

    public static /* synthetic */ void access$101600(x2 x2Var, h hVar) {
    }

    public static /* synthetic */ void access$101700(x2 x2Var) {
    }

    public static /* synthetic */ void access$101800(x2 x2Var, d dVar) {
    }

    public static /* synthetic */ void access$101900(x2 x2Var, d dVar) {
    }

    public static /* synthetic */ void access$102000(x2 x2Var) {
    }

    public static /* synthetic */ void access$102100(x2 x2Var, c cVar) {
    }

    public static /* synthetic */ void access$102200(x2 x2Var, c cVar) {
    }

    public static /* synthetic */ void access$102300(x2 x2Var) {
    }

    public static /* synthetic */ x2 access$99000() {
    }

    public static /* synthetic */ void access$99100(x2 x2Var, k0 k0Var) {
    }

    public static /* synthetic */ void access$99200(x2 x2Var, k0 k0Var) {
    }

    public static /* synthetic */ void access$99300(x2 x2Var) {
    }

    public static /* synthetic */ void access$99400(x2 x2Var, b bVar) {
    }

    public static /* synthetic */ void access$99500(x2 x2Var, b bVar) {
    }

    public static /* synthetic */ void access$99600(x2 x2Var) {
    }

    public static /* synthetic */ void access$99700(x2 x2Var, i iVar) {
    }

    public static /* synthetic */ void access$99800(x2 x2Var, i iVar) {
    }

    public static /* synthetic */ void access$99900(x2 x2Var) {
    }

    private void clearAllVideoMasssendData() {
    }

    private void clearAllVideoPlayedYesterday() {
    }

    private void clearAllVideoStatSource() {
    }

    private void clearAllVideoStatTendency() {
    }

    private void clearAllVideoStatYesterday() {
    }

    private void clearBaseResp() {
    }

    private void clearOneVideoDetail() {
    }

    private void clearOneVideoPlayDuration() {
    }

    private void clearOneVideoStat() {
    }

    private void clearOneVideoStatSource() {
    }

    private void clearOneVideoStatTendency() {
    }

    public static x2 getDefaultInstance() {
    }

    private void mergeAllVideoMasssendData(f fVar) {
    }

    private void mergeAllVideoPlayedYesterday(f fVar) {
    }

    private void mergeAllVideoStatSource(h hVar) {
    }

    private void mergeAllVideoStatTendency(i iVar) {
    }

    private void mergeAllVideoStatYesterday(b bVar) {
    }

    private void mergeBaseResp(k0 k0Var) {
    }

    private void mergeOneVideoDetail(c cVar) {
    }

    private void mergeOneVideoPlayDuration(d dVar) {
    }

    private void mergeOneVideoStat(e eVar) {
    }

    private void mergeOneVideoStatSource(h hVar) {
    }

    private void mergeOneVideoStatTendency(i iVar) {
    }

    public static a newBuilder() {
    }

    public static x2 parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static x2 parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static k.d.c.b1<x2> parser() {
    }

    private void setAllVideoMasssendData(f fVar) {
    }

    private void setAllVideoPlayedYesterday(f fVar) {
    }

    private void setAllVideoStatSource(h hVar) {
    }

    private void setAllVideoStatTendency(i iVar) {
    }

    private void setAllVideoStatYesterday(b bVar) {
    }

    private void setBaseResp(k0 k0Var) {
    }

    private void setOneVideoDetail(c cVar) {
    }

    private void setOneVideoPlayDuration(d dVar) {
    }

    private void setOneVideoStat(e eVar) {
    }

    private void setOneVideoStatSource(h hVar) {
    }

    private void setOneVideoStatTendency(i iVar) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public f getAllVideoMasssendData() {
    }

    public f getAllVideoPlayedYesterday() {
    }

    public h getAllVideoStatSource() {
    }

    public i getAllVideoStatTendency() {
    }

    public b getAllVideoStatYesterday() {
    }

    public k0 getBaseResp() {
    }

    public c getOneVideoDetail() {
    }

    public d getOneVideoPlayDuration() {
    }

    public e getOneVideoStat() {
    }

    public h getOneVideoStatSource() {
    }

    public i getOneVideoStatTendency() {
    }

    public boolean hasAllVideoMasssendData() {
    }

    public boolean hasAllVideoPlayedYesterday() {
    }

    public boolean hasAllVideoStatSource() {
    }

    public boolean hasAllVideoStatTendency() {
    }

    public boolean hasAllVideoStatYesterday() {
    }

    public boolean hasBaseResp() {
    }

    public boolean hasOneVideoDetail() {
    }

    public boolean hasOneVideoPlayDuration() {
    }

    public boolean hasOneVideoStat() {
    }

    public boolean hasOneVideoStatSource() {
    }

    public boolean hasOneVideoStatTendency() {
    }

    public static a newBuilder(x2 x2Var) {
    }

    public static x2 parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static x2 parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static x2 parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static x2 parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static x2 parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static x2 parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static x2 parseFrom(InputStream inputStream) throws IOException {
    }

    public static x2 parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static x2 parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static x2 parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }
}
