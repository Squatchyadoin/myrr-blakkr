/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Family
 */
public class Map implements Serializable {    
    
    private int numOfRows;
    private int numOfColumns;
    private Location[][] locations;
    
    // constructor
    public Map() {
    }

    public Map(int numOfRows, int numOfColumns) {
        
        if (numOfRows < 1 || numOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
                
        this.numOfRows = numOfRows;
        this.numOfColumns = numOfColumns;
        
        // create 2-D array of Location objects
        this.locations = new Location[numOfRows][numOfColumns];
        
        for (int row = 0; row < numOfRows; row++) {
            for (int column = 0; column < numOfColumns; column++) {
                // create and initialize new Location object instance
                Location location = new Location();
                location.setRow(row);
                location.setColumn(column);
                location.setVisited(false);
                
                // assign the Location object to the current position in array
                locations[row][column] = location;
            }
        }        
    }
    
    
    // Getter() and Setter()
    public int getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(int numOfRows) {
        this.numOfRows = numOfRows;
    }

    public int getNumOfColumns() {
        return numOfColumns;
    }

    public void setNumOfColumns(int numOfColumns) {
        this.numOfColumns = numOfColumns;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map{" + "numOfRows=" + numOfRows + ", numOfColumns=" + numOfColumns + ", locations=" + locations + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.numOfRows;
        hash = 53 * hash + this.numOfColumns;
        hash = 53 * hash + Arrays.deepHashCode(this.locations);
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
        if (this.numOfRows != other.numOfRows) {
            return false;
        }
        if (this.numOfColumns != other.numOfColumns) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }
    
    
}
