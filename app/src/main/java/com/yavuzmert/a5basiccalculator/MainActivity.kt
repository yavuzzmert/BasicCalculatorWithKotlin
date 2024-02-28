package com.yavuzmert.a5basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yavuzmert.a5basiccalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var number1 : Double? = null
    var number2 : Double? = null
    var result : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun plus(view: View)
    {
        number1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){
            result = (number1!! + number2!!).toDouble()
            binding.resultText.text = "Result: ${result.toString()}"
        } else {
            binding.resultText.text = "Enter number!"

        }

        clearInputs()
    }

    fun clearInputs(){
        binding.editTextNumber1.setText("")
        binding.editTextNumber2.setText("")
    }

    fun minus(view: View)
    {
        number1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){
            result = (number1!! - number2!!).toDouble()
            binding.resultText.text = "Result: ${result.toString()}"
        } else {
            binding.resultText.text = "Enter number!"

        }

        clearInputs()
    }
    fun multiply(view: View)
    {
        number1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){
            result = (number1!! * number2!!).toDouble()
            binding.resultText.text = "Result: ${result.toString()}"
        } else {
            binding.resultText.text = "Enter number!"

        }

        clearInputs()
    }

    fun divide(view: View)
    {
        number1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){
            result = (number1!! / number2!!).toDouble()
            binding.resultText.text = "Result: ${result.toString()}"
        } else {
            binding.resultText.text = "Enter number!"

        }

        clearInputs()
    }
}