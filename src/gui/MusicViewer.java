package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MusicViewer extends JFrame{

	public MusicViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("MusicName");
		model.addColumn("Singer");
		model.addColumn("ReleaseYear");
		model.addColumn("Genre");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}