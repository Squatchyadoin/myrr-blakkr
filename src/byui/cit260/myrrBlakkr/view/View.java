/*
 * View superclass that implements ViewInterface
 */
package byui.cit260.myrrBlakkr.view;

import java.util.Scanner;

/**
 *
 * @author Family
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        String value = "";
        boolean done = false;
        do {
            System.out.println(this.promptMessage);     // display the prompt message            
            value = this.getInput();                    // get the value from the user
            done = this.doAction(value);                // do action based on the value entered            
        } while (!done);
    }

    @Override
    public String getInput() {        
        boolean valid = false;                      // indicates if the value has been retrieved
        String value = null;
        Scanner keyboard = new Scanner(System.in);  // keyboard input stream
        
        while (!valid) {                            // while a valid value has not been retrieved                        
            value = keyboard.nextLine();            // gets the menu selection from the keyboard
            value = value.trim();                   // trims off the blanks            
            
            if (value.length() < 1) {               // if the menu selection is invalid (cannot be blank)
                System.out.println("[Invalid selection - you must enter a value]");
                continue;                           // and repeat the loop again
            }
            break;                                  // breaks out of the loop  
        }
        
        return value;                               // returns the value    
    }
        
    // Getter & Setter
    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }    
    
    
    /**
    * Commented out this code as part of L8 Team Assignment,
    * however, I wanted to keep it for reference, for now.
    
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU); // display the Main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of a string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'Q' && selection != 'q'); // selection is not "Quit game"
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
    */
    
}
