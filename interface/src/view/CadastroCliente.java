package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CadastroCliente extends JFrame {
	JLabel lblnome = new JLabel("Nome: ");
	JTextField txtnome = new JTextField();
	JButton btnCadastrar = new JButton("Cadastrar");
	
	public CadastroCliente() {
		super("Tela Cadastro de Cliente");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblnome.setBounds(40, 20, 100, 20);
		paine.add(lblnome);
		
		txtnome.setBounds(140, 20, 150, 20);
		paine.add(txtnome);
		
		btnCadastrar.setBounds(80, 60, 140, 30);
		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Nome: " + txtnome.getText());
				
			}
		}
				
		);
		paine.add(btnCadastrar);
		
		
		this.setVisible(true);
		this.setSize(400,400);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
		public static void main (String args[]) {
			CadastroCliente tela = new CadastroCliente();
		}
	

}
