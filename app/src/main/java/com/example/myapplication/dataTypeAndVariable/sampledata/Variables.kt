package com.example.myapplication.dataTypeAndVariable.sampledata

class Variables {

    // This is the main function
    fun main() {
        // There are 2 keywords val and var
        // val is used to declare a read-only variable(final in java)
        val name = "John"
        //name = "Doe" // This will give an error because name is a read-only variable
        // var is used to declare a mutable variable
        var age = 20
        age = 21 // This will not give an error because age is a mutable variable
    }
}