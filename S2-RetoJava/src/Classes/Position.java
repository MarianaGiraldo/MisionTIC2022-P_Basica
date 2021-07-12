/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author maria
 */
public class Position {
    private String positionName;
    private String hierarchyLevel;

    public Position(String positionName, String hierarchyLevel) {
        this.positionName = positionName;
        this.hierarchyLevel = hierarchyLevel;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getHierarchyLevel() {
        return hierarchyLevel;
    }

    public void setHierarchyLevel(String hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
    }
    
    
    
}
