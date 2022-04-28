package com.serdar.sorucevap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.serdar.sorucevap.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
private lateinit var sorum: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sorum = FragmentFirstBinding.inflate(inflater,container,false)
            sorum.button1.setOnClickListener {

                Navigation.findNavController(it).navigate(R.id.action_firstFragment_to_secondFragment)

            }


        return sorum.root
    }




}