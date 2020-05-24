package blatt05_Aufgabe17;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class A17b extends JFrame {
	
	public A17b(String titel) {
		super(titel);
		
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel alter = new JLabel("Alter: ");
		this.add(alter);
		
		ArrayList<String> dropdown = new ArrayList<String>();
		dropdown.add("none");
		for(int i = 0; i < 111; ++i) 
			dropdown.add(Integer.valueOf(i).toString());
		
		JComboBox<String> menu = new JComboBox<String>();
		for(String s: dropdown)
			menu.addItem(s);
		
		this.add(menu);
		
        pack();
        setVisible(true);	
	}

}
