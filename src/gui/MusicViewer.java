package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import managesystem.Musicmanager;
import music.Musicinput;

public class MusicViewer extends JPanel{
	
	WindowFrame frame;
	
	Musicmanager musicmanager;

	public MusicViewer(WindowFrame frame,Musicmanager musicmanager) {
		this.frame=frame;
		this.musicmanager=musicmanager;
		
		System.out.println("***"+musicmanager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("MusicName");
		model.addColumn("Singer");
		model.addColumn("ReleaseYear");
		model.addColumn("Genre");
		
		for(int i=0; i<musicmanager.size();i++) {
			Vector row=new Vector();
			Musicinput si=musicmanager.get(i);
			row.add(si.getMusicName());
			row.add(si.getSinger());
			row.add(si.getGenre());
			row.add(si.getReleaseYear());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
