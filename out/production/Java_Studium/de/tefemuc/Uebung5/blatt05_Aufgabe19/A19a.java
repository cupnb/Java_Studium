package blatt05_Aufgabe19;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class A19a extends JFrame {
	
	public A19a(String titel) {
		super(titel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton taste = new JButton("Change Title");
		this.add(taste);
		taste.addActionListener(e -> {
			String eingabe = JOptionPane.showInputDialog(A19a.this, "mach hier ");
		    if (eingabe != null)
				A19a.this.setTitle(eingabe);
		});
		
		pack();
		setVisible(true);
	}
}
