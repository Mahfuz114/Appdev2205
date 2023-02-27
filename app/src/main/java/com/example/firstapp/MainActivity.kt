import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up the button click listener
        calculateButton.setOnClickListener {
            calculateBMI()
        }
    }

    private fun calculateBMI() {
        // Get the user's input from the EditText fields
        val weight = weightEditText.text.toString().toDouble()
        val height = heightEditText.text.toString().toDouble()

        // Calculate the BMI
        val bmi = weight / (height * height)

        // Display the result
        resultTextView.text = "Your BMI is ${"%.2f".format(bmi)}"
    }
}