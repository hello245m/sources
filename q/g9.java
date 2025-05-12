package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k.d.c.b0;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class g9 extends k.d.c.z<g9, a> implements l9 {
    private static final g9 DEFAULT_INSTANCE = null;
    public static final int DESC_FIELD_NUMBER = 3;
    public static final int EXPORT_ID_FIELD_NUMBER = 4;
    public static final int EXT_FLAG_FIELD_NUMBER = 8;
    public static final int HEAD_URL_FIELD_NUMBER = 2;
    public static final int INVALID_FLAG_FIELD_NUMBER = 11;
    public static final int MEDIA_FIELD_NUMBER = 6;
    public static final int MEDIA_NUM_FIELD_NUMBER = 10;
    public static final int NICKNAME_FIELD_NUMBER = 9;
    public static final int NONCE_ID_FIELD_NUMBER = 5;
    private static volatile k.d.c.b1<g9> PARSER = null;
    public static final int SPAM_FLAG_FIELD_NUMBER = 7;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private String desc_;
    private String exportId_;
    private int extFlag_;
    private String headUrl_;
    private int invalidFlag_;
    private int mediaNum_;
    private b0.i<b> media_;
    private String nickname_;
    private String nonceId_;
    private int spamFlag_;
    private String username_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<g9, a> implements l9 {
        public a() {
        }

        public /* synthetic */ a(k6 k6Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class b extends k.d.c.z<b, a> implements c {
        public static final int COVER_URL_FIELD_NUMBER = 3;
        private static final b DEFAULT_INSTANCE = null;
        public static final int FULL_COVER_URL_FIELD_NUMBER = 6;
        public static final int FULL_HEIGHT_FIELD_NUMBER = 8;
        public static final int FULL_WIDTH_FIELD_NUMBER = 7;
        public static final int HEIGHT_FIELD_NUMBER = 5;
        public static final int MEDIA_TYPE_FIELD_NUMBER = 2;
        private static volatile k.d.c.b1<b> PARSER = null;
        public static final int THUMB_URL_FIELD_NUMBER = 1;
        public static final int WIDTH_FIELD_NUMBER = 4;
        private int bitField0_;
        private String coverUrl_;
        private String fullCoverUrl_;
        private float fullHeight_;
        private float fullWidth_;
        private float height_;
        private int mediaType_;
        private String thumbUrl_;
        private float width_;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
        public static final class a extends z.b<b, a> implements c {
            public a() {
            }

            public /* synthetic */ a(k6 k6Var) {
            }
        }

        private b() {
        }

        public static /* synthetic */ b access$298400() {
        }

        public static /* synthetic */ void access$298500(b bVar, String str) {
        }

        public static /* synthetic */ void access$298600(b bVar) {
        }

        public static /* synthetic */ void access$298700(b bVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$298800(b bVar, int i2) {
        }

        public static /* synthetic */ void access$298900(b bVar) {
        }

        public static /* synthetic */ void access$299000(b bVar, String str) {
        }

        public static /* synthetic */ void access$299100(b bVar) {
        }

        public static /* synthetic */ void access$299200(b bVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$299300(b bVar, float f) {
        }

        public static /* synthetic */ void access$299400(b bVar) {
        }

        public static /* synthetic */ void access$299500(b bVar, float f) {
        }

        public static /* synthetic */ void access$299600(b bVar) {
        }

        public static /* synthetic */ void access$299700(b bVar, String str) {
        }

        public static /* synthetic */ void access$299800(b bVar) {
        }

        public static /* synthetic */ void access$299900(b bVar, k.d.c.i iVar) {
        }

        public static /* synthetic */ void access$300000(b bVar, float f) {
        }

        public static /* synthetic */ void access$300100(b bVar) {
        }

        public static /* synthetic */ void access$300200(b bVar, float f) {
        }

        public static /* synthetic */ void access$300300(b bVar) {
        }

        private void clearCoverUrl() {
        }

        private void clearFullCoverUrl() {
        }

        private void clearFullHeight() {
        }

        private void clearFullWidth() {
        }

        private void clearHeight() {
        }

        private void clearMediaType() {
        }

        private void clearThumbUrl() {
        }

        private void clearWidth() {
        }

        public static b getDefaultInstance() {
        }

        public static a newBuilder() {
        }

        public static a newBuilder(b bVar) {
        }

        public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static b parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static b parseFrom(InputStream inputStream) throws IOException {
        }

        public static b parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
        }

        public static b parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
        }

        public static b parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static b parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
        }

        public static b parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static b parseFrom(k.d.c.j jVar) throws IOException {
        }

        public static b parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
        }

        public static b parseFrom(byte[] bArr) throws k.d.c.c0 {
        }

        public static b parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
        }

        public static k.d.c.b1<b> parser() {
        }

        private void setCoverUrl(String str) {
        }

        private void setCoverUrlBytes(k.d.c.i iVar) {
        }

        private void setFullCoverUrl(String str) {
        }

        private void setFullCoverUrlBytes(k.d.c.i iVar) {
        }

        private void setFullHeight(float f) {
        }

        private void setFullWidth(float f) {
        }

        private void setHeight(float f) {
        }

        private void setMediaType(int i2) {
        }

        private void setThumbUrl(String str) {
        }

        private void setThumbUrlBytes(k.d.c.i iVar) {
        }

        private void setWidth(float f) {
        }

        @Override // k.d.c.z
        public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
        }

        public String getCoverUrl() {
        }

        public k.d.c.i getCoverUrlBytes() {
        }

        public String getFullCoverUrl() {
        }

        public k.d.c.i getFullCoverUrlBytes() {
        }

        public float getFullHeight() {
        }

        public float getFullWidth() {
        }

        public float getHeight() {
        }

        public int getMediaType() {
        }

        public String getThumbUrl() {
        }

        public k.d.c.i getThumbUrlBytes() {
        }

        public float getWidth() {
        }

        public boolean hasCoverUrl() {
        }

        public boolean hasFullCoverUrl() {
        }

        public boolean hasFullHeight() {
        }

        public boolean hasFullWidth() {
        }

        public boolean hasHeight() {
        }

        public boolean hasMediaType() {
        }

        public boolean hasThumbUrl() {
        }

        public boolean hasWidth() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public interface c extends k.d.c.t0 {
    }

    private g9() {
    }

    public static /* synthetic */ g9 access$300500() {
    }

    public static /* synthetic */ void access$300600(g9 g9Var, String str) {
    }

    public static /* synthetic */ void access$300700(g9 g9Var) {
    }

    public static /* synthetic */ void access$300800(g9 g9Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$300900(g9 g9Var, String str) {
    }

    public static /* synthetic */ void access$301000(g9 g9Var) {
    }

    public static /* synthetic */ void access$301100(g9 g9Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$301200(g9 g9Var, String str) {
    }

    public static /* synthetic */ void access$301300(g9 g9Var) {
    }

    public static /* synthetic */ void access$301400(g9 g9Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$301500(g9 g9Var, String str) {
    }

    public static /* synthetic */ void access$301600(g9 g9Var) {
    }

    public static /* synthetic */ void access$301700(g9 g9Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$301800(g9 g9Var, String str) {
    }

    public static /* synthetic */ void access$301900(g9 g9Var) {
    }

    public static /* synthetic */ void access$302000(g9 g9Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$302100(g9 g9Var, int i2, b bVar) {
    }

    public static /* synthetic */ void access$302200(g9 g9Var, b bVar) {
    }

    public static /* synthetic */ void access$302300(g9 g9Var, int i2, b bVar) {
    }

    public static /* synthetic */ void access$302400(g9 g9Var, Iterable iterable) {
    }

    public static /* synthetic */ void access$302500(g9 g9Var) {
    }

    public static /* synthetic */ void access$302600(g9 g9Var, int i2) {
    }

    public static /* synthetic */ void access$302700(g9 g9Var, int i2) {
    }

    public static /* synthetic */ void access$302800(g9 g9Var) {
    }

    public static /* synthetic */ void access$302900(g9 g9Var, int i2) {
    }

    public static /* synthetic */ void access$303000(g9 g9Var) {
    }

    public static /* synthetic */ void access$303100(g9 g9Var, String str) {
    }

    public static /* synthetic */ void access$303200(g9 g9Var) {
    }

    public static /* synthetic */ void access$303300(g9 g9Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$303400(g9 g9Var, int i2) {
    }

    public static /* synthetic */ void access$303500(g9 g9Var) {
    }

    public static /* synthetic */ void access$303600(g9 g9Var, int i2) {
    }

    public static /* synthetic */ void access$303700(g9 g9Var) {
    }

    private void addAllMedia(Iterable<? extends b> iterable) {
    }

    private void addMedia(int i2, b bVar) {
    }

    private void addMedia(b bVar) {
    }

    private void clearDesc() {
    }

    private void clearExportId() {
    }

    private void clearExtFlag() {
    }

    private void clearHeadUrl() {
    }

    private void clearInvalidFlag() {
    }

    private void clearMedia() {
    }

    private void clearMediaNum() {
    }

    private void clearNickname() {
    }

    private void clearNonceId() {
    }

    private void clearSpamFlag() {
    }

    private void clearUsername() {
    }

    private void ensureMediaIsMutable() {
    }

    public static g9 getDefaultInstance() {
    }

    public static a newBuilder() {
    }

    public static a newBuilder(g9 g9Var) {
    }

    public static g9 parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static g9 parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static g9 parseFrom(InputStream inputStream) throws IOException {
    }

    public static g9 parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static g9 parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static g9 parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static g9 parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static g9 parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static g9 parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static g9 parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }

    public static g9 parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static g9 parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static k.d.c.b1<g9> parser() {
    }

    private void removeMedia(int i2) {
    }

    private void setDesc(String str) {
    }

    private void setDescBytes(k.d.c.i iVar) {
    }

    private void setExportId(String str) {
    }

    private void setExportIdBytes(k.d.c.i iVar) {
    }

    private void setExtFlag(int i2) {
    }

    private void setHeadUrl(String str) {
    }

    private void setHeadUrlBytes(k.d.c.i iVar) {
    }

    private void setInvalidFlag(int i2) {
    }

    private void setMedia(int i2, b bVar) {
    }

    private void setMediaNum(int i2) {
    }

    private void setNickname(String str) {
    }

    private void setNicknameBytes(k.d.c.i iVar) {
    }

    private void setNonceId(String str) {
    }

    private void setNonceIdBytes(k.d.c.i iVar) {
    }

    private void setSpamFlag(int i2) {
    }

    private void setUsername(String str) {
    }

    private void setUsernameBytes(k.d.c.i iVar) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public String getDesc() {
    }

    public k.d.c.i getDescBytes() {
    }

    public String getExportId() {
    }

    public k.d.c.i getExportIdBytes() {
    }

    public int getExtFlag() {
    }

    public String getHeadUrl() {
    }

    public k.d.c.i getHeadUrlBytes() {
    }

    public int getInvalidFlag() {
    }

    public b getMedia(int i2) {
    }

    public int getMediaCount() {
    }

    public List<b> getMediaList() {
    }

    public int getMediaNum() {
    }

    public c getMediaOrBuilder(int i2) {
    }

    public List<? extends c> getMediaOrBuilderList() {
    }

    public String getNickname() {
    }

    public k.d.c.i getNicknameBytes() {
    }

    public String getNonceId() {
    }

    public k.d.c.i getNonceIdBytes() {
    }

    public int getSpamFlag() {
    }

    public String getUsername() {
    }

    public k.d.c.i getUsernameBytes() {
    }

    public boolean hasDesc() {
    }

    public boolean hasExportId() {
    }

    public boolean hasExtFlag() {
    }

    public boolean hasHeadUrl() {
    }

    public boolean hasInvalidFlag() {
    }

    public boolean hasMediaNum() {
    }

    public boolean hasNickname() {
    }

    public boolean hasNonceId() {
    }

    public boolean hasSpamFlag() {
    }

    public boolean hasUsername() {
    }
}
