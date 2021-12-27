package com.example.filmoffer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    TextView filmTV;
    ArrayList<String> films;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        films = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.films)));
        filmTV = findViewById(R.id.filmname);
    }

    public void onClick(View v){

    if (films.size() !=0) {
        int randomindex = (int) (Math.random() * films.size());
        String film = films.get(randomindex);
        filmTV.setText(film);
        films.remove(randomindex);
    }
    else filmTV.setText("Run out!");
    }

}