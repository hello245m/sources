package com.tencent.mp.feature.article.base.data;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import n.d0.d.h;

@Keep
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class EditorJsConfig {

    @SerializedName("reprint_config")
    private ReprintConfig reprintConfig;

    public EditorJsConfig() {
    }

    public EditorJsConfig(ReprintConfig reprintConfig) {
    }

    public static /* synthetic */ EditorJsConfig copy$default(EditorJsConfig editorJsConfig, ReprintConfig reprintConfig, int i2, Object obj) {
    }

    public final ReprintConfig component1() {
    }

    public final EditorJsConfig copy(ReprintConfig reprintConfig) {
    }

    public boolean equals(Object obj) {
    }

    public final ReprintConfig getReprintConfig() {
    }

    public int hashCode() {
    }

    public final void merge(EditorJsConfig editorJsConfig) {
    }

    public final void setReprintConfig(ReprintConfig reprintConfig) {
    }

    public String toString() {
    }

    @Keep
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class ReprintConfig {

        @SerializedName("title_not_allow_edit")
        private String titleNotAllowEdit;

        public ReprintConfig() {
        }

        public ReprintConfig(String str) {
        }

        public static /* synthetic */ ReprintConfig copy$default(ReprintConfig reprintConfig, String str, int i2, Object obj) {
        }

        public final String component1() {
        }

        public final ReprintConfig copy(String str) {
        }

        public boolean equals(Object obj) {
        }

        public final String getTitleNotAllowEdit() {
        }

        public int hashCode() {
        }

        public final void setTitleNotAllowEdit(String str) {
        }

        public String toString() {
        }

        public /* synthetic */ ReprintConfig(String str, int i2, h hVar) {
        }
    }

    public /* synthetic */ EditorJsConfig(ReprintConfig reprintConfig, int i2, h hVar) {
    }
}
