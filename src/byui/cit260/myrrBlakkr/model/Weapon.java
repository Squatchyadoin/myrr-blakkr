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
public class Weapon implements Serializable{
    
    //class attributes
    private String weaponType;
    private int damageRating;
    private String weaponEquipped;
    private String weaponSpecialAbilities;

    public Weapon() {
    }
    
    

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public int getDamageRating() {
        return damageRating;
    }

    public void setDamageRating(int damageRating) {
        this.damageRating = damageRating;
    }

    public String getWeaponEquipped() {
        return weaponEquipped;
    }

    public void setWeaponEquipped(String weaponEquipped) {
        this.weaponEquipped = weaponEquipped;
    }

    public String getWeaponSpecialAbilities() {
        return weaponSpecialAbilities;
    }

    public void setWeaponSpecialAbilities(String weaponSpecialAbilities) {
        this.weaponSpecialAbilities = weaponSpecialAbilities;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.weaponType);
        hash = 83 * hash + this.damageRating;
        hash = 83 * hash + Objects.hashCode(this.weaponEquipped);
        hash = 83 * hash + Objects.hashCode(this.weaponSpecialAbilities);
        return hash;
    }

    @Override
    public String toString() {
        return "Weapon{" + "weaponType=" + weaponType + ", damageRating=" + damageRating + ", weaponEquipped=" + weaponEquipped + ", weaponSpecialAbilities=" + weaponSpecialAbilities + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Weapon other = (Weapon) obj;
        if (!Objects.equals(this.weaponType, other.weaponType)) {
            return false;
        }
        if (this.damageRating != other.damageRating) {
            return false;
        }
        if (!Objects.equals(this.weaponEquipped, other.weaponEquipped)) {
            return false;
        }
        if (!Objects.equals(this.weaponSpecialAbilities, other.weaponSpecialAbilities)) {
            return false;
        }
        return true;
    }
    
    
    
}
