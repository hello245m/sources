package com.tencent.rmonitor.base.meta;

import n.d0.d.h;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class DropFrameResultMeta extends MonitorMeta {
    public long hitchesDuration;
    public final long[] refreshCount;
    public final long[] refreshDuration;
    public String scene;
    public long suspendDuration;
    public long timeStamp;
    public long totalDuration;
    public JSONObject userCustom;

    public DropFrameResultMeta() {
    }

    public DropFrameResultMeta(String str, long j2, long[] jArr, long[] jArr2, long j3, long j4, long j5, JSONObject jSONObject) {
    }

    public static /* synthetic */ DropFrameResultMeta copy$default(DropFrameResultMeta dropFrameResultMeta, String str, long j2, long[] jArr, long[] jArr2, long j3, long j4, long j5, JSONObject jSONObject, int i2, Object obj) {
    }

    private final boolean equalsOther(DropFrameResultMeta dropFrameResultMeta) {
    }

    private final void mergeUserCustom(DropFrameResultMeta dropFrameResultMeta) {
    }

    public final String component1() {
    }

    public final long component2() {
    }

    public final long[] component3() {
    }

    public final long[] component4() {
    }

    public final long component5() {
    }

    public final long component6() {
    }

    public final long component7() {
    }

    public final JSONObject component8() {
    }

    public final DropFrameResultMeta copy(String str, long j2, long[] jArr, long[] jArr2, long j3, long j4, long j5, JSONObject jSONObject) {
    }

    public final void copyFrom(DropFrameResultMeta dropFrameResultMeta) {
    }

    public boolean equals(Object obj) {
    }

    public final void fromJSONObject(JSONObject jSONObject) {
    }

    public int hashCode() {
    }

    public final void merge(DropFrameResultMeta dropFrameResultMeta) {
    }

    @Override // com.tencent.bugly.common.utils.RecyclablePool.Recyclable
    public void reset() {
    }

    public final JSONObject toJSONObject() {
    }

    public String toString() {
    }

    public /* synthetic */ DropFrameResultMeta(String str, long j2, long[] jArr, long[] jArr2, long j3, long j4, long j5, JSONObject jSONObject, int i2, h hVar) {
    }
}
