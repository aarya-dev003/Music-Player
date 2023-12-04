package com.example.musicplayer.fragments
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.musicplayer.R
import com.example.musicplayer.R.id.register_frame_layout
import com.example.musicplayer.databinding.FragmentSignInBinding
class SignInFragment : Fragment() {

    private lateinit var binding: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment using View Binding
        binding = FragmentSignInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.submitButton.setOnClickListener {
            // Handle submit button click
        }

        binding.signupButton.setOnClickListener {
            val signUpFragment = SignUpFragment()

            // Perform fragment transaction
            requireActivity().supportFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.from_right, R.anim.out_from_left)
                .replace(register_frame_layout, signUpFragment)
                .addToBackStack(null)
                .commit()
        }
    }
}
