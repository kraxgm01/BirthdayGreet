package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_birthday_greeting.BirthdayGreeting
import kotlinx.android.synthetic.main.activity_candle_on.*
import kotlinx.android.synthetic.main.activity_main.*

class candleOn : AppCompatActivity() {

    companion object{
        const val NAME_candleOn = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_candle_on)

        val name = intent.getStringExtra(NAME_candleOn)
        BirthdayGreeting.text = "Hey, \n$name"

        blowCandles.setOnClickListener{
            val intent = Intent(this,candleOff::class.java)
            intent.putExtra(candleOff.NAME_EXTRA,name) //key-value pair
            startActivity(intent)
        }
    }

//    fun createBirthdayCard(view: android.view.View) {
//        val name = nameInput.editableText.toString()
////        Toast.makeText(this,"name is $name",Toast.LENGTH_LONG).show()
//
//        val intent = Intent(this,candleOff::class.java)
//        intent.putExtra(candleOff.NAME_EXTRA,name) //key-value pair
//        startActivity(intent)
//    }
}