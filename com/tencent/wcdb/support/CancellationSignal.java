package com.tencent.wcdb.support;

import android.os.RemoteException;
import com.tencent.wcdb.support.ICancellationSignal;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class CancellationSignal {
    private boolean mCancelInProgress;
    private boolean mIsCanceled;
    private OnCancelListener mOnCancelListener;
    private ICancellationSignal mRemote;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public interface OnCancelListener {
        void onCancel();
    }

    public static ICancellationSignal createTransport() {
    }

    public static CancellationSignal fromTransport(ICancellationSignal iCancellationSignal) {
    }

    private void waitForCancelFinishedLocked() {
    }

    public void cancel() {
    }

    public boolean isCanceled() {
    }

    public void setOnCancelListener(OnCancelListener onCancelListener) {
    }

    public void setRemote(ICancellationSignal iCancellationSignal) {
    }

    public void throwIfCanceled() {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class Transport extends ICancellationSignal.Stub {
        public final CancellationSignal mCancellationSignal;

        private Transport() {
        }

        @Override // com.tencent.wcdb.support.ICancellationSignal
        public void cancel() throws RemoteException {
        }

        public /* synthetic */ Transport(AnonymousClass1 anonymousClass1) {
        }
    }
}
