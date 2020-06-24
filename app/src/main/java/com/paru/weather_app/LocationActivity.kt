package com.paru.weather_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LocationActivity : AppCompatActivity() {

    lateinit var etlocation:EditText
    lateinit var btnSearch:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)

        etlocation=findViewById(R.id.etlocation)
        btnSearch=findViewById(R.id.btnSearch)

        btnSearch.setOnClickListener{
            if (etlocation.text.isNotEmpty())
            {
                val intent=Intent(this@LocationActivity,MainActivity::class.java)
                intent.putExtra("location",etlocation.text.toString())
                startActivity(intent)
                etlocation.setText("")
            }
            else
            {
                Toast.makeText(this@LocationActivity,"Please enter Location!",Toast.LENGTH_SHORT).show()
            }

        }
    }
}
