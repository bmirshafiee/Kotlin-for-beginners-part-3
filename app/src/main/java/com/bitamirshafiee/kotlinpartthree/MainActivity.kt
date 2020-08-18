package com.bitamirshafiee.kotlinpartthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number: Int = 19

        var result: String = ""

        if (number % 2 == 0) {
            result = "even"
        } else {
            result = "odd"
        }

        Log.d("KotlinForBeginnersPat3", result)

        val myFirstNumber: Float = 45.6f
        val mySecondNumber: Float = 50.9f

        val max = if (myFirstNumber > mySecondNumber) {
            myFirstNumber
        } else {
            mySecondNumber
        }

        Log.d("KotlinForBeginnersPat3", "max number is : $max")

        val age: Int = 30

        val ageRange = if (age <= 12) {
            "child"
        } else if (age > 12 && age < 17) {
            "Teen"
        } else if (age in 18..21) {
            "Young Adult"
        } else if (age in 22..30) {
            "Adult"
        } else if (age in 31..50) {
            "Middle Age"
        } else {
            "Old"
        }

        Log.d("KotlinForBeginnersPat3", ageRange)


        val dayOfWeek: Int = 7

        val day = when (dayOfWeek) {
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Invalid Day"
        }

        Log.d("KotlinForBeginnersPat3", "day of week is : $day")


        val toDo = when (dayOfWeek) {
            in 1..5 -> "Go to School"
            in 6..7 -> "Have fun, it is weekend"
            else -> "Invalid day"
        }
        Log.d("KotlinForBeginnersPat3", "What to do today : $toDo")

        val myNumber = 156

        val numberOfDigits = when (myNumber) {
            in 1..9 -> "One Digit Number"
            in 10..99 -> "Two Digits Number"
            in 100..999 -> "Three Digits Number"
            else -> "Four or More Than Four Digits"
        }

        Log.d("KotlinForBeginnersPat3", "Number of Digits are : $numberOfDigits")

        val numberTypeGuess: Any = 19.000000

        val numberDataType = when (numberTypeGuess) {

            is Int -> "Int"
            is Float -> "Float"
            is String -> "String"
            is Boolean -> "Boolean"
            is Array<*> -> "Array"
            else -> "Invalid Data Type or Haven't been studied yet"
        }
        Log.d("KotlinForBeginnersPat3", "Number Type is : $numberDataType")

        var myNumberIncreasing: Int = 1

        while (myNumberIncreasing < 10) {
            myNumberIncreasing += 1
            Log.d("KotlinForBeginnersPat3", "While, My Increased Number is : $myNumberIncreasing")
        }

        do {
            myNumberIncreasing += 1
            Log.d(
                "KotlinForBeginnersPat3",
                "Do-while, My Increased Number is : $myNumberIncreasing"
            )
        } while (myNumberIncreasing < 10)


        for (i in 1..5) {
            Log.d("KotlinForBeginnersPat3", "i in Range is : $i")
        }

        for (i in 5 downTo 1) {
            Log.d("KotlinForBeginnersPat3", "i in Reversed Range is : $i")
        }

        for (i in 5..20 step 2) {
            Log.d("KotlinForBeginnersPat3", "i in Advance 2 : $i")
        }

        val myArray: Array<String> =
            arrayOf("android", "Q", "Kotlin", "practice as much as you can", "developer")

        for (element in myArray) {
            Log.d("KotlinForBeginnersPat3", "elements of Array : $element ")
        }

        for (index in myArray.indices) {
            Log.d("KotlinForBeginnersPat3", "myArray[$index] = ${myArray[index]} ")
        }

        for ((index, element) in myArray.withIndex()) {
            Log.d("KotlinForBeginnersPat3", "myArray[$index] = $element")
        }

        val myString: String? = "Bita"

        Log.d("KotlinForBeginnersPat3", "null safe operator : ${myString?.length}")

        myString?.let {
            Log.d("KotlinForBeginnersPat3", "let operator : ${it.length}")
        }

        val length = if (myString != null) {
            myString.length
        } else {
            -1
        }

        val length2 = myString?.length ?: -1

        Log.d("KotlinForBeginnersPat3", "elvis operator : $length")
        Log.d("KotlinForBeginnersPat3", "elvis operator : $length2")

        val length3 = myString!!.length
        Log.d("KotlinForBeginnersPat3", "double bang operator : $length3")

    }
}