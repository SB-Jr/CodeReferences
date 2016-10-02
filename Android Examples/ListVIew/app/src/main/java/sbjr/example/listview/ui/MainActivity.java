package sbjr.example.listview.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import sbjr.example.listview.R;
import sbjr.example.listview.model.Movie;

public class MainActivity extends AppCompatActivity {


    List<Movie> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void populateList(){

    }
}
