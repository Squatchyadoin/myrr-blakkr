/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.view;

import byui.cit260.myrrBlakkr.model.Enemy;
import byui.cit260.myrrBlakkr.model.Player;
import java.util.Scanner;

/**
 *
 * @author Family
 */
public class CombatMenuView extends View {
    
    //private Player currentPlayer;

    public CombatMenuView() {
        super("\n"
        + "\n-------------------------------------------------------------"
        + "\n|                       Combat Menu                         |"
        + "\n-------------------------------------------------------------"
        + "\n| A -  Attack                                               |"
        + "\n| R -  Run                                                  |"
        + "\n| H -  Use healing potion                                   |"            
        + "\n-------------------------------------------------------------");
    }
    
    //currentPlayer = player;
        
    public boolean doAction(Object obj) {        
        String value = (String) obj;        
        value = value.toUpperCase();        // convert to all upper case
        char selection = value.charAt(0);   // get first character entered 
       
        switch (selection) {
            case 'A':                       // attack the enemy
                this.newBattle();
                break;            
            case 'H':                       // heal the player
                this.healPlayer();
                break;
            case 'R':                       // flee from the fight
                //this.retreatFromBattle();
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }            
    

    private void newBattle() {
        System.out.println("*** newBattle function called ***");
    }

    private void healPlayer() {
        System.out.println("*** healPlayer function called ***");
    }

    private void retreatFromBattle() {
        System.out.println("*** retreatFromBattle function called ***");
    }
      
    
}
