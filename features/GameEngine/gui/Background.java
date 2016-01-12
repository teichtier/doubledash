package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Background {

	private BufferedImage background;
	private int offset = 0;
	private final int height;
	private final int width;
	
	public Background(BufferedImage originalImage) {
		this.height = originalImage.getHeight();
		this.width = originalImage.getWidth();
		this.background = new BufferedImage(originalImage.getWidth()*3, originalImage.getHeight(), originalImage.getType());
		
		background.getGraphics().drawImage(originalImage, 0, 0, null);
		background.getGraphics().drawImage(originalImage, originalImage.getWidth(), 0, null);
	}
	
	public void draw(Graphics g) {
		g.drawImage(background, 0, 0, width, height, offset, 0, offset + width, height, null);
	}
	
	public void move(int offset) {
	
		this.offset = (this.offset +offset) % width ;
		if (this.offset < 0)
			this.offset = 0;
	}
}
