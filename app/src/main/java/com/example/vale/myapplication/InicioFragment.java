package com.example.vale.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class InicioFragment extends Fragment {


    public InicioFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_inicio,container, false);
        initUI(view);

        return view;
    }

    private void initUI(View v){
        Button b1 =(Button)v.findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), Ventas.class);
                // TODO Auto-generated method stub
                startActivity(intent);

            }

        });
        Button b2 =(Button)v.findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Compras.class);

                startActivity(intent);

            }
        });

        Button b3 =(Button)v.findViewById(R.id.btn3);
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Alquiler.class);

                startActivity(intent);

            }
        });
    }
}
