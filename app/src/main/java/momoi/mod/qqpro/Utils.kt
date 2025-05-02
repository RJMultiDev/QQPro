package momoi.mod.qqpro

import android.annotation.SuppressLint
import android.app.Application

object Utils {
    @SuppressLint("PrivateApi")
    val application = Class.forName("android.app.ActivityThread").getMethod("currentApplication")
        .invoke(null) as Application
}