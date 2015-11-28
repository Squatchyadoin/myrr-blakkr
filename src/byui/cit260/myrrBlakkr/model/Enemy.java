/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Family
 */
public class Enemy implements Serializable {    
    
    // class instance variables
    private String type;
    private String description;
    private int health;
    private String weapon;   
    private int attack;
    private int defense;
    private Point coordinates;

    // default constructor
    public Enemy() {
        this.type = null;
        this.health = 0;
        this.attack = 0;
        this.defense = 0;       
    }
    
    
    // Getter() and Setter()
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }        

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Enemy{" + "type=" + type + ", health=" + health + ", weapon=" + weapon + ", attack=" + attack + ", defense=" + defense + ", coordinates=" + coordinates + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;        
        hash = 17 * hash + Objects.hashCode(this.type);
        hash = 17 * hash + this.health;
        hash = 17 * hash + Objects.hashCode(this.weapon);
        hash = 17 * hash + this.attack;
        hash = 17 * hash + this.defense;
        hash = 17 * hash + Objects.hashCode(this.coordinates);
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
        final Enemy other = (Enemy) obj;        
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (this.health != other.health) {
            return false;
        }
        if (!Objects.equals(this.weapon, other.weapon)) {
            return false;
        }
        if (this.attack != other.attack) {
            return false;
        }
        if (this.defense != other.defense) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }
        
}
