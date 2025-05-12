package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class ob extends k.d.c.z<ob, a> implements pb {
    public static final int AESKEY_FIELD_NUMBER = 1;
    public static final int COLOR_FIELD_NUMBER = 16;
    public static final int CRYPT_VER_FIELD_NUMBER = 2;
    private static final ob DEFAULT_INSTANCE = null;
    public static final int FILEID_FIELD_NUMBER = 9;
    public static final int FORMAT_FIELD_NUMBER = 12;
    public static final int HD_SIZE_FIELD_NUMBER = 4;
    public static final int HEIGHT_FIELD_NUMBER = 14;
    public static final int HTTP_URL_FIELD_NUMBER = 13;
    public static final int MEDIAID_FIELD_NUMBER = 10;
    public static final int MID_SIZE_FIELD_NUMBER = 5;
    private static volatile k.d.c.b1<ob> PARSER = null;
    public static final int THUMB_HEIGHT_FIELD_NUMBER = 7;
    public static final int THUMB_MEDIAID_FIELD_NUMBER = 11;
    public static final int THUMB_SIZE_FIELD_NUMBER = 6;
    public static final int THUMB_WIDTH_FIELD_NUMBER = 8;
    public static final int URL_FIELD_NUMBER = 3;
    public static final int WIDTH_FIELD_NUMBER = 15;
    private String aeskey_;
    private int bitField0_;
    private h7 color_;
    private int cryptVer_;
    private int fileid_;
    private String format_;
    private int hdSize_;
    private int height_;
    private String httpUrl_;
    private String mediaid_;
    private int midSize_;
    private int thumbHeight_;
    private String thumbMediaid_;
    private int thumbSize_;
    private int thumbWidth_;
    private String url_;
    private int width_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<ob, a> implements pb {
        public /* synthetic */ a(k6 k6Var) {
        }

        public a A(int i2) {
        }

        public a B(String str) {
        }

        public a C(String str) {
        }

        public a D(int i2) {
        }

        public a E(int i2) {
        }

        public a F(String str) {
        }

        public a G(int i2) {
        }

        public a H(int i2) {
        }

        public a I(String str) {
        }

        public a J(int i2) {
        }

        public a v(String str) {
        }

        public a w(int i2) {
        }

        public a x(int i2) {
        }

        public a y(String str) {
        }

        public a z(int i2) {
        }

        public a() {
        }
    }

    private ob() {
    }

    public static /* synthetic */ ob access$34200() {
    }

    public static /* synthetic */ void access$34300(ob obVar, String str) {
    }

    public static /* synthetic */ void access$34400(ob obVar) {
    }

    public static /* synthetic */ void access$34500(ob obVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$34600(ob obVar, int i2) {
    }

    public static /* synthetic */ void access$34700(ob obVar) {
    }

    public static /* synthetic */ void access$34800(ob obVar, String str) {
    }

    public static /* synthetic */ void access$34900(ob obVar) {
    }

    public static /* synthetic */ void access$35000(ob obVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$35100(ob obVar, int i2) {
    }

    public static /* synthetic */ void access$35200(ob obVar) {
    }

    public static /* synthetic */ void access$35300(ob obVar, int i2) {
    }

    public static /* synthetic */ void access$35400(ob obVar) {
    }

    public static /* synthetic */ void access$35500(ob obVar, int i2) {
    }

    public static /* synthetic */ void access$35600(ob obVar) {
    }

    public static /* synthetic */ void access$35700(ob obVar, int i2) {
    }

    public static /* synthetic */ void access$35800(ob obVar) {
    }

    public static /* synthetic */ void access$35900(ob obVar, int i2) {
    }

    public static /* synthetic */ void access$36000(ob obVar) {
    }

    public static /* synthetic */ void access$36100(ob obVar, int i2) {
    }

    public static /* synthetic */ void access$36200(ob obVar) {
    }

    public static /* synthetic */ void access$36300(ob obVar, String str) {
    }

    public static /* synthetic */ void access$36400(ob obVar) {
    }

    public static /* synthetic */ void access$36500(ob obVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$36600(ob obVar, String str) {
    }

    public static /* synthetic */ void access$36700(ob obVar) {
    }

    public static /* synthetic */ void access$36800(ob obVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$36900(ob obVar, String str) {
    }

    public static /* synthetic */ void access$37000(ob obVar) {
    }

    public static /* synthetic */ void access$37100(ob obVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$37200(ob obVar, String str) {
    }

    public static /* synthetic */ void access$37300(ob obVar) {
    }

    public static /* synthetic */ void access$37400(ob obVar, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$37500(ob obVar, int i2) {
    }

    public static /* synthetic */ void access$37600(ob obVar) {
    }

    public static /* synthetic */ void access$37700(ob obVar, int i2) {
    }

    public static /* synthetic */ void access$37800(ob obVar) {
    }

    public static /* synthetic */ void access$37900(ob obVar, h7 h7Var) {
    }

    public static /* synthetic */ void access$38000(ob obVar, h7 h7Var) {
    }

    public static /* synthetic */ void access$38100(ob obVar) {
    }

    private void clearAeskey() {
    }

    private void clearColor() {
    }

    private void clearCryptVer() {
    }

    private void clearFileid() {
    }

    private void clearFormat() {
    }

    private void clearHdSize() {
    }

    private void clearHeight() {
    }

    private void clearHttpUrl() {
    }

    private void clearMediaid() {
    }

    private void clearMidSize() {
    }

    private void clearThumbHeight() {
    }

    private void clearThumbMediaid() {
    }

    private void clearThumbSize() {
    }

    private void clearThumbWidth() {
    }

    private void clearUrl() {
    }

    private void clearWidth() {
    }

    public static ob getDefaultInstance() {
    }

    private void mergeColor(h7 h7Var) {
    }

    public static a newBuilder() {
    }

    public static ob parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static ob parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static k.d.c.b1<ob> parser() {
    }

    private void setAeskey(String str) {
    }

    private void setAeskeyBytes(k.d.c.i iVar) {
    }

    private void setColor(h7 h7Var) {
    }

    private void setCryptVer(int i2) {
    }

    private void setFileid(int i2) {
    }

    private void setFormat(String str) {
    }

    private void setFormatBytes(k.d.c.i iVar) {
    }

    private void setHdSize(int i2) {
    }

    private void setHeight(int i2) {
    }

    private void setHttpUrl(String str) {
    }

    private void setHttpUrlBytes(k.d.c.i iVar) {
    }

    private void setMediaid(String str) {
    }

    private void setMediaidBytes(k.d.c.i iVar) {
    }

    private void setMidSize(int i2) {
    }

    private void setThumbHeight(int i2) {
    }

    private void setThumbMediaid(String str) {
    }

    private void setThumbMediaidBytes(k.d.c.i iVar) {
    }

    private void setThumbSize(int i2) {
    }

    private void setThumbWidth(int i2) {
    }

    private void setUrl(String str) {
    }

    private void setUrlBytes(k.d.c.i iVar) {
    }

    private void setWidth(int i2) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public String getAeskey() {
    }

    public k.d.c.i getAeskeyBytes() {
    }

    public h7 getColor() {
    }

    public int getCryptVer() {
    }

    public int getFileid() {
    }

    public String getFormat() {
    }

    public k.d.c.i getFormatBytes() {
    }

    public int getHdSize() {
    }

    public int getHeight() {
    }

    public String getHttpUrl() {
    }

    public k.d.c.i getHttpUrlBytes() {
    }

    public String getMediaid() {
    }

    public k.d.c.i getMediaidBytes() {
    }

    public int getMidSize() {
    }

    public int getThumbHeight() {
    }

    public String getThumbMediaid() {
    }

    public k.d.c.i getThumbMediaidBytes() {
    }

    public int getThumbSize() {
    }

    public int getThumbWidth() {
    }

    public String getUrl() {
    }

    public k.d.c.i getUrlBytes() {
    }

    public int getWidth() {
    }

    public boolean hasAeskey() {
    }

    public boolean hasColor() {
    }

    public boolean hasCryptVer() {
    }

    public boolean hasFileid() {
    }

    public boolean hasFormat() {
    }

    public boolean hasHdSize() {
    }

    public boolean hasHeight() {
    }

    public boolean hasHttpUrl() {
    }

    public boolean hasMediaid() {
    }

    public boolean hasMidSize() {
    }

    public boolean hasThumbHeight() {
    }

    public boolean hasThumbMediaid() {
    }

    public boolean hasThumbSize() {
    }

    public boolean hasThumbWidth() {
    }

    public boolean hasUrl() {
    }

    public boolean hasWidth() {
    }

    public static a newBuilder(ob obVar) {
    }

    public static ob parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static ob parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static ob parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    public static ob parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static ob parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static ob parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static ob parseFrom(InputStream inputStream) throws IOException {
    }

    public static ob parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static ob parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static ob parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }
}
