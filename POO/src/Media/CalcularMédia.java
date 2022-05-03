package Media;

import java.util.Scanner;

public class CalcularMédia {
	Scanner scan = new Scanner(System.in);
	public double n1;
	public double n2;
	public double n3;
	public double n4;
	public double media;
	public double notas[] = new double[4];

//	public void entrarDados() {
//		
//		for (int i = 0; i < notas.length; i++) {
//			System.out.println("Digite a primeira nota");
//			notas[i] = scan.nextDouble();
//		}
//		System.out.println("Digite n1: ");
//		n1 = scan.nextInt();
//		System.out.println("Digite n2: ");
//		n2 = scan.nextInt();
//		System.out.println("Digite n3: ");
//		n3 = scan.nextInt();
//		System.out.println("Digite n4: ");
//		n4 = scan.nextInt();
//	}
//	
//	public void calcularMedia() {
//		 media = (n1+n2+n3+n4)/4;
//	}
//	
//	public void mostrarMedia() {
//		System.out.println("Media: "+media);
//		
//	}
//	
//	public void aprovaçao() {
//		   if (media==10) {
//       		System.out.println("Aluno aprovado com distinção");
//       }else if (media >=7 && media <10) {
//       	System.out.println("Aluno aprovado");     	
//       }else (media<7) {
//       	System.out.println("Aluno reprovado");
//       }
//	}

	public void cadastrarNotas() {
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a primeira nota");
			notas[i] = scan.nextDouble();
		}
	}
	
	public void calcularMedia() {
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota: "+notas(i++)+": "+notas[i]);
			
		}
	}
	public void mostrarNotas() {
		for (int i = 0; i < notas.length; i++)
			system.out
	}
	public void mostrarMedia() {
		system.out.println("Media Final: "+media);
	}	
}
