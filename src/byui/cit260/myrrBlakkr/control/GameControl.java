/*
 * Control class for all calculations, decisions, and other functions that get or
 * save data for the end users stories related to the control of the specific
 * game instance (e.g., start game, keep score, save game, load game, & quit game).
 */

package byui.cit260.myrrBlakkr.control;

import byui.cit260.myrrBlakkr.model.Enemy;
import byui.cit260.myrrBlakkr.model.EnemyList;
import byui.cit260.myrrBlakkr.model.Game;
import byui.cit260.myrrBlakkr.model.InventoryItem;
import byui.cit260.myrrBlakkr.model.Item;
import byui.cit260.myrrBlakkr.model.Lock;
import byui.cit260.myrrBlakkr.model.Map;
import byui.cit260.myrrBlakkr.model.Player;
import byui.cit260.myrrBlakkr.model.Trap;
import byui.cit260.myrrBlakkr.model.TreasureCache;
import myrrblakkr.MyrrBlakkr;

/**
 *
 * @author Family
 */
public class GameControl {

    public static void createNewGame(Player player) {
        
        Game game = new Game();                             // create a new game
        MyrrBlakkr.setCurrentGame(game);                    // save the new game (...in Main class)
        
        game.setPlayer(player);                             // save player in the game
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();  // create the inventory list
        game.setInventory(inventoryList);                                   // save inventory list in the game
                                                                            
        Enemy[] enemyList = GameControl.createEnemyList();  // create the enemy list
        game.setEnemies(enemyList);                         // save enemy list in game
        
    //    Lock[] lockList = GameControl.createLockList();     // create the lock list
    //    game.setLocks(lockList);                            // save lock list in game
        
    //    Trap[] trapList = GameControl.createTrapList();     // create the trap list
    //    game.setTraps(trapList);                            // save trap list in game
        
    //    TreasureCache[] cacheList = GameControl.createCacheList();  // create the cache list
    //    game.setCaches(cacheList);                          // save cache list in game
        
        Map map = MapControl.createMap();                   // create and intialize new map
        game.setMap(map);                                   // save map in game             
                
        //MapControl.moveEnemiesToStartingLocation(map);      // move enemies to starting position on the map
        
    }
    
    /*
    *   CREATE A LIST OF INVENTORY ITEMS & SAVE THEM IN THE GAME
    */
    public static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory = new InventoryItem[71];  // see Lesson 9 - TA, p.19
        /*
        *   WEAPONS
        */
        InventoryItem dagger = new InventoryItem();
        dagger.setDescription("Dagger");
        dagger.setQuantityInStock(0);
        dagger.setRequiredAmount(0);
        dagger.setItemEquipped(false);
        inventory[Item.dagger.ordinal()] = dagger;
        
        InventoryItem dagger1 = new InventoryItem();
        dagger1.setDescription("Dagger +1");
        dagger1.setQuantityInStock(0);
        dagger1.setRequiredAmount(0);
        dagger1.setItemEquipped(false);
        inventory[Item.dagger1.ordinal()] = dagger1;
        
        InventoryItem dagger2 = new InventoryItem();
        dagger2.setDescription("Dagger +2");
        dagger2.setQuantityInStock(0);
        dagger2.setRequiredAmount(0);
        dagger2.setItemEquipped(false);
        inventory[Item.dagger2.ordinal()] = dagger2;
        
        InventoryItem shortsword = new InventoryItem();
        shortsword.setDescription("Short sword");
        shortsword.setQuantityInStock(0);
        shortsword.setRequiredAmount(0);
        shortsword.setItemEquipped(false);
        inventory[Item.shortsword.ordinal()] = shortsword;
        
        InventoryItem shortsword1 = new InventoryItem();
        shortsword1.setDescription("Short sword +1");
        shortsword1.setQuantityInStock(0);
        shortsword1.setRequiredAmount(0);
        shortsword1.setItemEquipped(false);
        inventory[Item.shortsword1.ordinal()] = shortsword1;
        
