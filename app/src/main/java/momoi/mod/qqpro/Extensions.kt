package momoi.mod.qqpro

import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.core.view.forEach
import java.io.File
import java.lang.reflect.Method

fun View.asGroupOrNull() = this as? ViewGroup
fun ViewParent.asGroup() = this as ViewGroup
fun View.asGroup() = this as ViewGroup
fun <E> List<E>.join(block: (E)->CharSequence) = joinToString("", transform = block)
fun ViewGroup.forEachAll(block: (View) -> Unit) {
    forEach { child ->
        block(child)
        child.asGroupOrNull()?.forEachAll(block)
    }
}
fun ViewGroup.findAll(block: (View) -> Boolean): View? {
    forEach { child ->
        if (block(child)) {
            return@findAll child
        } else child.asGroupOrNull()?.findAll(block)?.let {
            return@findAll it
        }
    }
    return null
}
fun ViewGroup.anyAll(block: (View) -> Boolean) = findAll(block) != null

fun String.removeBefore(key: String) = split(key, limit = 2)[1]
fun String.removeAfter(key: String) = split(key, limit = 2)[0]

fun String?.emptyUse(other: String) = if (isNullOrEmpty()) other else this

fun File.child(path: String) = File(this, path)

fun <T> Class<T>.findMethod(name: String, args: List<Class<Any>>? = null): Method {
    return try {
        if (args == null) getDeclaredMethod(name)
        else getDeclaredMethod(name, *args.toTypedArray())
    } catch (e: Exception) {
        superclass.findMethod(name, args)
    }
}