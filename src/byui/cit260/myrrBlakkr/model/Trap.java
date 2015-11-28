/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author James
 */
public enum Trap implements Serializable{
    
    Gas("\nSuddenly, the door swings shut! You hear a slight hiss and notice small holes in "
        + "\neach corner of the room that begin to release a poisonous gas. Within moments "
        + "\nyou begin to feel dizzy and you notice it's now difficult to breathe."),
    Acid(""),
    Dart(""),
    Fireball(""),
    Spear(""),
    Stone(""),
    Blade("");
    
    
    //class attributes
    private final String description;
    //private final int difficulty;
    //private final String damageRating;

    Trap (String description) {
        this.description = description;
        //this.difficulty(1);
        //this.damageRating("easy");
    }
    
    

    public String getDescription() {
        return description;
    }
/*
    public int getDifficulty() {
        return difficulty;
    }

    public String getDamageRating() {
        return damageRating;
    }
*/
}
