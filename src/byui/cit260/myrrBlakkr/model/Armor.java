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
public class Armor implements Serializable{
    
    //class attributes
    private String armorType;
    private int armorRating;
    private String equipped;
    private String armorSpecialAbilities;

    public Armor() {
    }
    
    

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public int getArmorRating() {
        return armorRating;
    }

    public void setArmorRating(int armorRating) {
        this.armorRating = armorRating;
    }

    public String getEquipped() {
        return equipped;
    }

    public void setEquipped(String equipped) {
        this.equipped = equipped;
    }

    public String getArmorSpecialAbilities() {
        return armorSpecialAbilities;
    }

    public void setArmorSpecialAbilities(String armorSpecialAbilities) {
        this.armorSpecialAbilities = armorSpecialAbilities;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.armorType);
        hash = 23 * hash + this.armorRating;
        hash = 23 * hash + Objects.hashCode(this.equipped);
        hash = 23 * hash + Objects.hashCode(this.armorSpecialAbilities);
        return hash;
    }

    @Override
    public String toString() {
        return "Armor{" + "armorType=" + armorType + ", armorRating=" + armorRating + ", equipped=" + equipped + ", armorSpecialAbilities=" + armorSpecialAbilities + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Armor other = (Armor) obj;
        if (!Objects.equals(this.armorType, other.armorType)) {
            return false;
        }
        if (this.armorRating != other.armorRating) {
            return false;
        }
        if (!Objects.equals(this.equipped, other.equipped)) {
            return false;
        }
        if (!Objects.equals(this.armorSpecialAbilities, other.armorSpecialAbilities)) {
            return false;
        }
        return true;
    }
    
    
    
}
