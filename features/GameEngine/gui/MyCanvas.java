package gui;

import game.Main;
import game.Utils;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class MyCanvas extends JPanel {

	private static final long serialVersionUID = 1L;
	private Background background;
	private MyUi ui;

	public MyCanvas() {
		try {
			this.background = new Background(Utils.loadImage("background.png"));
		} catch (Exception e1) {
			throw new RuntimeException(e1);
		}
		this.ui = new MyUi();
	}

	public void onKeyPress(KeyEvent event) {
		repaint();
	}

	private void moveForward() {
		this.background.move(5);
	}

	private void moveBackward() {
		this.background.move(-5);
	}

	private void changeWeapon() {
		Main.parameters.getWeapons().selectNextWeapon();
	}
	
	private void changeCharacter() {
		Main.parameters.getCharacters().switchToNextCharacter();
	}

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

		background.draw(gc);

		BufferedImage weaponImage = Utils.loadImage(Main.parameters
				.getWeapons().getSelectedWeapon().getSpriteName());
		gc.drawImage(weaponImage, xPlayer + weaponOffset, yPlayer, null);

		BufferedImage characterImage = Utils.loadImage(Main.parameters
				.getCharacters().getCurrentCharacter().getSpriteName());
		gc.drawImage(characterImage, xPlayer, yPlayer, null);

		BufferedImage badGuyImage = Utils.loadImage("enemy.png");
		gc.drawImage(badGuyImage, xEnemy, yEnemy, null);

		this.ui.draw(gc);
	}

}
