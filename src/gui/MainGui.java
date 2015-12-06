package gui;

import javax.swing.JFrame;

/**
 * @since 16.11.2015
 */
public class MainGui extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainGui() {
		super("DoubleDash");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new MyCanvas());
		setVisible(true);
	}
	    
}
