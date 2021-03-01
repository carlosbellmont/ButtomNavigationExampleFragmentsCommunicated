import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cbellmont.avengersapp.MainActivity
import com.cbellmont.avengersapp.databinding.FragmentRojoBinding
import com.cbellmont.avengersapp.databinding.FragmentTextViewBinding

class FragmentTextView : Fragment() {

    private lateinit var binding: FragmentTextViewBinding


    // En este fragment pasamos información a MainActivity de manera sencilla
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTextViewBinding.inflate(inflater, container, false)
        binding.textView.text = arguments?.getString("CLAVE_1") ?: "No hay valor"
        binding.textView.setOnClickListener {
            if (activity is MainActivity) {
                (activity as MainActivity).showToast("Se ha hecho click en el text view")
            }
        }
        return binding.root
    }

}