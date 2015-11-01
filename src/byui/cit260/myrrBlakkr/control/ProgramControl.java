/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.control;

import byui.cit260.myrrBlakkr.model.Player;
import myrrblakkr.MyrrBlakkr;

/**
 *
 * @author Family
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player(); // create a new player
        player.setName(name); // set the new player's name
        
        MyrrBlakkr.setPlayer(player); // save the player object in MB class
        
        return player;
    }
    
}
