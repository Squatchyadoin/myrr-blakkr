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
public class InventoryItem implements Serializable{
    
    //class instance variables
    private String description;
    private int quantityInStock;
    private int requiredAmount;
    private boolean itemEquipped;

    // default constructor
    public InventoryItem() {
    }
    
    
    // Getter() and Setter()
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public boolean getItemEquipped() {
        return itemEquipped;
    }

    public void setItemEquipped(boolean itemEquipped) {
        this.itemEquipped = itemEquipped;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "description=" + description + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + ", itemEquipped=" + itemEquipped + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + this.quantityInStock;
        hash = 31 * hash + this.requiredAmount;
        hash = 31 * hash + (this.itemEquipped ? 1 : 0);
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
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        if (this.itemEquipped != other.itemEquipped) {
            return false;
        }
        return true;
    } 
    
    
}
