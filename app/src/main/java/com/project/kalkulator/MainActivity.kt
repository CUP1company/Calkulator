package com.project.kalkulator

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    @SuppressLint("SourceLockedOrientationActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        var number = ""
        var number2 = ""

        var operation = ""
        val topView:TextView = findViewById(R.id.top_side_number)
        val bottomView:TextView = findViewById(R.id.botom_side_number)

        findViewById<Button>(R.id.ac).setOnClickListener{
            number = ""
            number2 = ""
            bottomView.text = "0"
            topView.text = ""
        }

        findViewById<Button>(R.id.del).setOnClickListener{
            if (number.isNotEmpty() && number!="0") {
                number = number.substring(0, number.length - 1)
                bottomView.text = number
            }
            if (number.isEmpty()) {
                number = ""
                bottomView.text = "0"
            }

        }

        findViewById<Button>(R.id.seven).setOnClickListener{
            number += "7"
            bottomView.text = number
        }

        findViewById<Button>(R.id.eight).setOnClickListener{
            number += "8"
            bottomView.text = number
        }

        findViewById<Button>(R.id.nine).setOnClickListener{
            number += "9"
            bottomView.text = number
        }

        findViewById<Button>(R.id.chet).setOnClickListener{
            number += "4"
            bottomView.text = number
        }

        findViewById<Button>(R.id.fif).setOnClickListener{
            number += "5"
            bottomView.text = number
        }

        findViewById<Button>(R.id.six).setOnClickListener{
            number += "6"
            bottomView.text = number
        }

        findViewById<Button>(R.id.tree).setOnClickListener{
            number += "3"
            bottomView.text = number
        }

        findViewById<Button>(R.id.dva).setOnClickListener{
            number += "2"
            bottomView.text = number
        }

        findViewById<Button>(R.id.odin).setOnClickListener{
            number += "1"
            bottomView.text = number
        }

        findViewById<Button>(R.id.nul).setOnClickListener{
            number += "0"
            bottomView.text = number
        }

        findViewById<Button>(R.id.point).setOnClickListener{
            number += "."
            bottomView.text = number
        }

        findViewById<Button>(R.id.settings).setOnClickListener{
            val intent = Intent(this@MainActivity, Referents::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.ymnog).setOnClickListener{
            number2 = number
            val elem = "$number╳"
            topView.text = elem
            number = ""
            operation = "*"
            bottomView.text = ""
        }

        findViewById<Button>(R.id.delit).setOnClickListener{
            number2 = number
            val elem = "$number÷"
            topView.text = elem
            number = ""
            operation = "/"
            bottomView.text = ""
        }

        findViewById<Button>(R.id.minus).setOnClickListener{
            number2 = number
            val elem = "$number-"
            topView.text = elem
            number = ""
            operation = "-"
            bottomView.text = ""
        }

        findViewById<Button>(R.id.plus).setOnClickListener{
            number2 = number
            val elem = "$number+"
            topView.text = elem
            number = ""
            operation = "+"
            bottomView.text = ""
        }

        findViewById<Button>(R.id.ravno).setOnClickListener{
            val x: Float = number2.toFloat()
            val y: Float = number.toFloat()

            if(operation == "/"){
                val gg = x / y
                val answer:String = gg.toString()
                number = answer
                bottomView.text = answer
            }

            if(operation == "+"){
                val gg: Float = x + y
                val answer:String = gg.toString()
                number = answer
                bottomView.text = answer
            }

            if(operation == "*"){
                val gg: Float = x * y
                val answer:String = gg.toString()
                number = answer
                bottomView.text = answer
            }

            if(operation == "-"){
                val gg: Float = x - y
                val answer:String = gg.toString()
                number = answer
                bottomView.text = answer

            }

        }
    }






}
