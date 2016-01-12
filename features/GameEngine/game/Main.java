package game;

import game.WeaponInventory;
import game.controlls.IControlls;
import game.controlls.WASDControlls;
import game.language.German;
import game.language.ILanguage;
import gui.MainGui;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static DashParameters parameters;

	public static void main(String[] args) {

		List<Character> character = getCharacter();
		Difficulty difficulty = getDifficulty();
		ILanguage language = getLanguage();
		IControlls controlls = getControlls();
		WeaponInventory weaponInventory = new WeaponInventory();

		boolean isMultiplayer = false;
		// #if Multiplayer
		// @ isMultiplayer = true;
		// #endif

		boolean isLeftToRight = true;
		// #if RightToLeft
		// @ isLeftToRight = false;
		// #endif
		parameters = new DashParameters(character, difficulty, isLeftToRight,
				language, isMultiplayer, weaponInventory, controlls);
		System.out.println(parameters);
		new MainGui();
	}

	private static List<Character> getCharacter() {
		List<Character> characters = new ArrayList<Character>();
		// #if Gandalf
		// @ characters.add(new Character("Gandalf", 100, "gandalf.png"));
		// #endif

		// #if Rambo
		characters.add(new Character("Rambo", 50, "rambo.png"));
		// #endif

		// #if Bob
		// @ characters.add(new Character("Bob", 25, "bob.png"));
		// #endif

		// #if Chantal
		// @ characters.add(new Character("Chantal", 75, "chantal.png"));
		// #endif

		return characters;
	}

	private static Difficulty getDifficulty() {

		// #if Easy
		// @ return new Difficulty("Easy", 10, 10000);
		// #endif

		// #if Normal
		return new Difficulty("Normal", 20, 5000);
		// #endif

		// #if Hard
		// @ return new Difficulty("Hard", 30, 2500);
		// #endif
	}

	private static ILanguage getLanguage() {

		// #if German
		return new German();
		// #endif

		// #if English
		// @ return new English();
		// #endif
	}

	private static IControlls getControlls() {

		// #if Arrows
		// @ return new ArrowControlls();
		// #endif

		// #if WASD
		return new WASDControlls();
		// #endif

	}

}
