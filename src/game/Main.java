package game;

import gui.MainGui;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static DashParameters parameters;

    public static void main(String[] args) {

        List<Character> character = getCharacter();
        List<Weapon> weapons = getWeapon();
        Difficulty difficulty = getDifficulty();
        Language language = getLanguage();
        
        boolean isMultiplayer = false; 
		// #if Multiplayer
//@        isMultiplayer = true;
        // #endif
       
        boolean isLeftToRight = true;
		// #if RightToLeft
//@        isLeftToRight = false;
        // #endif     
    	parameters = new DashParameters(character, difficulty, isLeftToRight, language, isMultiplayer, weapons);
        System.out.println(parameters);
        new MainGui();
    }
    
    private static List<Character> getCharacter() {
    	List<Character> characters = new ArrayList<Character>();
    	// #if Gandalf
//@        characters.add(new Character("Gandalf", 100, "gandalf.png"));
        // #endif
        
        // #if Rambo
    	characters.add(new Character("Rambo", 50, "rambo.png"));
        // #endif
        
        // #if Bob
//@        characters.add(new Character("Bob", 25, "bob.png"));
        // #endif
        
        // #if Chantal
//@        characters.add(new Character("Chantal", 75, "chantal.png"));
        // #endif
        
        return characters;
    }
    
    private static List<Weapon> getWeapon() {
    	List<Weapon> weapons = new ArrayList<Weapon>();
    	// #if Knife
    	weapons.add(new Weapon("Knife", 100, 1, "knife.png"));
    	// #endif
    	
    	// #if Bow
    	weapons.add(new Weapon("Bow", 10, 10, "bow.png"));
    	// #endif
    	
    	// #if Staff
//@    	weapons.add(new Weapon("Staff", 50, 5, "staff.png"));
    	// #endif
    	
    	// #if Chainsaw
//@    	weapons.add(new Weapon("Chainsaw", 75, 2, "chainsaw.png"));
    	// #endif
    	
    	return weapons;
    }
    
    private static Difficulty getDifficulty() {
    	
    	// #if Easy
//@    	return new Difficulty("Easy", 10, 10000);
    	// #endif
    	
    	
    	// #if Normal
    	return new Difficulty("Normal", 20, 5000);
    	// #endif
    	
    	// #if Hard
//@    	return new Difficulty("Hard", 30, 2500);
    	// #endif
    }
    
    private static Language getLanguage() {
    	
    	// #if German
    	return new Language("German");
    	// #endif
    	
    	// #if English
//@    	return new Language("English");
    	// #endif
    }

}
