package com.example.myapplication.dataTypeAndVariable.sampledata

class DataTypes {
}

// This is the main function
fun main() {
    // There are 2 types of data types in kotlin
    // 1. Primitive data types
    // 2. Non-primitive data types


    // 1. Primitive data types
    /*
    Syntax:
    val/var variableName: DataType = value
     */
    // Byte
    val byte: Byte = 1
    // Short
    val short: Short = 1
    // Int
    val int: Int = 1
    // Long
    val long: Long = 1
    // Float
    val float: Float = 1.0f
    // Double
    val double: Double = 1.0
    // Char
    val char: Char = 'A'
    // Boolean
    val boolean: Boolean = true
    /*
    Note: In Kotlin, we have type inference, so we don't need to specify the data type explicitly.
    For example, we can write the above code like this:
    val byte = 1
    val short = 1
    val int = 1
    val long = 1
    val float = 1.0f
    val double = 1.0
    val char = 'A'
    val boolean = true
     */

    // 2. Non-primitive data types
    // String
    val string: String = "Hello World"
    // Array
    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    // List
    val list: List<Int> = listOf(1, 2, 3, 4, 5)
    // Set
    val set: Set<Int> = setOf(1, 2, 3, 4, 5)
    // Map
    val map: Map<Int, String> = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    /*
    Note: In Kotlin, it's not necessary to import libraries to use collections cause of standard library containing them.
        And if we want to have mutable collections, we can use mutableListOf, mutableSetOf, and mutableMapOf.
        For example:
        val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
        val mutableSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
        val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "One", 2 to "Two", 3 to "Three")

     */

    // 3. Null types

    var nullable: String? = "John"
    nullable = null

    // 4. Any type
    /*
   Compared to Object types in Java, Kotlin has Any type which is the root of the Kotlin class hierarchy.
    */
    var any: Any? = 1
    any = "Hello"
    any = true
    any = 1.0
    any = 'A'
    any = null
    any = arrayOf(1, 2, 3, 4, 5)
    any = map
    println(any.toString())
}
