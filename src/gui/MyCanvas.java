package gui;

import game.Main;
import game.Utils;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class MyCanvas extends JPanel {

	private static final long serialVersionUID = 1L;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			draw(g);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void draw(Graphics gc) throws Exception {

		int xPlayer = 50;
		int yPlayer = 500;

		int xEnemy = 600;
		int yEnemy = 500;

		int weaponOffset = 20;

		BufferedImage backgroundImage = Utils.loadImage("background.png");
		gc.drawImage(backgroundImage, 0, 0, null);

		BufferedImage weaponImage = Utils.loadImage(Main.parameters
				.getWeaponType().getSpriteName());
		gc.drawImage(weaponImage, xPlayer + weaponOffset, yPlayer, null);

		BufferedImage characterImage = Utils.loadImage(Main.parameters
				.getCharacterType().getSpriteName());
		gc.drawImage(characterImage, xPlayer, yPlayer, null);

		BufferedImage badGuyImage = Utils.loadImage("enemy.png");
		gc.drawImage(badGuyImage, xEnemy, yEnemy, null);
	}

}
