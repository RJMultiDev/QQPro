package momoi.mod.qqpro

/**
 * 某些类构造函数要求传参，但是Mixin不需要，传入stuck()替换任意参数
 * 不过你也可以选择添加构造函数参数到Mixin类上
 */
fun <T> stuck(): T = throw RuntimeException()