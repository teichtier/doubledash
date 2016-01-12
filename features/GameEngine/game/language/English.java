package game.language;

public class English implements ILanguage {

	public English() {
	}

	public String getName() {
		return "English";
	}

	@Override
	public String toString() {
		return "Language [name=English]";
	}

	public String getMoveRight() {
		return "Move right";
	}

	public String getMoveLeft() {
		return "Move left";
	}

	public String getArrowLeftKey() {
		return "Arrow left";
	}

	public String getArrowRightKey() {
		return "Arrow right";
	}

	public String getChangeWeapon() {
		return "Change weapon";
	}
}
