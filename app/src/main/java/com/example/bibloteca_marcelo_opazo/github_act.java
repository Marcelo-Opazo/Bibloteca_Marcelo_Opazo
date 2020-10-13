package com.example.bibloteca_marcelo_opazo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;



import java.util.ArrayList;

import Clases.Libros;

public class github_act extends AppCompatActivity  {

    private Spinner sp;
    private TextView txt;
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        sp = (Spinner) findViewById(R.id.spinL);
        txt = (TextView) findViewById(R.id.txt1);


        //Asigno mi arrego al spinner
        final ArrayList<String> librosList = (ArrayList<String>) getIntent().getSerializableExtra("librosList");
        ArrayAdapter<String> adapt = new ArrayAdapter(this, android.R.layout.simple_list_item_1, librosList);
        sp.setAdapter(adapt);



        //SEgun lo seleccionado{
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected (AdapterView < ? > adapterView, View view,int i , long l)
            {

                //Acciones
                Libros lib = new Libros();

                String L = sp.getSelectedItem().toString();

                String faren = lib.getFarenheith();
                String revi = lib.getRevival();
                String alqui = lib.getEl_alquimista();
                String pw = lib.getEl_poder();
                String des = lib.getDespertar();

                if (L.equals("Farenheith")) {
                    txt.setText("El valor de Farenheith es : " + faren);
                } else if (L.equals("Revival")) {
                    txt.setText("El valor de Revival es: " + revi);
                } else if (L.equals("El Alquimista")) {
                    txt.setText("El valor de El alquimista es: " + alqui);
                }
                else if (L.equals("El Poder")) {
                    txt.setText("El valor del libro el Poder es: " + pw);
                }else if (L.equals("Despertar")) {
                    txt.setText("El valor del libro Despertar es: " + des);
                }
                }

            @Override
            public void onNothingSelected (AdapterView < ? > adapterView)
            {

            }
        });
    }

}