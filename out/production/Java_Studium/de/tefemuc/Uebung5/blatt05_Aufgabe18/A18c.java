package blatt05_Aufgabe18;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class A18c extends JFrame {
	
	private JTextArea text;
	
	public A18c(String titel) {
		super(titel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton left = new JButton("Left Button");
		JButton right = new JButton("Right Button");

		text = new JTextArea(5, 20);
		text.setEnabled(false);
		JScrollPane feld = new JScrollPane(text);
		
		left.addActionListener(new MyActionListener(text));
		right.addActionListener(new MyActionListener(text));
		
		this.add(left, BorderLayout.WEST);
		this.add(right, BorderLayout.EAST);
		this.add(feld, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}

}
