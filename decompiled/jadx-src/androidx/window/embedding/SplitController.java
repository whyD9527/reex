package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.window.core.ExperimentalWindowApi;
import g1.q;
import h1.f0;
import h1.r;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.k;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitController {
    private static volatile SplitController globalInstance = null;
    public static final boolean sDebug = false;
    private final EmbeddingBackend embeddingBackend;
    private Set<? extends EmbeddingRule> staticSplitRules;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final SplitController getInstance() {
            if (SplitController.globalInstance == null) {
                ReentrantLock reentrantLock = SplitController.globalLock;
                reentrantLock.lock();
                try {
                    if (SplitController.globalInstance == null) {
                        SplitController.globalInstance = new SplitController(null);
                    }
                    q qVar = q.f2865a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            SplitController splitController = SplitController.globalInstance;
            k.b(splitController);
            return splitController;
        }

        public final void initialize(Context context, int i2) {
            k.e(context, "context");
            Set<EmbeddingRule> parseSplitRules$window_release = new SplitRuleParser().parseSplitRules$window_release(context, i2);
            SplitController companion = getInstance();
            if (parseSplitRules$window_release == null) {
                parseSplitRules$window_release = f0.b();
            }
            companion.setStaticSplitRules(parseSplitRules$window_release);
        }
    }

    private SplitController() {
        Set<? extends EmbeddingRule> b3;
        this.embeddingBackend = ExtensionEmbeddingBackend.Companion.getInstance();
        b3 = f0.b();
        this.staticSplitRules = b3;
    }

    public /* synthetic */ SplitController(kotlin.jvm.internal.g gVar) {
        this();
    }

    public static final SplitController getInstance() {
        return Companion.getInstance();
    }

    public static final void initialize(Context context, int i2) {
        Companion.initialize(context, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStaticSplitRules(Set<? extends EmbeddingRule> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.setSplitRules(set);
    }

    public final void addSplitListener(Activity activity, Executor executor, androidx.core.util.a<List<SplitInfo>> consumer) {
        k.e(activity, "activity");
        k.e(executor, "executor");
        k.e(consumer, "consumer");
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, consumer);
    }

    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }

    public final Set<EmbeddingRule> getSplitRules() {
        Set<EmbeddingRule> v2;
        v2 = r.v(this.embeddingBackend.getSplitRules());
        return v2;
    }

    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }

    public final void registerRule(EmbeddingRule rule) {
        k.e(rule, "rule");
        this.embeddingBackend.registerRule(rule);
    }

    public final void removeSplitListener(androidx.core.util.a<List<SplitInfo>> consumer) {
        k.e(consumer, "consumer");
        this.embeddingBackend.unregisterSplitListenerForActivity(consumer);
    }

    public final void unregisterRule(EmbeddingRule rule) {
        k.e(rule, "rule");
        this.embeddingBackend.unregisterRule(rule);
    }
}
