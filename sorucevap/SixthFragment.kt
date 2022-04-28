package com.serdar.sorucevap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.serdar.sorucevap.databinding.FragmentFourthBinding
import com.serdar.sorucevap.databinding.FragmentSixthBinding


class SixthFragment : Fragment() {
    private lateinit var cevap: FragmentSixthBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cevap = FragmentSixthBinding.inflate(inflater,container,false)
        cevap.button8.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_sixthFragment_to_firstFragment)



        }


        return cevap.root
    }
}