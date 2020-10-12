package com.example.bibloteca_marcelo_opazo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageButton btG;
    private ProgressBar pb;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btG = (ImageButton)findViewById(R.id.btngit);
        pb = (ProgressBar)findViewById(R.id.prog);
        bt = (Button)findViewById(R.id.button);

        pb.setVisibility(View.INVISIBLE); //hago mi pb invisible
        bt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                new Task().execute();
            }
        });


    }

    class Task extends AsyncTask<String, Void, String>  // clase asincrona
    {

        @Override
        protected void onPreExecute() {
            pb.setVisibility(View.VISIBLE);
        }

        @Override
        protected String doInBackground(String... strings) {

            for (int i = 1; i<=10; i++)
            {
                try{
                    Thread.sleep(200);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            return null;
        }


        @Override
        protected void onPostExecute(String s) {
            Intent i =new Intent(getBaseContext(),Home_act.class);
            startActivity(i);
        }
    }

    public void Git(View v)
    {
        ArrayList<String> libros = new ArrayList<String>();

        libros.add("Farenheith");
        libros.add("Revival");
        libros.add("El Alquimista");
        //libros.add("El Poder");
        //libros.add("Despertar");


        Intent i = new Intent(this,github_act.class);
        i.putExtra("librosList",libros);
        startActivity(i);
    }
}