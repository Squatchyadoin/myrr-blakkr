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
public class NormalScene implements Serializable {
    
    // class instance variables
    private String description;
    private double travelTime;
    private int noMonsters;
    private int noItems;
    private int noTreasures;
    private int noLocks;
    private int noTraps;
    
    // default constructor method
    public NormalScene() {    
    }
    

    // getter() and setter() methods
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public int getNoMonsters() {
        return noMonsters;
    }

    public void setNoMonsters(int noMonsters) {
        this.noMonsters = noMonsters;
    }

    public int getNoItems() {
        return noItems;
    }

    public void setNoItems(int noItems) {
        this.noItems = noItems;
    }

    public int getNoTreasures() {
        return noTreasures;
    }

    public void setNoTreasures(int noTreasures) {
        this.noTreasures = noTreasures;
    }

    public int getNoLocks() {
        return noLocks;
    }

    public void setNoLocks(int noLocks) {
        this.noLocks = noLocks;
    }

    public int getNoTraps() {
        return noTraps;
    }

    public void setNoTraps(int noTraps) {
        this.noTraps = noTraps;
    }

    @Override
    public String toString() {
        return "NormalScene{" + "description=" + description + ", travelTime=" + travelTime + ", noMonsters=" + noMonsters + ", noItems=" + noItems + ", noTreasures=" + noTreasures + ", noLocks=" + noLocks + ", noTraps=" + noTraps + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 47 * hash + this.noMonsters;
        hash = 47 * hash + this.noItems;
        hash = 47 * hash + this.noTreasures;
        hash = 47 * hash + this.noLocks;
        hash = 47 * hash + this.noTraps;
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
        final NormalScene other = (NormalScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (this.noMonsters != other.noMonsters) {
            return false;
        }
        if (this.noItems != other.noItems) {
            return false;
        }
        if (this.noTreasures != other.noTreasures) {
            return false;
        }
        if (this.noLocks != other.noLocks) {
            return false;
        }
        if (this.noTraps != other.noTraps) {
            return false;
        }
        return true;
    }
    
    
}
