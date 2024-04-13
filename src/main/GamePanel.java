package main;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private JPanel panel;

	public GamePanel() {
		panel = new JPanel();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}
