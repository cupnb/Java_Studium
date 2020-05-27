package blatt05_Aufgabe17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class A17c extends JFrame {
	
	public A17c(String titel) {
		super(titel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
        JTextField north = new JTextField(20);
        north.setOpaque(true);
        this.add(north, BorderLayout.NORTH);
        north.setBackground(new Color(255, 255, 255));
        north.setEditable(false);
        
        JPanel south = new JPanel(new GridLayout(0,3));
        this.add(south, BorderLayout.SOUTH);
        south.setOpaque(true);
        
        for(int i = 0; i < 10; ++i) {
        	JButton zahl = new JButton(Integer.valueOf(i).toString());
        	south.add(zahl);
        }
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton gleich = new JButton("=");
        JButton trennzeichen = new JButton(".");
        JButton loeschen = new JButton("C");
        
        south.add(plus);
        south.add(minus);
        south.add(gleich);
        south.add(trennzeichen);
        south.add(loeschen);
		
		pack();
		setVisible(true);
	}
}
