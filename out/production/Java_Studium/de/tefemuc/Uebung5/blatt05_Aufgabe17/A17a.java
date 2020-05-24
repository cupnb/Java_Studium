package blatt05_Aufgabe17;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class A17a extends JFrame {
	
	public A17a(String titel) {
		super(titel);
		
		this.setLocation(300, 300);
		this.setLayout(new GridLayout(0, 2));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
        JLabel one = new JLabel("Name");
        one.setOpaque(true);
        one.setBackground(new Color(200, 200, 200));
        one.setFont(new Font("Helvetica", Font.BOLD, 20));
        this.add(one);

        JTextField two = new JTextField(20);
        two.setOpaque(true);
        two.setBackground(new Color(200, 200, 200));
        two.setFont(new Font("Helvetica", Font.BOLD, 20));
        this.add(two);

        JButton three = new JButton("Ok");
        three.setOpaque(true);
        three.setBackground(new Color(120, 120, 120));
        this.add(three);

        JButton four = new JButton("Cancel");
        four.setOpaque(true);
        four.setBackground(new Color(120, 120, 120));
        this.add(four);
        
        
        pack();
        setVisible(true);	
	}

}
