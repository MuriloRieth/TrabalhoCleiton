package com.exemplo.gestaodesporte

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSportsList = findViewById<Button>(R.id.btnSportsList)
        val btnProfile = findViewById<Button>(R.id.btnProfile)

        btnSportsList.setOnClickListener {
            // Navegação para a tela de lista de esportes
            val intent = Intent(this, SportsListActivity::class.java)
            startActivity(intent)
        }

        btnProfile.setOnClickListener {
            // Navegação para a tela de perfil
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
