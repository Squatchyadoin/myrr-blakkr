/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrrblakkr;

import byui.cit260.myrrBlakkr.model.Enemy;
import byui.cit260.myrrBlakkr.model.FightScene;
import byui.cit260.myrrBlakkr.model.Game;
import byui.cit260.myrrBlakkr.model.Location;
import byui.cit260.myrrBlakkr.model.Map;
import byui.cit260.myrrBlakkr.model.NormalScene;
import byui.cit260.myrrBlakkr.model.Player;             // needed for each class referenced from another package. L3, pg 18
import byui.cit260.myrrBlakkr.model.TrapScene;
import byui.cit260.myrrBlakkr.view.StartProgramView;    // only import statement needed in final draft

/**
 *
 * @author Family
 */
public class MyrrBlakkr {
    
    private static Player player = null;
    private static Game currentGame = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView(); // new object instance
        startProgramView.startProgram(); // call - default constructor
        
        // This method recommend by Bro Jones. Ensures main() function doesn't become full of Test Cases.
        /*
        runTestCases1();        
        */
                
    }
    
    // TEST CASES (Delete for final draft)
    
    private static void runTestCases1() {

        Player playerOne = new Player(); // creates a new instance of a class

        // programmer-developed info for testing purposes
        playerOne.setName("Nimblefingers");
        playerOne.setGameTime(24.47);
        playerOne.setHealth(27);
        playerOne.setExperience(375);
        playerOne.setTreasure(211);
        playerOne.setBaseAttack(16);
        playerOne.setBaseDefense(18);
        //playerOne.setInventory[];

        // calling toString() function returns a string representation of the contents of the object(s) created from the playerNPC class and saves the values in a String type variable, playerInfo
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo); // displays results to the console. L3, pg 19
        
        
        
        Enemy enemyOne = new Enemy(); // creates a new instance of the Enemy class        
        
        // programmer-developed info for testing purposes
        enemyOne.setType("Wererat");        
        //enemyOne.setEnemyWeapon[0];
        enemyOne.setHealth(44);        
        enemyOne.setAttack(14);
        enemyOne.setDefense(10);

        // calling toString() function returns a string representation of the values of all the object instance variables created for the enemyOne object and saves the values in a String type variable, monsterInfo
        String enemyInfo = enemyOne.toString();
        System.out.println(enemyInfo); // displays results to the console
        
        
        
        Game gameOne = new Game(); // creates a new object instance

        // programmer-developed info for testing purposes
        gameOne.setTotalTime(15.35);                

        // calling toString() function returns a string representation of the values of all the object instance variables created for the gameOne object and saves the values in a String type variable, gameInfo
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo); // displays results to the console        
        
        
        
        Map mapOne = new Map(); // creates a new object instance

        // programmer-developed info for testing purposes
        mapOne.setNumOfRows(1);        
        mapOne.setNumOfColumns(7);     

        // calling toString() function returns a string representation of the values of all the object instance variables created for the mapOne object and saves the values in a String type variable, mapInfo
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo); // displays results to the console   
        
        
        
        Location locationOne = new Location(); // creates a new object instance

        // programmer-developed info for testing purposes
        locationOne.setRow(2);
        locationOne.setColumn(6);
        locationOne.setVisited(false);        

        // calling toString() function returns a string representation of the values of all the object instance variables created for the locationOne object and saves the values in a String type variable, locationInfo
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo); // displays results to the console
        
        
        
        FightScene fightSceneOne = new FightScene(); // creates a new object instance

        // programmer-developed info for testing purposes
        fightSceneOne.setTravelTime(.75);
        fightSceneOne.setDescription("You find your party facing 3 Owlbears. What will you do?");
        fightSceneOne.setNoMonsters(3);
        fightSceneOne.setMonsterType("Owlbears");
        fightSceneOne.setFightOrFlight(true);

        // calling toString() function returns a string representation of the values of all the object instance variables created for the fightSceneOne object and saves the values in a String type variable, FightSceneInfo
        String fightSceneInfo = fightSceneOne.toString();
        System.out.println(fightSceneInfo); // displays results to the console
        
        
        
        TrapScene trapSceneOne = new TrapScene(); // creates a new object instance

        // programmer-developed info for testing purposes
        trapSceneOne.setTravelTime(2.12);
        trapSceneOne.setDescription("Freeze! You've found a trap! What will you do?");
        trapSceneOne.setTrapLocation("Small Treasure Chest");
        trapSceneOne.setTrapType("Acid Arrow");

        // calling toString() function returns a string representation of the values of all the object instance variables created for the trapSceneOne object and saves the values in a String type variable, TrapSceneInfo
        String trapSceneInfo = trapSceneOne.toString();
        System.out.println(trapSceneInfo); // displays results to the console
        
        
        
        NormalScene normalSceneOne = new NormalScene(); // creates a new object instance

        // programmer-developed info for testing purposes
        normalSceneOne.setDescription("You enter a dark room with water dripping in the distance. The walls are slick and covered in a pungent, oily, black slime. A slurping sound can also be heard just out of sight in the dark.");
        normalSceneOne.setTravelTime(2.57);        
        normalSceneOne.setNoMonsters(0);
        normalSceneOne.setNoItems(2);
        normalSceneOne.setNoTreasures(1);
        normalSceneOne.setNoLocks(2);
        normalSceneOne.setNoTraps(1);

        // calling toString() function returns a string representation of the values of all the object instance variables created for the normalSceneOne object and saves the values in a String type variable, NormalSceneInfo
        String normalSceneInfo = normalSceneOne.toString();
        System.out.println(normalSceneInfo); // displays results to the console
        
       
    }
    
    
    // Getter & Setter 
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MyrrBlakkr.player = player;
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MyrrBlakkr.currentGame = currentGame;
    }
    
}

