package game;

import game.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TODO description
 */
public class CharacterPool {
	private final List<Character> characters;
	private int currentCharacterIndex = 0;
	
	public CharacterPool () {
		this.characters = Collections.unmodifiableList(getCharacters());
	}
	
	private List<Character> getCharacters() {
		List<Character> characters = new ArrayList<Character>();
		
		return characters;
	}
	
	public List<Character> getAvailablesCharacters() {
		return characters;
	}
	
	public Character getCurrentCharacter() {
		return characters.get(currentCharacterIndex);
	}
	
	public Character switchToNextCharacter() {
		this.currentCharacterIndex = (currentCharacterIndex + 1) % characters.size();
		return characters.get(currentCharacterIndex);
	}
}