        InventoryItem shortsword2 = new InventoryItem();
        shortsword2.setDescription("Short sword +2");
        shortsword2.setQuantityInStock(0);
        shortsword2.setRequiredAmount(0);
        shortsword2.setItemEquipped(false);
        inventory[Item.shortsword2.ordinal()] = shortsword2;
        
        InventoryItem dirk = new InventoryItem();
        dirk.setDescription("Dirk");
        dirk.setQuantityInStock(0);
        dirk.setRequiredAmount(0);
        dirk.setItemEquipped(false);
        inventory[Item.dirk.ordinal()] = dirk;
        
        InventoryItem dirk1 = new InventoryItem();
        dirk1.setDescription("Dirk +1");
        dirk1.setQuantityInStock(0);
        dirk1.setRequiredAmount(0);
        dirk1.setItemEquipped(false);
        inventory[Item.dirk1.ordinal()] = dirk1;
        
        InventoryItem dirk2 = new InventoryItem();
        dirk2.setDescription("Dirk +2");
        dirk2.setQuantityInStock(0);
        dirk2.setRequiredAmount(0);
        dirk2.setItemEquipped(false);
        inventory[Item.dirk2.ordinal()] = dirk2;
        
        InventoryItem rapier = new InventoryItem();
        rapier.setDescription("Rapier");
        rapier.setQuantityInStock(0);
        rapier.setRequiredAmount(0);
        rapier.setItemEquipped(false);
        inventory[Item.rapier.ordinal()] = rapier;
        
        InventoryItem rapier1 = new InventoryItem();
        rapier1.setDescription("Rapier +1");
        rapier1.setQuantityInStock(0);
        rapier1.setRequiredAmount(0);
        rapier1.setItemEquipped(false);
        inventory[Item.rapier1.ordinal()] = rapier1;
        
        InventoryItem rapier2 = new InventoryItem();
        rapier2.setDescription("Rapier +2");
        rapier2.setQuantityInStock(0);
        rapier2.setRequiredAmount(0);
        rapier2.setItemEquipped(false);
        inventory[Item.rapier2.ordinal()] = rapier2;
        
        InventoryItem cutlass = new InventoryItem();
        cutlass.setDescription("Cutlass");
        cutlass.setQuantityInStock(0);
        cutlass.setRequiredAmount(0);
        cutlass.setItemEquipped(false);
        inventory[Item.cutlass.ordinal()] = cutlass;
        
        InventoryItem cutlass1 = new InventoryItem();
        cutlass1.setDescription("Cutlass +1");
        cutlass1.setQuantityInStock(0);
        cutlass1.setRequiredAmount(0);
        cutlass1.setItemEquipped(false);
        inventory[Item.cutlass1.ordinal()] = cutlass1;
        
        InventoryItem cutlass2 = new InventoryItem();
        cutlass2.setDescription("Cutlass +2");
        cutlass2.setQuantityInStock(0);
        cutlass2.setRequiredAmount(0);
        cutlass2.setItemEquipped(false);
        inventory[Item.cutlass2.ordinal()] = cutlass2;
        
        InventoryItem falchion = new InventoryItem();
        falchion.setDescription("Falchion");
        falchion.setQuantityInStock(0);
        falchion.setRequiredAmount(0);
        falchion.setItemEquipped(false);
        inventory[Item.falchion.ordinal()] = falchion;
        
        InventoryItem falchion1 = new InventoryItem();
        falchion1.setDescription("Falchion +1");
        falchion1.setQuantityInStock(0);
        falchion1.setRequiredAmount(0);
        falchion1.setItemEquipped(false);
        inventory[Item.falchion1.ordinal()] = falchion1;
        
        InventoryItem falchion2 = new InventoryItem();
        falchion2.setDescription("Falchion +2");
        falchion2.setQuantityInStock(0);
        falchion2.setRequiredAmount(0);
        falchion2.setItemEquipped(false);
        inventory[Item.falchion2.ordinal()] = falchion2;
        
