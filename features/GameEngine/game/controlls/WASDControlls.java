package game.controlls;

import java.awt.event.KeyEvent;

public class WASDControlls implements IControlls {

	public int keyCodeMoveRight() {
		return KeyEvent.VK_D;
	}

	public int keyCodeMoveLeft() {
		return KeyEvent.VK_A;
	}

	public boolean useArrows() {
		return false;
	}

}
