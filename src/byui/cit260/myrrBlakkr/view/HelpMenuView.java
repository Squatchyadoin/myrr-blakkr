/*
 * View class for the Help Menu
 */

package byui.cit260.myrrBlakkr.view;

/**
 *
 * @author Family
 */
public class HelpMenuView extends View {
  
    public HelpMenuView() {
        super("\n"
        + "\n-------------------------------------------------------------"
        + "\n|                         Help Menu                         |"
        + "\n-------------------------------------------------------------"
        + "\n| G -  Game goals / How to play                             |"
        + "\n| M -  How to move                                          |"
        + "\n| I -  Managing inventory                                   |"
        + "\n| L -  Picking locks                                        |"
        + "\n| T -  Disarming traps                                      |"
        + "\n| F -  Fighting enemies                                     |"
        + "\n| Q -  Quit the current menu                                |"
        + "\n-------------------------------------------------------------");
    }
    
    
    @Override
    public boolean doAction(Object obj) {        
        String value = (String) obj;        
        value = value.toUpperCase();        // convert to all upper case
        char selection = value.charAt(0);   // get first character entered
        
        switch (selection) {
            case 'G':                       // game goals & how to play            
                this.displayHowToPlay();
                break;
            case 'M':                       // how to move
                this.displayPlayerMovementHelp();
                break;
            case 'I':                       // managing inventory
                this.displayInventoryManagementHelp();
                break;
            case 'L':                       // picking locks
                this.displayLockPickingHelp();
                break;
            case 'T':                       // disarming traps
                this.displayTrapDisarmingHelp();
            case 'F':                       // fighting enemies
                this.displayCombatHelp();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    } 
    
    
    private void displayHowToPlay() {
        System.out.println("\n-------------------------------------------------------------"                   
                    + "\n|                        How To Play                        |"
                    + "\n-------------------------------------------------------------"
                    + "\n| Object of the Game:                                       |"
                    + "\n| Your goal is to search the ruins of a dead mage's tower   |"
                    + "\n| and find the lost Talisman of Shadows. In your quest to   |"
                    + "\n| obtain this powerful artifact, you will encounter many    |"
                    + "\n| obstacles including concealed objects, locked doors and   |"
                    + "\n| chests, traps, and even monsters. The winner of the game  |"
                    + "\n| will be the player who finds the artifact and escapes the |"
                    + "\n| tower with the highest score. Points will be awarded for  |"
                    + "\n| overcoming obstacles, collecting treasure, and moving     |"
                    + "\n| quickly through the game.                                 |"
                    + "\n-------------------------------------------------------------");
    }

    private void displayPlayerMovementHelp() {
        System.out.println("\n-------------------------------------------------------------"                   
                    + "\n|                      Player Movement                      |"
                    + "\n-------------------------------------------------------------"
                    + "\n| How to move:                                              |"
                    + "\n| Moving through the game is easy. Simply select the follo- |"
                    + "\n| wing selection from the Game menu:                        |"
                    + "\n|\tM - Look at map                                     |"
                    + "\n| From the Map menu, choose the coordinates of the locat-   |"
                    + "\n| ion you wish to visit. Shazzam! That's all there is to    |"
                    + "\n| it! You will travel to your destination. If your progress |"
                    + "\n| is stopped due to an obstacle, you will need to bring up  |"
                    + "\n| the Map menu again and re-select your destination. Happy  |"
                    + "\n| hunting!                                                  |"
                    + "\n-------------------------------------------------------------");
    }

    private void displayInventoryManagementHelp() {
        System.out.println("\n-------------------------------------------------------------"                   
                    + "\n|                   Inventory Management                    |"
                    + "\n-------------------------------------------------------------"
                    + "\n| They say it's not the sword that makes the swashbuckler,  |"
                    + "\n| but nevertheless, it always pays to have good equipment   |"
                    + "\n| and the right tool for the job!                           |"
                    + "\n|                                                           |"
                    + "\n| Throughout the game, you will need to use items from your |"
                    + "\n| inventory to overcome obstacles. From wielding powerful   |"
                    + "\n| weapons or donning magical armor to locating the making   |"
                    + "\n| sure you have enough torches to light your way, it will   |"
                    + "\n| be important for you know how much you can carry and how  |"
                    + "\n| you can move items in and out of your inventory.          |"
                    + "\n|                                                           |"
                    + "\n| How to manage inventory:                                  |"
                    + "\n| Step 1 - Bring up Inventory menu:                         |"
                    + "\n| Bring up your Inventory menu at any time by selecting     |"
                    + "\n| option 'I' - Managing inventory from the Game menu.       |"
                    + "\n| Step 2 - View items in inventory:                         |"
                    + "\n| In the Inventory menu, you will see a list of items in    |"
                    + "\n| your inventory, broken down by category (weapons, armor,  |"
                    + "\n| & miscellaneous). The items you currently have equipped   |"
                    + "\n| will be marked with an asterisk (*). Items with multiple  |"
                    + "\n| quantities will show the total number on hand enclosed by |"
                    + "\n| parenthesis. Each item will have a corresponding weight,  |"
                    + "\n| and the total weight of the items in inventory will be    |"
                    + "\n| displayed at the bottom of the Inventory menu.            |"
                    + "\n| Step 3 - Inventory options:                               |"
                    + "\n| Within the Inventory menu, you will have the option to    |"
                    + "\n| pick up, drop, equip, or use an item. The number of items |"
                    + "\n| you will have in your inventory will be limited by their  |"
                    + "\n| total weight.                                             |"
                    + "\n-------------------------------------------------------------");
    }

    private void displayLockPickingHelp() {
        System.out.println("\n-------------------------------------------------------------"                   
                    + "\n|                       Picking Locks                       |"
                    + "\n-------------------------------------------------------------"
                    + "\n| Mamma always said you picked your nose too much as a kid. |"
                    + "\n| Little did she know your picking skills would someday pay |"
                    + "\n| off as you expanded your talents to include infiltrating  |"
                    + "\n| armoires, chests, curios, and strongboxes!                |"
                    + "\n|                                                           |"                    
                    + "\n| How to pick locks:                                        |"
                    + "\n| Step 1 - Bring up Pick Lock menu:                         |"
                    + "\n| Bring up your Pick Lock menu by selecting option 'L' -    |"
                    + "\n| Pick Lock from the Game menu.                             |"
                    + "\n| Step 2 - Inspect the lock:                                |"
                    + "\n| This functionality hasn't been fully defined yet. It will |"
                    + "\n| be done shortly and implemented into the game design.     |"
                    + "\n| Step 3 - Choose the appropriate lock pick:                |"
                    + "\n| You will need to check your inventory for the correct     |"
                    + "\n| tool to pick the lock, equip it, and attempt to use it.   |"
                    + "\n| Step 4 - Pick the lock:                                   |"
                    + "\n| Once you have a lock picking tool equipped, you will be   |"
                    + "\n| given the option to pick the lock. If successful, you     |"
                    + "\n| will pick the lock and plunder the booty safeguarded      |"
                    + "\n| within.                                                   |"
                    + "\n-------------------------------------------------------------");
    }

    private void displayTrapDisarmingHelp() {
        System.out.println("\n-------------------------------------------------------------"                   
                    + "\n|                      Disarming Traps                      |"
                    + "\n-------------------------------------------------------------"
                    + "\n| There's a saying that goes, 'You never want to get caught |"
                    + "\n| with your hand in the cookie jar!' This saying is partic- |"
                    + "\n| ularly true when said cookie jar just so happens to cont- |"
                    + "\n| ain an acid trap!                                         |"
                    + "\n|                                                           |"                    
                    + "\n| How to disarm traps:                                      |"
                    + "\n| Step 1 - Bring up Disarm Trap menu:                       |"
                    + "\n| Bring up your Disarm Trap menu by selecting option 'T' -  |"
                    + "\n| Disarm Trap from the Game menu.                           |"
                    + "\n| Step 2 - Inspect the trap:                                |"
                    + "\n| This functionality hasn't been fully defined yet. It will |"
                    + "\n| be done shortly and implemented into the game design.     |"
                    + "\n| Step 3 - Choose the appropriate tool:                     |"
                    + "\n| You will need to check your inventory for the correct     |"
                    + "\n| tool to disarm the trap, equip it, and attempt to use it. |"
                    + "\n| Step 4 - Disarm the trap:                                 |"
                    + "\n| Once you have a tool equipped, you will be given the opt- |"
                    + "\n| ion to disarm the trap. If successful, you will disable   |"
                    + "\n| the trap.                                                 |"
                    + "\n-------------------------------------------------------------");
    }

    private void displayCombatHelp() {
        System.out.println("\n-------------------------------------------------------------"                   
                    + "\n|                          Combat                           |"
                    + "\n-------------------------------------------------------------"
                    + "\n| What fun would it be to scour a dungeon if you never had  |"
                    + "\n| an opportunity to wet your blade on the blood of an orc,  |"
                    + "\n| or mash your warhammer into the skull of a bugbear, or    |"
                    + "\n| decapitate a kobold with a spike mace, or...Sorry, some-  |"
                    + "\n| times I seem to forget myself!                            |"
                    + "\n|                                                           |"                    
                    + "\n| How to fight enemies:                                     |"
                    + "\n| Step 1 - Bring up Combat menu:                            |"
                    + "\n| Bring up your Combat menu by selecting option 'F' - Fight |"
                    + "\n| from the Game menu.                                       |"
                    + "\n| Step 2 - Assess your enemies                              |"
                    + "\n| This functionality hasn't been fully defined yet. It will |"
                    + "\n| be done shortly and implemented into the game design.     |"
                    + "\n| Step 3 - Choose to fight or run away:                     |"
                    + "\n| Hey, sometimes running helps you live to fight another    |"
                    + "\n| day! If you choose to flee, your enemies may see you and  |"   
                    + "\n| try to slay you.                                          |"
                    + "\n| Step 4 - Fight:                                           |"
                    + "\n| Once you have started a combat scene, you will take turns |"
                    + "\n| attacking and being attacked by your enemies. During com- |"
                    + "\n| bat, you will have the opportunity to drink a health pot- |"
                    + "\n| ion and heal your wounds. However, don't hold out until   |"
                    + "\n| you are too low on health points, or you might find your- |"
                    + "\n| self on the wrong side of the daisy bed!                  |"
                    + "\n-------------------------------------------------------------");
    }
    
}