        InventoryItem quarterstaff = new InventoryItem();
        quarterstaff.setDescription("Quarterstaff");
        quarterstaff.setQuantityInStock(0);
        quarterstaff.setRequiredAmount(0);
        quarterstaff.setItemEquipped(false);
        inventory[Item.quarterstaff.ordinal()] = quarterstaff;
        
        InventoryItem quarterstaff1 = new InventoryItem();
        quarterstaff1.setDescription("Quarterstaff +1");
        quarterstaff1.setQuantityInStock(0);
        quarterstaff1.setRequiredAmount(0);
        quarterstaff1.setItemEquipped(false);
        inventory[Item.quarterstaff1.ordinal()] = quarterstaff1;
        
        InventoryItem quarterstaff2 = new InventoryItem();
        quarterstaff2.setDescription("Quarterstaff +2");
        quarterstaff2.setQuantityInStock(0);
        quarterstaff2.setRequiredAmount(0);
        quarterstaff2.setItemEquipped(false);
        inventory[Item.quarterstaff2.ordinal()] = quarterstaff2;
        
        InventoryItem club = new InventoryItem();
        club.setDescription("Club");
        club.setQuantityInStock(0);
        club.setRequiredAmount(0);
        club.setItemEquipped(false);
        inventory[Item.club.ordinal()] = club;
        
        InventoryItem club1 = new InventoryItem();
        club1.setDescription("Club +1");
        club1.setQuantityInStock(0);
        club1.setRequiredAmount(0);
        club1.setItemEquipped(false);
        inventory[Item.club1.ordinal()] = club1;
        
        InventoryItem club2 = new InventoryItem();
        club2.setDescription("Club +2");
        club2.setQuantityInStock(0);
        club2.setRequiredAmount(0);
        club2.setItemEquipped(false);
        inventory[Item.club2.ordinal()] = club2;
        
        InventoryItem shortspear = new InventoryItem();
        shortspear.setDescription("Shortspear");
        shortspear.setQuantityInStock(0);
        shortspear.setRequiredAmount(0);
        shortspear.setItemEquipped(false);
        inventory[Item.shortspear.ordinal()] = shortspear;
        
        InventoryItem shortspear1 = new InventoryItem();
        shortspear1.setDescription("Shortspear +1");
        shortspear1.setQuantityInStock(0);
        shortspear1.setRequiredAmount(0);
        shortspear1.setItemEquipped(false);
        inventory[Item.shortspear1.ordinal()] = shortspear1;
        
        InventoryItem shortspear2 = new InventoryItem();
        shortspear2.setDescription("Shortspear +2");
        shortspear2.setQuantityInStock(0);
        shortspear2.setRequiredAmount(0);
        shortspear2.setItemEquipped(false);
        inventory[Item.shortspear2.ordinal()] = shortspear2;
        
        InventoryItem shortbow = new InventoryItem();
        shortbow.setDescription("Shortbow");
        shortbow.setQuantityInStock(0);
        shortbow.setRequiredAmount(0);
        shortbow.setItemEquipped(false);
        inventory[Item.shortbow.ordinal()] = shortbow;
        
        InventoryItem shortbow1 = new InventoryItem();
        shortbow1.setDescription("Shortbow +1");
        shortbow1.setQuantityInStock(0);
        shortbow1.setRequiredAmount(0);
        shortbow1.setItemEquipped(false);
        inventory[Item.shortbow1.ordinal()] = shortbow1;
        
        InventoryItem shortbow2 = new InventoryItem();
        shortbow2.setDescription("Shortbow +2");
        shortbow2.setQuantityInStock(0);
        shortbow2.setRequiredAmount(0);
        shortbow2.setItemEquipped(false);
        inventory[Item.shortbow2.ordinal()] = shortbow2;
        
        InventoryItem handcrossbow = new InventoryItem();
        handcrossbow.setDescription("Hand Crossbow");
        handcrossbow.setQuantityInStock(0);
        handcrossbow.setRequiredAmount(0);
        handcrossbow.setItemEquipped(false);
        inventory[Item.handcrossbow.ordinal()] = handcrossbow;
        
