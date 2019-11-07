package com.madantiwari.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.madantiwari.fragments.fragments.FirstFragment;
import com.madantiwari.fragments.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnfragments;
    //if status is true then load first fragment
    private Boolean status=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnfragments=findViewById(R.id.btnFragment);
        btnfragments.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(status){
                FirstFragment firstFragment = new FirstFragment();
                fragmentTransaction.replace(R.id.LinearLayout, firstFragment);
                fragmentTransaction.commit();
                btnfragments.setText("Load Second Fragment");
                status=false;
        }
        else {
            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.replace(R.id.LinearLayout, secondFragment);
            fragmentTransaction.commit();
            btnfragments.setText("Load First Fragment");
            status=true;
        }
    }
}
