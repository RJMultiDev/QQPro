package momoi.mod.qqpro.hook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tencent.aio.api.list.IListUIOperationApi
import com.tencent.aio.base.chat.ChatPie
import com.tencent.aio.base.mvi.part.MsgListUiState
import com.tencent.aio.main.fragment.ChatFragment
import com.tencent.mvi.base.mvi.MviUIState
import com.tencent.qqnt.msg.KernelServiceUtil
import com.tencent.watch.aio_impl.coreImpl.vb.WatchAIOListVB
import com.tencent.watch.aio_impl.data.WatchAIOMsgItem
import momoi.anno.mixin.Mixin
import momoi.mod.qqpro.Debug
import momoi.mod.qqpro.stuck
import java.util.LinkedList

object MsgListMirror {
    var list = mutableListOf<WatchAIOMsgItem>()

    @Mixin
    class MirrorHook : WatchAIOListVB() {
        @Suppress(names = ["UNCHECKED_CAST"])
        override fun o(p0: MsgListUiState, p1: IListUIOperationApi) {
            val new = p0 as LinkedList<WatchAIOMsgItem>
            if (list.isNotEmpty()) {
                val lastTime = list.last().d.msgTime
                for (i in new.indices.reversed()) {
                    val time = new[i].d.msgTime
                    if (time == lastTime) {
                        break
                    } else if (time < lastTime) {
                        new.addAll(
                            i,
                            list.subList(
                                list.lastIndexOf(new[i]),
                                list.size
                            )
                        )
                        break
                    }
                }
            }
            list = new
            Debug.log("MsgListMirror", list.size)
            KernelServiceUtil.i()?.richMediaService
                ?.getGroupSpace(ContactMirror.value!!.peerUid.toLong()) { i, s, result ->
                    Debug.log("getGroupSpace", i, s, result)
                }
            super.o(new as MsgListUiState, p1)
        }
    }

    @Mixin
    class ClearHook : ChatPie(stuck()) {
        override fun a(p0: ChatFragment, p1: LayoutInflater, p2: ViewGroup, p3: Boolean): View {
            list.clear()
            return super.a(p0, p1, p2, p3)
        }
    }
}