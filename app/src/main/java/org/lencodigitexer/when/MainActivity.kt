package org.lencodigitexer.`when`

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
        var text_of_input_old = "".toString()
        // text_of_input_old = ""

        button_date.setOnClickListener{
            // ищем поле
            var text_of_input = findViewById<EditText>(R.id.eventText)

            //берем актуальный текст из поля
            var text_of_input_text = text_of_input.text.toString()

            if (text_of_input_text.toString() == "".toString()){
                text_of_date.text = "Поле пустое"
            }

            //если поле не пустое
            else if (text_of_input_text.toString() != "".toString()){

                //если тексты разные
                if (text_of_input_text.toString() != text_of_input_old.toString()){
                    // выводим статус текущего текста
                    println(text_of_input_text)
                    println(text_of_input_old)

                    // и сохраняем этот текст в text_of_input_old
                    text_of_input_old = text_of_input_text

                    //вывод даты
                    var rnds = (1000000000..2000000000).random().toLong()
                    val date = java.util.Date(rnds * 1000)
                    text_of_date.text = sdf.format(date)
                }
            }



            /*
            println(text_of_input_text)
            println(text_of_input_old)

            var rnds = (1000000000..2000000000).random().toLong()
            val date = java.util.Date(rnds * 1000)
            text_of_date.text = sdf.format(date) */

        }
    }
}