package com.example.jafoole.githubpractice1;

import java.util.ArrayList;

/**
 * Created by ShowMe on 2/29/16.
 */
public class Actor {

    private static ArrayList<String> mActorRoster;
    private static Actor instance;
    String name;

    public static ArrayList<String> getmActorRoster() {
        return mActorRoster;
    }

    public static void setmActorRoster(ArrayList<String> mActorRoster) {
        Actor.mActorRoster = mActorRoster;
    }

    public static void setInstance(Actor instance) {
        Actor.instance = instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Actor getInstance() {
        if (instance == null) {
            instance = new Actor();
        }
        return instance;
    }
}
