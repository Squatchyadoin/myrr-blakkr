/*
 * Control class for all calculations, decisions, and other functions that get or
 * save data for the end users stories related to the general control of the 
 * program (e.g., start game, keep score, save game, load game, & quit game).
 */

package byui.cit260.myrrBlakkr.control;

import byui.cit260.myrrBlakkr.model.Game;
import byui.cit260.myrrBlakkr.model.Player;
import myrrblakkr.MyrrBlakkr;

/**
 *
 * @author Family
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {                             // IF no name is entered
            return null;                                // return null
        }        
        Player player = new Player();                   // create a new player
        player.setName(name);                           // set the new player's name        
        MyrrBlakkr.setPlayer(player);                   // save the player object in Main class
        
        return player;                                  // return the new player
    }
    
    /*
    *   SAVE THE CURRENT GAME
    */
    public static void saveGame(Game currentGame) {
        System.out.println("\n saveGame stub function called from GameControl class");
    }
    
    /*
    *   LOAD A SAVED GAME
    */
    public static void loadGame(Game currentGame) {
        System.out.println("\n loadGame stub function called from GameControl class");
    }
    
}
