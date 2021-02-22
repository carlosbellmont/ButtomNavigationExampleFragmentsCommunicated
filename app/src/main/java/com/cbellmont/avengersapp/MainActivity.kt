package com.cbellmont.avengersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.cbellmont.avengersapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    // Icónos gracias a <div>Iconos diseñados por <a href="https://icon54.com/" title="Pixel perfect">Pixel perfect</a> from <a href="https://www.flaticon.es/" title="Flaticon">www.flaticon.es</a></div>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navigationBottom.setOnNavigationItemSelectedListener { itemSelected ->
            when (itemSelected.itemId) {
                R.id.option_1 -> {
                    Toast.makeText(this,"1- Clicked on ${itemSelected.title}", Toast.LENGTH_LONG ).show()
                }
                R.id.option_2 -> {
                    Toast.makeText(this, "2- Clicked on ${itemSelected.title}", Toast.LENGTH_LONG ).show()
                }
                R.id.option_3 -> {
                    Toast.makeText(this, "3- Clicked on ${itemSelected.title}", Toast.LENGTH_LONG ).show()
                }
            }
            true
        }
    }
}