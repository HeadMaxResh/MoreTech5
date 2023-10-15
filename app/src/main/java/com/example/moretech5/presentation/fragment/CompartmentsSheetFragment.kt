package com.example.moretech5.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.moretech5.R
import com.example.moretech5.databinding.FragmentCompartmentsSheetBinding
import com.example.moretech5.databinding.FragmentHomeBinding

class CompartmentsSheetFragment : Fragment() {

    private var _binding: FragmentCompartmentsSheetBinding? = null
    private val binding: FragmentCompartmentsSheetBinding
        get() = _binding ?: throw java.lang.RuntimeException("FragmentCompartmentsSheetBinding == null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCompartmentsSheetBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}