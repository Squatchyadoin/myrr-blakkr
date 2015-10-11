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
public class Location implements Serializable {
    
    // class instance variables
    private int currentDungeonLevel;
    private int currentDungeonRoomNumber;
    private boolean currentRoomVisited;
    private int unvisitedRoomsRemaining;   
   
    // default constructor method
    public Location() {
    }
    

    // getter() and setter()
    public int getCurrentDungeonLevel() {
        return currentDungeonLevel;
    }

    public void setCurrentDungeonLevel(int currentDungeonLevel) {
        this.currentDungeonLevel = currentDungeonLevel;
    }

    public int getCurrentDungeonRoomNumber() {
        return currentDungeonRoomNumber;
    }

    public void setCurrentDungeonRoomNumber(int currentDungeonRoomNumber) {
        this.currentDungeonRoomNumber = currentDungeonRoomNumber;
    }

    public boolean isCurrentRoomVisited() {
        return currentRoomVisited;
    }

    public void setCurrentRoomVisited(boolean currentRoomVisited) {
        this.currentRoomVisited = currentRoomVisited;
    }

    public int getUnvisitedRoomsRemaining() {
        return unvisitedRoomsRemaining;
    }

    public void setUnvisitedRoomsRemaining(int unvisitedRoomsRemaining) {
        this.unvisitedRoomsRemaining = unvisitedRoomsRemaining;
    }

    @Override
    public String toString() {
        return "Location{" + "currentDungeonLevel=" + currentDungeonLevel + ", currentDungeonRoomNumber=" + currentDungeonRoomNumber + ", currentRoomVisited=" + currentRoomVisited + ", unvisitedRoomsRemaining=" + unvisitedRoomsRemaining + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.currentDungeonLevel;
        hash = 11 * hash + this.currentDungeonRoomNumber;
        hash = 11 * hash + (this.currentRoomVisited ? 1 : 0);
        hash = 11 * hash + this.unvisitedRoomsRemaining;
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
        final Location other = (Location) obj;
        if (this.currentDungeonLevel != other.currentDungeonLevel) {
            return false;
        }
        if (this.currentDungeonRoomNumber != other.currentDungeonRoomNumber) {
            return false;
        }
        if (this.currentRoomVisited != other.currentRoomVisited) {
            return false;
        }
        if (this.unvisitedRoomsRemaining != other.unvisitedRoomsRemaining) {
            return false;
        }
        return true;
    }
        
    
}
