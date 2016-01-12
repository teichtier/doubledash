package gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/**
 * @since 16.11.2015
 */
public class MainGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private MyCanvas canvas;

	public MainGui() {
		super("DoubleDash");
		this.canvas = new MyCanvas();
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(canvas);
		setVisible(true);
		
		this.addKeyListener(new KeyListener() {
			
			public void keyTyped(KeyEvent e) {
			}
			
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void keyPressed(KeyEvent e) {
				canvas.onKeyPress(e);
				
			}
		});
	}
	    
}
