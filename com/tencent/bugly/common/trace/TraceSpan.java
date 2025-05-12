package com.tencent.bugly.common.trace;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class TraceSpan {
    public static final String KEY_END_TIME_UNIX_MS = "end_time_unix_ms";
    public static final String KEY_KIND = "kind";
    public static final String KEY_NAME = "name";
    public static final String KEY_PARENT_SPAN_ID = "parent_span_id";
    public static final String KEY_SPAN_ID = "span_id";
    public static final String KEY_START_TIME_UNIX_MS = "start_time_unix_ms";
    public static final String KEY_TRACE_ID = "trace_id";
    private long endTimeInMs;
    public final String name;
    private final TraceSpan parentSpan;
    public final String spanId;
    private final long startTimeInMs;
    public final String traceId;

    public TraceSpan(String str, String str2, TraceSpan traceSpan) {
    }

    public long getStartTimeInMs() {
    }

    public boolean isSpanEnd() {
    }

    public void onSpanEnd() {
    }

    public JSONObject toJson() throws JSONException {
    }

    public String toString() {
    }

    public TraceSpan(String str, String str2, TraceSpan traceSpan, long j2, long j3) {
    }
}
