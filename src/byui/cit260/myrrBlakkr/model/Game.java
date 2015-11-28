/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Family
 */
public class Game implements Serializable {
    
    // class instance variables
    private double totalTime;
    private Player player;
    private Map map;
    private InventoryItem[] inventory;
    private Enemy[] enemies;
    //private ArrayList<Trap> traps;
    //private ArrayList<Lock> locks;
    //private ArrayList<TreasureCache> caches;
    
    
    // default constructor
    public Game() {
    }
    
    
    // Getter() and Setter()
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Enemy[] getEnemies() {
        return enemies;
    }

    public void setEnemies(Enemy[] enemies) {
        this.enemies = enemies;
    }
/*
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
*/

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", player=" + player + ", map=" + map + ", inventory=" + inventory + ", enemies=" + enemies + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.player);
        hash = 41 * hash + Objects.hashCode(this.map);
        hash = 41 * hash + Arrays.deepHashCode(this.inventory);
        hash = 41 * hash + Objects.hashCode(this.enemies);
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
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.enemies, other.enemies)) {
            return false;
        }
        
        return true;
    }

    public Enemy[] getEnemy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/*
    public void setLocks(Lock[] lockList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTraps(Trap[] trapList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCaches(TreasureCache[] cacheList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/    
}
