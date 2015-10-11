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
public class MiscellaneousItem implements Serializable{
    
    //class variables
    private String miscItemType;
    private int miscItemQuantity;
    private String miscItemEquipped;
    private String miscItemSpecialAbilities;

    public MiscellaneousItem() {
    }
    
    

    public String getMiscItemType() {
        return miscItemType;
    }

    public void setMiscItemType(String miscItemType) {
        this.miscItemType = miscItemType;
    }

    public int getMiscItemQuantity() {
        return miscItemQuantity;
    }

    public void setMiscItemQuantity(int miscItemQuantity) {
        this.miscItemQuantity = miscItemQuantity;
    }

    public String getMiscItemEquipped() {
        return miscItemEquipped;
    }

    public void setMiscItemEquipped(String miscItemEquipped) {
        this.miscItemEquipped = miscItemEquipped;
    }

    public String getMiscItemSpecialAbilities() {
        return miscItemSpecialAbilities;
    }

    public void setMiscItemSpecialAbilities(String miscItemSpecialAbilities) {
        this.miscItemSpecialAbilities = miscItemSpecialAbilities;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.miscItemType);
        hash = 71 * hash + this.miscItemQuantity;
        hash = 71 * hash + Objects.hashCode(this.miscItemEquipped);
        hash = 71 * hash + Objects.hashCode(this.miscItemSpecialAbilities);
        return hash;
    }

    @Override
    public String toString() {
        return "MiscellaneousItem{" + "miscItemType=" + miscItemType + ", miscItemQuantity=" + miscItemQuantity + ", miscItemEquipped=" + miscItemEquipped + ", miscItemSpecialAbilities=" + miscItemSpecialAbilities + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MiscellaneousItem other = (MiscellaneousItem) obj;
        if (!Objects.equals(this.miscItemType, other.miscItemType)) {
            return false;
        }
        if (this.miscItemQuantity != other.miscItemQuantity) {
            return false;
        }
        if (!Objects.equals(this.miscItemEquipped, other.miscItemEquipped)) {
            return false;
        }
        if (!Objects.equals(this.miscItemSpecialAbilities, other.miscItemSpecialAbilities)) {
            return false;
        }
        return true;
    }
    
    
    
}
