package com.example.tablayout

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    @SuppressLint("ResourceAsColor")
    fun add(view: View) {
        val version = findViewById<EditText>(R.id.androidVersion)
        val codeName = findViewById<EditText>(R.id.androidName)
        val tbl = findViewById<TableLayout>(R.id.tbl)

        val tableVersion = TextView(applicationContext)
        tableVersion.setBackgroundResource(R.drawable.border)
        tableVersion.setTextColor(R.color.black)
        tableVersion.text = version.text.toString()

        val tableCode = TextView(applicationContext)
        tableCode.setBackgroundResource(R.drawable.border)
        tableCode.setTextColor(R.color.black)
        tableCode.text = codeName.text.toString()

        var tableRow = TableRow(applicationContext)//this

        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        layoutParams.setMargins(0,0,0,10)
        tableRow.setLayoutParams(layoutParams)

        // add values into row by calling addView()
        tableRow.addView(tableVersion,0,layoutParams)//***required to pass layoutParams, if not margin not working
        tableRow.addView(tableCode,1,layoutParams)
        // Finally add the created row row into layout
        tbl.addView(tableRow, layoutParams)




    }
}