package com.Game;

public class Game_state {
	private static Game_state instance = null;
    private int level;
    private int score;

    private Game_state() {
        level = 1;
        score = 0;
    }

    public static Game_state getInstance() {
        if (instance == null) {
            synchronized (Game_state.class) {
                if (instance == null) {
                    instance = new Game_state();
                }
            }
        }
        return instance;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
    }


}
