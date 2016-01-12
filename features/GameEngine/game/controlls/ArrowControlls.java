package game.controlls;

import java.awt.event.KeyEvent;

public class ArrowControlls implements IControlls{

	public int keyCodeMoveRight() {
		return KeyEvent.VK_RIGHT;
	}

	public int keyCodeMoveLeft() {
		return KeyEvent.VK_RIGHT;
	}
	
	public int keyCodeWeaponChange() {
		return KeyEvent.VK_NUMPAD0;
	}

	public boolean useArrows() {
		return true;
	}
}
