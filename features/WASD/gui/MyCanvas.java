package gui;

import game.Main;

import java.awt.event.KeyEvent;

/**
 * TODO description
 */
public class MyCanvas {
	
	static final int MOVE_RIGHT = KeyEvent.VK_D;
	static final int MOVE_LEFT =  KeyEvent.VK_A;
	static final int CHANGE_WEAPON =  KeyEvent.VK_Q;
	static final int CHANGE_CHAR =  KeyEvent.VK_E;
	
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