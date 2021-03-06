package tk.paulmburu.moviesreview.details


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import tk.paulmburu.moviesreview.R
import tk.paulmburu.moviesreview.databinding.FragmentDetailBinding

/**
 * A simple [Fragment] subclass.
 */
class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        @Suppress("UNUSED_VARIABLE")
        val application = requireNotNull(activity).application
        val binding = FragmentDetailBinding.inflate(inflater)
        binding.setLifecycleOwner(this)
        // Get the selectedProperty from the fragment arguments with DetailFragmentArgs
        val movieResult = DetailFragmentArgs.fromBundle(arguments!!).selectedMovie

        // Create the DetailViewModelFactory using the movieResult and application
        val viewModelFactory = DetailViewModelFactory(movieResult, application)

        // Get the DetailViewModel from the DetailViewModelFactory and set it in the binding
        binding.viewModel = ViewModelProviders.of(
            this, viewModelFactory).get(DetailViewModel::class.java)

        return binding.root

    }
}
