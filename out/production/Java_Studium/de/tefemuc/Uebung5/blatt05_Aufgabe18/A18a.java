package blatt05_Aufgabe18;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class A18a extends JFrame implements ActionListener {
	
	private JTextArea text;
	
	public A18a(String titel) {
		super(titel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton left = new JButton("Left Button");
		JButton right = new JButton("Right Button");
		
		left.addActionListener(this);
		right.addActionListener(this);
		
		text = new JTextArea(5, 20);
		text.setEnabled(false);
		JScrollPane feld = new JScrollPane(text);
		
		this.add(left, BorderLayout.WEST);
		this.add(right, BorderLayout.EAST);
		this.add(feld, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		text.append(e.getActionCommand() + "\n");
		
	}
}
