package blatt05_Aufgabe19;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class A19b extends JFrame {
	
	public A19b(String titel) {
		super(titel);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setSize(500, 500);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(A19b.this, "drücke x zum schließen ");
			}
		});
		
		this.addKeyListener(new KeyAdapter( ) {
		    public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_X)
				    System.exit(0);
			    }
		});
		
		pack();
		setVisible(true);
	}

}
