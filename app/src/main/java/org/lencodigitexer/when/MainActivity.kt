package org.lencodigitexer.`when`

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val sdf = java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
        val sdf = java.text.SimpleDateFormat("HH:mm dd.MM.yyy")

        val button_date = findViewById<Button>(R.id.button) as Button
        val text_of_date = findViewById<TextView>(R.id.dateText) as TextView
        button_date.setOnClickListener{

            var rnds = (1000000000..2000000000).random().toLong()
            println(rnds)


            val date = java.util.Date(rnds * 1000)



            text_of_date.text = sdf.format(date)
        }
    }
}