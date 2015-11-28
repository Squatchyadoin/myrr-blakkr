/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.view;

//import byui.cit260.myrrBlakkr.control.ProgramControl;
import byui.cit260.myrrBlakkr.control.GameControl;
import byui.cit260.myrrBlakkr.model.InventoryItem;
import byui.cit260.myrrBlakkr.model.Location;
import byui.cit260.myrrBlakkr.model.Map;
import byui.cit260.myrrBlakkr.model.Player;


/**
 *
 * @author Family
 */
public class GameMenuView extends View {    
    
    public GameMenuView() {        
        super("\n"
            + "\n-------------------------------------------------------------"
            + "\n|                         Game Menu                         |"
            + "\n-------------------------------------------------------------"
            + "\n| S -  Search room/area                                     |"
            + "\n| C -  View character sheet                                 |"            
            + "\n| I -  View inventory                                       |"
            + "\n| P -  Pick up item                                         |"            
            + "\n| U -  Use item                                             |"
            + "\n| L -  Pick lock                                            |"
            + "\n| T -  Disarm trap                                          |"
            + "\n| M -  Look at map                                          |"
            + "\n| F -  Fight enemies                                        |"
            + "\n|                                                           |"
            + "\n| H -  Help menu                                            |"
            + "\n| Q -  Quit current menu                                    |"
            + "\n-------------------------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {        
        String value = (String) obj;        
        value = value.toUpperCase();            // convert to all upper case
        char selection = value.charAt(0);       // get first character entered
        
        switch (selection) {
            case 'S':                           // search a room or area
                this.searchRoom();
                break;
            case 'C':                           // display character sheet
                this.displayCharacterSheet();   
                break;    
            case 'I':                           // display inventory
                this.displayInventory();
                break;
            case 'P':                           // pick up item
                this.pickUpItem();
                break;
            case 'U':                           // use item
                this.useItem();
                break;
            case 'L':                           // display Lock menu
                this.displayLockMenu();
                break;
            case 'T':                           // display Trap menu
                this.displayTrapMenu();
                break;
            case 'M':                           // display map
                //this.displayMap();
                break;
            case 'F':                           // display Combat menu
                this.displayCombatMenu();
                break;
            case 'H':                           // display Help menu
                this.displayHelpMenu();
                break;
            case 'Q':                           // quit to Main menu
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    

    private void searchRoom() {
        System.out.println("*** searchRoom function called ***");
    }
    
    private void displayCharacterSheet() {
        System.out.println("*** displayCharacterSheet function called ***");
    }

    private void displayInventory() {
        // get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" +
                           "Required" + "\t" + 
                           "In Stock");
        
        // for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            // display the description, the required amount and quantity in stock
            System.out.println(inventoryItem.getDescription() + "\t     " +
                               inventoryItem.getRequiredAmount() + "\t      " +
                               inventoryItem.getQuantityInStock());
        }
    }

    private void pickUpItem() {
        System.out.println("*** pickUpItem function called ***");
    }

    private void useItem() {
        System.out.println("*** useItem function called ***");
    }

    private void displayLockMenu() {
        System.out.println("*** displayLockMenu function called ***");
    }

    private void displayTrapMenu() {
        // display the Trap menu
        TrapMenuView trapMenu = new TrapMenuView();
        trapMenu.displayMenu();
    }
/*
    private void displayMap() {
        
        // get a 2-D array of Location objects from the current game
        Location[][] locations = map.getLocations();
        
        System.out.println("\nGame Map");
        System.out.println("Col1" + "\t" +
                           "Col2" + "\t" + 
                           "Col3" + "\t" + 
                           "Col4" + "\t" + 
                           "Col5" + "\t" + 
                           "Col6" + "\t" + 
                           "Col7" + "\t" + 
                           "Col8" + "\t" + 
                           "Col9");
        
        // for each row in the map
        for (InventoryItem inventoryItem : inventory) {
            // display the description, the required amount and quantity in stock
            System.out.println(inventoryItem.getDescription() + "\t     " +
                               inventoryItem.getRequiredAmount() + "\t      " +
                               inventoryItem.getQuantityInStock());
        }
    }
*/
    private void displayCombatMenu() {
        // display the Combat menu
        CombatMenuView combatMenu = new CombatMenuView();
        combatMenu.display();
        //combatMenu.display(currentPlayer);
    }

    private void displayHelpMenu() {
        // display the Help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }


}
