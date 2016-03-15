package com.example.homemariahome.androidappgroupproject_fe;

/**
 * Created by June on 3/15/16.
 * Decision class for vote decisions.
 */

public class Decision {
    private int id;
    private int user_id;
    private String title;

    public Decision(int id, int user_id, String title) {
        this.id = id;
        this.user_id = user_id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
