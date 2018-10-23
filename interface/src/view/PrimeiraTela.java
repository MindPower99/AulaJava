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
	JFormattedTextField txtCEP = new JFormattedTextField();
	MaskFormatter formatCep = null;
	
	JLabel lblCidade = new JLabel("Cidade: ");
	JTextField txtCidade = new JTextField();
	
	JLabel lblEstado = new JLabel("Estado: ");
	JComboBox cmbEst = new JComboBox();
	
	JLabel lblBairro = new JLabel("Bairro: ");
	JTextField txtBairro = new JTextField();
	
	JLabel lblTelefone = new JLabel("Telefone: ");
	JFormattedTextField txtTelefone = new JFormattedTextField();
	MaskFormatter formatTel = null;
	
	JLabel lblCelular = new JLabel("Celular: ");
	JFormattedTextField txtCelular = new JFormattedTextField();
	MaskFormatter formatCel = null;

	JLabel lblRG = new JLabel("RG: ");
	JFormattedTextField txtRG = new JFormattedTextField();
	MaskFormatter formatRG = null;
	
	JLabel lblCPF = new JLabel("CPF: ");
	JFormattedTextField txtCPF = new JFormattedTextField();
	MaskFormatter formatCPF = null;
	
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
		lblNome.setBounds(30,20,100,20);
		paine.add(txtNome);
		txtNome.setBounds(140,20,200,20);
		
		paine.add(lblEndereco);
		lblEndereco.setBounds(30,50,100,20);
		paine.add(txtEndereco);
		txtEndereco.setBounds(140,50,200,20);
		
		paine.add(lblCidade);
		lblCidade.setBounds(30,80,100,20);
		paine.add(txtCidade);
		txtCidade.setBounds(140,80,200,20);
		
		paine.add(lblCEP);
		lblCEP.setBounds(30,110,100,20);
		
		
			try {
				formatCep = new MaskFormatter("#####-###");
				txtCEP = new JFormattedTextField(formatCep);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
		paine.add(txtCEP);
		txtCEP.setBounds(140,110,200,20);
		
		paine.add(lblEstado);
		lblEstado.setBounds(30,140,100,20);
		paine.add(cmbEst);
		cmbEst.setBounds(140,140,200,20);
		cmbEst.addItem("Acre");		cmbEst.addItem("Alagoas");
		cmbEst.addItem("Amapá");		cmbEst.addItem("Amapá");
		cmbEst.addItem("Bahia");		cmbEst.addItem("Ceará");
		cmbEst.addItem("Distrito Federal");		cmbEst.addItem("Espírito Santo");
		cmbEst.addItem("Goiás");		cmbEst.addItem("Maranhão");
		cmbEst.addItem("Mato Grosso");		cmbEst.addItem("Mato Grosso do Sul");
		cmbEst.addItem("Minas Gerais");		cmbEst.addItem("Pará");
		cmbEst.addItem("Paraíba");		cmbEst.addItem("Paraná");
		cmbEst.addItem("Pernambuco");		cmbEst.addItem("Piauí");
		cmbEst.addItem("Rio de Janeiro");		cmbEst.addItem("Rio Grande do Norte");
		cmbEst.addItem("Rio Grande do Sul");		cmbEst.addItem("Rondônia");
		cmbEst.addItem("Roraima");		cmbEst.addItem("Santa Catarina");
		cmbEst.addItem("São Paulo");		cmbEst.addItem("Sergipe");
		cmbEst.addItem("Tocantins");
		
		paine.add(lblBairro);
		lblBairro.setBounds(30,170,100,20);
		paine.add(txtBairro);
		txtBairro.setBounds(140,170,200,20);
		
		paine.add(lblTelefone);
		lblTelefone.setBounds(30,200,100,20);
		
		
				try {
					formatTel = new MaskFormatter("(##)####-####");
					txtTelefone = new JFormattedTextField(formatTel);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				paine.add(txtTelefone);
				txtTelefone.setBounds(140,200,200,20);
		
		
		
		paine.add(lblCelular);
		lblCelular.setBounds(30,230,100,20);
		
		       
				try {
					formatCel = new MaskFormatter("(##)#####-####");
					txtCelular = new JFormattedTextField(formatCel);
				} catch (Exception ex) {
					ex.printStackTrace();
				} 
		
				paine.add(txtCelular);
				txtCelular.setBounds(140,230,200,20);
		
		paine.add(lblRG);
		lblRG.setBounds(30,260,100,20);
		
				try {
					formatRG = new MaskFormatter("##-###-###-#");
					txtRG = new JFormattedTextField(formatRG);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
		paine.add(txtRG);
		txtRG.setBounds(140,260,100,20);
		
		paine.add(lblCPF);
		lblCPF.setBounds(30,290,100,20);
		
				try {
					formatCPF = new MaskFormatter("###-###-###-##");
					txtCPF = new JFormattedTextField(formatCPF);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
		paine.add(txtCPF);
		txtCPF.setBounds(140,290,100,20);
		
		paine.add(lblSexo);
		lblSexo.setBounds(30,320,100,20);
		grupo.add(rbdSexo[0]);
		grupo.add(rbdSexo[1]);
		rbdSexo[0].setBounds(140,320,100,20);
		paine.add(rbdSexo[0]);
		rbdSexo[1].setBounds(230,320,100,20);
		paine.add(rbdSexo[1]);
		
		
		paine.add(btnSalvar);
		btnSalvar.setBounds(90,390,100,20);
		
		paine.add(btnImprimir);
		btnImprimir.setBounds(200,390,100,20);
		
		this.setLayout(null);
		this.setSize(420,500);
		//this.setResizable(0);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String args[]) {
		PrimeiraTela tela = new PrimeiraTela();
	}
}
