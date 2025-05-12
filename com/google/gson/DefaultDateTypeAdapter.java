package com.google.gson;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Date;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class DefaultDateTypeAdapter implements JsonSerializer<Date>, JsonDeserializer<Date> {
    private final DateFormat enUsFormat;
    private final DateFormat localFormat;

    public DefaultDateTypeAdapter() {
    }

    private Date deserializeToDate(JsonElement jsonElement) {
    }

    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
    }

    @Override // com.google.gson.JsonSerializer
    public /* bridge */ /* synthetic */ JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
    }

    public String toString() {
    }

    @Override // com.google.gson.JsonDeserializer
    /* renamed from: deserialize, reason: avoid collision after fix types in other method */
    public Date deserialize2(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
    }

    /* renamed from: serialize, reason: avoid collision after fix types in other method */
    public JsonElement serialize2(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
    }

    public DefaultDateTypeAdapter(String str) {
    }

    public DefaultDateTypeAdapter(int i2) {
    }

    public DefaultDateTypeAdapter(int i2, int i3) {
    }

    public DefaultDateTypeAdapter(DateFormat dateFormat, DateFormat dateFormat2) {
    }
}
