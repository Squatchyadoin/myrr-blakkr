/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.model;

/**
 *
 * @author Family
 */
public enum Item {
    dagger(4),                      // weapons [0]
    dagger1(5),                     // weapons
    dagger2(6),                     // weapons
    shortsword(8),                  // weapons
    shortsword1(9),                 // weapons
    shortsword2(10),                // weapons
    dirk(4),                        // weapons
    dirk1(5),                       // weapons
    dirk2(6),                       // weapons
    rapier,                     // weapons
    rapier1,                    // weapons
    rapier2,                    // weapons
    cutlass,                    // weapons
    cutlass1,                   // weapons
    cutlass2,                   // weapons
    falchion,                   // weapons
    falchion1,                  // weapons
    falchion2,                  // weapons
    quarterstaff,               // weapons
    quarterstaff1,              // weapons
    quarterstaff2,              // weapons    
    club,                       // weapons
    club1,                      // weapons
    club2,                      // weapons
    shortspear,                 // weapons
    shortspear1,                // weapons
    shortspear2,                // weapons [27]
    
    shortbow,                   // ranged weapons [28]
    shortbow1,                  // ranged weapons
    shortbow2,                  // ranged weapons
    handcrossbow,               // ranged weapons
    handcrossbow1,              // ranged weapons
    handcrossbow2,              // ranged weapons
    sling,                      // ranged weapons
    sling1,                     // ranged weapons
    sling2,                     // ranged weapons [36]
    
    arrow,                      // ammo [37]
    arrow1,                     // ammo
    arrow2,                     // ammo
    bolt,                       // ammo
    bolt1,                      // ammo
    bolt2,                      // ammo
    stone,                      // ammo
    stone1,                     // ammo
    stone2,                     // ammo [45]
        
    padded,                     // armor [46]
    padded1,                    // armor
    padded2,                    // armor
    leather,                    // armor
    leather1,                   // armor
    leather2,                   // armor
    studdedleather,             // armor
    studdedleather1,            // armor
    studdedleather2,            // armor
    mithral,                    // armor [55]
    
    torch,                      // supplies [56]
    oil,                        // supplies
    flintandsteel,              // supplies
    rope,                       // supplies    
    grapplinghook,              // supplies [60]
    
    crowbar,                    // thieves tools [61]
    minisaw,                    // thieves tools
    hammer,                     // thieves tools
    chisel,                     // thieves tools
    acid,                       // thieves tools
    bentprobe,                  // thieves tools
    wedge,                      // thieves tools
    wirecutters,                // thieves tools
    jimmy,                      // thieves tools [69]
    
    healingpotion,              // healing [70]
    
    talismanOfShadows;          // artifact [71]
    
    private int property;
    Item (int x) {
        property = x;
    }
    
    Item () {
        property = 0;
    }
    
    public int getProperty() {
        return property;
    }
    
    
}
