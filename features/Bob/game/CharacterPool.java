package game;

import game.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TODO description
 */
public class CharacterPool {

	private List<Character> getCharacters() {
		List<Character> chars = original();
		chars.add(new Character("Bob", 25, "bob.png"));
		return chars;
	}
}