package com.example.homemariahome.androidappgroupproject_fe;

/**
 * Created by June on 3/15/16.
 * Total of all posts of decisions.
 */
public class Posts {
    private Decision[] posts;

    public Decision[] getPosts() {
        return posts;
    }

    public void setPosts(Decision[] posts) {
        this.posts = posts;
    }

    public Posts(Decision[] posts) {
        this.posts = posts;
    }

    public void addPost(Decision post) {
        this.posts.push(post);
    }

    public Decision Post() {
        int length = this.posts.length;
        int randomIndex = (int )(Math.random() * length + 1);
        return posts[randomIndex];
    }
}
