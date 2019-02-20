package metodos;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class metodos {
	
	public static void main(String[] args) {
		metodos obj = new metodos();
		System.out.println(obj.soma(2,10));
		System.out.println(obj.subtracao(10,12));
		System.out.println(obj.divisao(10,10));
		System.out.println(obj.multiplicacao(2,10));
		System.out.println(obj.exponenciacao(5,3));
		System.out.print(obj.radiciacao(64));
		
		
	}
	
	public double soma(double a, double b) {
		double total = a + b;
		return total;
	}
	
	public double subtracao(double a, double b) {
		double total = a - b;
		return total;
	}
	
	public double divisao(double a, double b) {
		double total = a / b;
		return total;
	}
	
	public double multiplicacao(double a, double b) {
		double total = a * b;
		return total;
	}
	
	public double exponenciacao(double a,double b) {;
		return Math.pow(a,b);
	}
	
	public double radiciacao(double a) {
		return Math.sqrt(a);
	}
	
	
}
