package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class Lifecycle {
    public AtomicReference<Object> mInternalScopeRef;

    /* renamed from: androidx.lifecycle.Lifecycle$1, reason: invalid class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event = null;
        public static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class Event {
        private static final /* synthetic */ Event[] $VALUES = null;
        public static final Event ON_ANY = null;
        public static final Event ON_CREATE = null;
        public static final Event ON_DESTROY = null;
        public static final Event ON_PAUSE = null;
        public static final Event ON_RESUME = null;
        public static final Event ON_START = null;
        public static final Event ON_STOP = null;

        private Event(String str, int i2) {
        }

        public static Event downFrom(State state) {
        }

        public static Event downTo(State state) {
        }

        public static Event upFrom(State state) {
        }

        public static Event upTo(State state) {
        }

        public static Event valueOf(String str) {
        }

        public static Event[] values() {
        }

        public State getTargetState() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES = null;
        public static final State CREATED = null;
        public static final State DESTROYED = null;
        public static final State INITIALIZED = null;
        public static final State RESUMED = null;
        public static final State STARTED = null;

        private State(String str, int i2) {
        }

        public static State valueOf(String str) {
        }

        public static State[] values() {
        }

        public boolean isAtLeast(State state) {
        }
    }

    public abstract void addObserver(LifecycleObserver lifecycleObserver);

    public abstract State getCurrentState();

    public abstract void removeObserver(LifecycleObserver lifecycleObserver);
}
