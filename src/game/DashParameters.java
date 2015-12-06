package game;

import java.util.List;

/**
 * @since 16.11.2015
 */
public class DashParameters {

    private final List<Character> characters;
    private final Difficulty difficulty;
    private final boolean isLeftToRight;
    private final Language language;
    // TODO: Replace this with code dependency
    private final boolean multiplayer;
    private final List<Weapon> weapons;

    public DashParameters(List<Character> characters, Difficulty difficulty, boolean isLeftToRight, Language language, boolean multiplayer, List<Weapon> weapons) {
        this.characters = characters;
        this.difficulty = difficulty;
        this.isLeftToRight = isLeftToRight;
        this.language = language;
        this.multiplayer = multiplayer;
        this.weapons = weapons;
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

    public Language getLanguage() {
        return language;
    }

    public boolean isMultiplayer() {
		return multiplayer;
	}

    public List<Weapon> getWeaponType() {
        return weapons;
    }

    @Override
    public String toString() {
        return "game.DashParameters{" +
            "characterType=" + characters +
            ", difficulty=" + difficulty +
            ", isLeftToRight=" + isLeftToRight +
            ", language=" + language +
            ", isMultiplayer=" + multiplayer +
            ", weapons=" + weapons +
            '}';
    }
}
