package view;

import javax.swing.*;

import controller.somatoriaController;

public class somatoriaPrincipal {

	public static void main(String[] args) {
		somatoriaController somaCont = new somatoriaController();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero para calcularmos sua s�rie!"));
		
		double resultado = somaCont.somaSerie(n);
		
		System.out.println(resultado);
	}

}