        InventoryItem handcrossbow1 = new InventoryItem();
        handcrossbow1.setDescription("Hand Crossbow +1");
        handcrossbow1.setQuantityInStock(0);
        handcrossbow1.setRequiredAmount(0);
        handcrossbow1.setItemEquipped(false);
        inventory[Item.handcrossbow1.ordinal()] = handcrossbow1;
        
        InventoryItem handcrossbow2 = new InventoryItem();
        handcrossbow2.setDescription("Hand Crossbow +2");
        handcrossbow2.setQuantityInStock(0);
        handcrossbow2.setRequiredAmount(0);
        handcrossbow2.setItemEquipped(false);
        inventory[Item.handcrossbow2.ordinal()] = handcrossbow2;
        
        InventoryItem sling = new InventoryItem();
        sling.setDescription("Sling");
        sling.setQuantityInStock(0);
        sling.setRequiredAmount(0);
        sling.setItemEquipped(false);
        inventory[Item.sling.ordinal()] = sling;
        
        InventoryItem sling1 = new InventoryItem();
        sling1.setDescription("Sling +1");
        sling1.setQuantityInStock(0);
        sling1.setRequiredAmount(0);
        sling1.setItemEquipped(false);
        inventory[Item.sling1.ordinal()] = sling1;
        
        InventoryItem sling2 = new InventoryItem();
        sling2.setDescription("Sling +2");
        sling2.setQuantityInStock(0);
        sling2.setRequiredAmount(0);
        sling2.setItemEquipped(false);
        inventory[Item.sling2.ordinal()] = sling2;
        /*
        *   AMMO
        */
        InventoryItem arrow = new InventoryItem();
        arrow.setDescription("Arrow");
        arrow.setQuantityInStock(0);
        arrow.setRequiredAmount(0);
        arrow.setItemEquipped(false);
        inventory[Item.arrow.ordinal()] = arrow;
        
        InventoryItem arrow1 = new InventoryItem();
        arrow1.setDescription("Arrow +1");
        arrow1.setQuantityInStock(0);
        arrow1.setRequiredAmount(0);
        arrow1.setItemEquipped(false);
        inventory[Item.arrow1.ordinal()] = arrow1;
        
        InventoryItem arrow2 = new InventoryItem();
        arrow2.setDescription("Arrow +2");
        arrow2.setQuantityInStock(0);
        arrow2.setRequiredAmount(0);
        arrow2.setItemEquipped(false);
        inventory[Item.arrow2.ordinal()] = arrow2;
        
        InventoryItem bolt = new InventoryItem();
        bolt.setDescription("Bolt");
        bolt.setQuantityInStock(0);
        bolt.setRequiredAmount(0);
        bolt.setItemEquipped(false);
        inventory[Item.bolt.ordinal()] = bolt;
        
        InventoryItem bolt1 = new InventoryItem();
        bolt1.setDescription("Bolt +1");
        bolt1.setQuantityInStock(0);
        bolt1.setRequiredAmount(0);
        bolt1.setItemEquipped(false);
        inventory[Item.bolt1.ordinal()] = bolt1;
        
        InventoryItem bolt2 = new InventoryItem();
        bolt2.setDescription("Bolt +2");
        bolt2.setQuantityInStock(0);
        bolt2.setRequiredAmount(0);
        bolt2.setItemEquipped(false);
        inventory[Item.bolt2.ordinal()] = bolt2;
        
        InventoryItem stone = new InventoryItem();
        stone.setDescription("Stone");
        stone.setQuantityInStock(0);
        stone.setRequiredAmount(0);
        stone.setItemEquipped(false);
        inventory[Item.stone.ordinal()] = stone;
        
        InventoryItem stone1 = new InventoryItem();
        stone1.setDescription("Stone +1");
        stone1.setQuantityInStock(0);
        stone1.setRequiredAmount(0);
        stone1.setItemEquipped(false);
        inventory[Item.stone1.ordinal()] = stone1;
        
