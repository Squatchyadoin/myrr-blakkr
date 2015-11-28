/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Family
 */
public class Location implements Serializable {
    
    private int row;
    private int column;
    private boolean visited;
    private Scene scene;
    private ArrayList<Enemy> enemies;
    private ArrayList<Trap> traps;
    private ArrayList<Lock> locks;
    private ArrayList<TreasureCache> caches;
    
   
    // constructor
    public Location() {
    }
    

    // Getter() and Setter()
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }

    public ArrayList<Trap> getTraps() {
        return traps;
    }

    public void setTraps(ArrayList<Trap> traps) {
        this.traps = traps;
    }

    public ArrayList<Lock> getLocks() {
        return locks;
    }

    public void setLocks(ArrayList<Lock> locks) {
        this.locks = locks;
    }

    public ArrayList<TreasureCache> getCaches() {
        return caches;
    }

    public void setCaches(ArrayList<TreasureCache> caches) {
        this.caches = caches;
    }

    

    

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", scene=" + scene + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.row;
        hash = 97 * hash + this.column;
        hash = 97 * hash + (this.visited ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.scene);        
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
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }        
        return true;
    }
       
    
}
