package game.controlls;

import java.awt.event.KeyEvent;

public class WASDControlls implements IControlls {

	public int keyCodeMoveRight() {
		return KeyEvent.VK_D;
	}

	public int keyCodeMoveLeft() {
		return KeyEvent.VK_A;
	}

	public int keyCodeWeaponChange() {
		return KeyEvent.VK_Q;
	}

	public int keyCodeCharacterChange() {
		return KeyEvent.VK_E;
	}

	public boolean useArrows() {
		return false;
	}

}
