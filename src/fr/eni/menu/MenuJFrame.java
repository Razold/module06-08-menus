package fr.eni.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuJFrame extends JFrame{


	private JMenuBar menubar;
	private JMenu menu;
	private JMenu sousmenu;
	private JMenuItem open;
	private JMenuItem exit;
	private JMenuItem hello;
	
	public MenuJFrame() {
		
		menubar = new JMenuBar();
		this.setJMenuBar(menubar);
		
		menu = new JMenu("File");
		menubar.add(menu);
		sousmenu = new JMenu("Sous-menu");
		
		open = new JMenuItem("Ouvrir");
		exit = new JMenuItem("Sortie");
		
		hello = new JMenuItem("Hello");
		sousmenu.add(hello);
		
		menu.add(open);
		menu.add(sousmenu);
		menu.addSeparator();
		menu.add(exit);

		this.setSize(450, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
				
			}
		});
		
		
		hello.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Salut :-)");
			}
		});
		
	}

	
}
