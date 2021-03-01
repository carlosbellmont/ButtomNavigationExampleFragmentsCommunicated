import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cbellmont.avengersapp.databinding.FragmentRojoBinding

class FragmentRojo : Fragment() {

    private lateinit var binding: FragmentRojoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentRojoBinding.inflate(inflater, container, false)
        return binding.root
    }

}