package com.example.tp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val edtValor1 = findViewById<EditText>(R.id.edt_valor1)
        val edtValor2 = findViewById<EditText>(R.id.edt_valor2)
        val Somar = findViewById<Button>(R.id.somar)
        val Dividir = findViewById<Button>(R.id.dividir)
        val Multiplicar = findViewById<Button>(R.id.mutiplicar)
        val Subtrair = findViewById<Button>(R.id.subtrair)

        Somar.setOnClickListener {
            val result = edtValor1.text.toString().toInt() + edtValor2.text.toString().toInt()
            Toast.makeText(this, "O valor é ${result.toString()}", Toast.LENGTH_SHORT).show()

        }

        Dividir.setOnClickListener {
                val result = edtValor1.text.toString().toInt() / edtValor2.text.toString().toInt()
                Toast.makeText(this, "O valor é ${result.toString()}", Toast.LENGTH_SHORT).show()

        }
        Multiplicar.setOnClickListener {
            val result = edtValor1.text.toString().toInt() * edtValor2.text.toString().toInt()
            Toast.makeText(this, "O valor é ${result.toString()}", Toast.LENGTH_SHORT).show()

        }
        Subtrair.setOnClickListener {
            val result = edtValor1.text.toString().toInt() - edtValor2.text.toString().toInt()
            Toast.makeText(this, "O valor é ${result.toString()}", Toast.LENGTH_SHORT).show()


        }


    }
}