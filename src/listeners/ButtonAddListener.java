package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MusicAdder;
import gui.MusicViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {
		this.frame=frame;
	}

	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton) e.getSource();
		MusicAdder adder=frame.getMusicadder();
		frame.setupPanel(adder);

	}

}
