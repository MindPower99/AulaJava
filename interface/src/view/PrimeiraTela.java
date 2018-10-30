package view;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeiraTela extends JFrame {
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	JLabel lblEndereco = new JLabel("Endereço: ");
	JTextField txtEndereco = new JTextField();
	JLabel lblCEP = new JLabel("CEP: ");
	JTextField txtCEP = new JTextField();
	JLabel lblCidade = new JLabel("Cidade: ");
	JTextField txtCidade = new JTextField();
	JLabel lblEstado = new JLabel("Estado: ");
	JTextField txtEstado = new JTextField();
	JLabel lblBairro = new JLabel("Bairro: ");
	JTextField txtBairro = new JTextField();
	
	public PrimeiraTela()	{
		super("Título da Minha Janela");
		
		Container paine = this.getContentPane();
		
		paine.add(lblNome);
		lblNome.setBounds(20,20,100,20);
		paine.add(txtNome);
		txtNome.setBounds(130,20,200,20);
		
		paine.add(lblEndereco);
		lblEndereco.setBounds(20,50,100,20);
		paine.add(txtEndereco);
		txtEndereco.setBounds(130,50,200,20);
		
		paine.add(lblCidade);
		lblCidade.setBounds(20,80,100,20);
		paine.add(txtCidade);
		txtCidade.setBounds(130,80,200,20);
		
		paine.add(lblCEP);
		lblCEP.setBounds(20,110,100,20);
		paine.add(txtCEP);
		txtCEP.setBounds(130,110,200,20);
		
		paine.add(lblEstado);
		lblEstado.setBounds(20,140,100,20);
		paine.add(txtEstado);
		txtEstado.setBounds(130,140,200,20);
		
		paine.add(lblBairro);
		lblBairro.setBounds(20,170,100,20);
		paine.add(txtBairro);
		txtBairro.setBounds(130,170,200,20);
		
		this.setLayout(null);
		this.setSize(400,400);
		//this.setResizable(0);
		this.setVisible(true);
		
	}
	
	public static void main(String args[]) {
		PrimeiraTela tela = new PrimeiraTela();
	}
}
