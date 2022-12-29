package my.edu.tarc.set1loosengxianrds2g1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.edu.tarc.set1loosengxianrds2g1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonResult.setOnClickListener {
            val healthy = binding.checkBoxHealth.isChecked
            val age = binding.checkBoxAge.isChecked
            val sleep = binding.checkBoxSleep.isChecked
            val weight_between = binding.radioButtonBetween.isChecked
            val weight_under = binding.radioButtonUnder.isChecked
            val weight_over = binding.radioButtonOver.isChecked

            if (healthy&&age&&sleep){
                if(weight_between){
                    binding.textViewResult.text = "You Are Eligible to Donate a Max Amount of 350ml of Blood"
                }else{
                    if(weight_under){
                        binding.textViewResult.text = "You Are Not Eligible to Donate Blood"
                    }else{
                        if(weight_over){
                            binding.textViewResult.text = "You Are Eligible to Donate a Max Amount of 450ml of Blood"
                        }
                    }
                }
            }else{
                binding.textViewResult.text = "You Are Not Eligible to Donate Blood"
            }

        }

    }
}