package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    fun createBirthdayCard(view: android.view.View) {
//
//        val name = nameInput.editableText.toString()
////        Toast.makeText(this,"name is $name",Toast.LENGTH_LONG).show()
//
//        val intent = Intent(this,candleOff::class.java)
//        intent.putExtra(candleOff.NAME_EXTRA,name) //key-value pair
//        startActivity(intent)
//    }

    fun blow_candles(view: android.view.View) {

        val name = nameInput.editableText.toString()
        Toast.makeText(this,"name is $name",Toast.LENGTH_LONG).show()

        val intent_con = Intent(this,candleOn::class.java)
        intent_con.putExtra(candleOn.NAME_candleOn,name)
        startActivity(intent_con)
    }
}