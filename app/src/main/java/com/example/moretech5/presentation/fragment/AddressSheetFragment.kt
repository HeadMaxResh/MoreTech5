package com.example.moretech5.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.moretech5.databinding.FragmentSheetAddressBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class AddressSheetFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentSheetAddressBinding? = null
    private val binding: FragmentSheetAddressBinding
        get() = _binding ?: throw java.lang.RuntimeException("FragmentSheetAddressBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSheetAddressBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}