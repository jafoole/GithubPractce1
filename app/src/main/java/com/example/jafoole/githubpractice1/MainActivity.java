package com.example.jafoole.githubpractice1;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayList<Actor> mActorArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///Below we will implement the custom adapter.

        mListView = (ListView) findViewById(R.id.actorListView);

        mActorArrayList = new ArrayList<Actor>();

        populateActorArray();

        ActorArrayAdapter mAdapter = new ActorArrayAdapter(MainActivity.this, mActorArrayList);
        mListView.setAdapter(mAdapter);


    }
    private void populateActorArray() {
        if (mActorArrayList == null) {
            mActorArrayList = new ArrayList<Actor>();
        }

        mActorArrayList.add(new Actor("Leonardo DiCaprio", "November 11, 1974", "1"));
        mActorArrayList.add(new Actor("Matt Damon", "October 8, 1970", "1"));
        mActorArrayList.add(new Actor("Jennifer Lawrence", "August 15, 1990", "1"));


    }


}


