/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentq2;

/**
 *
 * @author lab_services_student
 */
public class Player {
     private String name;
    private int totalInnings;
    private int totalRuns;
    private int[] runsPerMatch;
    
    //constructors being used
    public Player(String name, int totalMatches) {
        this.name = name;
        this.totalInnings = 0;
        this.totalRuns = 0;
        this.runsPerMatch = new int[totalMatches];
    }
    //getters
    public String getName() {
        return name;
    }
     public int getTotalInnings() {
        return totalInnings;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public int[] getRunsPerMatch() {
        return runsPerMatch;
    }
    //if statement
    public void playMatch(int matchIndex, int runs) {
        if (matchIndex >= 0 && matchIndex < runsPerMatch.length) {
            totalInnings++;
            totalRuns += runs;
            runsPerMatch[matchIndex] = runs;
        }
    

}
}
    

