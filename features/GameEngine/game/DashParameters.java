package game;

import game.CharacterPool;
import game.WeaponInventory;
import game.language.ILanguage;

/**
 * @since 16.11.2015
 */
public class DashParameters {

	private final CharacterPool charPool;
	private final Difficulty difficulty;
	private final boolean isLeftToRight;
	private final ILanguage language;
	// TODO: Replace this with code dependency
	private final boolean multiplayer;
	private final WeaponInventory weaponInventory;

	public DashParameters(CharacterPool charPool, Difficulty difficulty,
			boolean isLeftToRight, ILanguage language, boolean multiplayer,
			WeaponInventory weaponInventory) {
		this.charPool = charPool;
		this.difficulty = difficulty;
		this.isLeftToRight = isLeftToRight;
		this.language = language;
		this.multiplayer = multiplayer;
		this.weaponInventory = weaponInventory;
	}

	public CharacterPool getCharacters() {
		return charPool;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public boolean isLeftToRight() {
		return isLeftToRight;
	}

	public ILanguage getLanguage() {
		return language;
	}

	public boolean isMultiplayer() {
		return multiplayer;
	}

	public WeaponInventory getWeapons() {
		return weaponInventory;
	}
	
	public boolean useArrow() {
		return false;
	}

	@Override
	public String toString() {
		return "game.DashParameters{" + "characterType=" + charPool
				+ ", difficulty=" + difficulty + ", isLeftToRight="
				+ isLeftToRight + ", language=" + language + ", isMultiplayer="
				+ multiplayer + ", weapons=" + weaponInventory + "}";
	}
}
