/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.view;

import byui.cit260.myrrBlakkr.control.GameControl;
import java.util.Scanner;
import myrrblakkr.MyrrBlakkr;

/**
 *
 * @author Family
 */
public class MainMenuView {

    private final String MENU = "\n"
            + "\n-------------------------------------------------------------"
            + "\n|                         Main Menu                         |"
            + "\n-------------------------------------------------------------"
            + "\n| N -  Start new game                                       |"
            + "\n| H -  Help menu                                            |"
            + "\n| S -  Save game                                            |"
            + "\n| L -  Load saved game                                      |"
            + "\n| Q -  Quit game                                            |"
            + "\n-------------------------------------------------------------";
    
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU); // display the Main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of a string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'Q'); // selection is not "Quit game"
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
            case 'N': // create and start a new game
                this.newGame();
                break;
            case 'H': 
                this.displayHelpMenu();
                break;
            case 'S': 
                this.saveGame();
                break;
            case 'L': 
                this.loadGame();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }            

    private void newGame() {
        // create a new game
        GameControl.newGame(MyrrBlakkr.getPlayer());
        
        // display the Game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();                
    }

    private void displayHelpMenu() {
        // display the Help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu(); 
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void loadGame() {
        System.out.println("*** loadGame function called ***");
    }
      
    
}
