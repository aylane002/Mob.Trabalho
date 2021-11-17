package com.example.trabalho1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.view.View
import android.widget.EditText
import android.widget.TextView




/*import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.* */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peso = findViewById(R.id.editTextTextPersonName3) as EditText
        val altura = findViewById(R.id.editTextTextPersonName2) as EditText
        val imc = findViewById(R.id.editTextTextPersonName) as EditText
        val botao = findViewById(R.id.button2) as Button

        botao.setOnClickListener() {
            val p = (peso.text).toString().toFloat();
            val a = (altura.text).toString().toFloat();
            //var i = (imc.text).toString().toFloat();

            val result = p / (a * a)
            imc.setText(result.toString())

            if (result < 16) {
                val mensagem = findViewById<TextView>(R.id.textView4)
                mensagem.text = "Magreza Grave"
            } else if (result >= 16 && result <= 17) {
                val mensagem = findViewById<TextView>(R.id.textView4)
                mensagem.text = "Magreza Moderada"
            } else if (result >= 17 && result <= 18.5) {
                val mensagem = findViewById<TextView>(R.id.textView4)
                mensagem.text = "Magreza Leve"
            } else if (result >= 18.5 && result <= 25) {
                val mensagem = findViewById<TextView>(R.id.textView4)
                mensagem.text = "Saudavel"
            } else if (result >= 25 && result <= 30) {
                val mensagem = findViewById<TextView>(R.id.textView4)
                mensagem.text = "Sobrepeso"
            } else if (result >= 30 && result <= 35) {
                val mensagem = findViewById<TextView>(R.id.textView4)
                mensagem.text = "Obesidade Grau 1"
            } else if (result >= 35 && result <= 40) {
                val mensagem = findViewById<TextView>(R.id.textView4)
                mensagem.text = "Obesidade Grau 2"
            } else if (result >= 40) {
                val mensagem = findViewById<TextView>(R.id.textView4)
                mensagem.text = "Obesidade Grau 3"
            }
        }

        }


        override fun onStart() {
            super.onStart();

        }

        override fun onResume() {
            super.onResume();

        }

    override  fun  onPause () {
        super .onPause();

    }
        override fun onStop() {
            super.onStop();

        }

        override fun onDestroy() {
            super.onDestroy();
        }

}