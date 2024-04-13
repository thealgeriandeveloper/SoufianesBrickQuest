package main;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
	private JFrame frame;
	private GamePanel gamePanel;

	public GameWindow() {
		frame = new JFrame();
		gamePanel = new GamePanel();

		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gamePanel);
		frame.setVisible(true);
	}
}
