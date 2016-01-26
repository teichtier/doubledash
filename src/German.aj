import gui.MyUi;

import java.awt.event.KeyEvent;

public privileged aspect German {

	String around(MyUi gui) : get(private String MyUi.rightInfo) && this(gui) {
		return getMessage("Nach rechts", gui.getKeyRight());
	}

	String around(MyUi gui) : get(private String MyUi.leftInfo) && this(gui) {
		return getMessage("Nach links", gui.getKeyLeft());
	}

	String around(MyUi gui) : get(private String MyUi.changeWeaponInfo) && this(gui) {
		return getMessage("Waffe wechseln", gui.getKeyWeaponChange());
	}

	String around(MyUi gui) : get(private String MyUi.changeCharInfo) && this(gui) {
		return getMessage("Character wechseln", gui.getKeyCharChange());
	}

	private String getMessage(String prefix, int keyId) {
		return prefix + ": " + KeyEvent.getKeyText(keyId);
	}
}
