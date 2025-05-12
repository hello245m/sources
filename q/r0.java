package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k.d.c.b0;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class r0 extends k.d.c.z<r0, g> implements Object {
    public static final int ALL_ARTICLE_STAT_SOURCE_FIELD_NUMBER = 4;
    public static final int ALL_ARTICLE_STAT_TENDENCY_FIELD_NUMBER = 3;
    public static final int BASE_RESP_FIELD_NUMBER = 1;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final r0 DEFAULT_INSTANCE = null;
    public static final int FINISH_READ_RATE_FIELD_NUMBER = 23;
    public static final int JUMP_LIST_FIELD_NUMBER = 24;
    public static final int ONE_ARTICLE_BASE_INFO_FIELD_NUMBER = 18;
    public static final int ONE_ARTICLE_CAN_REWARD_FIELD_NUMBER = 9;
    public static final int ONE_ARTICLE_COMMENT_NUM_FIELD_NUMBER = 12;
    public static final int ONE_ARTICLE_FINDER_STAT_INFO_FIELD_NUMBER = 26;
    public static final int ONE_ARTICLE_IS_PAYREAD_FIELD_NUMBER = 13;
    public static final int ONE_ARTICLE_LIKE_NUM_FIELD_NUMBER = 8;
    public static final int ONE_ARTICLE_OLD_LIKE_NUM_FIELD_NUMBER = 7;
    public static final int ONE_ARTICLE_OPEN_COMMENT_FIELD_NUMBER = 11;
    public static final int ONE_ARTICLE_PAYREAD_COUNT_FIELD_NUMBER = 14;
    public static final int ONE_ARTICLE_READ_NUM_FIELD_NUMBER = 6;
    public static final int ONE_ARTICLE_REWARD_MONEY_FIELD_NUMBER = 21;
    public static final int ONE_ARTICLE_REWARD_NUM_FIELD_NUMBER = 10;
    public static final int ONE_ARTICLE_SUBSCRIBE_NUM_AFTER_READ_FIELD_NUMBER = 17;
    public static final int ONE_ARTICLE_SUMMARY_STAT_MISS_FIELD_NUMBER = 20;
    public static final int ONE_ARTICLE_TENDENCY_FIELD_NUMBER = 19;
    public static final int ONE_ARTICLE_TOTAL_READ_PV_FIELD_NUMBER = 15;
    public static final int ONE_ARTICLE_TOTAL_SHARE_PV_FIELD_NUMBER = 16;
    public static final int ONE_ARTICLE_TRANSFORM_DATA_FIELD_NUMBER = 22;
    private static volatile k.d.c.b1<r0> PARSER = null;
    public static final int USER_SOURCE_LIST_FIELD_NUMBER = 25;
    public static final int YESTERDAY_FINISH_READ_PV_FIELD_NUMBER = 5;
    private b allArticleStatSource_;
    private c allArticleStatTendency_;
    private k0 baseResp_;
    private int bitField0_;
    private f body_;
    private String finishReadRate_;
    private b0.i<k> jumpList_;
    private byte memoizedIsInitialized;
    private a oneArticleBaseInfo_;
    private boolean oneArticleCanReward_;
    private int oneArticleCommentNum_;
    private j oneArticleFinderStatInfo_;
    private boolean oneArticleIsPayread_;
    private int oneArticleLikeNum_;
    private int oneArticleOldLikeNum_;
    private boolean oneArticleOpenComment_;
    private int oneArticlePayreadCount_;
    private int oneArticleReadNum_;
    private int oneArticleRewardMoney_;
    private int oneArticleRewardNum_;
    private int oneArticleSubscribeNumAfterRead_;
    private boolean oneArticleSummaryStatMiss_;
    private d oneArticleTendency_;
    private int oneArticleTotalReadPv_;
    private int oneArticleTotalSharePv_;
    private e oneArticleTransformData_;
    private b0.i<q> userSourceList_;
    private int yesterdayFinishReadPv_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends k.d.c.z<a, C0787a> implements Object {
        public static final int CONTENT_URL_FIELD_NUMBER = 6;
        public static final int COVER_FIELD_NUMBER = 5;
        private static final a DEFAULT_INSTANCE = null;
        public static final int DIGEST_FIELD_NUMBER = 4;
        public static final int MSGID_FIELD_NUMBER = 1;
        private static volatile k.d.c.b1<a> PARSER = null;
        public static final int PUBLISH_DATE_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 2;
        private int bitField0_;
        private String contentUrl_;
        private String cover_;
        private String digest_;
        private String msgid_;
        private int publishDate_;
        private String title_;

        /* renamed from: q.r0$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class C0787a extends z.b<a, C0787a> implements Object {
            public /* synthetic */ C0787a(q0 q0Var) {
            }

            public C0787a() {
            }
        }

        private a() {
        }

        public static /* synthetic */ a access$53500() {
        }

        public static /* synthetic */ void access$53600(a aVar, String str) {
        }

        public static /* synthetic */ void access$53700(a aVar) {
        }

        public static /* synthetic */ void access$53800(a aVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$53900(a aVar, String str) {
        }

        public static /* synthetic */ void access$54000(a aVar) {
        }

        public static /* synthetic */ void access$54100(a aVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$54200(a aVar, int i2) {
        }

        public static /* synthetic */ void access$54300(a aVar) {
        }

        public static /* synthetic */ void access$54400(a aVar, String str) {
        }

        public static /* synthetic */ void access$54500(a aVar) {
        }

        public static /* synthetic */ void access$54600(a aVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$54700(a aVar, String str) {
        }

        public static /* synthetic */ void access$54800(a aVar) {
        }

        public static /* synthetic */ void access$54900(a aVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$55000(a aVar, String str) {
        }

        public static /* synthetic */ void access$55100(a aVar) {
        }

        public static /* synthetic */ void access$55200(a aVar, k.d.c.i iVar) {
        }

        private void clearContentUrl() {
        }

        private void clearCover() {
        }

        private void clearDigest() {
        }

        private void clearMsgid() {
        }

        private void clearPublishDate() {
        }

        private void clearTitle() {
        }

        public static a getDefaultInstance() {
        }

        public static C0787a newBuilder() {
        }

        public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static a parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<a> parser() {
        }

        private void setContentUrl(String str) {
        }

        private void setContentUrlBytes(k.d.c.i iVar) {
        }

        private void setCover(String str) {
        }

        private void setCoverBytes(k.d.c.i iVar) {
        }

        private void setDigest(String str) {
        }

        private void setDigestBytes(k.d.c.i iVar) {
        }

        private void setMsgid(String str) {
        }

        private void setMsgidBytes(k.d.c.i iVar) {
        }

        private void setPublishDate(int i2) {
        }

        private void setTitle(String str) {
        }

        private void setTitleBytes(k.d.c.i iVar) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public String getContentUrl() {
        }

        public k.d.c.i getContentUrlBytes() {
        }

        public String getCover() {
        }

        public k.d.c.i getCoverBytes() {
        }

        public String getDigest() {
        }

        public k.d.c.i getDigestBytes() {
        }

        public String getMsgid() {
        }

        public k.d.c.i getMsgidBytes() {
        }

        public int getPublishDate() {
        }

        public String getTitle() {
        }

        public k.d.c.i getTitleBytes() {
        }

        public boolean hasContentUrl() {
        }

        public boolean hasCover() {
        }

        public boolean hasDigest() {
        }

        public boolean hasMsgid() {
        }

        public boolean hasPublishDate() {
        }

        public boolean hasTitle() {
        }

        public static C0787a newBuilder(a aVar) {
        }

        public static a parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static a parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static a parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        public static a parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static a parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static a parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static a parseFrom(InputStream inputStream) throws IOException {
        }

        public static a parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static a parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static a parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class b extends k.d.c.z<b, a> implements Object {
        private static final b DEFAULT_INSTANCE = null;
        public static final int LIST_FIELD_NUMBER = 1;
        private static volatile k.d.c.b1<b> PARSER;
        private b0.i<C0788b> list_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<b, a> implements Object {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        /* renamed from: q.r0$b$b, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class C0788b extends k.d.c.z<C0788b, a> implements c {
            private static final C0788b DEFAULT_INSTANCE = null;
            private static volatile k.d.c.b1<C0788b> PARSER = null;
            public static final int READ_PV_FIELD_NUMBER = 2;
            public static final int SCENE_FIELD_NUMBER = 1;
            public static final int SHARE_PV_FIELD_NUMBER = 3;
            private int bitField0_;
            private int readPv_;
            private int scene_;
            private int sharePv_;

            /* renamed from: q.r0$b$b$a */
            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
            public static final class a extends z.b<C0788b, a> implements c {
                public /* synthetic */ a(q0 q0Var) {
                }

                public a() {
                }
            }

            private C0788b() {
            }

            public static /* synthetic */ C0788b access$51900() {
            }

            public static /* synthetic */ void access$52000(C0788b c0788b, int i2) {
            }

            public static /* synthetic */ void access$52100(C0788b c0788b) {
            }

            public static /* synthetic */ void access$52200(C0788b c0788b, int i2) {
            }

            public static /* synthetic */ void access$52300(C0788b c0788b) {
            }

            public static /* synthetic */ void access$52400(C0788b c0788b, int i2) {
            }

            public static /* synthetic */ void access$52500(C0788b c0788b) {
            }

            private void clearReadPv() {
            }

            private void clearScene() {
            }

            private void clearSharePv() {
            }

            public static C0788b getDefaultInstance() {
            }

            public static a newBuilder() {
            }

            public static C0788b parseDelimitedFrom(InputStream inputStream) throws IOException {
            }

            public static C0788b parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
            }

            public static k.d.c.b1<C0788b> parser() {
            }

            private void setReadPv(int i2) {
            }

            private void setScene(int i2) {
            }

            private void setSharePv(int i2) {
            }

            @Override // k.d.c.z
            public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
            }

            public int getReadPv() {
            }

            public int getScene() {
            }

            public int getSharePv() {
            }

            public boolean hasReadPv() {
            }

            public boolean hasScene() {
            }

            public boolean hasSharePv() {
            }

            public static a newBuilder(C0788b c0788b) {
            }

            public static C0788b parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
            }

            public static C0788b parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
            }

            public static C0788b parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
            }

            public static C0788b parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
            }

            public static C0788b parseFrom(byte[] bArr) throws k.d.c.c0 {
            }

            public static C0788b parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
            }

            public static C0788b parseFrom(InputStream inputStream) throws IOException {
            }

            public static C0788b parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
            }

            public static C0788b parseFrom(k.d.c.j jVar) throws IOException {
            }

            public static C0788b parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public interface c extends k.d.c.t0 {
        }

        private b() {
        }

        public static /* synthetic */ b access$52700() {
        }

        public static /* synthetic */ void access$52800(b bVar, int i2, C0788b c0788b) {
        }

        public static /* synthetic */ void access$52900(b bVar, C0788b c0788b) {
        }

        public static /* synthetic */ void access$53000(b bVar, int i2, C0788b c0788b) {
        }

        public static /* synthetic */ void access$53100(b bVar, Iterable iterable) {
        }

        public static /* synthetic */ void access$53200(b bVar) {
        }

        public static /* synthetic */ void access$53300(b bVar, int i2) {
        }

        private void addAllList(Iterable<? extends C0788b> iterable) {
        }

        private void addList(C0788b c0788b) {
        }

        private void clearList() {
        }

        private void ensureListIsMutable() {
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

        private void removeList(int i2) {
        }

        private void setList(int i2, C0788b c0788b) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public C0788b getList(int i2) {
        }

        public int getListCount() {
        }

        public List<C0788b> getListList() {
        }

        public c getListOrBuilder(int i2) {
        }

        public List<? extends c> getListOrBuilderList() {
        }

        public static a newBuilder(b bVar) {
        }

        public static b parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static b parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static b parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        private void addList(int i2, C0788b c0788b) {
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
        private static final c DEFAULT_INSTANCE = null;
        public static final int LIST_FIELD_NUMBER = 1;
        private static volatile k.d.c.b1<c> PARSER;
        private b0.i<b> list_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<c, a> implements Object {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class b extends k.d.c.z<b, a> implements InterfaceC0789c {
            public static final int COLLECTION_PV_FIELD_NUMBER = 9;
            public static final int COLLECTION_UV_FIELD_NUMBER = 10;
            public static final int DATE_FIELD_NUMBER = 1;
            private static final b DEFAULT_INSTANCE = null;
            public static final int MASS_PV_FIELD_NUMBER = 11;
            public static final int MASS_UV_FIELD_NUMBER = 12;
            private static volatile k.d.c.b1<b> PARSER = null;
            public static final int READ_PV_FIELD_NUMBER = 3;
            public static final int READ_UV_FIELD_NUMBER = 4;
            public static final int SCENE_FIELD_NUMBER = 2;
            public static final int SHARE_PV_FIELD_NUMBER = 5;
            public static final int SHARE_UV_FIELD_NUMBER = 6;
            public static final int SOURCE_PV_FIELD_NUMBER = 7;
            public static final int SOURCE_UV_FIELD_NUMBER = 8;
            private int bitField0_;
            private int collectionPv_;
            private int collectionUv_;
            private int date_;
            private int massPv_;
            private int massUv_;
            private int readPv_;
            private int readUv_;
            private int scene_;
            private int sharePv_;
            private int shareUv_;
            private int sourcePv_;
            private int sourceUv_;

            /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
            public static final class a extends z.b<b, a> implements InterfaceC0789c {
                public /* synthetic */ a(q0 q0Var) {
                }

                public a() {
                }
            }

            private b() {
            }

            public static /* synthetic */ b access$48500() {
            }

            public static /* synthetic */ void access$48600(b bVar, int i2) {
            }

            public static /* synthetic */ void access$48700(b bVar) {
            }

            public static /* synthetic */ void access$48800(b bVar, int i2) {
            }

            public static /* synthetic */ void access$48900(b bVar) {
            }

            public static /* synthetic */ void access$49000(b bVar, int i2) {
            }

            public static /* synthetic */ void access$49100(b bVar) {
            }

            public static /* synthetic */ void access$49200(b bVar, int i2) {
            }

            public static /* synthetic */ void access$49300(b bVar) {
            }

            public static /* synthetic */ void access$49400(b bVar, int i2) {
            }

            public static /* synthetic */ void access$49500(b bVar) {
            }

            public static /* synthetic */ void access$49600(b bVar, int i2) {
            }

            public static /* synthetic */ void access$49700(b bVar) {
            }

            public static /* synthetic */ void access$49800(b bVar, int i2) {
            }

            public static /* synthetic */ void access$49900(b bVar) {
            }

            public static /* synthetic */ void access$50000(b bVar, int i2) {
            }

            public static /* synthetic */ void access$50100(b bVar) {
            }

            public static /* synthetic */ void access$50200(b bVar, int i2) {
            }

            public static /* synthetic */ void access$50300(b bVar) {
            }

            public static /* synthetic */ void access$50400(b bVar, int i2) {
            }

            public static /* synthetic */ void access$50500(b bVar) {
            }

            public static /* synthetic */ void access$50600(b bVar, int i2) {
            }

            public static /* synthetic */ void access$50700(b bVar) {
            }

            public static /* synthetic */ void access$50800(b bVar, int i2) {
            }

            public static /* synthetic */ void access$50900(b bVar) {
            }

            private void clearCollectionPv() {
            }

            private void clearCollectionUv() {
            }

            private void clearDate() {
            }

            private void clearMassPv() {
            }

            private void clearMassUv() {
            }

            private void clearReadPv() {
            }

            private void clearReadUv() {
            }

            private void clearScene() {
            }

            private void clearSharePv() {
            }

            private void clearShareUv() {
            }

            private void clearSourcePv() {
            }

            private void clearSourceUv() {
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

            private void setCollectionPv(int i2) {
            }

            private void setCollectionUv(int i2) {
            }

            private void setDate(int i2) {
            }

            private void setMassPv(int i2) {
            }

            private void setMassUv(int i2) {
            }

            private void setReadPv(int i2) {
            }

            private void setReadUv(int i2) {
            }

            private void setScene(int i2) {
            }

            private void setSharePv(int i2) {
            }

            private void setShareUv(int i2) {
            }

            private void setSourcePv(int i2) {
            }

            private void setSourceUv(int i2) {
            }

            @Override // k.d.c.z
            public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
            }

            public int getCollectionPv() {
            }

            public int getCollectionUv() {
            }

            public int getDate() {
            }

            public int getMassPv() {
            }

            public int getMassUv() {
            }

            public int getReadPv() {
            }

            public int getReadUv() {
            }

            public int getScene() {
            }

            public int getSharePv() {
            }

            public int getShareUv() {
            }

            public int getSourcePv() {
            }

            public int getSourceUv() {
            }

            public boolean hasCollectionPv() {
            }

            public boolean hasCollectionUv() {
            }

            public boolean hasDate() {
            }

            public boolean hasMassPv() {
            }

            public boolean hasMassUv() {
            }

            public boolean hasReadPv() {
            }

            public boolean hasReadUv() {
            }

            public boolean hasScene() {
            }

            public boolean hasSharePv() {
            }

            public boolean hasShareUv() {
            }

            public boolean hasSourcePv() {
            }

            public boolean hasSourceUv() {
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

        /* renamed from: q.r0$c$c, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public interface InterfaceC0789c extends k.d.c.t0 {
        }

        private c() {
        }

        public static /* synthetic */ c access$51100() {
        }

        public static /* synthetic */ void access$51200(c cVar, int i2, b bVar) {
        }

        public static /* synthetic */ void access$51300(c cVar, b bVar) {
        }

        public static /* synthetic */ void access$51400(c cVar, int i2, b bVar) {
        }

        public static /* synthetic */ void access$51500(c cVar, Iterable iterable) {
        }

        public static /* synthetic */ void access$51600(c cVar) {
        }

        public static /* synthetic */ void access$51700(c cVar, int i2) {
        }

        private void addAllList(Iterable<? extends b> iterable) {
        }

        private void addList(b bVar) {
        }

        private void clearList() {
        }

        private void ensureListIsMutable() {
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

        public InterfaceC0789c getListOrBuilder(int i2) {
        }

        public List<? extends InterfaceC0789c> getListOrBuilderList() {
        }

        public static a newBuilder(c cVar) {
        }

        public static c parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static c parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static c parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        private void addList(int i2, b bVar) {
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
        public static final int DATA_LIST_FIELD_NUMBER = 3;
        private static final d DEFAULT_INSTANCE = null;
        public static final int MSGID_FIELD_NUMBER = 1;
        private static volatile k.d.c.b1<d> PARSER = null;
        public static final int PUBLISH_DATE_FIELD_NUMBER = 2;
        private int bitField0_;
        private b0.i<b> dataList_;
        private String msgid_;
        private String publishDate_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<d, a> implements Object {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class b extends k.d.c.z<b, a> implements c {
            public static final int DATA_DATE_FIELD_NUMBER = 1;
            private static final b DEFAULT_INSTANCE = null;
            private static volatile k.d.c.b1<b> PARSER = null;
            public static final int READ_PV_FIELD_NUMBER = 3;
            public static final int READ_UV_FIELD_NUMBER = 4;
            public static final int SCENE_FIELD_NUMBER = 2;
            public static final int SHARE_PV_FIELD_NUMBER = 5;
            public static final int SHARE_UV_FIELD_NUMBER = 6;
            private int bitField0_;
            private int dataDate_;
            private int readPv_;
            private int readUv_;
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

            public static /* synthetic */ b access$55400() {
            }

            public static /* synthetic */ void access$55500(b bVar, int i2) {
            }

            public static /* synthetic */ void access$55600(b bVar) {
            }

            public static /* synthetic */ void access$55700(b bVar, int i2) {
            }

            public static /* synthetic */ void access$55800(b bVar) {
            }

            public static /* synthetic */ void access$55900(b bVar, int i2) {
            }

            public static /* synthetic */ void access$56000(b bVar) {
            }

            public static /* synthetic */ void access$56100(b bVar, int i2) {
            }

            public static /* synthetic */ void access$56200(b bVar) {
            }

            public static /* synthetic */ void access$56300(b bVar, int i2) {
            }

            public static /* synthetic */ void access$56400(b bVar) {
            }

            public static /* synthetic */ void access$56500(b bVar, int i2) {
            }

            public static /* synthetic */ void access$56600(b bVar) {
            }

            private void clearDataDate() {
            }

            private void clearReadPv() {
            }

            private void clearReadUv() {
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

            private void setDataDate(int i2) {
            }

            private void setReadPv(int i2) {
            }

            private void setReadUv(int i2) {
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

            public int getDataDate() {
            }

            public int getReadPv() {
            }

            public int getReadUv() {
            }

            public int getScene() {
            }

            public int getSharePv() {
            }

            public int getShareUv() {
            }

            public boolean hasDataDate() {
            }

            public boolean hasReadPv() {
            }

            public boolean hasReadUv() {
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

        private d() {
        }

        public static /* synthetic */ d access$56800() {
        }

        public static /* synthetic */ void access$56900(d dVar, String str) {
        }

        public static /* synthetic */ void access$57000(d dVar) {
        }

        public static /* synthetic */ void access$57100(d dVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$57200(d dVar, String str) {
        }

        public static /* synthetic */ void access$57300(d dVar) {
        }

        public static /* synthetic */ void access$57400(d dVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$57500(d dVar, int i2, b bVar) {
        }

        public static /* synthetic */ void access$57600(d dVar, b bVar) {
        }

        public static /* synthetic */ void access$57700(d dVar, int i2, b bVar) {
        }

        public static /* synthetic */ void access$57800(d dVar, Iterable iterable) {
        }

        public static /* synthetic */ void access$57900(d dVar) {
        }

        public static /* synthetic */ void access$58000(d dVar, int i2) {
        }

        private void addAllDataList(Iterable<? extends b> iterable) {
        }

        private void addDataList(b bVar) {
        }

        private void clearDataList() {
        }

        private void clearMsgid() {
        }

        private void clearPublishDate() {
        }

        private void ensureDataListIsMutable() {
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

        private void removeDataList(int i2) {
        }

        private void setDataList(int i2, b bVar) {
        }

        private void setMsgid(String str) {
        }

        private void setMsgidBytes(k.d.c.i iVar) {
        }

        private void setPublishDate(String str) {
        }

        private void setPublishDateBytes(k.d.c.i iVar) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public b getDataList(int i2) {
        }

        public int getDataListCount() {
        }

        public List<b> getDataListList() {
        }

        public c getDataListOrBuilder(int i2) {
        }

        public List<? extends c> getDataListOrBuilderList() {
        }

        public String getMsgid() {
        }

        public k.d.c.i getMsgidBytes() {
        }

        public String getPublishDate() {
        }

        public k.d.c.i getPublishDateBytes() {
        }

        public boolean hasMsgid() {
        }

        public boolean hasPublishDate() {
        }

        public static a newBuilder(d dVar) {
        }

        public static d parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static d parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static d parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        private void addDataList(int i2, b bVar) {
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
    public static final class e extends k.d.c.z<e, a> implements Object {
        private static final e DEFAULT_INSTANCE = null;
        public static final int FIRST_SHARE_COUNT_FIELD_NUMBER = 3;
        public static final int INT_PAGE_FROM_SESSION_READ_COUNT_FIELD_NUMBER = 2;
        public static final int IS_DATA_LOADED_FIELD_NUMBER = 6;
        private static volatile k.d.c.b1<e> PARSER = null;
        public static final int READ_FROM_SHARE_COUNT_FIELD_NUMBER = 5;
        public static final int TARGET_USER_FIELD_NUMBER = 1;
        public static final int TOTAL_SHARE_COUNT_FIELD_NUMBER = 4;
        private int bitField0_;
        private int firstShareCount_;
        private int intPageFromSessionReadCount_;
        private boolean isDataLoaded_;
        private int readFromShareCount_;
        private int targetUser_;
        private int totalShareCount_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<e, a> implements Object {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        private e() {
        }

        public static /* synthetic */ e access$58200() {
        }

        public static /* synthetic */ void access$58300(e eVar, int i2) {
        }

        public static /* synthetic */ void access$58400(e eVar) {
        }

        public static /* synthetic */ void access$58500(e eVar, int i2) {
        }

        public static /* synthetic */ void access$58600(e eVar) {
        }

        public static /* synthetic */ void access$58700(e eVar, int i2) {
        }

        public static /* synthetic */ void access$58800(e eVar) {
        }

        public static /* synthetic */ void access$58900(e eVar, int i2) {
        }

        public static /* synthetic */ void access$59000(e eVar) {
        }

        public static /* synthetic */ void access$59100(e eVar, int i2) {
        }

        public static /* synthetic */ void access$59200(e eVar) {
        }

        public static /* synthetic */ void access$59300(e eVar, boolean z) {
        }

        public static /* synthetic */ void access$59400(e eVar) {
        }

        private void clearFirstShareCount() {
        }

        private void clearIntPageFromSessionReadCount() {
        }

        private void clearIsDataLoaded() {
        }

        private void clearReadFromShareCount() {
        }

        private void clearTargetUser() {
        }

        private void clearTotalShareCount() {
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

        private void setFirstShareCount(int i2) {
        }

        private void setIntPageFromSessionReadCount(int i2) {
        }

        private void setIsDataLoaded(boolean z) {
        }

        private void setReadFromShareCount(int i2) {
        }

        private void setTargetUser(int i2) {
        }

        private void setTotalShareCount(int i2) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public int getFirstShareCount() {
        }

        public int getIntPageFromSessionReadCount() {
        }

        public boolean getIsDataLoaded() {
        }

        public int getReadFromShareCount() {
        }

        public int getTargetUser() {
        }

        public int getTotalShareCount() {
        }

        public boolean hasFirstShareCount() {
        }

        public boolean hasIntPageFromSessionReadCount() {
        }

        public boolean hasIsDataLoaded() {
        }

        public boolean hasReadFromShareCount() {
        }

        public boolean hasTargetUser() {
        }

        public boolean hasTotalShareCount() {
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
        public static final int COUNT_FIELD_NUMBER = 3;
        private static final f DEFAULT_INSTANCE = null;
        private static volatile k.d.c.b1<f> PARSER = null;
        public static final int TABLES_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 1;
        private int bitField0_;
        private int count_;
        private b0.i<o> tables_;
        private int time_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<f, a> implements Object {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        private f() {
        }

        public static /* synthetic */ f access$47300() {
        }

        public static /* synthetic */ void access$47400(f fVar, int i2) {
        }

        public static /* synthetic */ void access$47500(f fVar) {
        }

        public static /* synthetic */ void access$47600(f fVar, int i2, o oVar) {
        }

        public static /* synthetic */ void access$47700(f fVar, o oVar) {
        }

        public static /* synthetic */ void access$47800(f fVar, int i2, o oVar) {
        }

        public static /* synthetic */ void access$47900(f fVar, Iterable iterable) {
        }

        public static /* synthetic */ void access$48000(f fVar) {
        }

        public static /* synthetic */ void access$48100(f fVar, int i2) {
        }

        public static /* synthetic */ void access$48200(f fVar, int i2) {
        }

        public static /* synthetic */ void access$48300(f fVar) {
        }

        private void addAllTables(Iterable<? extends o> iterable) {
        }

        private void addTables(o oVar) {
        }

        private void clearCount() {
        }

        private void clearTables() {
        }

        private void clearTime() {
        }

        private void ensureTablesIsMutable() {
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

        private void removeTables(int i2) {
        }

        private void setCount(int i2) {
        }

        private void setTables(int i2, o oVar) {
        }

        private void setTime(int i2) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public int getCount() {
        }

        public o getTables(int i2) {
        }

        public int getTablesCount() {
        }

        public List<o> getTablesList() {
        }

        public p getTablesOrBuilder(int i2) {
        }

        public List<? extends p> getTablesOrBuilderList() {
        }

        public int getTime() {
        }

        public boolean hasCount() {
        }

        public boolean hasTime() {
        }

        public static a newBuilder(f fVar) {
        }

        public static f parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static f parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static f parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        private void addTables(int i2, o oVar) {
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
    public static final class g extends z.b<r0, g> implements Object {
        public /* synthetic */ g(q0 q0Var) {
        }

        public g() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class h extends k.d.c.z<h, a> implements i {
        private static final h DEFAULT_INSTANCE = null;
        public static final int KEY_FIELD_NUMBER = 1;
        private static volatile k.d.c.b1<h> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private k.d.c.i key_;
        private k.d.c.i value_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<h, a> implements i {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        private h() {
        }

        public static /* synthetic */ h access$44300() {
        }

        public static /* synthetic */ void access$44400(h hVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$44500(h hVar) {
        }

        public static /* synthetic */ void access$44600(h hVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$44700(h hVar) {
        }

        private void clearKey() {
        }

        private void clearValue() {
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

        private void setKey(k.d.c.i iVar) {
        }

        private void setValue(k.d.c.i iVar) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public k.d.c.i getKey() {
        }

        public k.d.c.i getValue() {
        }

        public boolean hasKey() {
        }

        public boolean hasValue() {
        }

        public static a newBuilder(h hVar) {
        }

        public static h parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static h parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static h parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
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
    public interface i extends k.d.c.t0 {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class j extends k.d.c.z<j, a> implements Object {
        private static final j DEFAULT_INSTANCE = null;
        public static final int FAV_NUM_FIELD_NUMBER = 3;
        public static final int LIKE_NUM_FIELD_NUMBER = 2;
        private static volatile k.d.c.b1<j> PARSER = null;
        public static final int USE_FINDER_STAT_FIELD_NUMBER = 1;
        private int bitField0_;
        private int favNum_;
        private long likeNum_;
        private boolean useFinderStat_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<j, a> implements Object {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        private j() {
        }

        public static /* synthetic */ j access$61100() {
        }

        public static /* synthetic */ void access$61200(j jVar, boolean z) {
        }

        public static /* synthetic */ void access$61300(j jVar) {
        }

        public static /* synthetic */ void access$61400(j jVar, long j2) {
        }

        public static /* synthetic */ void access$61500(j jVar) {
        }

        public static /* synthetic */ void access$61600(j jVar, int i2) {
        }

        public static /* synthetic */ void access$61700(j jVar) {
        }

        private void clearFavNum() {
        }

        private void clearLikeNum() {
        }

        private void clearUseFinderStat() {
        }

        public static j getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static j parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static j parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<j> parser() {
        }

        private void setFavNum(int i2) {
        }

        private void setLikeNum(long j2) {
        }

        private void setUseFinderStat(boolean z) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public int getFavNum() {
        }

        public long getLikeNum() {
        }

        public boolean getUseFinderStat() {
        }

        public boolean hasFavNum() {
        }

        public boolean hasLikeNum() {
        }

        public boolean hasUseFinderStat() {
        }

        public static a newBuilder(j jVar) {
        }

        public static j parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static j parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static j parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        public static j parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static j parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static j parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static j parseFrom(InputStream inputStream) throws IOException {
        }

        public static j parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static j parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static j parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class k extends k.d.c.z<k, a> implements l {
        public static final int ATTR_TYPE_FIELD_NUMBER = 1;
        public static final int ATTR_VALUE_FIELD_NUMBER = 2;
        private static final k DEFAULT_INSTANCE = null;
        private static volatile k.d.c.b1<k> PARSER = null;
        public static final int USER_COUNT_FIELD_NUMBER = 3;
        private int attrType_;
        private int attrValue_;
        private int bitField0_;
        private int userCount_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<k, a> implements l {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        private k() {
        }

        public static /* synthetic */ k access$59600() {
        }

        public static /* synthetic */ void access$59700(k kVar, int i2) {
        }

        public static /* synthetic */ void access$59800(k kVar) {
        }

        public static /* synthetic */ void access$59900(k kVar, int i2) {
        }

        public static /* synthetic */ void access$60000(k kVar) {
        }

        public static /* synthetic */ void access$60100(k kVar, int i2) {
        }

        public static /* synthetic */ void access$60200(k kVar) {
        }

        private void clearAttrType() {
        }

        private void clearAttrValue() {
        }

        private void clearUserCount() {
        }

        public static k getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static k parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static k parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<k> parser() {
        }

        private void setAttrType(int i2) {
        }

        private void setAttrValue(int i2) {
        }

        private void setUserCount(int i2) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public int getAttrType() {
        }

        public int getAttrValue() {
        }

        public int getUserCount() {
        }

        public boolean hasAttrType() {
        }

        public boolean hasAttrValue() {
        }

        public boolean hasUserCount() {
        }

        public static a newBuilder(k kVar) {
        }

        public static k parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static k parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static k parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        public static k parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static k parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static k parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static k parseFrom(InputStream inputStream) throws IOException {
        }

        public static k parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static k parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static k parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public interface l extends k.d.c.t0 {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class m extends k.d.c.z<m, a> implements n {
        private static final m DEFAULT_INSTANCE = null;
        public static final int FIELDS_FIELD_NUMBER = 1;
        private static volatile k.d.c.b1<m> PARSER;
        private b0.i<h> fields_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<m, a> implements n {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        private m() {
        }

        public static /* synthetic */ m access$44900() {
        }

        public static /* synthetic */ void access$45000(m mVar, int i2, h hVar) {
        }

        public static /* synthetic */ void access$45100(m mVar, h hVar) {
        }

        public static /* synthetic */ void access$45200(m mVar, int i2, h hVar) {
        }

        public static /* synthetic */ void access$45300(m mVar, Iterable iterable) {
        }

        public static /* synthetic */ void access$45400(m mVar) {
        }

        public static /* synthetic */ void access$45500(m mVar, int i2) {
        }

        private void addAllFields(Iterable<? extends h> iterable) {
        }

        private void addFields(h hVar) {
        }

        private void clearFields() {
        }

        private void ensureFieldsIsMutable() {
        }

        public static m getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static m parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static m parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<m> parser() {
        }

        private void removeFields(int i2) {
        }

        private void setFields(int i2, h hVar) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public h getFields(int i2) {
        }

        public int getFieldsCount() {
        }

        public List<h> getFieldsList() {
        }

        public i getFieldsOrBuilder(int i2) {
        }

        public List<? extends i> getFieldsOrBuilderList() {
        }

        public static a newBuilder(m mVar) {
        }

        public static m parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static m parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static m parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        private void addFields(int i2, h hVar) {
        }

        public static m parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static m parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static m parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static m parseFrom(InputStream inputStream) throws IOException {
        }

        public static m parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static m parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static m parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public interface n extends k.d.c.t0 {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class o extends k.d.c.z<o, a> implements p {
        public static final int COUNT_FIELD_NUMBER = 2;
        public static final int DATA_DATE_FIELD_NUMBER = 5;
        private static final o DEFAULT_INSTANCE = null;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LINES_FIELD_NUMBER = 3;
        private static volatile k.d.c.b1<o> PARSER = null;
        public static final int SUM_FIELD_NUMBER = 4;
        private int bitField0_;
        private int count_;
        private k.d.c.i dataDate_;
        private k.d.c.i id_;
        private b0.i<m> lines_;
        private float sum_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<o, a> implements p {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        private o() {
        }

        public static /* synthetic */ o access$45700() {
        }

        public static /* synthetic */ void access$45800(o oVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$45900(o oVar) {
        }

        public static /* synthetic */ void access$46000(o oVar, int i2) {
        }

        public static /* synthetic */ void access$46100(o oVar) {
        }

        public static /* synthetic */ void access$46200(o oVar, int i2, m mVar) {
        }

        public static /* synthetic */ void access$46300(o oVar, m mVar) {
        }

        public static /* synthetic */ void access$46400(o oVar, int i2, m mVar) {
        }

        public static /* synthetic */ void access$46500(o oVar, Iterable iterable) {
        }

        public static /* synthetic */ void access$46600(o oVar) {
        }

        public static /* synthetic */ void access$46700(o oVar, int i2) {
        }

        public static /* synthetic */ void access$46800(o oVar, float f) {
        }

        public static /* synthetic */ void access$46900(o oVar) {
        }

        public static /* synthetic */ void access$47000(o oVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$47100(o oVar) {
        }

        private void addAllLines(Iterable<? extends m> iterable) {
        }

        private void addLines(m mVar) {
        }

        private void clearCount() {
        }

        private void clearDataDate() {
        }

        private void clearId() {
        }

        private void clearLines() {
        }

        private void clearSum() {
        }

        private void ensureLinesIsMutable() {
        }

        public static o getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static o parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static o parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<o> parser() {
        }

        private void removeLines(int i2) {
        }

        private void setCount(int i2) {
        }

        private void setDataDate(k.d.c.i iVar) {
        }

        private void setId(k.d.c.i iVar) {
        }

        private void setLines(int i2, m mVar) {
        }

        private void setSum(float f) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public int getCount() {
        }

        public k.d.c.i getDataDate() {
        }

        public k.d.c.i getId() {
        }

        public m getLines(int i2) {
        }

        public int getLinesCount() {
        }

        public List<m> getLinesList() {
        }

        public n getLinesOrBuilder(int i2) {
        }

        public List<? extends n> getLinesOrBuilderList() {
        }

        public float getSum() {
        }

        public boolean hasCount() {
        }

        public boolean hasDataDate() {
        }

        public boolean hasId() {
        }

        public boolean hasSum() {
        }

        public static a newBuilder(o oVar) {
        }

        public static o parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static o parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static o parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        private void addLines(int i2, m mVar) {
        }

        public static o parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static o parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static o parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static o parseFrom(InputStream inputStream) throws IOException {
        }

        public static o parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static o parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static o parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public interface p extends k.d.c.t0 {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class q extends k.d.c.z<q, a> implements r {
        private static final q DEFAULT_INSTANCE = null;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile k.d.c.b1<q> PARSER = null;
        public static final int USER_SOURCE_FIELD_NUMBER = 1;
        private int bitField0_;
        private String name_;
        private int userSource_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<q, a> implements r {
            public /* synthetic */ a(q0 q0Var) {
            }

            public a() {
            }
        }

        private q() {
        }

        public static /* synthetic */ q access$60400() {
        }

        public static /* synthetic */ void access$60500(q qVar, int i2) {
        }

        public static /* synthetic */ void access$60600(q qVar) {
        }

        public static /* synthetic */ void access$60700(q qVar, String str) {
        }

        public static /* synthetic */ void access$60800(q qVar) {
        }

        public static /* synthetic */ void access$60900(q qVar, k.d.c.i iVar) {
        }

        private void clearName() {
        }

        private void clearUserSource() {
        }

        public static q getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static q parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static q parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static k.d.c.b1<q> parser() {
        }

        private void setName(String str) {
        }

        private void setNameBytes(k.d.c.i iVar) {
        }

        private void setUserSource(int i2) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public String getName() {
        }

        public k.d.c.i getNameBytes() {
        }

        public int getUserSource() {
        }

        public boolean hasName() {
        }

        public boolean hasUserSource() {
        }

        public static a newBuilder(q qVar) {
        }

        public static q parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static q parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static q parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        public static q parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static q parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static q parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static q parseFrom(InputStream inputStream) throws IOException {
        }

        public static q parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static q parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static q parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public interface r extends k.d.c.t0 {
    }

    private r0() {
    }

    public static /* synthetic */ r0 access$61900() {
    }

    public static /* synthetic */ void access$62000(r0 r0Var, k0 k0Var) {
    }

    public static /* synthetic */ void access$62100(r0 r0Var, k0 k0Var) {
    }

    public static /* synthetic */ void access$62200(r0 r0Var) {
    }

    public static /* synthetic */ void access$62300(r0 r0Var, f fVar) {
    }

    public static /* synthetic */ void access$62400(r0 r0Var, f fVar) {
    }

    public static /* synthetic */ void access$62500(r0 r0Var) {
    }

    public static /* synthetic */ void access$62600(r0 r0Var, c cVar) {
    }

    public static /* synthetic */ void access$62700(r0 r0Var, c cVar) {
    }

    public static /* synthetic */ void access$62800(r0 r0Var) {
    }

    public static /* synthetic */ void access$62900(r0 r0Var, b bVar) {
    }

    public static /* synthetic */ void access$63000(r0 r0Var, b bVar) {
    }

    public static /* synthetic */ void access$63100(r0 r0Var) {
    }

    public static /* synthetic */ void access$63200(r0 r0Var, int i2) {
    }

    public static /* synthetic */ void access$63300(r0 r0Var) {
    }

    public static /* synthetic */ void access$63400(r0 r0Var, int i2) {
    }

    public static /* synthetic */ void access$63500(r0 r0Var) {
    }

    public static /* synthetic */ void access$63600(r0 r0Var, int i2) {
    }

    public static /* synthetic */ void access$63700(r0 r0Var) {
    }

    public static /* synthetic */ void access$63800(r0 r0Var, int i2) {
    }

    public static /* synthetic */ void access$63900(r0 r0Var) {
    }

    public static /* synthetic */ void access$64000(r0 r0Var, boolean z) {
    }

    public static /* synthetic */ void access$64100(r0 r0Var) {
    }

    public static /* synthetic */ void access$64200(r0 r0Var, int i2) {
    }

    public static /* synthetic */ void access$64300(r0 r0Var) {
    }

    public static /* synthetic */ void access$64400(r0 r0Var, boolean z) {
    }

    public static /* synthetic */ void access$64500(r0 r0Var) {
    }

    public static /* synthetic */ void access$64600(r0 r0Var, int i2) {
    }

    public static /* synthetic */ void access$64700(r0 r0Var) {
    }

    public static /* synthetic */ void access$64800(r0 r0Var, boolean z) {
    }

    public static /* synthetic */ void access$64900(r0 r0Var) {
    }

    public static /* synthetic */ void access$65000(r0 r0Var, int i2) {
    }

    public static /* synthetic */ void access$65100(r0 r0Var) {
    }

    public static /* synthetic */ void access$65200(r0 r0Var, int i2) {
    }

    public static /* synthetic */ void access$65300(r0 r0Var) {
    }

    public static /* synthetic */ void access$65400(r0 r0Var, int i2) {
    }

    public static /* synthetic */ void access$65500(r0 r0Var) {
    }

    public static /* synthetic */ void access$65600(r0 r0Var, int i2) {
    }

    public static /* synthetic */ void access$65700(r0 r0Var) {
    }

    public static /* synthetic */ void access$65800(r0 r0Var, a aVar) {
    }

    public static /* synthetic */ void access$65900(r0 r0Var, a aVar) {
    }

    public static /* synthetic */ void access$66000(r0 r0Var) {
    }

    public static /* synthetic */ void access$66100(r0 r0Var, d dVar) {
    }

    public static /* synthetic */ void access$66200(r0 r0Var, d dVar) {
    }

    public static /* synthetic */ void access$66300(r0 r0Var) {
    }

    public static /* synthetic */ void access$66400(r0 r0Var, boolean z) {
    }

    public static /* synthetic */ void access$66500(r0 r0Var) {
    }

    public static /* synthetic */ void access$66600(r0 r0Var, int i2) {
    }

    public static /* synthetic */ void access$66700(r0 r0Var) {
    }

    public static /* synthetic */ void access$66800(r0 r0Var, e eVar) {
    }

    public static /* synthetic */ void access$66900(r0 r0Var, e eVar) {
    }

    public static /* synthetic */ void access$67000(r0 r0Var) {
    }

    public static /* synthetic */ void access$67100(r0 r0Var, String str) {
    }

    public static /* synthetic */ void access$67200(r0 r0Var) {
    }

    public static /* synthetic */ void access$67300(r0 r0Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$67400(r0 r0Var, int i2, k kVar) {
    }

    public static /* synthetic */ void access$67500(r0 r0Var, k kVar) {
    }

    public static /* synthetic */ void access$67600(r0 r0Var, int i2, k kVar) {
    }

    public static /* synthetic */ void access$67700(r0 r0Var, Iterable iterable) {
    }

    public static /* synthetic */ void access$67800(r0 r0Var) {
    }

    public static /* synthetic */ void access$67900(r0 r0Var, int i2) {
    }

    public static /* synthetic */ void access$68000(r0 r0Var, int i2, q qVar) {
    }

    public static /* synthetic */ void access$68100(r0 r0Var, q qVar) {
    }

    public static /* synthetic */ void access$68200(r0 r0Var, int i2, q qVar) {
    }

    public static /* synthetic */ void access$68300(r0 r0Var, Iterable iterable) {
    }

    public static /* synthetic */ void access$68400(r0 r0Var) {
    }

    public static /* synthetic */ void access$68500(r0 r0Var, int i2) {
    }

    public static /* synthetic */ void access$68600(r0 r0Var, j jVar) {
    }

    public static /* synthetic */ void access$68700(r0 r0Var, j jVar) {
    }

    public static /* synthetic */ void access$68800(r0 r0Var) {
    }

    private void addAllJumpList(Iterable<? extends k> iterable) {
    }

    private void addAllUserSourceList(Iterable<? extends q> iterable) {
    }

    private void addJumpList(k kVar) {
    }

    private void addUserSourceList(q qVar) {
    }

    private void clearAllArticleStatSource() {
    }

    private void clearAllArticleStatTendency() {
    }

    private void clearBaseResp() {
    }

    private void clearBody() {
    }

    private void clearFinishReadRate() {
    }

    private void clearJumpList() {
    }

    private void clearOneArticleBaseInfo() {
    }

    private void clearOneArticleCanReward() {
    }

    private void clearOneArticleCommentNum() {
    }

    private void clearOneArticleFinderStatInfo() {
    }

    private void clearOneArticleIsPayread() {
    }

    private void clearOneArticleLikeNum() {
    }

    private void clearOneArticleOldLikeNum() {
    }

    private void clearOneArticleOpenComment() {
    }

    private void clearOneArticlePayreadCount() {
    }

    private void clearOneArticleReadNum() {
    }

    private void clearOneArticleRewardMoney() {
    }

    private void clearOneArticleRewardNum() {
    }

    private void clearOneArticleSubscribeNumAfterRead() {
    }

    private void clearOneArticleSummaryStatMiss() {
    }

    private void clearOneArticleTendency() {
    }

    private void clearOneArticleTotalReadPv() {
    }

    private void clearOneArticleTotalSharePv() {
    }

    private void clearOneArticleTransformData() {
    }

    private void clearUserSourceList() {
    }

    private void clearYesterdayFinishReadPv() {
    }

    private void ensureJumpListIsMutable() {
    }

    private void ensureUserSourceListIsMutable() {
    }

    public static r0 getDefaultInstance() {
    }

    private void mergeAllArticleStatSource(b bVar) {
    }

    private void mergeAllArticleStatTendency(c cVar) {
    }

    private void mergeBaseResp(k0 k0Var) {
    }

    private void mergeBody(f fVar) {
    }

    private void mergeOneArticleBaseInfo(a aVar) {
    }

    private void mergeOneArticleFinderStatInfo(j jVar) {
    }

    private void mergeOneArticleTendency(d dVar) {
    }

    private void mergeOneArticleTransformData(e eVar) {
    }

    public static g newBuilder() {
    }

    public static r0 parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static r0 parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static k.d.c.b1<r0> parser() {
    }

    private void removeJumpList(int i2) {
    }

    private void removeUserSourceList(int i2) {
    }

    private void setAllArticleStatSource(b bVar) {
    }

    private void setAllArticleStatTendency(c cVar) {
    }

    private void setBaseResp(k0 k0Var) {
    }

    private void setBody(f fVar) {
    }

    private void setFinishReadRate(String str) {
    }

    private void setFinishReadRateBytes(k.d.c.i iVar) {
    }

    private void setJumpList(int i2, k kVar) {
    }

    private void setOneArticleBaseInfo(a aVar) {
    }

    private void setOneArticleCanReward(boolean z) {
    }

    private void setOneArticleCommentNum(int i2) {
    }

    private void setOneArticleFinderStatInfo(j jVar) {
    }

    private void setOneArticleIsPayread(boolean z) {
    }

    private void setOneArticleLikeNum(int i2) {
    }

    private void setOneArticleOldLikeNum(int i2) {
    }

    private void setOneArticleOpenComment(boolean z) {
    }

    private void setOneArticlePayreadCount(int i2) {
    }

    private void setOneArticleReadNum(int i2) {
    }

    private void setOneArticleRewardMoney(int i2) {
    }

    private void setOneArticleRewardNum(int i2) {
    }

    private void setOneArticleSubscribeNumAfterRead(int i2) {
    }

    private void setOneArticleSummaryStatMiss(boolean z) {
    }

    private void setOneArticleTendency(d dVar) {
    }

    private void setOneArticleTotalReadPv(int i2) {
    }

    private void setOneArticleTotalSharePv(int i2) {
    }

    private void setOneArticleTransformData(e eVar) {
    }

    private void setUserSourceList(int i2, q qVar) {
    }

    private void setYesterdayFinishReadPv(int i2) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public b getAllArticleStatSource() {
    }

    public c getAllArticleStatTendency() {
    }

    public k0 getBaseResp() {
    }

    public f getBody() {
    }

    public String getFinishReadRate() {
    }

    public k.d.c.i getFinishReadRateBytes() {
    }

    public k getJumpList(int i2) {
    }

    public int getJumpListCount() {
    }

    public List<k> getJumpListList() {
    }

    public l getJumpListOrBuilder(int i2) {
    }

    public List<? extends l> getJumpListOrBuilderList() {
    }

    public a getOneArticleBaseInfo() {
    }

    public boolean getOneArticleCanReward() {
    }

    public int getOneArticleCommentNum() {
    }

    public j getOneArticleFinderStatInfo() {
    }

    public boolean getOneArticleIsPayread() {
    }

    public int getOneArticleLikeNum() {
    }

    public int getOneArticleOldLikeNum() {
    }

    public boolean getOneArticleOpenComment() {
    }

    public int getOneArticlePayreadCount() {
    }

    public int getOneArticleReadNum() {
    }

    public int getOneArticleRewardMoney() {
    }

    public int getOneArticleRewardNum() {
    }

    public int getOneArticleSubscribeNumAfterRead() {
    }

    public boolean getOneArticleSummaryStatMiss() {
    }

    public d getOneArticleTendency() {
    }

    public int getOneArticleTotalReadPv() {
    }

    public int getOneArticleTotalSharePv() {
    }

    public e getOneArticleTransformData() {
    }

    public q getUserSourceList(int i2) {
    }

    public int getUserSourceListCount() {
    }

    public List<q> getUserSourceListList() {
    }

    public r getUserSourceListOrBuilder(int i2) {
    }

    public List<? extends r> getUserSourceListOrBuilderList() {
    }

    public int getYesterdayFinishReadPv() {
    }

    public boolean hasAllArticleStatSource() {
    }

    public boolean hasAllArticleStatTendency() {
    }

    public boolean hasBaseResp() {
    }

    public boolean hasBody() {
    }

    public boolean hasFinishReadRate() {
    }

    public boolean hasOneArticleBaseInfo() {
    }

    public boolean hasOneArticleCanReward() {
    }

    public boolean hasOneArticleCommentNum() {
    }

    public boolean hasOneArticleFinderStatInfo() {
    }

    public boolean hasOneArticleIsPayread() {
    }

    public boolean hasOneArticleLikeNum() {
    }

    public boolean hasOneArticleOldLikeNum() {
    }

    public boolean hasOneArticleOpenComment() {
    }

    public boolean hasOneArticlePayreadCount() {
    }

    public boolean hasOneArticleReadNum() {
    }

    public boolean hasOneArticleRewardMoney() {
    }

    public boolean hasOneArticleRewardNum() {
    }

    public boolean hasOneArticleSubscribeNumAfterRead() {
    }

    public boolean hasOneArticleSummaryStatMiss() {
    }

    public boolean hasOneArticleTendency() {
    }

    public boolean hasOneArticleTotalReadPv() {
    }

    public boolean hasOneArticleTotalSharePv() {
    }

    public boolean hasOneArticleTransformData() {
    }

    public boolean hasYesterdayFinishReadPv() {
    }

    public static g newBuilder(r0 r0Var) {
    }

    public static r0 parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static r0 parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static r0 parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    private void addJumpList(int i2, k kVar) {
    }

    private void addUserSourceList(int i2, q qVar) {
    }

    public static r0 parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static r0 parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static r0 parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static r0 parseFrom(InputStream inputStream) throws IOException {
    }

    public static r0 parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static r0 parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static r0 parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }
}
