package com.madantiwari.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.madantiwari.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {
    private EditText etFirstn,etSecondn;
    Button btnAdd;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        etFirstn = view.findViewById(R.id.etFirst);
        etSecondn = view.findViewById(R.id.etSecond);
        btnAdd = view.findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int first = Integer.parseInt(etFirstn.getText().toString());
        int second = Integer.parseInt(etSecondn.getText().toString());
        int result = first+second;

        Toast.makeText(getActivity(), "Sum is "+result, Toast.LENGTH_SHORT).show();

    }
}
