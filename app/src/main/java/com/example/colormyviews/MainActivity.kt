package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.colormyviews.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        listOf(binding.boxOne, binding.boxTwo, binding.boxThree, binding.boxFour,
            binding.boxFive, binding.boxSix, binding.boxSeven, binding.boxEight,
            binding.button1, binding.button2, binding.button3, binding.constraintLayout)
            .forEach { view ->
                view.setOnClickListener { makeColour(it) }
            }
    }

    private fun makeColour(view: View) {
        when(view.id){
            R.id.boxOne -> view.setBackgroundColor(Color.YELLOW)
            R.id.boxTwo -> view.setBackgroundColor(Color.DKGRAY)
            R.id.boxThree -> view.setBackgroundColor(Color.LTGRAY)
            R.id.boxFour -> view.setBackgroundColor(Color.MAGENTA)
            R.id.boxFive -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.boxSix -> view.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.boxSeven -> view.setBackgroundResource(android.R.color.holo_purple)
            R.id.boxEight -> view.setBackgroundResource(android.R.color.holo_red_light)
            R.id.button1 -> binding.boxOne.setBackgroundResource(R.color.btn1)
            R.id.button2 -> binding.boxTwo.setBackgroundResource(R.color.btn2)
            R.id.button3 -> binding.boxThree.setBackgroundResource(R.color.btn3)
            else -> view.setBackgroundColor(Color.BLUE)
        }
    }
}