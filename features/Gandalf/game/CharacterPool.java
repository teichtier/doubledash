package game;

import game.Character;
import game.Weapon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TODO description
 */
public class CharacterPool {

	private List<Character> getCharacters() {
		List<Character> chars = original();
		chars.add(new Character("Gandalf", 100, "gandalf.png"));
		return chars;
	}
}