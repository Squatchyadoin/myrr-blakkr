/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.control;

import byui.cit260.myrrBlakkr.model.Item;
import java.util.Random;

/**
 *
 * @author Keller Z570 Laptop
 */
public class CalculationUtilities {
    
    private static Random random = new Random();
    
    // RANDOM DICE ROLLS    
    public static int rolld4() {                    // random 4-sided die roll
        return random.nextInt(4);
    }
    
    public static int rolld6() {                    // random 6-sided die roll
        return random.nextInt(6);
    }
    
    public static int rolld8() {                    // random 8-sided die roll
        return random.nextInt(8);
    }
    
    public static int rolld12() {                   // random 12-sided die roll
        return random.nextInt(12);
    }
    
    public static int rolld20() {                   // random 20-sided die roll
        return random.nextInt(20);
    }
    
    
    // ROLLS
    public static int attackRoll(Item i) {          // attack roll
        return random.nextInt(i.getProperty());
    }
        
    public static int damageRoll(Item i) {          // damage roll
        return random.nextInt(i.getProperty());
    }
    
    /*
    public static int initiativeRoll(Player p) {      // initiative roll
        return random.nextInt(p.getAbility());
    }
    */
    
}
