package view;

import java.awt.Container;

import javax.swing.JFrame;

public class Janela extends JFrame {
	public Janela() {
		super ("Nome da Janela");
		Container paine = this.getContentPane();
		paine.setLayout(null);
		this.setSize(200,200);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main (String args[]) {
		Janela janela = new Janela();
	}

}
