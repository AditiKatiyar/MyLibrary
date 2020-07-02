package com.example.my_library

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.my_library.databinding.MyFragmentBinding

class MyFragment : Fragment() {
    companion object {
        fun getInstance(): MyFragment {
            return MyFragment()
        }
    }

    private lateinit var binding: MyFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.my_fragment, container, false)
        return binding.root
    }
}