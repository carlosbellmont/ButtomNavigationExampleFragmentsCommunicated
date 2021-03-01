import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cbellmont.avengersapp.databinding.FragmentRojoBinding
import com.cbellmont.avengersapp.databinding.FragmentTextViewBinding

class FragmentTextView : Fragment() {

    private lateinit var binding: FragmentTextViewBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTextViewBinding.inflate(inflater, container, false)
        return binding.root
    }

}