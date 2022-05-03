package Carro;

import java.util.Scanner;

public class Carro {
	Scanner scan = new Scanner(System.in);
	
	public String nome;
	public String cor;
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return this.cor;
	}
}
