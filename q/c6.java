package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class c6 extends k.d.c.z<c6, a> implements Object {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int BASE_REQ_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 10;
    private static final c6 DEFAULT_INSTANCE = null;
    public static final int DESC_FIELD_NUMBER = 13;
    public static final int FILENAME_FIELD_NUMBER = 3;
    public static final int FILESHA_FIELD_NUMBER = 4;
    public static final int FILESIZE_FIELD_NUMBER = 5;
    public static final int HEIGHT_FIELD_NUMBER = 16;
    public static final int MAX_PART_SIZE_FIELD_NUMBER = 6;
    private static volatile k.d.c.b1<c6> PARSER = null;
    public static final int PART_NUM_FIELD_NUMBER = 9;
    public static final int PART_SHA_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 12;
    public static final int USE_APPVIDEO_ORI_FLAG_FIELD_NUMBER = 14;
    public static final int VIDEO_DURATION_FIELD_NUMBER = 11;
    public static final int VID_FIELD_NUMBER = 8;
    public static final int WIDTH_FIELD_NUMBER = 15;
    private String action_;
    private j0 baseReq_;
    private int bitField0_;
    private k.d.c.i data_;
    private String desc_;
    private String filename_;
    private String filesha_;
    private long filesize_;
    private int height_;
    private int maxPartSize_;
    private byte memoizedIsInitialized;
    private int partNum_;
    private String partSha_;
    private String title_;
    private int useAppvideoOriFlag_;
    private String vid_;
    private int videoDuration_;
    private int width_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<c6, a> implements Object {
        public /* synthetic */ a(a3 a3Var) {
        }

        public a A(String str) {
        }

        public a B(long j2) {
        }

        public a C(int i2) {
        }

        public a D(int i2) {
        }

        public a E(int i2) {
        }

        public a F(String str) {
        }

        public a G(String str) {
        }

        public a H(int i2) {
        }

        public a I(String str) {
        }

        public a J(int i2) {
        }

        public a K(int i2) {
        }

        public a v(String str) {
        }

        public a w(j0 j0Var) {
        }

        public a x(k.d.c.i iVar) {
        }

        public a y(String str) {
        }

        public a z(String str) {
        }

        public a() {
        }
    }

    private c6() {
    }

    public static /* synthetic */ c6 access$81700() {
    }

    public static /* synthetic */ void access$81800(c6 c6Var, j0 j0Var) {
    }

    public static /* synthetic */ void access$81900(c6 c6Var, j0 j0Var) {
    }

    public static /* synthetic */ void access$82000(c6 c6Var) {
    }

    public static /* synthetic */ void access$82100(c6 c6Var, String str) {
    }

    public static /* synthetic */ void access$82200(c6 c6Var) {
    }

    public static /* synthetic */ void access$82300(c6 c6Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$82400(c6 c6Var, String str) {
    }

    public static /* synthetic */ void access$82500(c6 c6Var) {
    }

    public static /* synthetic */ void access$82600(c6 c6Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$82700(c6 c6Var, String str) {
    }

    public static /* synthetic */ void access$82800(c6 c6Var) {
    }

    public static /* synthetic */ void access$82900(c6 c6Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$83000(c6 c6Var, long j2) {
    }

    public static /* synthetic */ void access$83100(c6 c6Var) {
    }

    public static /* synthetic */ void access$83200(c6 c6Var, int i2) {
    }

    public static /* synthetic */ void access$83300(c6 c6Var) {
    }

    public static /* synthetic */ void access$83400(c6 c6Var, String str) {
    }

    public static /* synthetic */ void access$83500(c6 c6Var) {
    }

    public static /* synthetic */ void access$83600(c6 c6Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$83700(c6 c6Var, String str) {
    }

    public static /* synthetic */ void access$83800(c6 c6Var) {
    }

    public static /* synthetic */ void access$83900(c6 c6Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$84000(c6 c6Var, int i2) {
    }

    public static /* synthetic */ void access$84100(c6 c6Var) {
    }

    public static /* synthetic */ void access$84200(c6 c6Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$84300(c6 c6Var) {
    }

    public static /* synthetic */ void access$84400(c6 c6Var, int i2) {
    }

    public static /* synthetic */ void access$84500(c6 c6Var) {
    }

    public static /* synthetic */ void access$84600(c6 c6Var, String str) {
    }

    public static /* synthetic */ void access$84700(c6 c6Var) {
    }

    public static /* synthetic */ void access$84800(c6 c6Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$84900(c6 c6Var, String str) {
    }

    public static /* synthetic */ void access$85000(c6 c6Var) {
    }

    public static /* synthetic */ void access$85100(c6 c6Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$85200(c6 c6Var, int i2) {
    }

    public static /* synthetic */ void access$85300(c6 c6Var) {
    }

    public static /* synthetic */ void access$85400(c6 c6Var, int i2) {
    }

    public static /* synthetic */ void access$85500(c6 c6Var) {
    }

    public static /* synthetic */ void access$85600(c6 c6Var, int i2) {
    }

    public static /* synthetic */ void access$85700(c6 c6Var) {
    }

    private void clearAction() {
    }

    private void clearBaseReq() {
    }

    private void clearData() {
    }

    private void clearDesc() {
    }

    private void clearFilename() {
    }

    private void clearFilesha() {
    }

    private void clearFilesize() {
    }

    private void clearHeight() {
    }

    private void clearMaxPartSize() {
    }

    private void clearPartNum() {
    }

    private void clearPartSha() {
    }

    private void clearTitle() {
    }

    private void clearUseAppvideoOriFlag() {
    }

    private void clearVid() {
    }

    private void clearVideoDuration() {
    }

    private void clearWidth() {
    }

    public static c6 getDefaultInstance() {
    }

    private void mergeBaseReq(j0 j0Var) {
    }

    public static a newBuilder() {
    }

    public static c6 parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static c6 parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static k.d.c.b1<c6> parser() {
    }

    private void setAction(String str) {
    }

    private void setActionBytes(k.d.c.i iVar) {
    }

    private void setBaseReq(j0 j0Var) {
    }

    private void setData(k.d.c.i iVar) {
    }

    private void setDesc(String str) {
    }

    private void setDescBytes(k.d.c.i iVar) {
    }

    private void setFilename(String str) {
    }

    private void setFilenameBytes(k.d.c.i iVar) {
    }

    private void setFilesha(String str) {
    }

    private void setFileshaBytes(k.d.c.i iVar) {
    }

    private void setFilesize(long j2) {
    }

    private void setHeight(int i2) {
    }

    private void setMaxPartSize(int i2) {
    }

    private void setPartNum(int i2) {
    }

    private void setPartSha(String str) {
    }

    private void setPartShaBytes(k.d.c.i iVar) {
    }

    private void setTitle(String str) {
    }

    private void setTitleBytes(k.d.c.i iVar) {
    }

    private void setUseAppvideoOriFlag(int i2) {
    }

    private void setVid(String str) {
    }

    private void setVidBytes(k.d.c.i iVar) {
    }

    private void setVideoDuration(int i2) {
    }

    private void setWidth(int i2) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public String getAction() {
    }

    public k.d.c.i getActionBytes() {
    }

    public j0 getBaseReq() {
    }

    public k.d.c.i getData() {
    }

    public String getDesc() {
    }

    public k.d.c.i getDescBytes() {
    }

    public String getFilename() {
    }

    public k.d.c.i getFilenameBytes() {
    }

    public String getFilesha() {
    }

    public k.d.c.i getFileshaBytes() {
    }

    public long getFilesize() {
    }

    public int getHeight() {
    }

    public int getMaxPartSize() {
    }

    public int getPartNum() {
    }

    public String getPartSha() {
    }

    public k.d.c.i getPartShaBytes() {
    }

    public String getTitle() {
    }

    public k.d.c.i getTitleBytes() {
    }

    public int getUseAppvideoOriFlag() {
    }

    public String getVid() {
    }

    public k.d.c.i getVidBytes() {
    }

    public int getVideoDuration() {
    }

    public int getWidth() {
    }

    public boolean hasAction() {
    }

    public boolean hasBaseReq() {
    }

    public boolean hasData() {
    }

    public boolean hasDesc() {
    }

    public boolean hasFilename() {
    }

    public boolean hasFilesha() {
    }

    public boolean hasFilesize() {
    }

    public boolean hasHeight() {
    }

    public boolean hasMaxPartSize() {
    }

    public boolean hasPartNum() {
    }

    public boolean hasPartSha() {
    }

    public boolean hasTitle() {
    }

    public boolean hasUseAppvideoOriFlag() {
    }

    public boolean hasVid() {
    }

    public boolean hasVideoDuration() {
    }

    public boolean hasWidth() {
    }

    public static a newBuilder(c6 c6Var) {
    }

    public static c6 parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static c6 parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static c6 parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static c6 parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static c6 parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static c6 parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static c6 parseFrom(InputStream inputStream) throws IOException {
    }

    public static c6 parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static c6 parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static c6 parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }
}
