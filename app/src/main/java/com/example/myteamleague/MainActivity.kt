package com.example.myteam

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // teams
    val teams = arrayof<String>("Barcelona",
        "Real Madrid",
        "Atletico Madrid",
        "Arsenal",
        "Man United")

    private fun arrayof(
        string: String,
        string2: String,
        string3: String,
        string4: String,
        string5: String
    ) {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val teamsTextView = findViewById<TextView>(R.id.teamsTextView)

        teamsTextView.text = teams[0]

        teams[0] = "Real Madrid"



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
