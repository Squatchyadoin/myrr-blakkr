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
public class FightScene implements Serializable {
    
    // class instance variables
    private double travelTime;
    private String description;
    private int noMonsters;
    private String monsterType;
    private boolean fightOrFlight;
    
    // default constructor method
    public FightScene() {
    }
    
    
    // getter() and setter() methods
    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNoMonsters() {
        return noMonsters;
    }

    public void setNoMonsters(int noMonsters) {
        this.noMonsters = noMonsters;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public boolean isFightOrFlight() {
        return fightOrFlight;
    }

    public void setFightOrFlight(boolean fightOrFlight) {
        this.fightOrFlight = fightOrFlight;
    }

    @Override
    public String toString() {
        return "FightScene{" + "travelTime=" + travelTime + ", description=" + description + ", noMonsters=" + noMonsters + ", monsterType=" + monsterType + ", fightOrFlight=" + fightOrFlight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + this.noMonsters;
        hash = 59 * hash + Objects.hashCode(this.monsterType);
        hash = 59 * hash + (this.fightOrFlight ? 1 : 0);
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
        final FightScene other = (FightScene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.noMonsters != other.noMonsters) {
            return false;
        }
        if (!Objects.equals(this.monsterType, other.monsterType)) {
            return false;
        }
        if (this.fightOrFlight != other.fightOrFlight) {
            return false;
        }
        return true;
    }
    
        
}
