package cat.copernic.fgascong.codelabgetstarted

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener() {
            rollDice()
        }

        val countButton:Button = findViewById(R.id.count_button)
        countButton.setOnClickListener(){
            countUp()
        }

        val resetButton:Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener(){
            reset()
        }
    }

    private fun rollDice(){
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val resultText:TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }

    private fun countUp(){

            var result:Int
            val resultText:TextView = findViewById(R.id.result_text)
            val text = resultText.text.toString()

            when(text) {
                "1", "2", "3", "4","5" -> result = Integer.parseInt(text) + 1
                "6" -> result = Integer.parseInt(text)
                else -> result = 1
            }

            resultText.text = result.toString()
    }

    private fun reset(){
        val resultText:TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }
}