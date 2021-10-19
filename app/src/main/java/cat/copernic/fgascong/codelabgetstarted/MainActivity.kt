package cat.copernic.fgascong.codelabgetstarted

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener() {
            rollDice()
        }
    }

    private fun rollDice(){
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}