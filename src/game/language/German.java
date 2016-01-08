package game.language;

public class German implements ILanguage {

	public String getName() {
		return "Deutsch";
	}

	public String getMoveRight() {
		return "Nach rechts";
	}

	public String getMoveLeft() {
		return "Nach links";
	}

	public String getArrowLeftKey() {
		return "Pfeil Links";
	}

	public String getArrowRightKey() {
		return "Pfeil Rechts";
	}

}