        InventoryItem stone2 = new InventoryItem();
        stone2.setDescription("Stone +2");
        stone2.setQuantityInStock(0);
        stone2.setRequiredAmount(0);
        stone2.setItemEquipped(false);
        inventory[Item.stone2.ordinal()] = stone2;
        /*
        *   ARMOR
        */
        InventoryItem padded = new InventoryItem();
        padded.setDescription("Padded Armor");
        padded.setQuantityInStock(0);
        padded.setRequiredAmount(0);
        padded.setItemEquipped(false);
        inventory[Item.padded.ordinal()] = padded;
        
        InventoryItem padded1 = new InventoryItem();
        padded1.setDescription("Padded Armor +1");
        padded1.setQuantityInStock(0);
        padded1.setRequiredAmount(0);
        padded1.setItemEquipped(false);
        inventory[Item.padded1.ordinal()] = padded1;
        
        InventoryItem padded2 = new InventoryItem();
        padded2.setDescription("Padded Armor +2");
        padded2.setQuantityInStock(0);
        padded2.setRequiredAmount(0);
        padded2.setItemEquipped(false);
        inventory[Item.padded2.ordinal()] = padded2;
        
        InventoryItem leather = new InventoryItem();
        leather.setDescription("Leather Armor");
        leather.setQuantityInStock(0);
        leather.setRequiredAmount(0);
        leather.setItemEquipped(false);
        inventory[Item.leather.ordinal()] = leather;
        
        InventoryItem leather1 = new InventoryItem();
        leather1.setDescription("Leather Armor +1");
        leather1.setQuantityInStock(0);
        leather1.setRequiredAmount(0);
        leather1.setItemEquipped(false);
        inventory[Item.leather1.ordinal()] = leather1;
        
        InventoryItem leather2 = new InventoryItem();
        leather2.setDescription("Leather Armor +2");
        leather2.setQuantityInStock(0);
        leather2.setRequiredAmount(0);
        leather2.setItemEquipped(false);
        inventory[Item.leather2.ordinal()] = leather2;
        
        InventoryItem studdedleather = new InventoryItem();
        studdedleather.setDescription("Studded Leather Armor");
        studdedleather.setQuantityInStock(0);
        studdedleather.setRequiredAmount(0);
        studdedleather.setItemEquipped(false);
        inventory[Item.studdedleather.ordinal()] = studdedleather;
        
        InventoryItem studdedleather1 = new InventoryItem();
        studdedleather1.setDescription("Studded Leather Armor +1");
        studdedleather1.setQuantityInStock(0);
        studdedleather1.setRequiredAmount(0);
        studdedleather1.setItemEquipped(false);
        inventory[Item.studdedleather1.ordinal()] = studdedleather1;
        
        InventoryItem studdedleather2 = new InventoryItem();
        studdedleather2.setDescription("Studded Leather Armor +2");
        studdedleather2.setQuantityInStock(0);
        studdedleather2.setRequiredAmount(0);
        studdedleather2.setItemEquipped(false);
        inventory[Item.studdedleather2.ordinal()] = studdedleather2;
        
        InventoryItem mithral = new InventoryItem();
        mithral.setDescription("Mithral Armor");
        mithral.setQuantityInStock(0);
        mithral.setRequiredAmount(0);
        mithral.setItemEquipped(false);
        inventory[Item.mithral.ordinal()] = mithral;
        /*
        *   SUPPLIES
        */
        InventoryItem torch = new InventoryItem();
        torch.setDescription("Torch");
        torch.setQuantityInStock(0);
        torch.setRequiredAmount(0);
        torch.setItemEquipped(false);
        inventory[Item.torch.ordinal()] = torch;
        
        InventoryItem oil = new InventoryItem();
        oil.setDescription("Oil");
        oil.setQuantityInStock(0);
        oil.setRequiredAmount(0);
        oil.setItemEquipped(false);
        inventory[Item.oil.ordinal()] = oil;
        
        InventoryItem flintandsteel = new InventoryItem();
        flintandsteel.setDescription("Flint and Steel");
        flintandsteel.setQuantityInStock(0);
        flintandsteel.setRequiredAmount(0);
        flintandsteel.setItemEquipped(false);
        inventory[Item.flintandsteel.ordinal()] = flintandsteel;
        
