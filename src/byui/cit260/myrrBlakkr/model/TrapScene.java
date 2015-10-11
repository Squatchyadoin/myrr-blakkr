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
 * @author Family
 */
public class TrapScene implements Serializable {
    
    // class instance variables
    private double travelTime;
    private String description;
    private String trapLocation;
    private String trapType;
    
    // default constructor method
    public TrapScene() {    
    }

    
    // getter() and setter() methods
    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrapLocation() {
        return trapLocation;
    }

    public void setTrapLocation(String trapLocation) {
        this.trapLocation = trapLocation;
    }

    public String getTrapType() {
        return trapType;
    }

    public void setTrapType(String trapType) {
        this.trapType = trapType;
    }

    @Override
    public String toString() {
        return "TrapScene{" + "travelTime=" + travelTime + ", description=" + description + ", trapLocation=" + trapLocation + ", trapType=" + trapType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.trapLocation);
        hash = 71 * hash + Objects.hashCode(this.trapType);
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
        final TrapScene other = (TrapScene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.trapLocation, other.trapLocation)) {
            return false;
        }
        if (!Objects.equals(this.trapType, other.trapType)) {
            return false;
        }
        return true;
    }
    
    
}
