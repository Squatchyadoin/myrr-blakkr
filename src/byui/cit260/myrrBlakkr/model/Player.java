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
public class Player implements Serializable {
    
    // class instance variables
    private String name;
    private double gameTime;
    private int healthPoints;
    private int experiencePoints;
    private int treasureValue;
    private int attackRating;
    private int defenseRating;
    private String playerInventory;
    
    // default constructor function
    public Player() {
    }

    public String getName() {
        return name;
    }
    
    // getter and setter functions
    // (How other classes access private variables to create an object instance. L3, pg 8-10)
    public void setName(String name) {
        this.name = name;
    }

    public double getGameTime() {
        return gameTime;
    }

    public void setGameTime(double gameTime) {
        this.gameTime = gameTime;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getTreasureValue() {
        return treasureValue;
    }

    public void setTreasureValue(int treasureValue) {
        this.treasureValue = treasureValue;
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

    public String getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerInventory(String playerInventory) {
        this.playerInventory = playerInventory;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", gameTime=" + gameTime + ", healthPoints=" + healthPoints + ", experiencePoints=" + experiencePoints + ", treasureValue=" + treasureValue + ", attackRating=" + attackRating + ", defenseRating=" + defenseRating + ", playerInventory=" + playerInventory + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.gameTime) ^ (Double.doubleToLongBits(this.gameTime) >>> 32));
        hash = 67 * hash + this.healthPoints;
        hash = 67 * hash + this.experiencePoints;
        hash = 67 * hash + this.treasureValue;
        hash = 67 * hash + this.attackRating;
        hash = 67 * hash + this.defenseRating;
        hash = 67 * hash + Objects.hashCode(this.playerInventory);
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
        if (this.healthPoints != other.healthPoints) {
            return false;
        }
        if (this.experiencePoints != other.experiencePoints) {
            return false;
        }
        if (this.treasureValue != other.treasureValue) {
            return false;
        }
        if (this.attackRating != other.attackRating) {
            return false;
        }
        if (this.defenseRating != other.defenseRating) {
            return false;
        }
        if (!Objects.equals(this.playerInventory, other.playerInventory)) {
            return false;
        }
        return true;
    }

       
    
}
