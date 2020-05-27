package blatt05_Aufgabe20;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class A20b extends JDialog {
	
	public A20b(JFrame owner, Iterable<String> log) {
		super(owner, "Log", true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JTextArea text = new JTextArea(5, 50);
		for (String s: log) {
		    text.append(s + "\n");
		}
		text.setEnabled(false);
		JScrollPane scrollpane = new JScrollPane(text);
		this.add(scrollpane, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
	}

}
