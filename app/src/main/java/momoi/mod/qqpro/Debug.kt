package momoi.mod.qqpro

import android.util.Log

object Debug {
    fun log(vararg msg: Any?) {
        Log.e("QQPro", msg.joinToString(" "))
    }
}