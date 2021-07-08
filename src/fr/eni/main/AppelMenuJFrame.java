package fr.eni.main;

import javax.swing.SwingUtilities;

import fr.eni.menu.MenuJFrame;

public class AppelMenuJFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MenuJFrame frame = new MenuJFrame();
				
			}
		});

	}

}
