package momoi.mod.qqpro.hook

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.tencent.qqnt.kernel.nativeinterface.GroupFileListResult
import com.tencent.qqnt.msg.KernelServiceUtil
import com.tencent.qqnt.msg.`MsgService$init$1`
import com.tencent.watch.aio_impl.ui.frames.SettingFrame
import momoi.anno.mixin.Mixin
import momoi.mod.qqpro.Utils
import momoi.mod.qqpro.asGroup
import momoi.mod.qqpro.hook.action.CurrentContact
import momoi.mod.qqpro.hook.view.MyDialogFragment
import momoi.mod.qqpro.lib.FILL
import momoi.mod.qqpro.lib.WRAP
import momoi.mod.qqpro.lib.background
import momoi.mod.qqpro.lib.clickable
import momoi.mod.qqpro.lib.content
import momoi.mod.qqpro.lib.create
import momoi.mod.qqpro.lib.dp
import momoi.mod.qqpro.lib.gravity
import momoi.mod.qqpro.lib.height
import momoi.mod.qqpro.lib.marginHorizontal
import momoi.mod.qqpro.lib.text
import momoi.mod.qqpro.lib.textColor
import momoi.mod.qqpro.lib.textSize
import momoi.mod.qqpro.lib.vertical
import momoi.mod.qqpro.showDialog

fun forceFetchClientKey() {
    KernelServiceUtil.f()?.wrapperSession?.ticketService
        ?.forceFetchClientKey("") { i, s1, s2, j, s3, j2 ->
            Utils.log("key: $i, $s1, $s2, $j, $s3, $j2")
        }
}
@Mixin
class 群公告入口 : SettingFrame() {
    override fun Y(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val result = super.Y(inflater, container, savedInstanceState)
        result.asGroup().getChildAt(0).asGroup() //LinearLayout
            .apply {
                addView(
                    create<LinearLayout>(context, LinearLayout.LayoutParams(FILL, WRAP))
                        .background(getChildAt(childCount - 1).background)
                        .height(40.dp)
                        .marginHorizontal(3.dp)
                        .gravity(Gravity.CENTER_VERTICAL)
                        .content {
                            add<TextView>()
                                .text("群公告")
                                .marginHorizontal(12.dp)
                                .textColor(0xFF_FFFFFF)
                                .textSize(12f)
                                .clickable {
                                    showDialog(GroupNoticeFragment())
                                }
                        },
                    childCount - 3
                )
            }
        return result
    }
}

class GroupNoticeFragment : MyDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return create<LinearLayout>(inflater.context, ViewGroup.LayoutParams(FILL, FILL))
            .vertical()
            .background(Color.BLACK)
            .gravity(Gravity.CENTER_HORIZONTAL)
            .content {
                add<TextView>()
                    .text("群公告")
                    .textColor(Color.WHITE)
                    .textSize(12f)
                forceFetchClientKey()
            }
    }
}