        InventoryItem rope = new InventoryItem();
        rope.setDescription("Rope (50')");
        rope.setQuantityInStock(0);
        rope.setRequiredAmount(0);
        rope.setItemEquipped(false);
        inventory[Item.rope.ordinal()] = rope;
        
        InventoryItem grapplinghook = new InventoryItem();
        grapplinghook.setDescription("Grappling Hook");
        grapplinghook.setQuantityInStock(0);
        grapplinghook.setRequiredAmount(0);
        grapplinghook.setItemEquipped(false);
        inventory[Item.grapplinghook.ordinal()] = grapplinghook;
        /*
        *   THIEVES' TOOLS
        */
        InventoryItem crowbar = new InventoryItem();
        crowbar.setDescription("Crowbar");
        crowbar.setQuantityInStock(0);
        crowbar.setRequiredAmount(0);
        crowbar.setItemEquipped(false);
        inventory[Item.crowbar.ordinal()] = crowbar;
        
        InventoryItem minisaw = new InventoryItem();
        minisaw.setDescription("Mini Saw");
        minisaw.setQuantityInStock(0);
        minisaw.setRequiredAmount(0);
        minisaw.setItemEquipped(false);
        inventory[Item.minisaw.ordinal()] = minisaw;
        
        InventoryItem hammer = new InventoryItem();
        hammer.setDescription("Hammer");
        hammer.setQuantityInStock(0);
        hammer.setRequiredAmount(0);
        hammer.setItemEquipped(false);
        inventory[Item.hammer.ordinal()] = hammer;
        
        InventoryItem chisel = new InventoryItem();
        chisel.setDescription("Chisel");
        chisel.setQuantityInStock(0);
        chisel.setRequiredAmount(0);
        chisel.setItemEquipped(false);
        inventory[Item.chisel.ordinal()] = chisel;
        
        InventoryItem acid = new InventoryItem();
        acid.setDescription("Acid");
        acid.setQuantityInStock(0);
        acid.setRequiredAmount(0);
        acid.setItemEquipped(false);
        inventory[Item.acid.ordinal()] = acid;
        
        InventoryItem bentprobe = new InventoryItem();
        bentprobe.setDescription("Bent Probe");
        bentprobe.setQuantityInStock(0);
        bentprobe.setRequiredAmount(0);
        bentprobe.setItemEquipped(false);
        inventory[Item.bentprobe.ordinal()] = bentprobe;
        
        InventoryItem wedge = new InventoryItem();
        wedge.setDescription("Wedge");
        wedge.setQuantityInStock(0);
        wedge.setRequiredAmount(0);
        wedge.setItemEquipped(false);
        inventory[Item.wedge.ordinal()] = wedge;
        
        InventoryItem wirecutters = new InventoryItem();
        wirecutters.setDescription("Wirecutters");
        wirecutters.setQuantityInStock(0);
        wirecutters.setRequiredAmount(0);
        wirecutters.setItemEquipped(false);
        inventory[Item.wirecutters.ordinal()] = wirecutters;
        
