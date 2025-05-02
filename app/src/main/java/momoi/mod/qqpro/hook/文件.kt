package momoi.mod.qqpro.hook

import android.content.Context
import android.view.View
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import com.tencent.qqnt.kernel.nativeinterface.Contact
import com.tencent.qqnt.kernel.nativeinterface.MsgRecord
import com.tencent.watch.aio_impl.data.WatchAIOMsgItem
import com.tencent.watch.aio_impl.ui.cell.base.BaseWatchItemCell
import com.tencent.watch.aio_impl.ui.cell.unsupport.WatchToQQViewMsgItem
import com.tencent.watch.aio_impl.ui.widget.AIOCellGroupWidget
import momoi.anno.mixin.Mixin

//@Mixin
class FileMsgWidget(context: Context) : AIOCellGroupWidget(context) {
    fun applyFileWidget(model: FileModel) {
        contentWidget.visibility = GONE
    }
    fun recover() {
        contentWidget.visibility = VISIBLE
    }
}

class FileModel(peer: Contact, msg: MsgRecord) {

}

//@Mixin
class FileMsgItem : WatchToQQViewMsgItem() {
    var model: FileModel? = null
        private set
    override fun o(context: Context?) {
        super.o(context)
        if (this.o.startsWith("[文件]")) {
            model = FileModel(l(), d)
        }
    }
}

//@Mixin
class 苦呀西 : BaseWatchItemCell() {
    override fun i(
        view: View?,
        item: WatchAIOMsgItem,
        p3: Int,
        p4: MutableList<*>?,
        p5: Lifecycle?,
        p6: LifecycleOwner?
    ) {
        super.i(view, item, p3, p4, p5, p6)
        (view as? FileMsgWidget)?.let { cell ->
            (item as? FileMsgItem)?.model?.let {
                cell.applyFileWidget(it)
            } ?: cell.recover()
        }
    }
}