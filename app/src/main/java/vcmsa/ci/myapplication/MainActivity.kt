package vcmsa.ci.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val clickMeButton = findViewById<Button>(R.id.clickMeButton)

        val timeEditText = findViewById<EditText>(R.id.timeEditText)

        val foodOptiontextView = findViewById<TextView>(R.id.foodOptiontextView)

        clickMeButton?.setOnClickListener {

            var foodOption: String = "Unknown Option"

            if (timeEditText.text.toString() == "Morning") {
                foodOption = "Eggs"
            } else {

                if (timeEditText.text.toString() == "Mid-morning") {
                    foodOption = "Fruits"
                } else {

                    if (timeEditText.text.toString() == "Afternoon") {
                        foodOption = "Sandwiches"
                    } else {

                        if (timeEditText.text.toString() == "Mid-afternoon") {
                            foodOption = "Cake"
                        } else {

                            if(timeEditText.text.toString() == "Dinner") {
                                foodOption = "Pasta"
                            } else {

                                (timeEditText.text.toString() == "After-dinner-snack") {
                                    foodOption = "Ice cream"

                                }

                            }

                        }
                    }
                }
            }
            foodOptiontextView.text = foodOption







        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

private operator fun Boolean.invoke(value: () -> Unit) {

}