        InventoryItem jimmy = new InventoryItem();
        jimmy.setDescription("Jimmy");
        jimmy.setQuantityInStock(0);
        jimmy.setRequiredAmount(0);
        jimmy.setItemEquipped(false);
        inventory[Item.jimmy.ordinal()] = jimmy;
        /*
        *   HEALING
        */
        InventoryItem healingpotion = new InventoryItem();
        healingpotion.setDescription("Healing Potion");
        healingpotion.setQuantityInStock(0);
        healingpotion.setRequiredAmount(0);
        healingpotion.setItemEquipped(false);
        inventory[Item.healingpotion.ordinal()] = healingpotion;
        /*
        *   ARTIFACTS
        */
        InventoryItem talismanOfShadows = new InventoryItem();
        healingpotion.setDescription("Talisman of Shadows");
        healingpotion.setQuantityInStock(0);
        healingpotion.setRequiredAmount(0);
        healingpotion.setItemEquipped(false);
        inventory[Item.talismanOfShadows.ordinal()] = talismanOfShadows;
        
        
        return inventory;
    }
    
    public static InventoryItem[] getSortedInventoryList() {
        
        //get inventory list for the current game
        InventoryItem[] originalInventoryList = MyrrBlakkr.getCurrentGame().getInventory();
        
        // clone (make a copy) original inventory list
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        // use a bubble sort to sort the list of inventory items alphabetically by name
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length - 1; i++) {
            for (int j = 0; j < inventoryList.length - 1 - i; j++) {
                if (inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j + 1];
                    inventoryList[j + 1] = tempInventoryItem;
                }
            }
        }
        return inventoryList;
    }
    
    /*
    *   CREATE A LIST OF ENEMIES & SAVE THEM IN THE GAME
    */
    public static Enemy[] createEnemyList() {
        Enemy[] enemy = new Enemy[3];
        /*
        *   ENEMIES
        */
        Enemy goblinWarrior = new Enemy();
        goblinWarrior.setHealth(9);        
        //goblinWarrior.setWeapon(Item.shortsword);
        goblinWarrior.setAttack(11);
        goblinWarrior.setDefense(15);
        enemy[EnemyList.goblinWarrior.ordinal()] = goblinWarrior;
        
        Enemy goblinBlackBlade = new Enemy();
        goblinBlackBlade.setHealth(13);        
        //goblinBlackBlade.setWeapon(Item.quarterstaff);
        goblinBlackBlade.setAttack(13);
        goblinBlackBlade.setDefense(16);
        enemy[EnemyList.goblinBlackBlade.ordinal()] = goblinBlackBlade;
        
        Enemy goblinShaman = new Enemy();
        goblinShaman.setHealth(11);        
        //goblinShaman.setWeapon(Item.quarterstaff);
        goblinShaman.setAttack(12);
        goblinShaman.setDefense(14);
        enemy[EnemyList.goblinShaman.ordinal()] = goblinShaman;
        
        return enemy;         
    }
    
    /*
    ,          // [0]
    goblinBlackBlade,
    goblinShaman,
    ochreJelly,
    gelatinousCube,
    ghoul,
    ghast,
    giantCentipede,
    gnoll,
    lurkingStrangler,
    hookHorror,
    owlBear,
    skeleton,
    wererat,
    zombie,
    orcWarrior,
    orcShaman,
    orcSkullcrusher,
    drowWarrior,
    drowMage,
    drowPriestess,
    eridihlDuskfinder;
    
    private String type;    
    private int health;
    private EnemyWeapon[] weapon;    
    private int attack;
    private int defense;
    private Point coordinates;
    */
    
    public static Enemy[] getSortedEnemyList() {
        
        //get enemy list for the current game
        Enemy[] originalEnemyList = MyrrBlakkr.getCurrentGame().getEnemy();
        
        // clone (make a copy) original inventory list
        Enemy[] enemyList = originalEnemyList.clone();
        
        // use a bubble sort to sort the list of inventory items alphabetically by name
        Enemy tempEnemy;
        for (int i = 0; i < enemyList.length - 1; i++) {
            for (int j = 0; j < enemyList.length - 1 - i; j++) {
                if (enemyList[j].getDescription().compareToIgnoreCase(enemyList[j + 1].getDescription()) > 0) {
                    tempEnemy = enemyList[j];
                    enemyList[j] = enemyList[j + 1];
                    enemyList[j + 1] = tempEnemy;
                }
            }
        }
        return enemyList;
    }
    
/*        
    private static Lock[] createLockList() {
        System.out.println("*** createLockList function called from GameControl class***");
        return null;
    }

    private static Trap[] createTrapList() {
        System.out.println("*** createTrapList function called from GameControl class***");
        return null;
    }

    private static TreasureCache[] createCacheList() {
        System.out.println("*** createCacheList function called from GameControl class***");
        return null;
    }
*/    
    
    public static void saveGame(Game currentGame) {
        System.out.println("*** saveGame function called from GameControl class***");
    }
    
    
}
