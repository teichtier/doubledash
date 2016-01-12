package game;

import game.CharacterPool;
import game.WeaponInventory;
import game.language.German;
import game.language.ILanguage;
import gui.MainGui;

public class Main {

	public static DashParameters parameters;

	public static void main(String[] args) {

		CharacterPool charPool = new CharacterPool();
		Difficulty difficulty = getDifficulty();
		ILanguage language = getLanguage();
		WeaponInventory weaponInventory = new WeaponInventory();

		boolean isMultiplayer = false;
		// #if Multiplayer
		// @ isMultiplayer = true;
		// #endif

		boolean isLeftToRight = true;
		// #if RightToLeft
		// @ isLeftToRight = false;
		// #endif
		parameters = new DashParameters(charPool, difficulty, isLeftToRight,
				language, isMultiplayer, weaponInventory);
		System.out.println(parameters);
		new MainGui();
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
}
