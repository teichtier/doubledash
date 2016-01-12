package gui;

import game.Main;
import game.controlls.IControlls;
import game.language.ILanguage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class MyUi {

	private final String rightInfo;
	private final String leftInfo;
	private final String changeWeaponInfo;

	public MyUi() {
		ILanguage lang = Main.parameters.getLanguage();
		IControlls controlls = Main.parameters.getControlls();

		String rightInfo = lang.getMoveRight() + ": ";
		String leftInfo = lang.getMoveLeft() + ": ";

		if (Main.parameters.getControlls().useArrows()) {
			rightInfo += lang.getArrowRightKey();
			leftInfo += lang.getArrowLeftKey();
		} else {
			rightInfo += KeyEvent.getKeyText(controlls.keyCodeMoveRight());
			leftInfo += KeyEvent.getKeyText(controlls.keyCodeMoveLeft());
		}

		this.rightInfo = rightInfo;
		this.leftInfo = leftInfo;

		this.changeWeaponInfo = lang.getChangeWeapon() + " : "
				+ KeyEvent.getKeyText(controlls.keyCodeWeaponChange());
	}

	public void draw(Graphics g) {

		Color prevCol = g.getColor();
		Font prevFont = g.getFont();
		g.setColor(Color.RED);
		g.setFont(prevFont.deriveFont(32.0F));
		g.drawString(rightInfo, 200, 50);
		g.drawString(leftInfo, 200, 80);
		g.drawString(changeWeaponInfo, 200, 105);
		g.setColor(prevCol);
		g.setFont(prevFont);
	}

}
