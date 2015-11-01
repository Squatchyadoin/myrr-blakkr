/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.view;

//import byui.cit260.myrrBlakkr.control.GameControl;
import java.util.Scanner;
import myrrblakkr.MyrrBlakkr;

/**
 *
 * @author Family
 */
public class GameMenuView {

    private final String MENU = "\n"
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
            + "\n-------------------------------------------------------------";
    
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU); // display the Game menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of a string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'Q'); // selection is not "Quit current menu"
    }

    private String getInput() {        
        boolean valid = false; // indicates if the menu selection has been retrieved
        String menuSelection = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while (!valid) { // while a valid menu selection has not been retrieved
            
            // prompt for a menu selection
            System.out.println("\nPlease make a selection:");
            
            // get the menu selection from the keyboard and trim off the blanks
            menuSelection = keyboard.nextLine();
            menuSelection = menuSelection.trim();
            
            // if the menu selection is invalid (cannot be blank or > 1 char in length)
            if (menuSelection.length() != 1) {
                System.out.println("[Invalid selection - choose from the listed options]");
                continue; // and repeat the loop again
            }
            break; // breaks out of the loop          
        }
        
        return menuSelection; // return the menu selection    
    }

    private void doAction(char selection) {
        
        switch (selection) {
            case 'S': // search a room or area
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
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
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
        System.out.println("*** displayTrapMenu function called ***");
    }

    private void displayMapMenu() {
        System.out.println("*** displayMapMenu function called ***");
    }

    private void displayCombatMenu() {
        System.out.println("*** displayCombatMenu function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }

}
