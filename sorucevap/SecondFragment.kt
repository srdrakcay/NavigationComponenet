package com.serdar.sorucevap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.serdar.sorucevap.databinding.FragmentFirstBinding
import com.serdar.sorucevap.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var cevap: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cevap = FragmentSecondBinding.inflate(inflater,container,false)
            cevap.button2.setOnClickListener {

                Navigation.findNavController(it).navigate(R.id.action_secondFragment_to_thirdFragment)


            }

            cevap.button3.setOnClickListener {

                Navigation.findNavController(it).navigate(R.id.action_secondFragment_to_fourthFragment)



            }


        return cevap.root
    }

}