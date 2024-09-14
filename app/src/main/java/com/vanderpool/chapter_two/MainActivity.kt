package com.vanderpool.chapter_two

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.True)
        falseButton = findViewById(R.id.False)

        trueButton.setOnClickListener { Toast.makeText(this,R.string.Correct, Toast.LENGTH_LONG).show() }
        falseButton.setOnClickListener { Toast.makeText(this,R.string.Incorrect, Toast.LENGTH_LONG).show() }

        Snackbar.make(trueButton, "Correct", Snackbar.LENGTH_LONG).show()
        Snackbar.make(falseButton, "Incorrect", Snackbar.LENGTH_LONG).show()

    }
}