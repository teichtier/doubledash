package gui;

import javax.swing.JFrame;

/**
 * @since 16.11.2015
 */
public class MainGui extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainGui() {
		super("DoubleDash");
		setSize(640, 480);
		
		add(new MyCanvas());
		setVisible(true);
		
		
	}
	    
}
