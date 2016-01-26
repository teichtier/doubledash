import gui.MyCanvas;
import gui.MyUi;

import java.awt.event.KeyEvent;

public privileged aspect WASD {
	before(KeyEvent event, MyCanvas canvas) : execution(void MyCanvas.onKeyPress(KeyEvent)) && args(event) && this(canvas) {

		int keyCode = event.getKeyCode();
		switch (keyCode) {
		case KeyEvent.VK_D:
			canvas.moveForward();
			break;
		case KeyEvent.VK_A:
			canvas.moveBackward();
			break;
		case KeyEvent.VK_Q:
			canvas.changeWeapon();
			break;
		case KeyEvent.VK_E:
			canvas.changeCharacter();
			break;
		}
	}

	int around() : execution(private int MyUi.getKeyLeft()) {
		return KeyEvent.VK_A;
	}

	int around() : execution(private int MyUi.getKeyRight()) {
		return KeyEvent.VK_D;
	}

	int around() : execution(private int MyUi.getKeyWeaponChange()) {
		return KeyEvent.VK_Q;
	}

	int around() : execution(private int MyUi.getKeyCharChange()) {
		return KeyEvent.VK_E;
	}
}
