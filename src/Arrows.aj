import gui.MyCanvas;
import gui.MyUi;

import java.awt.event.KeyEvent;

public privileged aspect Arrows {

	before(KeyEvent event, MyCanvas canvas) : execution(void MyCanvas.onKeyPress(KeyEvent)) && args(event) && this(canvas) {

		int keyCode = event.getKeyCode();
		switch (keyCode) {
		case KeyEvent.VK_RIGHT:
			canvas.moveForward();
			break;
		case KeyEvent.VK_LEFT:
			canvas.moveBackward();
			break;
		case KeyEvent.VK_NUMPAD0:
			canvas.changeWeapon();
			break;
		case KeyEvent.VK_NUMPAD1:
			canvas.changeCharacter();
			break;
		}
	}

	int around() : execution(private int MyUi.getKeyLeft()) {
		return KeyEvent.VK_LEFT;
	}
	
	int around() : execution(private int MyUi.getKeyRight()) {
		return KeyEvent.VK_RIGHT;
	}
	
	int around() : execution(private int MyUi.getKeyWeaponChange()) {
		return KeyEvent.VK_NUMPAD0;
	}
	
	int around() : execution(private int MyUi.getKeyCharChange()) {
		return KeyEvent.VK_NUMPAD1;
	}
}
