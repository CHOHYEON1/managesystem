package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MusicAdder extends JFrame{
	
	public MusicAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelMusicName = new JLabel("MusicName: ", JLabel.TRAILING);
		JTextField fieldMusicName = new JTextField(10);
		labelMusicName.setLabelFor(fieldMusicName);
		panel.add(labelMusicName);
		panel.add(fieldMusicName);
		
		JLabel labelSinger = new JLabel("Singer: ", JLabel.TRAILING);
		JTextField fieldSinger = new JTextField(10);
		labelSinger.setLabelFor(fieldSinger);
		panel.add(labelSinger);
		panel.add(fieldSinger);
		
		JLabel labelReleaseYear = new JLabel("ReleaseYear: ", JLabel.TRAILING);
		JTextField fieldReleaseYear = new JTextField(10);
		labelReleaseYear.setLabelFor(fieldReleaseYear);
		panel.add(labelReleaseYear);
		panel.add(fieldReleaseYear);
		
		JLabel labelGenre = new JLabel("Genre: ", JLabel.TRAILING);
		JTextField fieldGenre = new JTextField(10);
		labelGenre.setLabelFor(fieldGenre);
		panel.add(labelGenre);
		panel.add(fieldGenre);

		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
