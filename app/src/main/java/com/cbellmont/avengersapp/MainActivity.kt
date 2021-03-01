package com.cbellmont.avengersapp

import FragmentAmarillo
import FragmentRojo
import FragmentTextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cbellmont.avengersapp.databinding.ActivityMainBinding

interface MainActivityInterface{
    fun showToastInterface(text : String)
}

class MainActivity : AppCompatActivity(), MainActivityInterface {

    lateinit var binding : ActivityMainBinding

    private var numClick = 0

    // Icónos gracias a <div>Iconos diseñados por <a href="https://icon54.com/" title="Pixel perfect">Pixel perfect</a> from <a href="https://www.flaticon.es/" title="Flaticon">www.flaticon.es</a></div>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        changeFragment(FragmentTextView())

        binding.navigationBottom.setOnNavigationItemSelectedListener { itemSelected ->
            when (itemSelected.itemId) {
                R.id.option_1 -> {
                    val fragmentTextView = FragmentTextView()
                    val bundle = Bundle()
                    numClick++
                    bundle.putString("CLAVE_1", "Se ha hecho click $numClick")
                    fragmentTextView.arguments = bundle
                    changeFragment(fragmentTextView)
                }
                R.id.option_2 -> {
                    changeFragment(FragmentRojo(this))
                }
                R.id.option_3 -> {
                    changeFragment(FragmentAmarillo())
                }
            }
            true
        }
    }

    private fun changeFragment(fragment : Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.frameLayout.id, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    fun showToast(text : String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

    override fun showToastInterface(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

}