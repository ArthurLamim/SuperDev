package Calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Calculadora calculadora = new Calculadora();

		System.out.println("1- soma");
		System.out.println("2- subtra��o");
		System.out.println("3- multiplica��o");
		System.out.println("4- divis�o");
		int op = scan.nextInt();

		if (op == 1) {
			System.out.println(calculadora.somar());
		} else if (op == 2) {
			System.out.println(calculadora.subtrair());
		} else if (op == 3) {
			System.out.println(calculadora.multiplicar());
		} else if (op == 4) {
			System.out.println(calculadora.dividir());
		}
	}

}
