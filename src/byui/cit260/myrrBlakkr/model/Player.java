/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.model;

import byui.cit260.myrrBlakkr.control.CalculationUtilities;
import java.awt.Point;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Family
 */
public class Player implements Serializable {

    // class instance variables
    private String name;
    private double gameTime;
    private int strength;
    private int dexterity;
    private int constitution;
    private int health;
    private int experience;
    private int treasure;
    private int baseAttack;
    private int baseDefense;
    private InventoryItem[] inventory;
    private Point coordinates;

    // default constructor function
    public Player() {
    /*    this.name = null;
        
        this.gameTime = 0;
        
        int strength = 0;
        for (int i = 0; i < 3; i++) {
            strength += CalculationUtilities.rolld6();
        }
        this.strength = strength;
        
        int dexterity = 0;
        for (int i = 0; i < 3; i++){
            dexterity += CalculationUtilities.rolld6();
        }
        this.constitution = constitution;
        
        int constitution = 0;
        for (int i = 0; i < 3; i++){
            constitution += CalculationUtilities.rolld6();
        }
        this.constitution = constitution;
        
        this.health = 0;
        
        this.experience = 0;
        
        this.treasure = 0;
        
        this.baseAttack = 0;
        
        this.baseDefense = 0;
     */   
    }

    // Getter() and Setter()
    // (How other classes access private variables to create an object instance. L3, pg 8-10)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGameTime() {
        return gameTime;
    }

    public void setGameTime(double gameTime) {
        this.gameTime = gameTime;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    
    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getTreasure() {
        return treasure;
    }

    public void setTreasure(int treasure) {
        this.treasure = treasure;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", gameTime=" + gameTime + ", strength=" + strength + ", dexterity=" + dexterity + ", constitution=" + constitution + ", health=" + health + ", experience=" + experience + ", treasure=" + treasure + ", baseAttack=" + baseAttack + ", baseDefense=" + baseDefense + ", inventory=" + inventory + ", coordinates=" + coordinates + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.gameTime) ^ (Double.doubleToLongBits(this.gameTime) >>> 32));
        hash = 97 * hash + this.strength;
        hash = 97 * hash + this.dexterity;
        hash = 97 * hash + this.constitution;
        hash = 97 * hash + this.health;
        hash = 97 * hash + this.experience;
        hash = 97 * hash + this.treasure;
        hash = 97 * hash + this.baseAttack;
        hash = 97 * hash + this.baseDefense;
        hash = 97 * hash + Arrays.deepHashCode(this.inventory);
        hash = 97 * hash + Objects.hashCode(this.coordinates);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gameTime) != Double.doubleToLongBits(other.gameTime)) {
            return false;
        }
        if (this.strength != other.strength) {
            return false;
        }
        if (this.dexterity != other.dexterity) {
            return false;
        }
        if (this.constitution != other.constitution) {
            return false;
        }
        if (this.health != other.health) {
            return false;
        }
        if (this.experience != other.experience) {
            return false;
        }
        if (this.treasure != other.treasure) {
            return false;
        }
        if (this.baseAttack != other.baseAttack) {
            return false;
        }
        if (this.baseDefense != other.baseDefense) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }

}
