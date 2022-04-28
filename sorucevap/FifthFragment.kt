package com.serdar.sorucevap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.serdar.sorucevap.databinding.FragmentFifthBinding
import com.serdar.sorucevap.databinding.FragmentSixthBinding


class FifthFragment : Fragment() {
    private lateinit var cevap: FragmentFifthBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cevap = FragmentFifthBinding.inflate(inflater,container,false)
        cevap.button9.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_fifthFragment_to_firstFragment)



        }


        return cevap.root
    }
}