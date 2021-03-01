import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cbellmont.avengersapp.MainActivityInterface
import com.cbellmont.avengersapp.databinding.FragmentRojoBinding

class FragmentRojo(val listener : MainActivityInterface) : Fragment() {

    private lateinit var binding: FragmentRojoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentRojoBinding.inflate(inflater, container, false)
        binding.root.setOnClickListener {
            listener.showToastInterface("Se ha hecho click en el fragment rojo")
        }
        return binding.root
    }



}