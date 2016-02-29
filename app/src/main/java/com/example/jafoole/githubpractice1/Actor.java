package com.example.jafoole.githubpractice1;

import java.util.ArrayList;

/**
 * Created by ShowMe on 2/29/16.
 */
public class Actor {

    private static ArrayList<String> mActorRoster;
    private static Actor instance;
    String mName;
    String mDOB;
    String mOscars;

    public String getmDOB() {
        return mDOB;
    }

    public void setmDOB(String mDOB) {
        this.mDOB = mDOB;
    }

    public String getmOscars() {
        return mOscars;
    }

    public void setmOscars(String mOscars) {
        this.mOscars = mOscars;
    }

    public Actor(String name, String dob, String oscars) {
        this.mName = name;
        this.mDOB = dob;
        this.mOscars = oscars;
    }

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
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }


}
