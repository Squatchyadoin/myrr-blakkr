/*
 * Control class for all calculations, decisions, and other functions that get or
 * save data for the end users stories related to the control of the game map
 * (e.g., create map, create scenes, & assign scenes to each location).
 */
package byui.cit260.myrrBlakkr.control;

import byui.cit260.myrrBlakkr.model.Game;
import byui.cit260.myrrBlakkr.model.Location;
import byui.cit260.myrrBlakkr.model.Map;
import byui.cit260.myrrBlakkr.model.Scene;
import byui.cit260.myrrBlakkr.model.SceneType;
import myrrblakkr.MyrrBlakkr;

/**
 *
 * @author Family
 */
public class MapControl {

    public static Map createMap() {        
        
        Map map = new Map (45, 45);                     // create the map (...in the Map class)
        Scene[] scenes = createScenes();                // create a list of scenes in the game
        assignScenesToLocations(map, scenes);           // assign scenes to locations on the map        
        
        return map;
    }   


    /*
    *   CREATE SCENES FOR THE MAP
    */
    private static Scene[] createScenes() {
        
        Game game = MyrrBlakkr.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene start = new Scene();
        start.setDescription(
                  "\n* You land in a pile of rubble at the end of the chute.     *"
                + "\n* Unharmed, you rise up, dust yourself off and look at your *"
                + "\n* surrounds. A dimly lit corridor leads East and West. The  *"
                + "\n* corridor is roughly 10 ft high and about 6 ft wide, and   *"
                + "\n* consists of uneven flagstone slabs. A sense of foreboding *"
                + "\n* arises in you as you quickly notice signs of someone or   *"
                + "\n* something else having passed through this same corridor   *"
                + "\n* very recently. Several sets of footprints mar the fine    *"
                + "\n* layer of dust the coats the floor and walls of the corr-  *"
                + "\n* idor and a couple of sconces currently hold a low flame.  *");
        start.setMapSymbol(" ST ");
        start.setBlocked(false);
        start.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = start;
        
        Scene solid = new Scene();
        solid.setMapSymbol(" [*] ");
        scenes[SceneType.solid.ordinal()] = solid;
        
        Scene corridorN = new Scene();
        corridorN.setDescription(
                  "\n* A corridor leads to the North. There are walls to the     *"
                + "\n* South, East, and West.                                    *");
        corridorN.setMapSymbol(" |_| ");
        corridorN.setBlocked(false);
        corridorN.setTravelTime(10);
        scenes[SceneType.corridorN.ordinal()] = corridorN;
        
        Scene corridorS = new Scene();
        corridorS.setDescription(
                  "\n* A corridor leads to the South. There are walls to the     *"
                + "\n* North, East, and West.                                    *");
        corridorS.setMapSymbol(" |^| ");
        corridorS.setBlocked(false);
        corridorS.setTravelTime(10);
        scenes[SceneType.corridorS.ordinal()] = corridorS;
        
        Scene corridorE = new Scene();
        corridorE.setDescription(
                  "\n* A corridor leads to the East. There are walls to the      *"
                + "\n* North, South, and West.                                   *");
        corridorE.setMapSymbol(" [= ");
        corridorE.setBlocked(false);
        corridorE.setTravelTime(10);
        scenes[SceneType.corridorE.ordinal()] = corridorE;
        
        Scene corridorW = new Scene();
        corridorW.setDescription(
                  "\n* A corridor leads to the West. There are walls to the      *"
                + "\n* North, South, and East.                                   *");
        corridorW.setMapSymbol(" =] ");
        corridorW.setBlocked(false);
        corridorW.setTravelTime(10);
        scenes[SceneType.corridorW.ordinal()] = corridorW;
        
        Scene corridorNS = new Scene();
        corridorNS.setDescription(
                  "\n* A corridor leads to the North and South, with walls to    *"
                + "\n* the East and West.                                        *");
        corridorNS.setMapSymbol(" | | ");
        corridorNS.setBlocked(false);
        corridorNS.setTravelTime(10);
        scenes[SceneType.corridorNS.ordinal()] = corridorNS;
        
        Scene corridorNE = new Scene();
        corridorNE.setDescription(
                  "\n* A corridor leads to the North and the East. There are     *"
                + "\n* walls to the South and West.                              *");
        corridorNE.setMapSymbol(" |__ ");
        corridorNE.setBlocked(false);
        corridorNE.setTravelTime(10);
        scenes[SceneType.corridorNE.ordinal()] = corridorNE;
        
        Scene corridorNW = new Scene();
        corridorNW.setDescription(
                  "\n* A corridor leads to the North and the West. There are     *"
                + "\n* walls to the South and East.                              *");
        corridorNW.setMapSymbol(" __| ");
        corridorNW.setBlocked(false);
        corridorNW.setTravelTime(10);
        scenes[SceneType.corridorNW.ordinal()] = corridorNW;
        
        Scene corridorSE = new Scene();
        corridorSE.setDescription(
                  "\n* A corridor leads to the South and the East. There are     *"
                + "\n* walls to the North and West.                              *");
        corridorSE.setMapSymbol(" |^^ ");
        corridorSE.setBlocked(false);
        corridorSE.setTravelTime(10);
        scenes[SceneType.corridorSE.ordinal()] = corridorSE;
        
        Scene corridorSW = new Scene();
        corridorSW.setDescription(
                  "\n* A corridor leads to the South and the West. There are     *"
                + "\n* walls to the North and East.                              *");
        corridorSW.setMapSymbol(" ^^| ");
        corridorSW.setBlocked(false);
        corridorSW.setTravelTime(10);
        scenes[SceneType.corridorSW.ordinal()] = corridorSW;
        
        Scene corridorEW = new Scene();
        corridorEW.setDescription(
                  "\n* A corridor leads to the East and West, with walls to the  *"
                + "\n* North and South.                                          *");
        corridorEW.setMapSymbol(" _-_ ");
        corridorEW.setBlocked(false);
        corridorEW.setTravelTime(10);
        scenes[SceneType.corridorEW.ordinal()] = corridorEW;
        
        Scene corridorNSE = new Scene();
        corridorNSE.setDescription(
                  "\n* A corridor leads to the North, South, and East, with a    *"
                + "\n* wall facing West.                                         *");
        corridorNSE.setMapSymbol(" | = ");
        corridorNSE.setBlocked(false);
        corridorNSE.setTravelTime(10);
        scenes[SceneType.corridorNSE.ordinal()] = corridorNSE;
        
        Scene corridorNSW = new Scene();
        corridorNSW.setDescription(
                  "\n* A corridor leads to the North, South, and West, with a    *"
                + "\n* wall facing East.                                         *");
        corridorNSW.setMapSymbol(" = | ");
        corridorNSW.setBlocked(false);
        corridorNSW.setTravelTime(10);
        scenes[SceneType.corridorNSW.ordinal()] = corridorNSW;
        
        Scene corridorNEW = new Scene();
        corridorNEW.setDescription(
                  "\n* A corridor leads to the North, East, and West, with a     *"
                + "\n* wall facing South.                                        *");
        corridorNEW.setMapSymbol(" = | ");
        corridorNEW.setBlocked(false);
        corridorNEW.setTravelTime(10);
        scenes[SceneType.corridorNEW.ordinal()] = corridorNEW;
        
        Scene corridorSEW = new Scene();
        corridorSEW.setDescription(
                  "\n* A corridor leads to the South, East, and West, with a     *"
                + "\n* wall facing North.                                        *");
        corridorSEW.setMapSymbol(" = | ");
        corridorSEW.setBlocked(false);
        corridorSEW.setTravelTime(10);
        scenes[SceneType.corridorSEW.ordinal()] = corridorSEW;
        
        Scene corridorNSEW = new Scene();
        corridorNSEW.setDescription(
                  "\n* You stand at an intersection. A corridor leads to the     *"
                + "\n* North, South, East, and West.                             *");
        corridorNSEW.setMapSymbol(" + ");
        corridorNSEW.setBlocked(false);
        corridorNSEW.setTravelTime(10);
        scenes[SceneType.corridorNSEW.ordinal()] = corridorNSEW;
        
        Scene door = new Scene();
        door.setDescription(
                  "\n* A solid wooden door lies closed before you.               *");
        door.setMapSymbol(" [|] ");
        door.setBlocked(false);
        door.setTravelTime(10);
        scenes[SceneType.door.ordinal()] = door;
        
        Scene doorLocked = new Scene();
        doorLocked.setDescription(
                  "\n* A locked, solid wooden door lies closed before you.       *");
        doorLocked.setMapSymbol(" [L] ");
        doorLocked.setBlocked(true);        
        doorLocked.setTravelTime(10);
        scenes[SceneType.doorLocked.ordinal()] = doorLocked;
        
        Scene doorTrapped = new Scene();
        doorTrapped.setDescription(
                  "\n* A locked, solid wooden door lies closed before you.       *");
        doorTrapped.setMapSymbol(" [L] ");
        doorTrapped.setBlocked(true);
        //doorTrapped.setTrapped(true);
        doorTrapped.setTravelTime(10);
        scenes[SceneType.doorTrapped.ordinal()] = doorTrapped;
        
        Scene doorSecret = new Scene();
        doorSecret.setDescription(
                  "\n* Your thorough search reveals a secret, hidden door which  *"
                + "\n* lies closed before you.                                   *");
        doorSecret.setMapSymbol(" [S] ");
        doorSecret.setBlocked(false);
        //doorSecret.setSecret(true);
        doorSecret.setTravelTime(10);
        scenes[SceneType.doorSecret.ordinal()] = doorSecret;
        
        Scene arch = new Scene();
        arch.setDescription(
                  "\n* You stand within an open archway.                         *");
        arch.setMapSymbol(" ( ) ");
        arch.setBlocked(false);
        arch.setTravelTime(10);
        scenes[SceneType.arch.ordinal()] = arch;
        
        Scene portculis = new Scene();
        portculis.setDescription(
                  "\n* You stand underneath an open wooden portculis.            *");
        portculis.setMapSymbol(" |'''| ");
        portculis.setBlocked(false);
        portculis.setTravelTime(10);
        scenes[SceneType.portculis.ordinal()] = portculis;
        
        Scene chasm = new Scene();
        chasm.setDescription(
                  "\n* A 15 ft wide chasm cut accross the corridor. You cannot   *"
                + "\n* see the bottom.                                           *");
        chasm.setMapSymbol(" |C| ");
        chasm.setBlocked(false);
        chasm.setTravelTime(10);
        scenes[SceneType.chasm.ordinal()] = chasm;
        
        Scene chanting = new Scene();
        chanting.setDescription(
                  "\n* Chanting fills the corridor.                              *");
        chanting.setMapSymbol(" ( ) ");
        chanting.setBlocked(false);
        chanting.setTravelTime(10);
        scenes[SceneType.chanting.ordinal()] = chanting;
        
        Scene curse = new Scene();
        curse.setDescription(
                  "\n* Someone has scrawled 'the curse can never be broken' on   *"
                + "\n* the corridor wall here.                                   *");
        curse.setMapSymbol(" ( ) ");
        curse.setBlocked(false);
        curse.setTravelTime(10);
        scenes[SceneType.curse.ordinal()] = curse;
        
        Scene room01 = new Scene();
        room01.setDescription(
                  "\n* Dimensions: 45' x 35' w/ 20' ceiling                      *"
                + "\n* Exits: Archway to West. Door to South                     *"
                + "\n* Features: A mirror hangs on the East wall. A toppled      *"
                + "\n* statue lies in the East side of the room.                 *");
        room01.setMapSymbol(" [1] ");
        room01.setBlocked(false);
        room01.setTravelTime(10);
        scenes[SceneType.room01.ordinal()] = room01;
        
        Scene room02 = new Scene();
        room02.setDescription(
                  "\n* Dimensions: 55' x 55' w/ 30' ceiling                      *"
                + "\n* Exits: Two doors 6' apart to North                        *"
                + "\n* Features: Someone has scrawled 'Praise Sardoc the Black'  *"
                + "\n* on the wall to the South. A rusted iron box lies in the   *"
                + "\n* Southeast corner of the room.                             *");
        room02.setMapSymbol(" [2] ");
        room02.setBlocked(false);
        room02.setTravelTime(10);
        scenes[SceneType.room02.ordinal()] = room02;
        
        Scene room03 = new Scene();
        room03.setDescription(
                  "\n* Dimensions: 45' x 55' w/ 30' ceiling                      *"
                + "\n* Exits: Doors to West, East, and in Northeast. Arch to     *"
                + "\n* Southwest                                                 *"
                + "\n* Features: Someone has scrawled 'The Onyx Throne shall be  *"
                + "\n* restored when North becomes South' on the South wall. A   *"
                + "\n* human corpse lies in front of an open chest in the North- *"
                + "\n* west corner of the room.                                  *");                
        room03.setMapSymbol(" [3] ");
        room03.setBlocked(false);
        room03.setTravelTime(10);
        scenes[SceneType.room03.ordinal()] = room03;
        
        Scene room04 = new Scene();
        room04.setDescription(
                  "\n* Dimensions: 25' x 45' w/ 20' ceiling                      *"
                + "\n* Exits: Door to East                                       *"
                + "\n* Features: A well lies in the South side of the room. A    *"                
                + "\n* carved stone statue lies in the center of the room.       *");                
        room04.setMapSymbol(" [4] ");
        room04.setBlocked(false);
        room04.setTravelTime(10);
        scenes[SceneType.room04.ordinal()] = room04;
        
        Scene room05 = new Scene();
        room05.setDescription(
                  "\n* Dimensions: 25' x 45' w/ 20' ceiling                      *"
                + "\n* Exits: Doors 6' apart East. Archway to South              *"
                + "\n* Features: A fountain lies in the center of the room. In   *"
                + "\n* the middle of the fountain stands the marble statue of a  *"
                + "\n* nude elven female pouring the contents of a pitcher of    *"
                + "\n* wine into the fountain below. The water is tainted, and   *"
                + "\n* it appears like blood is streaming from the pitcher and   *"
                + "\n* filling the fountain. A rank smell seems to be emanating  *"
                + "\n* from the archway to the South.                            *");                
        room05.setMapSymbol(" [5] ");
        room05.setBlocked(false);
        room05.setTravelTime(10);
        scenes[SceneType.room05.ordinal()] = room05;
        
        Scene room05a = new Scene();
        room05a.setDescription(
                  "\n* Dimensions: 25' x 5' w/ 10' ceiling                       *"
                + "\n* Exits: Archway to North                                   *"
                + "\n* Features: A pile of goblin bodies lies stacked to the     *"
                + "\n* West. Blood from the bodies trickles slightly downhill    *"
                + "\n* and seeps through a drain at the East end of the room.    *");                
        room05a.setMapSymbol(" [5a] ");
        room05a.setBlocked(false);
        room05a.setTravelTime(10);
        scenes[SceneType.room05a.ordinal()] = room05a;
        
        Scene room06 = new Scene();
        room06.setDescription(
                  "\n* Dimensions: 45' x 15' w/ 10' ceiling                      *"
                + "\n* Exits: Doors to North and East. Archway to Northeast      *"
                + "\n* Features: The floor of this room is covered in perfect    *"
                + "\n* hexagonal tiles. Alien glyphs cover the West wall.        *");                
        room06.setMapSymbol(" [6] ");
        room06.setBlocked(false);
        room06.setTravelTime(10);
        scenes[SceneType.room06.ordinal()] = room06;
        
        Scene room07 = new Scene();
        room07.setDescription(
                  "\n* Dimensions: 35' x 45' w/ 20' ceiling                      *"
                + "\n* Exits: Doors to East, Northeast, and Southwest            *"
                + "\n* Features: Several alcoves are carved into the East and    *"
                + "\n* West walls. Numerous bookshelves occupy the room. Several *"
                + "\n* are overturned and piles of books, scrolls, and tomes     *"
                + "\n* litter the room.                                          *");                
        room07.setMapSymbol(" [7] ");
        room07.setBlocked(false);
        room07.setTravelTime(10);
        scenes[SceneType.room07.ordinal()] = room07;
        
        Scene room08 = new Scene();
        room08.setDescription(
                  "\n* Dimensions: 35' x 25' w/ 20' ceiling                      *"
                + "\n* Exits: Doors to the East, Northwest, and Southeast        *"
                + "\n* Features: The bodies of several adventures are scattered  *"
                + "\n* throughout the room. All are dessicated and appear to be  *"
                + "\n* drained of all fluids. The corpses of several giant       *"
                + "\n* spiders lie upturned in the Southwest corner of the room. *");                
        room08.setMapSymbol(" [8] ");
        room08.setBlocked(false);
        room08.setTravelTime(10);
        scenes[SceneType.room08.ordinal()] = room08;
        
        Scene room08a = new Scene();
        room08a.setDescription(
                  "\n* Dimensions: 5' x 5' w/ 10' ceiling                        *"
                + "\n* Exits: Door to North                                      *"
                + "\n* Features: Darkness fills this room. Your torch cannot     *"
                + "\n* penetrate it, but when you pull it out, it remains lit.   *");                
        room08a.setMapSymbol(" [8a] ");
        room08a.setBlocked(false);
        room08a.setTravelTime(10);
        scenes[SceneType.room08a.ordinal()] = room08a;
        
        Scene room09 = new Scene();
        room09.setDescription(
                  "\n* Dimensions: 25' x 45' w/ 20' ceiling                      *"
                + "\n* Exits: Doors to West and Northwest                        *"
                + "\n* Features: In the center of the room is a 15 ft tall cage. *"
                + "\n* In the cage is a pile of coins and gems. Also in the cage *"
                + "\n* stands a hook horror. A switch protrudes from the floor   *"
                + "\n* near the door to the East    .                            *");                
        room09.setMapSymbol(" [9] ");
        room09.setBlocked(false);
        room09.setTravelTime(10);
        scenes[SceneType.room09.ordinal()] = room09;
        
        Scene room10 = new Scene();
        room10.setDescription(
                  "\n* Dimensions: 25' x 15' w/ 20' ceiling                      *"
                + "\n* Exits: Doors to South, East, and Southwest                *"
                + "\n* Features: Sporadic knocking fills the room. A pile of     *"
                + "\n* rotten rope lies in the Southeast corner of the room.     *");                
        room10.setMapSymbol(" [10] ");
        room10.setBlocked(false);
        room10.setTravelTime(10);
        scenes[SceneType.room10.ordinal()] = room10;
        
        Scene room10a = new Scene();
        room10a.setDescription(
                  "\n* Dimensions: 5' x 15' w/ 10' ceiling                       *"
                + "\n* Exits: Door to North                                      *"
                + "\n* Features: The floor of this room is littered with bones.  *");                
        room10a.setMapSymbol(" [10a] ");
        room10a.setBlocked(false);
        room10a.setTravelTime(10);
        scenes[SceneType.room10a.ordinal()] = room10;
        
        Scene room11 = new Scene();
        room11.setDescription(
                  "\n* Dimensions: 35' x 35' w/ 20' ceiling                      *"
                + "\n* Exits: Doors to West, Northwest, and Southwest            *"
                + "\n* Features: This L-shaped room has torch sconces spaced     *"
                + "\n* every 5 ft along each wall. Mysteriously, the sconces dim *"
                + "\n* and flicker every 20 seconds, then return to full flame.  *"
                + "\n* Scrawled in blood on the East wall are the words 'Deadeye *"
                + "\n* Dick looted this place. All praise be to Grummsh.'        *");                
        room11.setMapSymbol(" [11] ");
        room11.setBlocked(false);
        room11.setTravelTime(10);
        scenes[SceneType.room11.ordinal()] = room11;
        
        Scene room12 = new Scene();
        room12.setDescription(
                  "\n* Dimensions:45' x 45' w/ 40' ceiling                       *"
                + "\n* Exits: Doors to Northwest, Northeast, and Southeast. An   *"
                + "\n* archway lies to the West                                  *"
                + "\n* Features: The preeminant feature of this large room is    *"
                + "\n* a high domed ceiling covered in astrological pictographs. *"
                + "\n* A carved stone statue of a elven mage standing while      *"
                + "\n* studying a open tome in one hand lies in the East side of *"
                + "\n* the room. A plaque on the statue has the name 'Eridihl    *"
                + "\n* Duskfinder - beloved husband and trusted lord' inscribed. *");                
        room12.setMapSymbol(" [12] ");
        room12.setBlocked(false);
        room12.setTravelTime(10);
        scenes[SceneType.room12.ordinal()] = room12;
        
        Scene room12a = new Scene();
        room12a.setDescription(
                  "\n* Dimensions: 5' x 15' w/ 4 0' ceiling                      *"
                + "\n* Exits: Door to North                                      *"
                + "\n* Features: The walls of this tall, narrow room are covered *"
                + "\n* with arcane runes from top to bottom.                     *");                
        room12a.setMapSymbol(" [12a] ");
        room12a.setBlocked(false);
        room12a.setTravelTime(10);
        scenes[SceneType.room12a.ordinal()] = room12a; 
        
        Scene room13 = new Scene();
        room13.setDescription(
                  "\n* Dimensions: 25' x 25' w/ 20' ceiling                      *"
                + "\n* Exits: Doors to the East, Southeast, and Southwest       *"
                + "\n* Features: A mirror hangs on the South wall of this room.  *"
                + "\n* Twelve sarcophagi reside within alcoves along the North   *"                          
                + "\n* and West walls. Someone has scratched 'My beloved Lliryl' *"
                + "\n* on the North wall.                                        *");                                
        room13.setMapSymbol(" [13] ");
        room13.setBlocked(false);
        room13.setTravelTime(10);
        scenes[SceneType.room13.ordinal()] = room13;
        
        Scene room13a = new Scene();
        room13a.setDescription(
                  "\n* Dimensions: 5' x 5' w/ 10' ceiling                        *"
                + "\n* Exits: Door to North                                      *"
                + "\n* Features: A shrine dominates this small room. The air     *"
                + "\n* smells of incense and the mummified body of a child lies  *"                          
                + "\n* on a black marble slab before you.                        *");                                
        room13a.setMapSymbol(" [13a] ");
        room13a.setBlocked(false);
        room13a.setTravelTime(10);
        scenes[SceneType.room13a.ordinal()] = room13a;
        
        Scene room14 = new Scene();
        room14.setDescription(
                  "\n* Dimensions: 45' x 45' w/ 20' ceiling                      *"
                + "\n* Exits: Doors to the East, Northeast, Southeast and South- *"
                + "\n* west                                                      *"
                + "\n* Features: The floor is covered in perfect hexagonal tiles *"
                + "\n* set in a seemingly random pattern. A large empty bath is  *"
                + "\n* built into the Southeast corner of the room. A marble     *"
                + "\n* divan lines the West wall by which resides a pile of bent *"
                + "\n* copper coins.                                             *");                
        room14.setMapSymbol(" [14] ");
        room14.setBlocked(false);
        room14.setTravelTime(10);
        scenes[SceneType.room14.ordinal()] = room14;
        
        Scene room14a = new Scene();
        room14a.setDescription(
                  "\n* Dimensions: 5' x 15' w/ 20' ceiling                       *"
                + "\n* Exits: Door to North. Archway to East                     *"
                + "\n* Features: The bodies of several adventures are scattered  *"
                + "\n* The walls of this room seem to be covered in spots with a *"                
                + "\n* purple slime. Bones and rubble litter the floor.          *");                
        room14a.setMapSymbol(" [14a] ");
        room14a.setBlocked(false);
        room14a.setTravelTime(10);
        scenes[SceneType.room14a.ordinal()] = room14a;       
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                  "\n* You step forward and find yourself back in the Black Swamp. *"
                + "\n* You look down and find the Talisman of Shadows still firm *"
                + "\n* in your hand. Amazed, you look back up an notice you've   *"
                + "\n* appeared at the edge of camp. Your friends have noticed   *"
                + "\n* your sudden arrival and rush forward to greet you!        *"
                + "\n\n* Congratulations! You have completed your quest and lived  *"
                + "\n* to tell your tale. Someday bards far and wide may spread  *"
                + "\n* the legend of a ne'er-do-well thief who once claimed the  *"
                + "\n* fabled Talisman of Shadows from the haunted ruins of Myrr *"
                + "\n* Blakkr!!!                                                 *");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
        
    }

    /*
    *   ASSIGN A SCENE TO EACH LOCATION IN THE MAP
    */
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[0][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[0][10].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[0][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][13].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[0][20].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[0][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[0][30].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[0][31].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][32].setScene(scenes[SceneType.solid.ordinal()]);
        locations[0][33].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][34].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][35].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][37].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[0][40].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[0][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[0][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[0][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[1][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.corridorE.ordinal()]); 
        locations[1][2].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[1][3].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[1][4].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[1][5].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[1][6].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[1][7].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[1][8].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[1][9].setScene(scenes[SceneType.corridorEW.ordinal()]);
        locations[1][10].setScene(scenes[SceneType.corridorEW.ordinal()]);
        locations[1][11].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[1][12].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[1][13].setScene(scenes[SceneType.corridorSW.ordinal()]); 
        locations[1][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[1][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[1][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[1][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[1][31].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[1][32].setScene(scenes[SceneType.room13.ordinal()]);
        locations[1][33].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[1][34].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[1][35].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[1][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][37].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[1][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[1][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[1][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[1][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[2][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[2][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[2][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][13].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[2][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[2][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[2][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[2][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[2][31].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[2][32].setScene(scenes[SceneType.room13.ordinal()]);
        locations[2][33].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[2][34].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[2][35].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[2][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][37].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[2][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[2][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[2][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[2][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[3][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[3][2].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[3][3].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[3][4].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[3][5].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[3][6].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[3][7].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[3][8].setScene(scenes[SceneType.door.ordinal()]); 
        locations[3][9].setScene(scenes[SceneType.corridorEW.ordinal()]);
        locations[3][10].setScene(scenes[SceneType.corridorEW.ordinal()]);
        locations[3][11].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[3][12].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[3][13].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[3][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[3][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[3][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[3][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[3][31].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[3][32].setScene(scenes[SceneType.room13.ordinal()]);
        locations[3][33].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[3][34].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[3][35].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[3][36].setScene(scenes[SceneType.door.ordinal()]); 
        locations[3][37].setScene(scenes[SceneType.corridorSW.ordinal()]); 
        locations[3][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[3][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[3][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[3][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[3][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[4][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[4][2].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[4][3].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[4][4].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[4][5].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[4][6].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[4][7].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[4][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[4][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[4][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][13].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[4][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[4][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[4][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[4][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[4][31].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[4][32].setScene(scenes[SceneType.room13.ordinal()]);
        locations[4][33].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[4][34].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[4][35].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[4][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][37].setScene(scenes[SceneType.chasm.ordinal()]); 
        locations[4][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[4][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[4][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[4][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[4][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[5][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[5][2].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[5][3].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[5][4].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[5][5].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[5][6].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[5][7].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[5][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[5][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[5][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][13].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[5][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[5][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[5][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[5][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[5][31].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[5][32].setScene(scenes[SceneType.room13.ordinal()]);
        locations[5][33].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[5][34].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[5][35].setScene(scenes[SceneType.room13.ordinal()]); 
        locations[5][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][37].setScene(scenes[SceneType.corridorNS.ordinal()]);
        locations[5][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[5][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[5][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[5][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[5][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[6][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[6][2].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[6][3].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[6][4].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[6][5].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[6][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[6][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[6][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][13].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[6][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[6][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[6][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[6][30].setScene(scenes[SceneType.door.ordinal()]);
        locations[6][31].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][32].setScene(scenes[SceneType.solid.ordinal()]);
        locations[6][33].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][34].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][35].setScene(scenes[SceneType.doorLocked.ordinal()]); 
        locations[6][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][37].setScene(scenes[SceneType.doorLocked.ordinal()]); 
        locations[6][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[6][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[6][41].setScene(scenes[SceneType.solid.ordinal()]);
        locations[6][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[6][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[6][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[7][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[7][2].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[7][3].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[7][4].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[7][5].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[7][6].setScene(scenes[SceneType.corridorNE.ordinal()]); 
        locations[7][7].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[7][8].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[7][9].setScene(scenes[SceneType.corridorEW.ordinal()]);
        locations[7][10].setScene(scenes[SceneType.corridorEW.ordinal()]);
        locations[7][11].setScene(scenes[SceneType.corridorSW.ordinal()]); 
        locations[7][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][13].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[7][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[7][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[7][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[7][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[7][31].setScene(scenes[SceneType.room13a.ordinal()]); 
        locations[7][32].setScene(scenes[SceneType.solid.ordinal()]);
        locations[7][33].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[7][34].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[7][35].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[7][36].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[7][37].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[7][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[7][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[7][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[7][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[7][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[8][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[8][1].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[8][2].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[8][3].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[8][4].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[8][5].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[8][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][7].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[8][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[8][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[8][11].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[8][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][13].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[8][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[8][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[8][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[8][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[8][31].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][32].setScene(scenes[SceneType.solid.ordinal()]);
        locations[8][33].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[8][34].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[8][35].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[8][36].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[8][37].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[8][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[8][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[8][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[8][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[8][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[9][0].setScene(scenes[SceneType.solid.ordinal()]);        
        locations[9][1].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[9][2].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[9][3].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[9][4].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[9][5].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[9][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[9][7].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[9][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[9][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[9][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[9][11].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[9][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[9][13].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[9][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[9][15].setScene(scenes[SceneType.corridorSE.ordinal()]); 
        locations[9][16].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[9][17].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[9][18].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[9][19].setScene(scenes[SceneType.corridorEW.ordinal()]);
        locations[9][20].setScene(scenes[SceneType.corridorEW.ordinal()]);
        locations[9][21].setScene(scenes[SceneType.curse.ordinal()]); 
        locations[9][22].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[9][23].setScene(scenes[SceneType.corridorSW.ordinal()]); 
        locations[9][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[9][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[9][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[9][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[9][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[9][29].setScene(scenes[SceneType.room02.ordinal()]);
        locations[9][30].setScene(scenes[SceneType.room02.ordinal()]);
        locations[9][31].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[9][32].setScene(scenes[SceneType.room02.ordinal()]);
        locations[9][33].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[9][34].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[9][35].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[9][36].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[9][37].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[9][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[9][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[9][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[9][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[9][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[9][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[9][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[10][0].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[10][1].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[10][2].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[10][3].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[10][4].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[10][5].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[10][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][7].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[10][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[10][10].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[10][11].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[10][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][13].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[10][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][15].setScene(scenes[SceneType.door.ordinal()]); 
        locations[10][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[10][20].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[10][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][23].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[10][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][29].setScene(scenes[SceneType.room02.ordinal()]);
        locations[10][30].setScene(scenes[SceneType.room02.ordinal()]);         
        locations[10][31].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[10][32].setScene(scenes[SceneType.room02.ordinal()]);
        locations[10][33].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[10][34].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[10][35].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[10][36].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[10][37].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[10][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[10][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[10][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[10][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[10][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[11][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[11][1].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[11][2].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[11][3].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[11][4].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[11][5].setScene(scenes[SceneType.room04.ordinal()]); 
        locations[11][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[11][7].setScene(scenes[SceneType.corridorNSE.ordinal()]); 
        locations[11][8].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[11][9].setScene(scenes[SceneType.corridorSE.ordinal()]);
        locations[11][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[11][11].setScene(scenes[SceneType.corridorS.ordinal()]); 
        locations[11][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[11][13].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[11][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[11][15].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[11][16].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[11][17].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[11][18].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[11][19].setScene(scenes[SceneType.room11.ordinal()]);
        locations[11][20].setScene(scenes[SceneType.room11.ordinal()]);
        locations[11][21].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[11][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[11][23].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[11][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[11][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[11][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[11][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[11][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[11][29].setScene(scenes[SceneType.room02.ordinal()]);
        locations[11][30].setScene(scenes[SceneType.room02.ordinal()]);
        locations[11][31].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[11][32].setScene(scenes[SceneType.room02.ordinal()]);
        locations[11][33].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[11][34].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[11][35].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[11][36].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[11][37].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[11][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[11][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[11][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[11][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[11][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[11][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[11][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[12][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[12][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][7].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[12][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][9].setScene(scenes[SceneType.corridorNE.ordinal()]);
        locations[12][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[12][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][13].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[12][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][15].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[12][16].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[12][17].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[12][18].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[12][19].setScene(scenes[SceneType.room11.ordinal()]);
        locations[12][20].setScene(scenes[SceneType.room11.ordinal()]);
        locations[12][21].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[12][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][23].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[12][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][29].setScene(scenes[SceneType.room02.ordinal()]);
        locations[12][30].setScene(scenes[SceneType.room02.ordinal()]);
        locations[12][31].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[12][32].setScene(scenes[SceneType.room02.ordinal()]);
        locations[12][33].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[12][34].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[12][35].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[12][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][37].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[12][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[12][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[12][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[12][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[13][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[13][1].setScene(scenes[SceneType.corridorE.ordinal()]); 
        locations[13][2].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[13][3].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[13][4].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[13][5].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[13][6].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[13][7].setScene(scenes[SceneType.corridorNW.ordinal()]); 
        locations[13][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[13][9].setScene(scenes[SceneType.corridorNE.ordinal()]);
        locations[13][10].setScene(scenes[SceneType.corridorEW.ordinal()]);
        locations[13][11].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[13][12].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[13][13].setScene(scenes[SceneType.corridorNSW.ordinal()]); 
        locations[13][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[13][15].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[13][16].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[13][17].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[13][18].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[13][19].setScene(scenes[SceneType.room11.ordinal()]);
        locations[13][20].setScene(scenes[SceneType.room11.ordinal()]);
        locations[13][21].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[13][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[13][23].setScene(scenes[SceneType.corridorNE.ordinal()]); 
        locations[13][24].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[13][25].setScene(scenes[SceneType.corridorSW.ordinal()]); 
        locations[13][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[13][27].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[13][28].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[13][29].setScene(scenes[SceneType.room02.ordinal()]);
        locations[13][30].setScene(scenes[SceneType.room02.ordinal()]);
        locations[13][31].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[13][32].setScene(scenes[SceneType.room02.ordinal()]);
        locations[13][32].setScene(scenes[SceneType.room02.ordinal()]);
        locations[13][33].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[13][34].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[13][35].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[13][36].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[13][37].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[13][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[13][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[13][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[13][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[13][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[13][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[13][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[14][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[14][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[14][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[14][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][13].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[14][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][15].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[14][16].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[14][17].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[14][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[14][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[14][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][25].setScene(scenes[SceneType.door.ordinal()]); 
        locations[14][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][27].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[14][28].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[14][29].setScene(scenes[SceneType.room02.ordinal()]);
        locations[14][30].setScene(scenes[SceneType.room02.ordinal()]);
        locations[14][31].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[14][32].setScene(scenes[SceneType.room02.ordinal()]);        
        locations[14][33].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[14][34].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[14][35].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[14][36].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[14][37].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[14][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[14][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[14][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[14][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[14][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[15][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[15][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[15][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[15][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[15][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[15][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[15][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[15][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[15][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[15][9].setScene(scenes[SceneType.room05.ordinal()]);
        locations[15][10].setScene(scenes[SceneType.room05.ordinal()]);
        locations[15][11].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[15][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[15][13].setScene(scenes[SceneType.corridorNE.ordinal()]); 
        locations[15][14].setScene(scenes[SceneType.door.ordinal()]); 
        locations[15][15].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[15][16].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[15][17].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[15][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[15][19].setScene(scenes[SceneType.room07.ordinal()]);
        locations[15][20].setScene(scenes[SceneType.room07.ordinal()]);
        locations[15][21].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[15][22].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[15][23].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[15][24].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[15][25].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[15][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[15][27].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[15][28].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[15][29].setScene(scenes[SceneType.room02.ordinal()]);
        locations[15][30].setScene(scenes[SceneType.room02.ordinal()]);
        locations[15][31].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[15][32].setScene(scenes[SceneType.room02.ordinal()]);
        locations[15][33].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[15][34].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[15][35].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[15][36].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[15][37].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[15][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[15][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[15][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[15][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[15][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[15][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[15][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[16][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[16][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][9].setScene(scenes[SceneType.room05.ordinal()]);
        locations[16][10].setScene(scenes[SceneType.room05.ordinal()]);
        locations[16][11].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[16][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][13].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][15].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[16][16].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[16][17].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[16][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][19].setScene(scenes[SceneType.room07.ordinal()]);
        locations[16][20].setScene(scenes[SceneType.room07.ordinal()]);
        locations[16][21].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[16][22].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[16][23].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[16][24].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[16][25].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[16][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][29].setScene(scenes[SceneType.room02.ordinal()]);
        locations[16][30].setScene(scenes[SceneType.room02.ordinal()]);
        locations[16][31].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[16][32].setScene(scenes[SceneType.solid.ordinal()]);
        locations[16][33].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[16][34].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[16][35].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[16][36].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[16][37].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[16][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[16][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[16][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[16][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[16][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[17][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[17][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][9].setScene(scenes[SceneType.room05.ordinal()]);
        locations[17][10].setScene(scenes[SceneType.room05.ordinal()]);
        locations[17][11].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[17][12].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[17][13].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[17][14].setScene(scenes[SceneType.door.ordinal()]); 
        locations[17][15].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[17][16].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[17][17].setScene(scenes[SceneType.room11.ordinal()]); 
        locations[17][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][19].setScene(scenes[SceneType.room07.ordinal()]);
        locations[17][20].setScene(scenes[SceneType.room07.ordinal()]);
        locations[17][21].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[17][22].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[17][23].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[17][24].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[17][25].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[17][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][29].setScene(scenes[SceneType.room02.ordinal()]);
        locations[17][30].setScene(scenes[SceneType.room02.ordinal()]);
        locations[17][31].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[17][32].setScene(scenes[SceneType.solid.ordinal()]);
        locations[17][33].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[17][34].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[17][35].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[17][36].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[17][37].setScene(scenes[SceneType.room02.ordinal()]); 
        locations[17][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[17][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[17][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[17][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[17][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[18][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[18][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][9].setScene(scenes[SceneType.room05.ordinal()]);
        locations[18][10].setScene(scenes[SceneType.room05.ordinal()]);
        locations[18][11].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[18][12].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[18][13].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[18][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][19].setScene(scenes[SceneType.room07.ordinal()]);
        locations[18][20].setScene(scenes[SceneType.room07.ordinal()]);
        locations[18][21].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[18][22].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[18][23].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[18][24].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[18][25].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[18][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[18][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[18][31].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][32].setScene(scenes[SceneType.solid.ordinal()]);
        locations[18][33].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][34].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][35].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][37].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[18][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[18][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[18][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[18][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[19][0].setScene(scenes[SceneType.solid.ordinal()]);        
        locations[19][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[19][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[19][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[19][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[19][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[19][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[19][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[19][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[19][9].setScene(scenes[SceneType.room05.ordinal()]);
        locations[19][10].setScene(scenes[SceneType.room05.ordinal()]);
        locations[19][11].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[19][12].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[19][13].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[19][14].setScene(scenes[SceneType.doorLocked.ordinal()]); 
        locations[19][15].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[19][16].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[19][17].setScene(scenes[SceneType.start.ordinal()]);          // player starts here
        locations[19][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[19][19].setScene(scenes[SceneType.room07.ordinal()]);
        locations[19][20].setScene(scenes[SceneType.room07.ordinal()]);
        locations[19][21].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[19][22].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[19][23].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[19][24].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[19][25].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[19][26].setScene(scenes[SceneType.door.ordinal()]); 
        locations[19][27].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[19][28].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[19][29].setScene(scenes[SceneType.room12.ordinal()]);
        locations[19][30].setScene(scenes[SceneType.room12.ordinal()]);
        locations[19][31].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[19][32].setScene(scenes[SceneType.solid.ordinal()]);
        locations[19][33].setScene(scenes[SceneType.corridorE.ordinal()]); 
        locations[19][34].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[19][35].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[19][36].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[19][37].setScene(scenes[SceneType.corridorSW.ordinal()]); 
        locations[19][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[19][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[19][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[19][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[19][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[19][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[19][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[20][0].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[20][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][9].setScene(scenes[SceneType.room05.ordinal()]);
        locations[20][10].setScene(scenes[SceneType.room05.ordinal()]);         
        locations[20][11].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[20][12].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[20][13].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[20][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][15].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[20][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][19].setScene(scenes[SceneType.room07.ordinal()]);
        locations[20][20].setScene(scenes[SceneType.room07.ordinal()]);         
        locations[20][21].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[20][22].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[20][23].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[20][24].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[20][25].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[20][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][27].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[20][28].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[20][29].setScene(scenes[SceneType.room12.ordinal()]);
        locations[20][30].setScene(scenes[SceneType.room12.ordinal()]);         
        locations[20][31].setScene(scenes[SceneType.room12.ordinal()]);        
        locations[20][32].setScene(scenes[SceneType.solid.ordinal()]);
        locations[20][33].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][34].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][35].setScene(scenes[SceneType.door.ordinal()]); 
        locations[20][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[20][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[20][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[20][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[20][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[20][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[21][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[21][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][9].setScene(scenes[SceneType.room05.ordinal()]);
        locations[21][10].setScene(scenes[SceneType.room05.ordinal()]);
        locations[21][11].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[21][12].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[21][13].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[21][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][15].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[21][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][17].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[21][18].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[21][19].setScene(scenes[SceneType.room07.ordinal()]);
        locations[21][20].setScene(scenes[SceneType.room07.ordinal()]);
        locations[21][21].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[21][22].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[21][23].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[21][24].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[21][25].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[21][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][27].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[21][28].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[21][29].setScene(scenes[SceneType.room12.ordinal()]);
        locations[21][30].setScene(scenes[SceneType.room12.ordinal()]);
        locations[21][31].setScene(scenes[SceneType.room12.ordinal()]);         
        locations[21][32].setScene(scenes[SceneType.room12.ordinal()]);
        locations[21][33].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[21][34].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[21][35].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[21][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[21][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[21][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[21][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[21][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[21][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[22][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[22][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][9].setScene(scenes[SceneType.room05.ordinal()]);
        locations[22][10].setScene(scenes[SceneType.room05.ordinal()]);
        locations[22][11].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[22][12].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[22][13].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[22][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][15].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[22][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][17].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[22][18].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[22][19].setScene(scenes[SceneType.room07.ordinal()]);
        locations[22][20].setScene(scenes[SceneType.room07.ordinal()]);
        locations[22][21].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[22][22].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[22][23].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[22][24].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[22][25].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[22][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][27].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[22][28].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[22][29].setScene(scenes[SceneType.room12.ordinal()]);
        locations[22][30].setScene(scenes[SceneType.room12.ordinal()]);
        locations[22][31].setScene(scenes[SceneType.room12.ordinal()]);         
        locations[22][32].setScene(scenes[SceneType.room12.ordinal()]);
        locations[22][33].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[22][34].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[22][35].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[22][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[22][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[22][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[22][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[22][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[22][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[23][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[23][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][9].setScene(scenes[SceneType.room05.ordinal()]);
        locations[23][10].setScene(scenes[SceneType.room05.ordinal()]);
        locations[23][11].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[23][12].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[23][13].setScene(scenes[SceneType.room05.ordinal()]); 
        locations[23][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][15].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[23][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][17].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[23][18].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[23][19].setScene(scenes[SceneType.room07.ordinal()]);
        locations[23][20].setScene(scenes[SceneType.room07.ordinal()]);
        locations[23][21].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[23][22].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[23][23].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[23][24].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[23][25].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[23][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][27].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[23][28].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[23][29].setScene(scenes[SceneType.room12.ordinal()]);
        locations[23][30].setScene(scenes[SceneType.room12.ordinal()]);
        locations[23][31].setScene(scenes[SceneType.room12.ordinal()]);         
        locations[23][32].setScene(scenes[SceneType.room12.ordinal()]);
        locations[23][33].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[23][34].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[23][35].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[23][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[23][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[23][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[23][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[23][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[23][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[24][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[24][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[24][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[24][11].setScene(scenes[SceneType.arch.ordinal()]); 
        locations[24][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][13].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][15].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[24][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][19].setScene(scenes[SceneType.door.ordinal()]);
        locations[24][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[24][21].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[24][22].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[24][23].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[24][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][27].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[24][28].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[24][29].setScene(scenes[SceneType.room12.ordinal()]);
        locations[24][30].setScene(scenes[SceneType.room12.ordinal()]);
        locations[24][31].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[24][32].setScene(scenes[SceneType.room12.ordinal()]);
        locations[24][33].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[24][34].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[24][35].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[24][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[24][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[24][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[24][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[24][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[24][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[25][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[25][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[25][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[25][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[25][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[25][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[25][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[25][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[25][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[25][9].setScene(scenes[SceneType.room05a.ordinal()]);
        locations[25][10].setScene(scenes[SceneType.room05a.ordinal()]);
        locations[25][11].setScene(scenes[SceneType.room05a.ordinal()]); 
        locations[25][12].setScene(scenes[SceneType.room05a.ordinal()]); 
        locations[25][13].setScene(scenes[SceneType.room05a.ordinal()]); 
        locations[25][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[25][15].setScene(scenes[SceneType.corridorNSE.ordinal()]); 
        locations[25][16].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[25][17].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[25][18].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[25][19].setScene(scenes[SceneType.corridorNW.ordinal()]);
        locations[25][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[25][21].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[25][22].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[25][23].setScene(scenes[SceneType.room07.ordinal()]); 
        locations[25][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[25][25].setScene(scenes[SceneType.corridorNE.ordinal()]); 
        locations[25][26].setScene(scenes[SceneType.arch.ordinal()]); 
        locations[25][27].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[25][28].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[25][29].setScene(scenes[SceneType.room12.ordinal()]);
        locations[25][30].setScene(scenes[SceneType.room12.ordinal()]);
        locations[25][31].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[25][32].setScene(scenes[SceneType.room12.ordinal()]);
        locations[25][33].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[25][34].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[25][35].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[25][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[25][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[25][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[25][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[25][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[25][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[25][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[25][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[25][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[26][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[26][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[26][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[26][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][13].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][15].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[26][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[26][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[26][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][25].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[26][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][27].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[26][28].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[26][29].setScene(scenes[SceneType.room12.ordinal()]);
        locations[26][30].setScene(scenes[SceneType.room12.ordinal()]);
        locations[26][31].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[26][32].setScene(scenes[SceneType.room12.ordinal()]);
        locations[26][33].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[26][34].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][35].setScene(scenes[SceneType.door.ordinal()]); 
        locations[26][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[26][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[26][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[26][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[26][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[26][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[27][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[27][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[27][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[27][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[27][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[27][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[27][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[27][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[27][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[27][9].setScene(scenes[SceneType.room03.ordinal()]);
        locations[27][10].setScene(scenes[SceneType.room03.ordinal()]);
        locations[27][11].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[27][12].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[27][13].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[27][14].setScene(scenes[SceneType.door.ordinal()]); 
        locations[27][15].setScene(scenes[SceneType.corridorNE.ordinal()]); 
        locations[27][16].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[27][17].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[27][18].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[27][19].setScene(scenes[SceneType.corridorEW.ordinal()]);
        locations[27][20].setScene(scenes[SceneType.corridorEW.ordinal()]);
        locations[27][21].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[27][22].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[27][23].setScene(scenes[SceneType.chanting.ordinal()]); 
        locations[27][24].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[27][25].setScene(scenes[SceneType.corridorNW.ordinal()]); 
        locations[27][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[27][27].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[27][28].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[27][29].setScene(scenes[SceneType.room12.ordinal()]);
        locations[27][30].setScene(scenes[SceneType.room12.ordinal()]);
        locations[27][31].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[27][32].setScene(scenes[SceneType.room12.ordinal()]);
        locations[27][33].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[27][34].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[27][35].setScene(scenes[SceneType.room12a.ordinal()]); 
        locations[27][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[27][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[27][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[27][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[27][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[27][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[27][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[27][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[27][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[28][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[28][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][9].setScene(scenes[SceneType.room03.ordinal()]);
        locations[28][10].setScene(scenes[SceneType.room03.ordinal()]);
        locations[28][11].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[28][12].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[28][13].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[28][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[28][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[28][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][25].setScene(scenes[SceneType.doorLocked.ordinal()]); 
        locations[28][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][27].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[28][28].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[28][29].setScene(scenes[SceneType.room12.ordinal()]);
        locations[28][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[28][31].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[28][32].setScene(scenes[SceneType.room12.ordinal()]);
        locations[28][33].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[28][34].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][35].setScene(scenes[SceneType.room12a.ordinal()]); 
        locations[28][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[28][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[28][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[28][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[28][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[28][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[29][0].setScene(scenes[SceneType.solid.ordinal()]);        
        locations[29][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][9].setScene(scenes[SceneType.room03.ordinal()]);
        locations[29][10].setScene(scenes[SceneType.room03.ordinal()]);
        locations[29][11].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[29][12].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[29][13].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[29][14].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[29][15].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[29][16].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[29][17].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[29][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][19].setScene(scenes[SceneType.room14.ordinal()]);
        locations[29][20].setScene(scenes[SceneType.room14.ordinal()]);
        locations[29][21].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[29][22].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[29][23].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[29][24].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[29][25].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[29][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][27].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[29][28].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[29][29].setScene(scenes[SceneType.room12.ordinal()]);
        locations[29][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[29][31].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[29][32].setScene(scenes[SceneType.room12.ordinal()]);
        locations[29][33].setScene(scenes[SceneType.room12.ordinal()]); 
        locations[29][34].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][35].setScene(scenes[SceneType.room12a.ordinal()]); 
        locations[29][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[29][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[29][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[29][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[29][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[29][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[30][0].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[30][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][9].setScene(scenes[SceneType.room03.ordinal()]);
        locations[30][10].setScene(scenes[SceneType.room03.ordinal()]);         
        locations[30][11].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[30][12].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[30][13].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[30][14].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[30][15].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[30][16].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[30][17].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[30][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][19].setScene(scenes[SceneType.room14.ordinal()]);
        locations[30][20].setScene(scenes[SceneType.room14.ordinal()]);         
        locations[30][21].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[30][22].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[30][23].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[30][24].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[30][25].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[30][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[30][30].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[30][31].setScene(scenes[SceneType.solid.ordinal()]);        
        locations[30][32].setScene(scenes[SceneType.solid.ordinal()]);
        locations[30][33].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][34].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][35].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[30][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[30][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[30][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[30][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[30][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[31][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[31][1].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[31][2].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[31][3].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[31][4].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[31][5].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[31][6].setScene(scenes[SceneType.door.ordinal()]); 
        locations[31][7].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[31][8].setScene(scenes[SceneType.door.ordinal()]); 
        locations[31][9].setScene(scenes[SceneType.room03.ordinal()]);
        locations[31][10].setScene(scenes[SceneType.room03.ordinal()]);
        locations[31][11].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[31][12].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[31][13].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[31][14].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[31][15].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[31][16].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[31][17].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[31][18].setScene(scenes[SceneType.door.ordinal()]); 
        locations[31][19].setScene(scenes[SceneType.room14.ordinal()]);
        locations[31][20].setScene(scenes[SceneType.room14.ordinal()]);
        locations[31][21].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[31][22].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[31][23].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[31][24].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[31][25].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[31][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[31][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[31][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[31][29].setScene(scenes[SceneType.room01.ordinal()]);
        locations[31][30].setScene(scenes[SceneType.room01.ordinal()]);
        locations[31][31].setScene(scenes[SceneType.room01.ordinal()]);         
        locations[31][32].setScene(scenes[SceneType.room01.ordinal()]);
        locations[31][33].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[31][34].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[31][35].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[31][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[31][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[31][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[31][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[31][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[31][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[31][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[31][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[31][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[32][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[32][1].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[32][2].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[32][3].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[32][4].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[32][5].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[32][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[32][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[32][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[32][9].setScene(scenes[SceneType.room03.ordinal()]);
        locations[32][10].setScene(scenes[SceneType.room03.ordinal()]);
        locations[32][11].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[32][12].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[32][13].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[32][14].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[32][15].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[32][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[32][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[32][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[32][19].setScene(scenes[SceneType.room14.ordinal()]);
        locations[32][20].setScene(scenes[SceneType.room14.ordinal()]);
        locations[32][21].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[32][22].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[32][23].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[32][24].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[32][25].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[32][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[32][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[32][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[32][29].setScene(scenes[SceneType.room01.ordinal()]);
        locations[32][30].setScene(scenes[SceneType.room01.ordinal()]);
        locations[32][31].setScene(scenes[SceneType.room01.ordinal()]);         
        locations[32][32].setScene(scenes[SceneType.room01.ordinal()]);
        locations[32][33].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[32][34].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[32][35].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[32][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[32][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[32][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[32][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[32][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[32][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[32][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[32][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[32][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[33][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[33][1].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[33][2].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[33][3].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[33][4].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[33][5].setScene(scenes[SceneType.room10.ordinal()]); 
        locations[33][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[33][7].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[33][8].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[33][9].setScene(scenes[SceneType.room03.ordinal()]);
        locations[33][10].setScene(scenes[SceneType.room03.ordinal()]);
        locations[33][11].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[33][12].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[33][13].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[33][14].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[33][15].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[33][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[33][17].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[33][18].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[33][19].setScene(scenes[SceneType.room14.ordinal()]);
        locations[33][20].setScene(scenes[SceneType.room14.ordinal()]);
        locations[33][21].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[33][22].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[33][23].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[33][24].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[33][25].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[33][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[33][27].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[33][28].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[33][29].setScene(scenes[SceneType.room01.ordinal()]);
        locations[33][30].setScene(scenes[SceneType.room01.ordinal()]);
        locations[33][31].setScene(scenes[SceneType.room01.ordinal()]);         
        locations[33][32].setScene(scenes[SceneType.room01.ordinal()]);
        locations[33][33].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[33][34].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[33][35].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[33][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[33][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[33][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[33][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[33][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[33][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[33][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[33][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[33][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[34][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[34][1].setScene(scenes[SceneType.doorLocked.ordinal()]); 
        locations[34][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[34][3].setScene(scenes[SceneType.doorLocked.ordinal()]); 
        locations[34][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[34][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[34][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[34][7].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[34][8].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[34][9].setScene(scenes[SceneType.room03.ordinal()]);
        locations[34][10].setScene(scenes[SceneType.room03.ordinal()]);
        locations[34][11].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[34][12].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[34][13].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[34][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[34][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[34][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[34][17].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[34][18].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[34][19].setScene(scenes[SceneType.room14.ordinal()]);
        locations[34][20].setScene(scenes[SceneType.room14.ordinal()]);
        locations[34][21].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[34][22].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[34][23].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[34][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[34][25].setScene(scenes[SceneType.door.ordinal()]); 
        locations[34][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[34][27].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[34][28].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[34][29].setScene(scenes[SceneType.room01.ordinal()]);
        locations[34][30].setScene(scenes[SceneType.room01.ordinal()]);
        locations[34][31].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[34][32].setScene(scenes[SceneType.room01.ordinal()]);
        locations[34][33].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[34][34].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[34][35].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[34][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[34][37].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[34][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[34][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[34][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[34][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[34][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[34][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[34][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[35][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[35][1].setScene(scenes[SceneType.room10a.ordinal()]); 
        locations[35][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[35][3].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[35][4].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[35][5].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[35][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[35][7].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[35][8].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[35][9].setScene(scenes[SceneType.room03.ordinal()]);
        locations[35][10].setScene(scenes[SceneType.room03.ordinal()]);
        locations[35][11].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[35][12].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[35][13].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[35][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[35][15].setScene(scenes[SceneType.corridorS.ordinal()]); 
        locations[35][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[35][17].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[35][18].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[35][19].setScene(scenes[SceneType.room14.ordinal()]);
        locations[35][20].setScene(scenes[SceneType.room14.ordinal()]);
        locations[35][21].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[35][22].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[35][23].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[35][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[35][25].setScene(scenes[SceneType.room14a.ordinal()]); 
        locations[35][26].setScene(scenes[SceneType.arch.ordinal()]); 
        locations[35][27].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[35][28].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[35][29].setScene(scenes[SceneType.room01.ordinal()]);
        locations[35][30].setScene(scenes[SceneType.room01.ordinal()]);
        locations[35][31].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[35][32].setScene(scenes[SceneType.room01.ordinal()]);
        locations[35][33].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[35][34].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[35][35].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[35][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[35][37].setScene(scenes[SceneType.corridorNE.ordinal()]); 
        locations[35][38].setScene(scenes[SceneType.doorLocked.ordinal()]); 
        locations[35][39].setScene(scenes[SceneType.room09.ordinal()]);
        locations[35][40].setScene(scenes[SceneType.room09.ordinal()]);
        locations[35][41].setScene(scenes[SceneType.room09.ordinal()]); 
        locations[35][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[35][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[35][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[36][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[36][1].setScene(scenes[SceneType.room10a.ordinal()]); 
        locations[36][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[36][3].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[36][4].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[36][5].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[36][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[36][7].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[36][8].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[36][9].setScene(scenes[SceneType.room03.ordinal()]);
        locations[36][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[36][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[36][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[36][13].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[36][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[36][15].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[36][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[36][17].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[36][18].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[36][19].setScene(scenes[SceneType.room14.ordinal()]);
        locations[36][20].setScene(scenes[SceneType.room14.ordinal()]);
        locations[36][21].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[36][22].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[36][23].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[36][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[36][25].setScene(scenes[SceneType.room14a.ordinal()]); 
        locations[36][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[36][27].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[36][28].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[36][29].setScene(scenes[SceneType.room01.ordinal()]);
        locations[36][30].setScene(scenes[SceneType.room01.ordinal()]);
        locations[36][31].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[36][32].setScene(scenes[SceneType.room01.ordinal()]);
        locations[36][33].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[36][34].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[36][35].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[36][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[36][37].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[36][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[36][39].setScene(scenes[SceneType.room09.ordinal()]);
        locations[36][40].setScene(scenes[SceneType.room09.ordinal()]);
        locations[36][41].setScene(scenes[SceneType.room09.ordinal()]); 
        locations[36][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[36][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[36][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[37][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[37][1].setScene(scenes[SceneType.room10a.ordinal()]); 
        locations[37][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[37][3].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[37][4].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[37][5].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[37][6].setScene(scenes[SceneType.arch.ordinal()]); 
        locations[37][7].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[37][8].setScene(scenes[SceneType.room03.ordinal()]); 
        locations[37][9].setScene(scenes[SceneType.room03.ordinal()]);
        locations[37][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[37][11].setScene(scenes[SceneType.corridorE.ordinal()]); 
        locations[37][12].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[37][13].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[37][14].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[37][15].setScene(scenes[SceneType.corridorNEW.ordinal()]); 
        locations[37][16].setScene(scenes[SceneType.door.ordinal()]); 
        locations[37][17].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[37][18].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[37][19].setScene(scenes[SceneType.room14.ordinal()]);
        locations[37][20].setScene(scenes[SceneType.room14.ordinal()]);
        locations[37][21].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[37][22].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[37][23].setScene(scenes[SceneType.room14.ordinal()]); 
        locations[37][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[37][25].setScene(scenes[SceneType.room14a.ordinal()]); 
        locations[37][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[37][27].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[37][28].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[37][29].setScene(scenes[SceneType.room01.ordinal()]);
        locations[37][30].setScene(scenes[SceneType.room01.ordinal()]);
        locations[37][31].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[37][32].setScene(scenes[SceneType.room01.ordinal()]);
        locations[37][33].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[37][34].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[37][35].setScene(scenes[SceneType.room01.ordinal()]); 
        locations[37][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[37][37].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[37][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[37][39].setScene(scenes[SceneType.room09.ordinal()]);
        locations[37][40].setScene(scenes[SceneType.room09.ordinal()]);
        locations[37][41].setScene(scenes[SceneType.room09.ordinal()]); 
        locations[37][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[37][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[37][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[38][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[38][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][3].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[38][4].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[38][5].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[38][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[38][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[38][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][13].setScene(scenes[SceneType.corridorNS.ordinal()]); 
        locations[38][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[38][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[38][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[38][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[38][31].setScene(scenes[SceneType.door.ordinal()]); 
        locations[38][32].setScene(scenes[SceneType.solid.ordinal()]);
        locations[38][33].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][34].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][35].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][37].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][39].setScene(scenes[SceneType.room09.ordinal()]);
        locations[38][40].setScene(scenes[SceneType.room09.ordinal()]);
        locations[38][41].setScene(scenes[SceneType.room09.ordinal()]); 
        locations[38][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[38][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[38][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[39][0].setScene(scenes[SceneType.solid.ordinal()]);        
        locations[39][1].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[39][2].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[39][3].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[39][4].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[39][5].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[39][6].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[39][7].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[39][8].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[39][9].setScene(scenes[SceneType.room06.ordinal()]);
        locations[39][10].setScene(scenes[SceneType.door.ordinal()]);
        locations[39][11].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[39][12].setScene(scenes[SceneType.corridorEW.ordinal()]); 
        locations[39][13].setScene(scenes[SceneType.corridorNW.ordinal()]); 
        locations[39][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[39][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[39][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[39][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[39][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[39][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[39][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[39][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[39][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[39][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[39][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[39][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[39][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[39][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[39][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[39][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[39][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[39][31].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[39][32].setScene(scenes[SceneType.room08.ordinal()]);
        locations[39][33].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[39][34].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[39][35].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[39][36].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[39][37].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[39][38].setScene(scenes[SceneType.door.ordinal()]); 
        locations[39][39].setScene(scenes[SceneType.room09.ordinal()]);
        locations[39][40].setScene(scenes[SceneType.room09.ordinal()]);
        locations[39][41].setScene(scenes[SceneType.room09.ordinal()]); 
        locations[39][42].setScene(scenes[SceneType.room09.ordinal()]);
        locations[39][43].setScene(scenes[SceneType.room09.ordinal()]); 
        locations[39][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[40][0].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[40][1].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[40][2].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[40][3].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[40][4].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[40][5].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[40][6].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[40][7].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[40][8].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[40][9].setScene(scenes[SceneType.room06.ordinal()]);
        locations[40][10].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[40][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][13].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[40][20].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[40][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[40][30].setScene(scenes[SceneType.solid.ordinal()]);         
        locations[40][31].setScene(scenes[SceneType.room08.ordinal()]);        
        locations[40][32].setScene(scenes[SceneType.room08.ordinal()]);
        locations[40][33].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[40][34].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[40][35].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[40][36].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[40][37].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[40][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[40][39].setScene(scenes[SceneType.room09.ordinal()]);
        locations[40][40].setScene(scenes[SceneType.room09.ordinal()]);
        locations[40][41].setScene(scenes[SceneType.room09.ordinal()]); 
        locations[40][42].setScene(scenes[SceneType.room09.ordinal()]);
        locations[40][43].setScene(scenes[SceneType.room09.ordinal()]); 
        locations[40][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[41][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[41][1].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[41][2].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[41][3].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[41][4].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[41][5].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[41][6].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[41][7].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[41][8].setScene(scenes[SceneType.room06.ordinal()]); 
        locations[41][9].setScene(scenes[SceneType.room06.ordinal()]);
        locations[41][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[41][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][13].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[41][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[41][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[41][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[41][31].setScene(scenes[SceneType.room08.ordinal()]);         
        locations[41][32].setScene(scenes[SceneType.room08.ordinal()]);
        locations[41][33].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[41][34].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[41][35].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[41][36].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[41][37].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[41][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[41][39].setScene(scenes[SceneType.room09.ordinal()]);
        locations[41][40].setScene(scenes[SceneType.room09.ordinal()]);
        locations[41][41].setScene(scenes[SceneType.room09.ordinal()]); 
        locations[41][42].setScene(scenes[SceneType.room09.ordinal()]);
        locations[41][43].setScene(scenes[SceneType.room09.ordinal()]); 
        locations[41][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[42][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[42][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[42][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[42][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][13].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[42][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[42][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[42][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[42][31].setScene(scenes[SceneType.room08.ordinal()]);         
        locations[42][32].setScene(scenes[SceneType.room08.ordinal()]);
        locations[42][33].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[42][34].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[42][35].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[42][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][37].setScene(scenes[SceneType.door.ordinal()]); 
        locations[42][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[42][39].setScene(scenes[SceneType.room09.ordinal()]);
        locations[42][40].setScene(scenes[SceneType.room09.ordinal()]);
        locations[42][41].setScene(scenes[SceneType.room09.ordinal()]); 
        locations[42][42].setScene(scenes[SceneType.room09.ordinal()]);
        locations[42][43].setScene(scenes[SceneType.room09.ordinal()]); 
        locations[42][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[43][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[43][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[43][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[43][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][13].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[43][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[43][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[43][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[43][31].setScene(scenes[SceneType.room08.ordinal()]);         
        locations[43][32].setScene(scenes[SceneType.room08.ordinal()]);
        locations[43][33].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[43][34].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[43][35].setScene(scenes[SceneType.room08.ordinal()]); 
        locations[43][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][37].setScene(scenes[SceneType.room08a.ordinal()]); 
        locations[43][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[43][39].setScene(scenes[SceneType.room09.ordinal()]);
        locations[43][40].setScene(scenes[SceneType.room09.ordinal()]);
        locations[43][41].setScene(scenes[SceneType.room09.ordinal()]); 
        locations[43][42].setScene(scenes[SceneType.room09.ordinal()]);
        locations[43][43].setScene(scenes[SceneType.room09.ordinal()]); 
        locations[43][44].setScene(scenes[SceneType.solid.ordinal()]);
        
        locations[44][0].setScene(scenes[SceneType.solid.ordinal()]);
        locations[44][1].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][2].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][3].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][4].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][5].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][6].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][7].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][8].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][9].setScene(scenes[SceneType.solid.ordinal()]);
        locations[44][10].setScene(scenes[SceneType.solid.ordinal()]);
        locations[44][11].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][12].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][13].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][14].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][15].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][16].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][17].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][18].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][19].setScene(scenes[SceneType.solid.ordinal()]);
        locations[44][20].setScene(scenes[SceneType.solid.ordinal()]);
        locations[44][21].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][22].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][23].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][24].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][25].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][26].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][27].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][28].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][29].setScene(scenes[SceneType.solid.ordinal()]);
        locations[44][30].setScene(scenes[SceneType.solid.ordinal()]);
        locations[44][31].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][32].setScene(scenes[SceneType.solid.ordinal()]);
        locations[44][33].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][34].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][35].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][36].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][37].setScene(scenes[SceneType.finish.ordinal()]); 
        locations[44][38].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][39].setScene(scenes[SceneType.solid.ordinal()]);
        locations[44][40].setScene(scenes[SceneType.solid.ordinal()]);
        locations[44][41].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][42].setScene(scenes[SceneType.solid.ordinal()]);
        locations[44][43].setScene(scenes[SceneType.solid.ordinal()]); 
        locations[44][44].setScene(scenes[SceneType.solid.ordinal()]);        
    } 
    
}
