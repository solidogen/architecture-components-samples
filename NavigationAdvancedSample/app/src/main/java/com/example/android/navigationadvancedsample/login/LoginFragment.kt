package com.example.android.navigationadvancedsample.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.navigationadvancedsample.R
import com.example.android.navigationadvancedsample.databinding.FragmentLoginBinding
import kotlin.random.Random

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding: FragmentLoginBinding get() = _binding!!

    private val myId = Random.nextInt()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentLoginBinding.inflate(inflater, container, false)
        .also { _binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.loginLabel.text = "${binding.loginLabel.text} $myId"
        binding.loginButton.setOnClickListener { findNavController().navigate(R.id.action_go_to_home) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
