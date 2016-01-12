package gui;

import game.Main;
import game.controlls.IControlls;

import java.awt.event.KeyEvent;

/**
 * TODO description
 */
public class MyCanvas {
	
	static final int MOVE_RIGHT = KeyEvent.VK_RIGHT;
	static final int MOVE_LEFT =  KeyEvent.VK_LEFT;
	static final int CHANGE_WEAPON =  KeyEvent.VK_NUMPAD0;
	static final int CHANGE_CHAR =  KeyEvent.VK_NUMPAD1;
	
	public void onKeyPress(KeyEvent event) {
		int keyCode = event.getKeyCode();
		
		switch(keyCode) {
			case MOVE_RIGHT:
				moveForward();
				break;
			case MOVE_LEFT:
				moveBackward();
				break;
			case CHANGE_WEAPON:
				changeWeapon();
				break;
			case CHANGE_CHAR:
				changeCharacter();
				break;
		}
		original(event);
	}
	
}