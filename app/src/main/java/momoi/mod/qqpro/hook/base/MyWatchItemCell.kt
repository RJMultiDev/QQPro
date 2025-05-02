package momoi.mod.qqpro.hook.base

import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import com.tencent.watch.aio_impl.data.WatchAIOMsgItem
import com.tencent.watch.aio_impl.ui.cell.base.BaseWatchItemCell
import com.tencent.watch.aio_impl.ui.widget.AIOCellGroupWidget
import momoi.anno.mixin.Mixin

@Mixin
open class MyWatchItemCell<T : AIOCellGroupWidget> : BaseWatchItemCell<WatchAIOMsgItem, View>() {
    @Suppress("UNCHECKED_CAST")
    override fun i(p0: View, p1: WatchAIOMsgItem, p2: Int, p3: List<Any?>, p4: Lifecycle, p5: LifecycleOwner?) {
        super.i(p0, p1, p2, p3, p4, p5)
        (p0 as? T)?.let { onAttachGroupWidget(it, p1) }
    }
    open fun onAttachGroupWidget(widget: T, item: WatchAIOMsgItem) {

    }

    override fun d(
        p0: View,
        p1: WatchAIOMsgItem,
        p2: Int,
        p3: List<Any?>
    ) {
        TODO("Not yet implemented")
    }

    override fun e(p0: ViewGroup): View {
        TODO("Not yet implemented")
    }
}