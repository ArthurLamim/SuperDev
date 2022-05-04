package Media;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Media media = new Media();
		
		int op = 0;
		while (op != 6) {
		
		System.out.println("1 - Cadastrar Notas");
		System.out.println("2 - Calcular Media");
		System.out.println("3 - Mostrar Notas");
		System.out.println("4 - Mostrar Media");
		System.out.println("5 - Verificar aprovação");
		System.out.println("6 - Sair");
		op = scan.nextInt();
		System.out.println(" ");
		
		if (op == 1) {
			media.cadastrarNotas();
		}else if (op == 2) {
			media.calcularMedia();
		}else if (op == 3) {
			media.mostrarNotas();
		}else if (op == 4) {
			media.mostrarMedia();
		}else if (op == 5) {
			media.verificarAprovacao();
		}else {
			System.out.println("Sair");
		}
		
		}
		
	}

}
