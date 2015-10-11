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
public class Map implements Serializable {
    
    // class instance variables
    private int dungeonLevelCount;
    private int dungeonRoomCount;
    
    // default constructor method
    public Map() {
    }
    
    
    // getter() and setter() methods
    public int getDungeonLevelCount() {
        return dungeonLevelCount;
    }

    public void setDungeonLevelCount(int dungeonLevelCount) {
        this.dungeonLevelCount = dungeonLevelCount;
    }

    public int getDungeonRoomCount() {
        return dungeonRoomCount;
    }

    public void setDungeonRoomCount(int dungeonRoomCount) {
        this.dungeonRoomCount = dungeonRoomCount;
    }

    @Override
    public String toString() {
        return "Map{" + "dungeonLevelCount=" + dungeonLevelCount + ", dungeonRoomCount=" + dungeonRoomCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.dungeonLevelCount;
        hash = 97 * hash + this.dungeonRoomCount;
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
        final Map other = (Map) obj;
        if (this.dungeonLevelCount != other.dungeonLevelCount) {
            return false;
        }
        if (this.dungeonRoomCount != other.dungeonRoomCount) {
            return false;
        }
        return true;
    }    
    
    
}
