/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
public class Grades {

    private int[] distribution;

    public Grades() {
        distribution = new int[6];
    }

    public void addAScore(int newScore) {
        if (newScore < 0 || newScore > 60) {
            return;
        }

        int grade = calcGrade(newScore);
        distribution[grade]++;
    }

    private int calcGrade(int score) {
        if (score < 30) {
            return 0;
        } else if (score < 35) {
            return 1;
        } else if (score < 40) {
            return 2;
        } else if (score < 45) {
            return 3;
        } else if (score < 50) {
            return 4;
        } else {
            return 5;
        }
    }
    
    private double calcAcceptance(){
        int numAccepted = 0;
        int totalScores = 0;

        for (int i = 0; i < distribution.length; i++) {
            if (i > 0) {
                numAccepted += distribution[i];
            }
            totalScores += distribution[i];
        }

        return (100 * (double) numAccepted / totalScores);
    }

    public void print() {
        System.out.println("Grade distribution:");
        
        for (int i = 5; i >= 0; i--){
            System.out.println(i + ":  " + printStars(this.distribution[i]));
        }
        
        System.out.println("Acceptance percentage: " + calcAcceptance());
    }

    private String printStars(int numStars) {
        String stars = "";
        for (int i = 0; i < numStars; i++) {
            stars += "*";
        }
        return stars;
    }

}
