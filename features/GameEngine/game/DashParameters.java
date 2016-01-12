package game;

import game.WeaponInventory;
import game.controlls.IControlls;
import game.language.ILanguage;

import java.util.List;

/**
 * @since 16.11.2015
 */
public class DashParameters {

	private final List<Character> characters;
	private final Difficulty difficulty;
	private final boolean isLeftToRight;
	private final ILanguage language;
	// TODO: Replace this with code dependency
	private final boolean multiplayer;
	private final WeaponInventory weaponInventory;
	private final IControlls controlls;

	public DashParameters(List<Character> characters, Difficulty difficulty,
			boolean isLeftToRight, ILanguage language, boolean multiplayer,
			 WeaponInventory weaponInventory, IControlls controlls) {
		this.characters = characters;
		this.difficulty = difficulty;
		this.isLeftToRight = isLeftToRight;
		this.language = language;
		this.multiplayer = multiplayer;
		this.weaponInventory = weaponInventory;
		this.controlls = controlls;
	}

	public List<Character> getCharacters() {
		return characters;
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

	public IControlls getControlls() {
		return controlls;
	}

	@Override
	public String toString() {
		return "game.DashParameters{" + "characterType=" + characters
				+ ", difficulty=" + difficulty + ", isLeftToRight="
				+ isLeftToRight + ", language=" + language + ", isMultiplayer="
				+ multiplayer + ", weapons=" + weaponInventory + ", controlls="
				+ controlls + '}';
	}
}
