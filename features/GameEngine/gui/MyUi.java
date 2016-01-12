package gui;

import game.Main;
import game.language.ILanguage;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class MyUi {

	private final String rightInfo;
	private final String leftInfo;
	private final String changeWeaponInfo;
	private final String changeCharInfo;

	public MyUi() {
		ILanguage lang = Main.parameters.getLanguage();

		String rightInfo = lang.getMoveRight() + ": ";
		String leftInfo = lang.getMoveLeft() + ": ";

		if (Main.parameters.useArrow()) {
			rightInfo += lang.getArrowRightKey();
			leftInfo += lang.getArrowLeftKey();
		} else {
			rightInfo += KeyEvent.getKeyText(getKeyRight());
			leftInfo += KeyEvent.getKeyText(getKeyLeft());
		}

		this.rightInfo = rightInfo;
		this.leftInfo = leftInfo;

		this.changeWeaponInfo = lang.getChangeWeapon() + " : "
				+ KeyEvent.getKeyText(getKeyWeaponChange());

		this.changeCharInfo = lang.getChangeWeapon() + " : "
				+ KeyEvent.getKeyText(getKeyCharChange());
	}

	private int getKeyLeft() {
		return KeyEvent.VK_F4;
	}

	private int getKeyRight() {
		return KeyEvent.VK_F4;
	}

	private int getKeyWeaponChange() {
		return KeyEvent.VK_F4;
	}

	private int getKeyCharChange() {
		return KeyEvent.VK_F4;
	}

	public void draw(Graphics g) {

		Color prevCol = g.getColor();
		Font prevFont = g.getFont();
		g.setColor(Color.RED);
		g.setFont(prevFont.deriveFont(24.0F));
		FontMetrics metrics = g.getFontMetrics();
		int y = 50;
		int yD = metrics.getHeight() + 1;
		g.drawString(rightInfo, 200, y);
		g.drawString(leftInfo, 200, (y += yD));
		g.drawString(changeWeaponInfo, 200, (y += yD));
		g.drawString(changeCharInfo, 200, (y += yD));
		g.setColor(prevCol);
		g.setFont(prevFont);
	}

}
