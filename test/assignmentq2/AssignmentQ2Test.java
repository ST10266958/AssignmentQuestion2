/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignmentq2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class AssignmentQ2Test {
    
        @Test
    public void testCalculateBattingAverage() {
        Player player = new Player("TestPlayer", 3);
        player.playMatch(0, 50);
        player.playMatch(1, 60);
        player.playMatch(2, 40);

        CricketMatch cricketMatch = new CricketMatch("ODI", 3);
        double expectedAverage = (50 + 60 + 40) / 3.0;

        assertEquals(expectedAverage, cricketMatch.calculateBattingAverage(player), 0.01);

   
    
}
       @Test
    public void testCalculateBattingAverageWithZeroInnings() {
        Player player = new Player("ZeroInningsPlayer", 0);

        CricketMatch cricketMatch = new CricketMatch("T20", 0);

        assertEquals(0.0, cricketMatch.calculateBattingAverage(player), 0.01);
    }
}

    


    

