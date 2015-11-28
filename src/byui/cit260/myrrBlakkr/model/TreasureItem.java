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
 * @author James
 */
public class TreasureItem implements Serializable{
    
    //class instance variables
    private String treasureType;
    private int quantity;
    private int treasureValue;

    public TreasureItem() {
    }
    
    

    public String getTreasureType() {
        return treasureType;
    }

    public void setTreasureType(String treasureType) {
        this.treasureType = treasureType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTreasureValue() {
        return treasureValue;
    }

    public void setTreasureValue(int treasureValue) {
        this.treasureValue = treasureValue;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.treasureType);
        hash = 17 * hash + this.quantity;
        hash = 17 * hash + this.treasureValue;
        return hash;
    }

    @Override
    public String toString() {
        return "Treasure{" + "treasureType=" + treasureType + ", quantity=" + quantity + ", treasureValue=" + treasureValue + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TreasureItem other = (TreasureItem) obj;
        if (!Objects.equals(this.treasureType, other.treasureType)) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (this.treasureValue != other.treasureValue) {
            return false;
        }
        return true;
    }
    
    
    
}
