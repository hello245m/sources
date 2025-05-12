package com.tencent.mp.feature.data.biz.account.domain.article;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import n.d0.d.h;
import q.z4;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ShareImageInfo implements Parcelable {
    public static final Parcelable.Creator<ShareImageInfo> CREATOR = null;
    public static final a Companion = null;
    private int calVersion;
    private int color;
    private List<CpsAdInfo> cpsAdInfoList;
    private int disableLive;
    private int disableTheme;
    private MakeImageExtData extData;
    private int fileId;
    private int height;
    private LivePhotoInfo livePhotoInfo;
    private OriPictureInfo oriPictureInfo;
    private List<PoiData> poiList;
    private String url;
    private int width;
    private List<WxaData> wxaList;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {

        /* renamed from: com.tencent.mp.feature.data.biz.account.domain.article.ShareImageInfo$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class C0051a extends TypeToken<MakeImageExtData> {
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b extends TypeToken<OriPictureInfo> {
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class c extends TypeToken<ArrayList<WxaData>> {
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class d extends TypeToken<ArrayList<PoiData>> {
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class e extends TypeToken<ArrayList<CpsAdInfo>> {
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class f extends TypeToken<LivePhotoInfo> {
        }

        public a() {
        }

        public /* synthetic */ a(h hVar) {
        }

        public final ArrayList<ShareImageInfo> a(String str) {
        }

        public final String b(List<z4> list) {
        }

        public final String c(List<ShareImageInfo> list) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b implements Parcelable.Creator<ShareImageInfo> {
        public final ShareImageInfo a(Parcel parcel) {
        }

        public final ShareImageInfo[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShareImageInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShareImageInfo[] newArray(int i2) {
        }
    }

    public ShareImageInfo() {
    }

    public ShareImageInfo(int i2, String str, int i3, int i4, int i5, int i6, int i7, MakeImageExtData makeImageExtData, OriPictureInfo oriPictureInfo, List<WxaData> list, List<PoiData> list2, List<CpsAdInfo> list3, LivePhotoInfo livePhotoInfo, int i8) {
    }

    public static /* synthetic */ ShareImageInfo copy$default(ShareImageInfo shareImageInfo, int i2, String str, int i3, int i4, int i5, int i6, int i7, MakeImageExtData makeImageExtData, OriPictureInfo oriPictureInfo, List list, List list2, List list3, LivePhotoInfo livePhotoInfo, int i8, int i9, Object obj) {
    }

    public final int component1() {
    }

    public final List<WxaData> component10() {
    }

    public final List<PoiData> component11() {
    }

    public final List<CpsAdInfo> component12() {
    }

    public final LivePhotoInfo component13() {
    }

    public final int component14() {
    }

    public final String component2() {
    }

    public final int component3() {
    }

    public final int component4() {
    }

    public final int component5() {
    }

    public final int component6() {
    }

    public final int component7() {
    }

    public final MakeImageExtData component8() {
    }

    public final OriPictureInfo component9() {
    }

    public final ShareImageInfo copy(int i2, String str, int i3, int i4, int i5, int i6, int i7, MakeImageExtData makeImageExtData, OriPictureInfo oriPictureInfo, List<WxaData> list, List<PoiData> list2, List<CpsAdInfo> list3, LivePhotoInfo livePhotoInfo, int i8) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public final int getCalVersion() {
    }

    public final int getColor() {
    }

    public final List<CpsAdInfo> getCpsAdInfoList() {
    }

    public final int getDisableLive() {
    }

    public final int getDisableTheme() {
    }

    public final MakeImageExtData getExtData() {
    }

    public final int getFileId() {
    }

    public final int getHeight() {
    }

    public final LivePhotoInfo getLivePhotoInfo() {
    }

    public final OriPictureInfo getOriPictureInfo() {
    }

    public final List<PoiData> getPoiList() {
    }

    public final String getUrl() {
    }

    public final int getWidth() {
    }

    public final List<WxaData> getWxaList() {
    }

    public int hashCode() {
    }

    public final void setCalVersion(int i2) {
    }

    public final void setColor(int i2) {
    }

    public final void setCpsAdInfoList(List<CpsAdInfo> list) {
    }

    public final void setDisableLive(int i2) {
    }

    public final void setDisableTheme(int i2) {
    }

    public final void setExtData(MakeImageExtData makeImageExtData) {
    }

    public final void setFileId(int i2) {
    }

    public final void setHeight(int i2) {
    }

    public final void setLivePhotoInfo(LivePhotoInfo livePhotoInfo) {
    }

    public final void setOriPictureInfo(OriPictureInfo oriPictureInfo) {
    }

    public final void setPoiList(List<PoiData> list) {
    }

    public final void setUrl(String str) {
    }

    public final void setWidth(int i2) {
    }

    public final void setWxaList(List<WxaData> list) {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public /* synthetic */ ShareImageInfo(int i2, String str, int i3, int i4, int i5, int i6, int i7, MakeImageExtData makeImageExtData, OriPictureInfo oriPictureInfo, List list, List list2, List list3, LivePhotoInfo livePhotoInfo, int i8, int i9, h hVar) {
    }
}
