package com.example.jafoole.githubpractice1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ShowMe on 2/29/16.
 */
public class ActorArrayAdapter extends ArrayAdapter<Actor> {
    ArrayList<Actor> mActors;

    public ActorArrayAdapter(Context context, ArrayList<Actor> actors) {
        super(context, -1);
        mActors = actors;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View actorLayoutView = inflater.inflate(R.layout.actor_layouts, parent, false);

        Actor currentActor = mActors.get(position);

        TextView actorNameTextView = (TextView) actorLayoutView.findViewById(R.id.actorNameTextView);
        TextView actorDOBTextView = (TextView) actorLayoutView.findViewById(R.id.actorDOBTextView);
        TextView actorOscarTextView = (TextView) actorLayoutView.findViewById(R.id.actorOscarTextView);

        Actor getActors = mActors.get(position);


        actorNameTextView.setText(getActors.getName());
        actorDOBTextView.setText(getActors.getmDOB());
        actorOscarTextView.setText(getActors.getmOscars());

        return actorLayoutView;
    }

    @Override
    public int getCount() {
        return mActors.size();
    }
}
