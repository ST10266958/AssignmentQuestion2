/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentq2;

/**
 *
 * @author lab_services_student
 */
public class CricketMatch extends Match {
    public CricketMatch(String matchType, int totalMatches) {
        super(matchType, totalMatches);
    }

    public double calculateBattingAverage(Player player) {
        int[] runsPerMatch = player.getRunsPerMatch();
        int totalRuns = player.getTotalRuns();
        int totalInnings = player.getTotalInnings();

        if (totalInnings == 0) {
            return 0.0; // Avoid division by zero
        }

        return (double) totalRuns / totalInnings;
    }
    
    
    
}
