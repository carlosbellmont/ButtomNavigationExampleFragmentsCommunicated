import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cbellmont.avengersapp.databinding.FragmentAmarilloBinding

class FragmentAmarillo : Fragment() {

    private lateinit var binding: FragmentAmarilloBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAmarilloBinding.inflate(inflater, container, false)
        return binding.root
    }
}