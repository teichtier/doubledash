package gui;

import java.awt.event.KeyEvent;

/**
 * TODO description
 */
public class MyUi {

	private int getKeyLeft() {
		return MyCanvas.MOVE_LEFT;
	}

	private int getKeyRight() {
		return MyCanvas.MOVE_RIGHT;
	}

	private int getKeyWeaponChange() {
		return MyCanvas.CHANGE_WEAPON;
	}

	private int getKeyCharChange() {
		return MyCanvas.CHANGE_CHAR;
	}
}