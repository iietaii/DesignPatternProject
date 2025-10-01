/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spaceinvaders;

public class ScoreManager {

    private static ScoreManager instance = new ScoreManager();
    private int score = 0;

    private ScoreManager() {} 

    public static ScoreManager getInstance() {
        
        return instance;
    }

    public void addPoints(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }

    public void reset() {
        score = 0;
    }
}