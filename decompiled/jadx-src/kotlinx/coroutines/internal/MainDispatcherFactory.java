package kotlinx.coroutines.internal;

import java.util.List;
import x1.u1;

/* loaded from: classes.dex */
public interface MainDispatcherFactory {
    u1 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
