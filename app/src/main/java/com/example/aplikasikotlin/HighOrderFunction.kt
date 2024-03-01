package com.example.aplikasikotlin

fun main() {
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter)) //  lambda waterfilter digunakan sebagai argument
    println(updateDirty(15, ::increaseDirty)) // tanda :: melempar fungsi lain sebagai argument

    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23} // last parameter call syntax
    println(dirtyLevel)

}

// High Order Function
// Argument1 : dirty dengan tipe data Int
// Argument2 : fungsi lambda operation dengan tipe data Int dan mengeluarkan output Int
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

// Compact function
fun increaseDirty( start: Int ) = start + 1




