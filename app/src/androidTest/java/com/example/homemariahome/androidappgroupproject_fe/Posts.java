package com.example.homemariahome.androidappgroupproject_fe;
import java.util.Random;
import java.util.ArrayList;
//import java.net.HttpURLConnection;
//import java.net.HttpURLConnection;

/**
 * Created by June on 3/15/16.
 * Total of all posts of decisions.
 */
public class Posts {
    private Random randomGenerator;
    private ArrayList<Decision> posts;


    public Posts(ArrayList<Decision> posts) {
        this.posts = posts;
    }

    public ArrayList<Decision> getPosts() {
//        HttpURLConnection('')
        return posts;

    }

    public void setPosts(ArrayList<Decision> posts) {
        this.posts = posts;
    }

    public void addPost(Decision post) {
        this.posts.add(post);
        // add this to database?
    }

    public Decision getPost(int index) {
        return this.posts.get(index);
    }

    public Decision randomPost() {
        int index = randomGenerator.nextInt(this.posts.size());
        return this.getPost(index);
//        return decision;
    }
}
