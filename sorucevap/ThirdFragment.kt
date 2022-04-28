package com.serdar.sorucevap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.serdar.sorucevap.databinding.FragmentSecondBinding
import com.serdar.sorucevap.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    private lateinit var cevap: FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cevap = FragmentThirdBinding.inflate(inflater,container,false)
        cevap.button4.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_thirdFragment_to_fourthFragment)


        }

        cevap.button5.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_thirdFragment_to_sixthFragment)



        }


        return cevap.root
    }

}