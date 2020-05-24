package blatt05_Aufgabe20;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class A20a extends JFrame {
	
	public static ArrayList<String> logList = new ArrayList<String>();
	
	public A20a(String titel) {
		super(titel);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setSize(200, 200);
		
		this.setLayout(new FlowLayout());
		JButton close = new JButton("Close Application");
		this.add(close);
		JButton log = new JButton("Show Log");
		this.add(log);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				logList.add(LocalDateTime.now() + " :" + e.paramString());
			}
			public void windowActivated(WindowEvent e) {
				logList.add(LocalDateTime.now() + " :" + e.paramString());
			}
			public void windowClosed(WindowEvent e) {
				logList.add(LocalDateTime.now() + " :" + e.paramString());
			}
			public void windowDeactivated(WindowEvent e) {
				logList.add(LocalDateTime.now() + " :" + e.paramString());
			}
			public void windowDeiconified(WindowEvent e) {
				logList.add(LocalDateTime.now() + " :" + e.paramString());
			}
			public void windowGainedFocus(WindowEvent e) {
				logList.add(LocalDateTime.now() + " :" + e.paramString());
			}
			public void windowIconified(WindowEvent e) {
				logList.add(LocalDateTime.now() + " :" + e.paramString());
			}
			public void windowLostFocus(WindowEvent e) {
				logList.add(LocalDateTime.now() + " :" + e.paramString());
			}
			public void windowOpened(WindowEvent e) {
				logList.add(LocalDateTime.now() + " :" + e.paramString());
			}
			public void windowStateChanged(WindowEvent e) {
				logList.add(LocalDateTime.now() + " :" + e.paramString());
			}
		});
		
		close.addActionListener(e -> {
			System.exit(0);
		});
		
		log.addActionListener(e -> {
			new A20b(A20a.this, logList);
		});
		
		pack();
		setVisible(true);
	}

}
