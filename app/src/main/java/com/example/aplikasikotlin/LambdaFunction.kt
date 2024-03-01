package com.example.aplikasikotlin

// Lambda Function
fun main() {
    var dirtyLevel = 20
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilter(dirtyLevel))
}