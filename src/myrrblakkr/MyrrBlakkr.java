/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrrblakkr;

import byui.cit260.myrrBlakkr.model.Player; // needed for each class referenced from another package. L3, pg 18

/**
 *
 * @author Family
 */
public class MyrrBlakkr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TEST CASES
        // This method recommend by Bro Jones. Ensures main() function doesn't become full of Test Cases.
        runTestCases1();
        //runTestCases2(); [Save and use later.]
        
    }

    private static void runTestCases1() {

        Player playerOne = new Player(); // creates a new instance of a class

        // programmer-developed info for testing purposes
        playerOne.setName("Tor the Mighty");
        playerOne.setGameTime(24.47);
        playerOne.setHealthPoints(27);
        playerOne.setExperiencePoints(375);
        playerOne.setTreasureValue(211);
        playerOne.setAttackRating(17);
        playerOne.setDefenseRating(16);
        playerOne.setPlayerInventory("Sword, Nightskin, Ring of Power, Ring of Loose Fingers, Lockpick Kit, Torch, Oil Flask");

        // calling toString() function returns a string representation of the contents of the playerOne object and saves the value in a String type variable, playerInfo
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo); // displays results to the console. L3, pg 19

    }

    
}

