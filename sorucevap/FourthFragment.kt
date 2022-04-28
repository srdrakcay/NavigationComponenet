package com.serdar.sorucevap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.serdar.sorucevap.databinding.FragmentFourthBinding
import com.serdar.sorucevap.databinding.FragmentThirdBinding


class FourthFragment : Fragment() {
    private lateinit var cevap: FragmentFourthBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cevap = FragmentFourthBinding.inflate(inflater,container,false)
        cevap.button6.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_fourthFragment_to_sixthFragment)


        }

        cevap.button7.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_fourthFragment_to_fifthFragment)



        }


        return cevap.root
    }

}