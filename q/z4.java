package q;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k.d.c.b0;
import k.d.c.z;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
public final class z4 extends k.d.c.z<z4, a> implements a5 {
    public static final int BIND_AD_INFO_FIELD_NUMBER = 23;
    public static final int BLUE_FIELD_NUMBER = 8;
    public static final int CAL_VERSION_FIELD_NUMBER = 14;
    public static final int CDN_URL_FIELD_NUMBER = 2;
    public static final int COVER_URL_FIELD_NUMBER = 5;
    public static final int CPS_AD_INFO_FIELD_NUMBER = 24;
    private static final z4 DEFAULT_INSTANCE = null;
    public static final int DISABLE_LIVE_FIELD_NUMBER = 25;
    public static final int DISABLE_THEME_FIELD_NUMBER = 22;
    public static final int FILE_ID_FIELD_NUMBER = 1;
    public static final int GREEN_FIELD_NUMBER = 7;
    public static final int HEIGHT_FIELD_NUMBER = 4;
    public static final int LIVE_PHOTO_FIELD_NUMBER = 19;
    public static final int ORI_PICTURE_FIELD_NUMBER = 15;
    private static volatile k.d.c.b1<z4> PARSER = null;
    public static final int PIC_CFG_FIELD_NUMBER = 11;
    public static final int PIC_TEXT_FIELD_NUMBER = 10;
    public static final int PIC_TYPE_FIELD_NUMBER = 9;
    public static final int POI_INFO_FIELD_NUMBER = 17;
    public static final int RED_FIELD_NUMBER = 6;
    public static final int THEME_COLOR_FIELD_NUMBER = 12;
    public static final int WIDTH_FIELD_NUMBER = 3;
    public static final int WXA_INFO_FIELD_NUMBER = 18;
    private b0.i<v4> bindAdInfo_;
    private int bitField0_;
    private int blue_;
    private int calVersion_;
    private String cdnUrl_;
    private String coverUrl_;
    private b0.i<x4> cpsAdInfo_;
    private int disableLive_;
    private int disableTheme_;
    private int fileId_;
    private int green_;
    private int height_;
    private b5 livePhoto_;
    private u4 oriPicture_;
    private String picCfg_;
    private String picText_;
    private int picType_;
    private b0.i<c5> poiInfo_;
    private int red_;
    private h7 themeColor_;
    private int width_;
    private b0.i<e5> wxaInfo_;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_2.dex */
    public static final class a extends z.b<z4, a> implements a5 {
        public /* synthetic */ a(a3 a3Var) {
        }

        public a() {
        }
    }

    private z4() {
    }

    public static /* synthetic */ z4 access$108600() {
    }

    public static /* synthetic */ void access$108700(z4 z4Var, int i2) {
    }

    public static /* synthetic */ void access$108800(z4 z4Var) {
    }

    public static /* synthetic */ void access$108900(z4 z4Var, String str) {
    }

    public static /* synthetic */ void access$109000(z4 z4Var) {
    }

