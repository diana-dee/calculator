package com.example.converter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

   val btnConverter = findViewById<Button>(R.id.btnConvert)
   val btnE = findViewById<Button>(R.id.btnExit)
        val edMm = findViewById<EditText>(R.id.edMillimeters)
        val textV = findViewById<TextView>(R.id.txtInches)

        btnConverter.setOnClickListener(){
            val strMillimeters : String= edMm.getText().toString()
            if (strMillimeters.equals("")){
                edMm.setError("Please Enter Millimeters")
                edMm.requestFocus()
               finish()
            }

            val  millimetre : Float =strMillimeters.toFloat()
              //1 mile is equal to 1.609344 kilometers:
            val  inches: Float =  (millimetre*0.0394).toFloat()

        }

    btnE.setOnClickListener(){
            val  intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

}
}

private fun View.text(inches: Float): Any {
    TODO("Not yet implemented")
}

