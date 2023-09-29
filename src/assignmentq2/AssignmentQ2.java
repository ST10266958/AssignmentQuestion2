/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignmentq2;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class AssignmentQ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Cricket Average Calculator!");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.print("Enter the total number of matches played: ");
        int totalMatches = scanner.nextInt();

        Player player = new Player(playerName, totalMatches);

        System.out.println("Choose a match type:");
        System.out.println("1. ODI");
        System.out.println("2. Test");
        System.out.println("3. T20");

        int matchChoice = scanner.nextInt();
        String matchType;
        //various match choices
          switch (matchChoice) {
            case 1:
                matchType = "ODI";
                break;
            case 2:
                matchType = "Test";
                break;
            case 3:
                matchType = "T20";
                break;
            default:
                matchType = "Unknown";
                break;
        }
          CricketMatch cricketMatch = new CricketMatch(matchType, totalMatches);

        for (int i = 0; i < totalMatches; i++) {
            System.out.print("Enter runs scored in match " + (i + 1) + ": ");
            int runs = scanner.nextInt();
            player.playMatch(i, runs);
        }

        double battingAverage = cricketMatch.calculateBattingAverage(player);
        
          System.out.println("\nPlayer Name: " + player.getName());
        System.out.println("Match Type: " + cricketMatch.getMatchType());
        System.out.println("Total Matches Played: " + cricketMatch.getTotalMatches());
        System.out.println("Total Runs Scored: " + player.getTotalRuns());
        System.out.println("Batting Average: " + battingAverage);

        scanner.close();
    }
    }
    

