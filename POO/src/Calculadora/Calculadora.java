package Calculadora;

import java.util.Scanner;

public class Calculadora {

	// Calcular -> Soma, Divisão, Subtração e Multiplicação
	// Entrada de dados
	// Saída de dados

	public double valor1;
	public double valor2;
	public double total;
	public int op;

	Scanner scan = new Scanner(System.in);

	public void entrarDados() {
		System.out.println("Digite o valor1: ");
		valor1 = scan.nextDouble();
		System.out.println("Digite o valor2: ");
		valor2 = scan.nextDouble();
	}

	public double somar() {
		return valor1+valor2;
	}
	public double subtrair() {
		return valor1-valor2;
	}
	public double multiplicar() {
		return valor1*valor2;
	}
	public double dividir() {
		return valor1/valor2;
	}
	
	
//	public void calcular() {
//		System.out.println("1- soma");
//		System.out.println("2- subtração");
//		System.out.println("3- multiplicação");
//		System.out.println("4- divisão");
//		op = scan.nextInt();
//
//		if (op == 1) {
//			total = valor1 + valor2;
//		} else if (op == 2) {
//			total = valor1 - valor2;
//		} else if (op == 3) {
//			total = valor1 * valor2;
//		} else if (op == 4) {
//			total = valor1 / valor2;
//		}
//	}

	public void sairDados() {
		System.out.println("Total: " + total);
	}
}
