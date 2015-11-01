/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.myrrBlakkr.view;

import byui.cit260.myrrBlakkr.control.ProgramControl;
import byui.cit260.myrrBlakkr.model.Player;
import java.util.Scanner;

/**
 *
 * @author Family
 */
public class StartProgramView {
    
    public StartProgramView() {
    }
    
    public void startProgram() {
    
        // Display the banner screen
        this.displayBanner();
        
        // Prompt the player to enter a name
        // Retrieve the name of the player
        String playersName = this.getPlayersName();
        
        // Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        
        // DISPLAY a customized welcome message
        this.displayWelcomeMessage(player);
        
        // DISPLAY the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    
    } 

    // member functions
    private void displayBanner() {
        System.out.println("\n\n*************************************************************");
        
        System.out.println("*                    Beware Myrr Blakkr!                    *"                         
                         + "\n*                                                           *"
                         + "\n* In this game, you will you will be taking on the role of  *"
                         + "\n* a thief. You and your fellow adventurers have been        *"
                         + "\n* searching for a lost artifact of tremendous power, the    *"
                         + "\n* Talisman of Shadows. You have explored many lands and     *"
                         + "\n* followed many leads before finally reaching your current  *"
                         + "\n* destination, Myrr Blakkr, the Black Swamp.                *"
                         + "\n*                                                           *"
                         + "\n* Legends tell of Myrr Blakkr as a once beautiful land,     *"
                         + "\n* ruled by a elven mage of considerable power. The mage     *"
                         + "\n* was a fair ruler and well-respected. And though most      *"
                         + "\n* people thought highly of their lord, everyone in the land *"
                         + "\n* adored his lovely and vivacious wife. She was kind to     *"
                         + "\n* everyone and made everything around her seem more vibrant *"
                         + "\n* and beautiful.                                            *"
                         + "\n*                                                           *"
                         + "\n* Alas, one day the lady of the keep died tragically during *"
                         + "\n* childbirth--along with the couples' first born child.     *"
                         + "\n* Grief stricken and despondent, the lord tried everything  *"
                         + "\n* in his power to bring his dead wife back. In his desper-  *"
                         + "\n* ation, the mage even called upon the dark arts, perform-  *"
                         + "\n* ing spells beyond his power to control. But, it was to no *"                         
                         + "\n* avail. The lord's anguish quickly turned to bitterness    *"
                         + "\n* and anger. He dismissed his entire staff and refused to   *"
                         + "\n* take visitors. He locked and warded his doors and was not *"
                         + "\n* heard from or seen ever again.                            *"
                         + "\n*                                                           *"                         
                         + "\n* As a result of his experiments with dark magic, ere long  *"
                         + "\n* a palpable darkness began to pervade the land, and the    *"
                         + "\n* countryside soon began to change. Where once lush, verd-  *"
                         + "\n* ant woodlands and rich farmlands thrived, now a dark and  *"
                         + "\n* gloomy swamp land pervades. Gone are the farms and vill-  *"
                         + "\n* ages teeming with cheerful and industrious people. The    *"
                         + "\n* land is now all but desolate, filled with eeried noises   *"
                         + "\n* and untold dangers.                                       *"
                         + "\n*                                                           *"
                         + "\n* All signs indicate the artifact you seek lies near the    *"
                         + "\n* heart of the swamp, entombed within the lost ruins of the *"
                         + "\n* mage's tower. You have searched the swamp for days, and   *"
                         + "\n* just now discovered what appears to be a small tunnel     *"
                         + "\n* hidden within the bole of giant, uprooted cypress tree.   *"
                         + "\n* What lies within the dark, narrow opening? No one knows.  *"                         
                         + "\n* You are the only person in your party who is small enough *"
                         + "\n* to fit inside the opening...so, naturally, you now are    *"
                         + "\n* tasked with exploring the tunnel.                         *");            
        
        System.out.println("*                                                           *"
                         + "\n* As the party’s thief, you will play a specific role in     *"
                         + "\n* finding any hidden doors, compartments, traps, or snares  *"
                         + "\n* that await your intrepid group. You are also tasked with  *"
                         + "\n* unlocking doors and chests, and, of course, fending off   *"
                         + "\n* baddies. Oh, and since you are a thief after all, you'll  *"
                         + "\n* also want to plunder as much loot as you can carry as you *"
                         + "\n* endeavor to find the Talisman of Shadows and make it out  *"
                         + "\n* of the tower ruins.                                       *");
        
        System.out.println("*                                                           *"
                         + "\n* The winner will be the thief who successfully makes it    *"
                         + "\n* out of the tower alive with the Talisman of Shadows,      *"
                         + "\n* earns the most experience points, and loots the most      *"                         
                         + "\n* treasure, in the least amount of time.                    *");

        System.out.println("*                                                           *"
                         + "\n* Will you be the hero, or will you fall victim to the evil *"
                         + "\n* that haunts the Black Swamp?                              *"
                         + "\n*                                                           *");
        
        System.out.println("*************************************************************");
        
    }

    private String getPlayersName() {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while (!valid) { // while a valid name has not been retrieved
            
            // prompt for the player's name
            System.out.println("\nEnter your name, thief:");
            
            // get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            // if the name is invalid (< 1 char in length)
            if (playersName.length() < 2) {
                System.out.println("[Invalid name - the name cannot be blank]");
                continue; // and repeat the loop again
            }
            break; // breaks out of the loop            
        }
        
        return playersName; // return the name
    }

    private void displayWelcomeMessage(Player player) {        
        System.out.println("\n\n=============================================================");
        System.out.println("\tWelcome to the game, " + player.getName() + ".");
        System.out.println("\tWe hope you make it out alive!");
        System.out.println("=============================================================");
    }
    
    
}
