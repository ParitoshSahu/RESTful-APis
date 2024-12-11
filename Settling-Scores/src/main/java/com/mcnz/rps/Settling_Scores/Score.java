package com.mcnz.rps.Settling_Scores;

public class Score {
    int wins, ties, losses;
    public void setWins(int wins) {
        this.wins = wins;
    }

    public Score() {}

    public Score(int wins, int ties, int losses) {
        super();
        this.wins = wins;
        this.ties = ties;
        this.losses = losses;
    }

    public int getWins() {
        return wins;
    }
    public void setTies(int ties) {
        this.ties = ties;
    }
    public int getTies() {
        return ties;
    }
    public void setLosses(int losses) {
        this.losses = losses;
    }
    public int getLosses() {
        return losses;
    }
}
