package com.blokkok.app.fragments.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.blokkok.app.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ModulesFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_modules, container, false)
        val addModuleFab = root.findViewById<FloatingActionButton>(R.id.addModule)

        addModuleFab.setOnClickListener {
            TODO("Implement add module fab")
        }

        return root
    }

    companion object {
        fun newInstance(): ModulesFragment {
            return ModulesFragment()
        }
    }
}