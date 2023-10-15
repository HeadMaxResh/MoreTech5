package com.example.moretech5.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.moretech5.R
import com.example.moretech5.databinding.FragmentDepartmentBinding
import com.example.moretech5.databinding.FragmentHomeBinding

class DepartmentFragment : Fragment() {

    private var _binding: FragmentDepartmentBinding? = null
    private val binding: FragmentDepartmentBinding
        get() = _binding ?: throw java.lang.RuntimeException("FragmentDepartmentBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDepartmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}