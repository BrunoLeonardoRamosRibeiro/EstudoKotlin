package com.louzeiroribeiro.aulaactivityfragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var buttonAbrir: Button
    lateinit var buttonFecharApp: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("ciclo vida", "onCreate")

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        buttonAbrir = findViewById(R.id.button_abrir)

        buttonAbrir.setOnClickListener() {

            val intent = Intent(
                this,
                DetalhesActivity::class.java
            )

//            intent.putExtra("filme", "The Witcher")
//            intent.putExtra("classificacao", 5)
//            intent.putExtra("avaliacoes", 9.2)

            val filme = Filme(
                nome = "Sem limites",
                descricao ="Descrição teste",
                diretor = "Diretor teste",
                distribuidor = "Netflix",
                avaliacoes = 9.5
            )

            intent.putExtra("filme", filme)

            startActivity(intent)
        }

        buttonFecharApp = findViewById(R.id.button_fechar_app)

        buttonFecharApp.setOnClickListener() {
            finish()
        }


    }

    override fun onStart() {
        super.onStart()

        Log.i("ciclo vida", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i("ciclo vida", "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.i("ciclo vida", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo vida", "onStop")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i("ciclo vida", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo vida", "onDestroy")

    }


}