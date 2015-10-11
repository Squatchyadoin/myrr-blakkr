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
 * @author Family
 */
public class ActorNPC implements Serializable {
    
    // class instance variables
    private String name;
    private String characterClass;
    private String attackStyle;
    private int healthPoints;
    private int attackRating;
    private int defenseRating;    

    // default constructor method (called ehenever you need to create a new object instance. L03, pg 11)
    public ActorNPC() {
    }
    
    
    // getter() and setter() methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getAttackStyle() {
        return attackStyle;
    }

    public void setAttackStyle(String attackStyle) {
        this.attackStyle = attackStyle;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackRating() {
        return attackRating;
    }

    public void setAttackRating(int attackRating) {
        this.attackRating = attackRating;
    }

    public int getDefenseRating() {
        return defenseRating;
    }

    public void setDefenseRating(int defenseRating) {
        this.defenseRating = defenseRating;
    }   

    @Override
    public String toString() {
        return "ActorNPC{" + "name=" + name + ", characterClass=" + characterClass + ", attackStyle=" + attackStyle + ", healthPoints=" + healthPoints + ", attackRating=" + attackRating + ", defenseRating=" + defenseRating + ")";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.characterClass);
        hash = 83 * hash + Objects.hashCode(this.attackStyle);
        hash = 83 * hash + this.attackRating;
        hash = 83 * hash + this.defenseRating;        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ActorNPC other = (ActorNPC) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.characterClass, other.characterClass)) {
            return false;
        }
        if (!Objects.equals(this.attackStyle, other.attackStyle)) {
            return false;
        }
        if (this.healthPoints != other.healthPoints) {
            return false;
        }
        if (this.attackRating != other.attackRating) {
            return false;
        }
        if (this.defenseRating != other.defenseRating) {
            return false;
        }        
        return true;
    }
        
    
}