    public static /* synthetic */ void access$109100(z4 z4Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$109200(z4 z4Var, int i2) {
    }

    public static /* synthetic */ void access$109300(z4 z4Var) {
    }

    public static /* synthetic */ void access$109400(z4 z4Var, int i2) {
    }

    public static /* synthetic */ void access$109500(z4 z4Var) {
    }

    public static /* synthetic */ void access$109600(z4 z4Var, String str) {
    }

    public static /* synthetic */ void access$109700(z4 z4Var) {
    }

    public static /* synthetic */ void access$109800(z4 z4Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$109900(z4 z4Var, int i2) {
    }

    public static /* synthetic */ void access$110000(z4 z4Var) {
    }

    public static /* synthetic */ void access$110100(z4 z4Var, int i2) {
    }

    public static /* synthetic */ void access$110200(z4 z4Var) {
    }

    public static /* synthetic */ void access$110300(z4 z4Var, int i2) {
    }

    public static /* synthetic */ void access$110400(z4 z4Var) {
    }

    public static /* synthetic */ void access$110500(z4 z4Var, int i2) {
    }

    public static /* synthetic */ void access$110600(z4 z4Var) {
    }

    public static /* synthetic */ void access$110700(z4 z4Var, String str) {
    }

    public static /* synthetic */ void access$110800(z4 z4Var) {
    }

    public static /* synthetic */ void access$110900(z4 z4Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$111000(z4 z4Var, String str) {
    }

    public static /* synthetic */ void access$111100(z4 z4Var) {
    }

    public static /* synthetic */ void access$111200(z4 z4Var, k.d.c.i iVar) {
    }

    public static /* synthetic */ void access$111300(z4 z4Var, h7 h7Var) {
    }

    public static /* synthetic */ void access$111400(z4 z4Var, h7 h7Var) {
    }

    public static /* synthetic */ void access$111500(z4 z4Var) {
    }

    public static /* synthetic */ void access$111600(z4 z4Var, int i2) {
    }

    public static /* synthetic */ void access$111700(z4 z4Var) {
    }

    public static /* synthetic */ void access$111800(z4 z4Var, u4 u4Var) {
    }

    public static /* synthetic */ void access$111900(z4 z4Var, u4 u4Var) {
    }

    public static /* synthetic */ void access$112000(z4 z4Var) {
    }

    public static /* synthetic */ void access$112100(z4 z4Var, int i2, c5 c5Var) {
    }

    public static /* synthetic */ void access$112200(z4 z4Var, c5 c5Var) {
    }

    public static /* synthetic */ void access$112300(z4 z4Var, int i2, c5 c5Var) {
    }

    public static /* synthetic */ void access$112400(z4 z4Var, Iterable iterable) {
    }

    public static /* synthetic */ void access$112500(z4 z4Var) {
    }

    public static /* synthetic */ void access$112600(z4 z4Var, int i2) {
    }

    public static /* synthetic */ void access$112700(z4 z4Var, int i2, e5 e5Var) {
    }

    public static /* synthetic */ void access$112800(z4 z4Var, e5 e5Var) {
    }

    public static /* synthetic */ void access$112900(z4 z4Var, int i2, e5 e5Var) {
    }

    public static /* synthetic */ void access$113000(z4 z4Var, Iterable iterable) {
    }

    public static /* synthetic */ void access$113100(z4 z4Var) {
    }

    public static /* synthetic */ void access$113200(z4 z4Var, int i2) {
    }

    public static /* synthetic */ void access$113300(z4 z4Var, b5 b5Var) {
    }

    public static /* synthetic */ void access$113400(z4 z4Var, b5 b5Var) {
    }

    public static /* synthetic */ void access$113500(z4 z4Var) {
    }

    public static /* synthetic */ void access$113600(z4 z4Var, int i2) {
    }

    public static /* synthetic */ void access$113700(z4 z4Var) {
    }

    public static /* synthetic */ void access$113800(z4 z4Var, int i2, v4 v4Var) {
    }

    public static /* synthetic */ void access$113900(z4 z4Var, v4 v4Var) {
    }

    public static /* synthetic */ void access$114000(z4 z4Var, int i2, v4 v4Var) {
    }

    public static /* synthetic */ void access$114100(z4 z4Var, Iterable iterable) {
    }

    public static /* synthetic */ void access$114200(z4 z4Var) {
    }

    public static /* synthetic */ void access$114300(z4 z4Var, int i2) {
    }

    public static /* synthetic */ void access$114400(z4 z4Var, int i2, x4 x4Var) {
    }

    public static /* synthetic */ void access$114500(z4 z4Var, x4 x4Var) {
    }

    public static /* synthetic */ void access$114600(z4 z4Var, int i2, x4 x4Var) {
    }

    public static /* synthetic */ void access$114700(z4 z4Var, Iterable iterable) {
    }

    public static /* synthetic */ void access$114800(z4 z4Var) {
    }

    public static /* synthetic */ void access$114900(z4 z4Var, int i2) {
    }

    public static /* synthetic */ void access$115000(z4 z4Var, int i2) {
    }

    public static /* synthetic */ void access$115100(z4 z4Var) {
    }

    private void addAllBindAdInfo(Iterable<? extends v4> iterable) {
    }

    private void addAllCpsAdInfo(Iterable<? extends x4> iterable) {
    }

    private void addAllPoiInfo(Iterable<? extends c5> iterable) {
    }

    private void addAllWxaInfo(Iterable<? extends e5> iterable) {
    }

    private void addBindAdInfo(v4 v4Var) {
    }

    private void addCpsAdInfo(x4 x4Var) {
    }

    private void addPoiInfo(c5 c5Var) {
    }

    private void addWxaInfo(e5 e5Var) {
    }

    private void clearBindAdInfo() {
    }

    private void clearBlue() {
    }

    private void clearCalVersion() {
    }

    private void clearCdnUrl() {
    }

    private void clearCoverUrl() {
    }

    private void clearCpsAdInfo() {
    }

    private void clearDisableLive() {
    }

    private void clearDisableTheme() {
    }

    private void clearFileId() {
    }

    private void clearGreen() {
    }

    private void clearHeight() {
    }

    private void clearLivePhoto() {
    }

    private void clearOriPicture() {
    }

    private void clearPicCfg() {
    }

    private void clearPicText() {
    }

    private void clearPicType() {
    }

    private void clearPoiInfo() {
    }

    private void clearRed() {
    }

    private void clearThemeColor() {
    }

    private void clearWidth() {
    }

    private void clearWxaInfo() {
    }

    private void ensureBindAdInfoIsMutable() {
    }

    private void ensureCpsAdInfoIsMutable() {
    }

    private void ensurePoiInfoIsMutable() {
    }

    private void ensureWxaInfoIsMutable() {
    }

    public static z4 getDefaultInstance() {
    }

    private void mergeLivePhoto(b5 b5Var) {
    }

    private void mergeOriPicture(u4 u4Var) {
    }

    private void mergeThemeColor(h7 h7Var) {
    }

    public static a newBuilder() {
    }

    public static z4 parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static z4 parseFrom(ByteBuffer byteBuffer) throws k.d.c.c0 {
    }

    public static k.d.c.b1<z4> parser() {
    }

    private void removeBindAdInfo(int i2) {
    }

    private void removeCpsAdInfo(int i2) {
    }

    private void removePoiInfo(int i2) {
    }

    private void removeWxaInfo(int i2) {
    }

    private void setBindAdInfo(int i2, v4 v4Var) {
    }

    private void setBlue(int i2) {
    }

    private void setCalVersion(int i2) {
    }

    private void setCdnUrl(String str) {
    }

    private void setCdnUrlBytes(k.d.c.i iVar) {
    }

    private void setCoverUrl(String str) {
    }

    private void setCoverUrlBytes(k.d.c.i iVar) {
    }

    private void setCpsAdInfo(int i2, x4 x4Var) {
    }

    private void setDisableLive(int i2) {
    }

    private void setDisableTheme(int i2) {
    }

    private void setFileId(int i2) {
    }

    private void setGreen(int i2) {
    }

    private void setHeight(int i2) {
    }

    private void setLivePhoto(b5 b5Var) {
    }

    private void setOriPicture(u4 u4Var) {
    }

    private void setPicCfg(String str) {
    }

    private void setPicCfgBytes(k.d.c.i iVar) {
    }

    private void setPicText(String str) {
    }

    private void setPicTextBytes(k.d.c.i iVar) {
    }

    private void setPicType(int i2) {
    }

    private void setPoiInfo(int i2, c5 c5Var) {
    }

    private void setRed(int i2) {
    }

    private void setThemeColor(h7 h7Var) {
    }

    private void setWidth(int i2) {
    }

    private void setWxaInfo(int i2, e5 e5Var) {
    }

    @Override // k.d.c.z
    public final Object dynamicMethod(z.g gVar, Object obj, Object obj2) {
    }

    public v4 getBindAdInfo(int i2) {
    }

    public int getBindAdInfoCount() {
    }

    public List<v4> getBindAdInfoList() {
    }

    public w4 getBindAdInfoOrBuilder(int i2) {
    }

    public List<? extends w4> getBindAdInfoOrBuilderList() {
    }

    public int getBlue() {
    }

    public int getCalVersion() {
    }

    public String getCdnUrl() {
    }

    public k.d.c.i getCdnUrlBytes() {
    }

    public String getCoverUrl() {
    }

    public k.d.c.i getCoverUrlBytes() {
    }

    public x4 getCpsAdInfo(int i2) {
    }

    public int getCpsAdInfoCount() {
    }

    public List<x4> getCpsAdInfoList() {
    }

    public y4 getCpsAdInfoOrBuilder(int i2) {
    }

    public List<? extends y4> getCpsAdInfoOrBuilderList() {
    }

    public int getDisableLive() {
    }

    public int getDisableTheme() {
    }

    public int getFileId() {
    }

    public int getGreen() {
    }

    public int getHeight() {
    }

    public b5 getLivePhoto() {
    }

    public u4 getOriPicture() {
    }

    public String getPicCfg() {
    }

    public k.d.c.i getPicCfgBytes() {
    }

    public String getPicText() {
    }

    public k.d.c.i getPicTextBytes() {
    }

    public int getPicType() {
    }

    public c5 getPoiInfo(int i2) {
    }

    public int getPoiInfoCount() {
    }

    public List<c5> getPoiInfoList() {
    }

    public d5 getPoiInfoOrBuilder(int i2) {
    }

    public List<? extends d5> getPoiInfoOrBuilderList() {
    }

    public int getRed() {
    }

    public h7 getThemeColor() {
    }

    public int getWidth() {
    }

    public e5 getWxaInfo(int i2) {
    }

    public int getWxaInfoCount() {
    }

    public List<e5> getWxaInfoList() {
    }

    public f5 getWxaInfoOrBuilder(int i2) {
    }

    public List<? extends f5> getWxaInfoOrBuilderList() {
    }

    public boolean hasBlue() {
    }

    public boolean hasCalVersion() {
    }

    public boolean hasCdnUrl() {
    }

    public boolean hasCoverUrl() {
    }

    public boolean hasDisableLive() {
    }

    public boolean hasDisableTheme() {
    }

    public boolean hasFileId() {
    }

    public boolean hasGreen() {
    }

    public boolean hasHeight() {
    }

    public boolean hasLivePhoto() {
    }

    public boolean hasOriPicture() {
    }

    public boolean hasPicCfg() {
    }

    public boolean hasPicText() {
    }

    public boolean hasPicType() {
    }

    public boolean hasRed() {
    }

    public boolean hasThemeColor() {
    }

    public boolean hasWidth() {
    }

    public static a newBuilder(z4 z4Var) {
    }

    public static z4 parseDelimitedFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static z4 parseFrom(ByteBuffer byteBuffer, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static z4 parseFrom(k.d.c.i iVar) throws k.d.c.c0 {
    }

    private void addBindAdInfo(int i2, v4 v4Var) {
    }

    private void addCpsAdInfo(int i2, x4 x4Var) {
    }

    private void addPoiInfo(int i2, c5 c5Var) {
    }

    private void addWxaInfo(int i2, e5 e5Var) {
    }

    public static z4 parseFrom(k.d.c.i iVar, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static z4 parseFrom(byte[] bArr) throws k.d.c.c0 {
    }

    public static z4 parseFrom(byte[] bArr, k.d.c.q qVar) throws k.d.c.c0 {
    }

    public static z4 parseFrom(InputStream inputStream) throws IOException {
    }

    public static z4 parseFrom(InputStream inputStream, k.d.c.q qVar) throws IOException {
    }

    public static z4 parseFrom(k.d.c.j jVar) throws IOException {
    }

    public static z4 parseFrom(k.d.c.j jVar, k.d.c.q qVar) throws IOException {
    }
}
