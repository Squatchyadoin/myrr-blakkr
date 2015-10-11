/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.model;

import java.io.Serializable;

/**
 *
 * @author Family
 */
public class Game implements Serializable {
    
    // class instance variables
    private double totalTime;
    private int noPeople;
    
    // default constructor method
    public Game() {
    }
    
    
    // getter() and setter() methods
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 37 * hash + this.noPeople;
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (this.noPeople != other.noPeople) {
            return false;
        }
        return true;
    }
        
    
}
