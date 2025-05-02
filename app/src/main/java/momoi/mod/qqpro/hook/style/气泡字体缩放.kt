package momoi.mod.qqpro.hook.style

import android.view.View
import android.widget.TextView
import androidx.core.view.forEach
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import com.tencent.qqnt.msg.KernelServiceUtil
import com.tencent.watch.aio_impl.data.WatchAIOMsgItem
import com.tencent.watch.aio_impl.ui.cell.base.BaseWatchItemCell
import com.tencent.watch.aio_impl.ui.widget.AIOCellGroupWidget
import momoi.anno.mixin.Mixin
import momoi.mod.qqpro.Debug
import momoi.mod.qqpro.Settings
import momoi.mod.qqpro.asGroupOrNull
import momoi.mod.qqpro.hook.base.MyWatchItemCell

@Mixin
class 气泡字体缩放 : MyWatchItemCell<AIOCellGroupWidget>() {
    override fun onAttachGroupWidget(widget: AIOCellGroupWidget, item: WatchAIOMsgItem) {
        widget.getContentWidget<View>()?.let { content ->
            content.asGroupOrNull()?.forEach {
                resize(it)
            } ?: resize(content)
        }
    }

    fun resize(view: View) {
        if (view is TextView) {
            view.textSize = 15f * Settings.chatScale.value
        }
    }
}