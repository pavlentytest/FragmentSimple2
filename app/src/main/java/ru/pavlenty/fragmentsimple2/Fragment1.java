package ru.pavlenty.fragmentsimple2;


import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    View view;
    Button btn;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.fragment_fragment1, container,false);
         btn = view.findViewById(R.id.button2);
         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                // логика
             }
         });

       return view;
        //return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }

}
