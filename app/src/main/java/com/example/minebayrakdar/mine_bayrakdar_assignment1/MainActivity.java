package com.example.minebayrakdar.mine_bayrakdar_assignment1;


import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends Activity {
    final List<Movie> movies =new ArrayList<Movie>();

    Spinner sp;
    ListView lv;
    TextView tw;
    Context context;

    private String[] Cinemas = {"Cinemaximum","Kanatlı Cinema Pink","Özdilek Cinetime"};
    private String[] Movies = {"Yol Arkadaşım","Ayla","Thor: Ragnarok","Damat Takımı","Cingöz Recai"};
    private String[] Language = {"Dublaj: Türkçe","Türkçe"};
    private int [] Images ={R.drawable.yolarkadasim,R.drawable.ayla,R.drawable.thorragnarok,R.drawable.damattakimi,R.drawable.cingozrecai};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner sp = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> CinemasAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Cinemas);
        sp.setAdapter(CinemasAdapter);

        context = this;
        lv = (ListView) findViewById(R.id.listView);

        tw = (TextView) findViewById(R.id.txtMsg);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:    // Cinemaximum
                        tw.setText(Cinemas[position]);
                        movies.clear();
                        movies.add(new Movie(Movies[4], Language[1], "Sessions \n 11:30   13:00   16:15", Images[4]));
                        movies.add(new Movie(Movies[0], Language[1], "Sessions \n 14:30   15:00   17:30", Images[0]));
                        movies.add(new Movie(Movies[1], Language[1], "Sessions \n 11:30   13:00   16:15", Images[1]));
                        movies.add(new Movie(Movies[2], Language[0], "Sessions \n 14:30   15:00   17:30", Images[2]));
                        movies.add(new Movie(Movies[3], Language[1], "Sessions \n 11:30   13:00   16:15", Images[3]));
                        lv.setAdapter(new OzelAdapter((MainActivity) context, movies));
                        break;
                    case 1:    // Kanatlı Cinema Pink
                        tw.setText(Cinemas[position]);
                        movies.clear();
                        movies.add(new Movie(Movies[1], Language[1], "Sessions \n 11:30   13:00   16:15", Images[1]));
                        movies.add(new Movie(Movies[4], Language[1], "Sessions \n 11:30   13:00   16:15", Images[4]));
                        movies.add(new Movie(Movies[0], Language[1], "Sessions \n 14:30   15:00   17:30", Images[0]));
                        movies.add(new Movie(Movies[3], Language[1], "Sessions \n 11:30   13:00   16:15", Images[3]));
                        lv.setAdapter(new OzelAdapter((MainActivity) context, movies));
                        break;
                    case 2:    // Özdilek Cinetime
                        tw.setText(Cinemas[position]);
                        movies.clear();
                        movies.add(new Movie(Movies[1], Language[1], "Sessions \n 11:30   13:00   16:15", Images[1]));
                        movies.add(new Movie(Movies[0], Language[1], "Sessions \n 14:30   15:00   17:30", Images[0]));
                        movies.add(new Movie(Movies[4], Language[1], "Sessions \n 11:30   13:00   16:15", Images[4]));
                        movies.add(new Movie(Movies[3], Language[1], "Sessions \n 11:30   13:00   16:15", Images[3]));
                        movies.add(new Movie(Movies[2], Language[0], "Sessions \n 11:30   13:00   16:15", Images[2]));
                        lv.setAdapter(new OzelAdapter((MainActivity) context, movies));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

