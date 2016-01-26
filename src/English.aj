
import gui.MyUi;

import java.awt.event.KeyEvent;


public privileged aspect English {

	String around(MyUi gui) : get(private String MyUi.rightInfo) && this(gui) {
		return getMessage("To right", gui.getKeyRight());
	}

	String around(MyUi gui) : get(private String MyUi.leftInfo) && this(gui) {
		return getMessage("To left", gui.getKeyRight());
	}

	String around(MyUi gui) : get(private String MyUi.changeWeaponInfo) && this(gui) {
		return getMessage("Change weapon", gui.getKeyRight());
	}

	String around(MyUi gui) : get(private String MyUi.changeCharInfo) && this(gui) {
		return getMessage("Change character", gui.getKeyRight());
	}

	private String getMessage(String prefix, int keyId) {
		return prefix + ": " + KeyEvent.getKeyText(keyId);
	}
		
}
