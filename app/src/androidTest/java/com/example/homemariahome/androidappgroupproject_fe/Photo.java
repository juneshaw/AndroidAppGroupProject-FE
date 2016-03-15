package com.example.homemariahome.androidappgroupproject_fe;

/**
 * Created by June on 3/15/16.
 * Photo class contains photo data.
 */
public class Photo {
    private int id;
    private String description;
    private int votes;
    private int decisionId;
    private boolean winner;

    public Photo(int id, String description, int votes, int decisionId, boolean winner) {
        this.id = id;
        this.description = description;
        this.votes = votes;
        this.decisionId = decisionId;
        this.winner = winner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public int getDecisionId() {
        return decisionId;
    }

    public void setDecisionId(int decisionId) {
        this.decisionId = decisionId;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }
}

