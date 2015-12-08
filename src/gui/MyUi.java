package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MyUi {

	public MyUi() {

	}

	public void draw(Graphics g) {
		String rightInfo;
		String leftInfo;
		// #if English
		// #if Arrows
		// @ rightInfo = "Move right: Right Arrow";
		// @ leftInfo = "Move left: Left Arrow";
		// #endif
		// #if WASD
		rightInfo = "Move right: D";
		leftInfo = "Move left: A";
		// #endif

		// #endif

		// #if German
		// #if Arrows
		// @ rightInfo = "Nach rechts: Pfeil rechts";
		// @ leftInfo = "Nach links: Pfeil links";
		// #endif
		// #if WASD
		// @ rightInfo = "Nach rechts: D";
		// @ leftInfo = "Nach links: A";
		// #endif
		// #endif
		
		Color prevCol = g.getColor();
		Font prevFont = g.getFont();
		g.setColor(Color.RED);
		g.setFont(prevFont.deriveFont(32.0F));
		g.drawString(rightInfo, 200, 50);
		g.drawString(leftInfo, 200, 80);
		g.setColor(prevCol);
		g.setFont(prevFont);
	}

}
