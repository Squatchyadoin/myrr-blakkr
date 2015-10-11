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
public class Trap implements Serializable{
    
    //class attributes
    private String description;
    private String type;
    private int difficulty;
    private String damageRating;

    public Trap() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getDamageRating() {
        return damageRating;
    }

    public void setDamageRating(String damageRating) {
        this.damageRating = damageRating;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.type);
        hash = 59 * hash + this.difficulty;
        hash = 59 * hash + Objects.hashCode(this.damageRating);
        return hash;
    }

    @Override
    public String toString() {
        return "Trap{" + "description=" + description + ", type=" + type + ", difficulty=" + difficulty + ", damageRating=" + damageRating + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trap other = (Trap) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (this.difficulty != other.difficulty) {
            return false;
        }
        if (!Objects.equals(this.damageRating, other.damageRating)) {
            return false;
        }
        return true;
    }
    
    
    
}
