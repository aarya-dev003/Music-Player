package com.example.musicplayer.fragments
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.musicplayer.R
import com.example.musicplayer.R.id.register_frame_layout

import com.example.musicplayer.databinding.FragmentSignUpBinding
class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment using View Binding
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.registerBtn.setOnClickListener {
            // Handle submit button click
        }

        binding.signin.setOnClickListener {
            val signInFragment = SignInFragment()

            // Perform fragment transaction
            requireActivity().supportFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.from_left, R.anim.out_from_right)
                .replace(register_frame_layout, signInFragment)
                .addToBackStack(null)
                .remove(this@SignUpFragment)
                .commit()
        }
    }
}
