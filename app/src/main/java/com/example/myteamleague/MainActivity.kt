package com.example.myteamleague

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // teams
    val teams = arrayOf<String>("Barcelona",
        "Real Madrid",
        "Atletico Madrid",
        "Arsenal",
        "Man United")

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val teamsTextView = findViewById<TextView>(R.id.teamDisplay)

        teamsTextView.text = teams[0]

        teams[0] = "Barcelona"

        var teamDisplay = ""
        var counter = 0
        while (counter < teams.size) {
            teamDisplay += teams[counter] + "\n"
            counter++

        }
        fun getShortestString(strings: List<String>): String? {
            if (strings.isEmpty()) return null

            var shortest = strings[0]

            for (str in strings) {
                if (str.length < shortest.length) {
                    shortest = str
                }
            }

            return shortest
        }

        var shortestName = getShortestString(teams.toList())

        println("shortestName, $shortestName")



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
