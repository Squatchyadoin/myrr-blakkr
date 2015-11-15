/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.view;

//import byui.cit260.myrrBlakkr.control.ProgramControl;
import byui.cit260.myrrBlakkr.model.Player;


/**
 *
 * @author Family
 */
public class GameMenuView extends View {
    
    //private Player currentPlayer;

    public GameMenuView() {        
        super("\n"
            + "\n-------------------------------------------------------------"
            + "\n|                         Game Menu                         |"
            + "\n-------------------------------------------------------------"
            + "\n| S -  Search room/area                                     |"            
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
        value = value.toUpperCase();        // convert to all upper case
        char selection = value.charAt(0);   // get first character entered
        
        switch (selection) {
            case 'S':                       // search a room or area
                this.searchRoom();
                break;
            case 'I':
                this.displayInventoryMenu();
                break;
            case 'P':
                this.pickUpItem();
                break;
            case 'U':
                this.useItem();
                break;
            case 'L':
                this.displayLockMenu();
                break;
            case 'T':
                this.displayTrapMenu();
                break;
            case 'M':
                this.displayMapMenu();
                break;
            case 'F':
                this.displayCombatMenu();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'Q':
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

    private void displayInventoryMenu() {
        System.out.println("*** displayInventoryMenu function called ***");
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

    private void displayMapMenu() {
        System.out.println("*** displayMapMenu function called ***");
    }

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
