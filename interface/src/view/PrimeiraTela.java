package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;


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
	JComboBox cmbEst = new JComboBox();
	
	JLabel lblBairro = new JLabel("Bairro: ");
	JTextField txtBairro = new JTextField();
	JLabel lblTelefone = new JLabel("Telefone: ");
	JTextField txtTelefone = new JTextField();
	JLabel lblCelular = new JLabel("Celular: ");
	JTextField txtCelular = new JTextField();
	JLabel lblRG = new JLabel("RG: ");
	JTextField txtRG = new JTextField();
	JLabel lblCPF = new JLabel("CPF: ");
	JTextField txtCPF = new JTextField();
	JLabel lblSexo = new JLabel("Sexo: ");
	
	JRadioButton[] rbdSexo = new JRadioButton[2];
	ButtonGroup grupo = new ButtonGroup(); {
		rbdSexo[0] = new JRadioButton("Feminino");
		rbdSexo[1] = new JRadioButton("Masculino");
	}
	
	JButton btnSalvar = new JButton("Salvar");
	JButton btnImprimir = new JButton("Imprimir");
	
	public PrimeiraTela()	{
		super("Cadastro PF");
		
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
		paine.add(cmbEst);
		cmbEst.setBounds(130,140,200,20);
		cmbEst.addItem("AC");		cmbEst.addItem("AL");
		cmbEst.addItem("AP");		cmbEst.addItem("AM");
		cmbEst.addItem("BA");		cmbEst.addItem("CE");
		cmbEst.addItem("DF");		cmbEst.addItem("ES");
		cmbEst.addItem("GO");		cmbEst.addItem("MA");
		cmbEst.addItem("MT");		cmbEst.addItem("MS");
		cmbEst.addItem("MG");		cmbEst.addItem("PA");
		cmbEst.addItem("PB");		cmbEst.addItem("PR");
		cmbEst.addItem("PE");		cmbEst.addItem("PI");
		cmbEst.addItem("RJ");		cmbEst.addItem("RN");
		cmbEst.addItem("RS");		cmbEst.addItem("RO");
		cmbEst.addItem("RR");		cmbEst.addItem("SC");
		cmbEst.addItem("SP");		cmbEst.addItem("SE");
		cmbEst.addItem("TO");
		
		paine.add(lblBairro);
		lblBairro.setBounds(20,170,100,20);
		paine.add(txtBairro);
		txtBairro.setBounds(130,170,200,20);
		
		paine.add(lblTelefone);
		lblBairro.setBounds(20,200,100,20);
		paine.add(txtTelefone);
		txtBairro.setBounds(130,200,200,20);
		
		paine.add(lblCelular);
		lblBairro.setBounds(20,230,100,20);
		paine.add(txtCelular);
		txtBairro.setBounds(130,230,200,20);
		
		paine.add(lblRG);
		lblRG.setBounds(20,260,100,20);
		paine.add(txtRG);
		txtRG.setBounds(130,260,100,20);
		
		paine.add(lblCPF);
		lblRG.setBounds(20,290,100,20);
		paine.add(txtCPF);
		txtRG.setBounds(130,290,100,20);
		
		paine.add(btnSalvar);
		btnSalvar.setBounds(130,320,100,20);
		
		paine.add(btnImprimir);
		btnSalvar.setBounds(130,320,100,20);
		
		this.setLayout(null);
		this.setSize(400,400);
		//this.setResizable(0);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String args[]) {
		PrimeiraTela tela = new PrimeiraTela();
	}
}
