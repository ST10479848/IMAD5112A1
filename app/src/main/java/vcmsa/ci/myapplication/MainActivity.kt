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
// Get the references to the views from the layout
        val clickMeButton = findViewById<Button>(R.id.clickMeButton)

        val timeEditText = findViewById<EditText>(R.id.timeEditText)

        val foodOptiontextView = findViewById<TextView>(R.id.foodOptiontextView)
        
        val resetButton = findViewById<Button>(R.id.resetMeButton)
 // Set up the click me button
        clickMeButton?.setOnClickListener {
// Set up a rest Button to reset both options for the Text view and Edit View
            resetButton.setOnClickListener {
            timeEditText.text.clear()
           foodOptiontextView.text = ""
        }
// Default food option if option is incorrect
            var foodOption: String = "Unknown Option"
// Check the input from the EditText to output which food option to show
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

                                if (timeEditText.text.toString() == "After dinner snack") {
                                    foodOption = "Ice cream"


                                }

                            }

                        }
                    }
                }
            }
    // Set the text of the TextView to the selected food option
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
