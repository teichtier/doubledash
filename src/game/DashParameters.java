package game;


/**
 * @since 16.11.2015
 */
public class DashParameters {

	private final CharacterPool charPool;
	private final Difficulty difficulty;
	private final boolean isLeftToRight;
	// TODO: Replace this with code dependency
	private final boolean multiplayer;
	private final WeaponInventory weaponInventory;

	public DashParameters(CharacterPool charPool, Difficulty difficulty,
			boolean isLeftToRight,boolean multiplayer,
			WeaponInventory weaponInventory) {
		this.charPool = charPool;
		this.difficulty = difficulty;
		this.isLeftToRight = isLeftToRight;
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
				+ isLeftToRight + ", isMultiplayer="
				+ multiplayer + ", weapons=" + weaponInventory + "}";
	}
}
