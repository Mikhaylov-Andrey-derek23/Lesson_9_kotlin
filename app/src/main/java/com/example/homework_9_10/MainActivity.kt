package com.example.homework_9_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val textList = listOf(
            "Never regret anything that made you smile.– Mark Twain",
            "Every moment is a fresh beginning – T.S Eliot",
            "Everything you can imagine is real. – Pablo Picasso",
            "If you change the way you look at things, the things you look at change. – Wayne Dyer",
            "The manifesto of the dealmaker is simple: Reality is negotiable. – Tim Ferriss",
        )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton = findViewById<Button>(R.id.btn)
        val myTextView = findViewById<TextView>(R.id.txt)
        myTextView.text = textList.random()

        myButton.setOnClickListener {
            myTextView.text = textList.random()
        }

    }
}