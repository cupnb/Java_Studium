package blatt05_Aufgabe18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class MyActionListener implements ActionListener {
	
	JTextArea text;
	
	public MyActionListener(JTextArea text) {
		this.text = text;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		text.append(e.getActionCommand() + "\n");
		
	}



}
