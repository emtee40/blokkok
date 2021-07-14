package com.blokkok.app.fragments.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blokkok.app.R;

class LicensesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_licenses, container, false);
    }

    companion object {
        fun newInstance(): LicensesFragment {
            return LicensesFragment();
        }
    }
}