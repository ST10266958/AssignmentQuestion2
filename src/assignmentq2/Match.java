/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentq2;

/**
 *
 * @author lab_services_student
 */
public class Match {
      private String matchType;
    private int totalMatches;

    public Match(String matchType, int totalMatches) {
        this.matchType = matchType;
        this.totalMatches = totalMatches;
    }
    public String getMatchType() {
        return matchType;
    }

    public int getTotalMatches() {
        return totalMatches;
    }
    
    
}
