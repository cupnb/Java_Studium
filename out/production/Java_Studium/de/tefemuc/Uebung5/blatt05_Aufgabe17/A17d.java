package blatt05_Aufgabe17;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class A17d extends JFrame {
	
	public A17d(String titel) {
		super(titel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(200, 200);
		
		JMenu menu = new JMenu("A Menu");
		
		JMenu submenu = new JMenu("A Submenu");
		menu.add(submenu);
		submenu.add(new JMenuItem("A Menuitem"));
		submenu.addSeparator();
		submenu.add(new JCheckBoxMenuItem("A Checkbox Menuitem"));
		
		JMenuBar menubar = new JMenuBar();
		menubar.add(menu);
		this.setJMenuBar(menubar);

		setVisible(true);
	}

}
