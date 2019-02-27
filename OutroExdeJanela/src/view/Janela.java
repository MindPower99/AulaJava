package view;

import java.awt.Container;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.*;

public class Janela extends JFrame {
	JButton btnN1 = new JButton("1");
	JButton btnN2 = new JButton("2");
	JButton btnN3 = new JButton("3");
	JButton btnN4 = new JButton("4");
	JButton btnN5 = new JButton("5");
	JButton btnN6 = new JButton("6");
	JButton btnN7 = new JButton("7");
	JButton btnN8 = new JButton("8");
	JButton btnN9 = new JButton("9");
	JButton btnN0 = new JButton("0");
	JButton btnMc = new JButton("MC");
	JButton btMr = new JButton("MR");
	JButton btnMs = new JButton("MS");
	JButton btnMmais = new JButton("M+");
	JButton btnMmenos = new JButton("M-");
	JButton btnBackinit = new JButton("<-");
	JButton btnCe = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnmaismenos = new JButton("+/-");
	JButton btnRaiz = new JButton("V");
	JButton btnDiv = new JButton("/");
	JButton btnMulti = new JButton("*");
	JButton btn1x = new JButton("1/x");
	JButton btnPorce = new JButton("%");
	JButton btnSub = new JButton("-");
	JButton btnSoma = new JButton("+");
	JButton btnIgual = new JButton("=");
	JButton btnVirgula = new JButton(",");
	JButton btnExibir = new JButton("Exibir");
	JButton btnAjuda = new JButton("Editar");
	JButton btnEditar = new JButton("Ajuda");
	
	public Janela() {
		super ("Calculadora");
		
		Container paine = this.getContentPane();
		
		paine.add(btnExibir);
		btnExibir.setBounds(0, 0, 70, 15);
		paine.add(btnEditar);
		btnEditar.setBounds(71, 0, 70, 15);
		paine.add(btnAjuda);
		btnAjuda.setBounds(142, 0, 70, 15);
		
		paine.add(btnN1);
		btnN1.setBounds(10,50, 35, 25);
		paine.add(btnN1);
		btnN2.setBounds(10,80, 35, 25);
		paine.add(btnN2);
		btnN3.setBounds(10,110, 35, 25);
		paine.add(btnN3);
		btnN4.setBounds(50,50, 35, 25);
		paine.add(btnN4);
		btnN5.setBounds(90,50, 35, 25);
		paine.add(btnN5);
		btnN1.setBounds(130,80, 35, 25);
		paine.add(btnN6);
		btnN6.setBounds(10,50, 35, 25);
		paine.add(btnN1);
		btnN1.setBounds(10,50, 35, 25);
		paine.add(btnN1);
		btnN1.setBounds(10,50, 35, 25);
		paine.add(btnN1);
		btnN1.setBounds(10,50, 35, 25);
		paine.add(btnN1);
		btnN1.setBounds(10,50, 35, 25);
		
		
		paine.setLayout(null);
		this.setSize(220,320);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main (String args[]) {
		Janela janela = new Janela();
	}

}
