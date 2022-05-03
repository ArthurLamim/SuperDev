package Exemplos;

import java.util.Scanner;

public class CarroMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		Scanner scan = new Scanner(System.in);
		
        carro1.ano = 2022;      
	    carro1.modelo = "Sedan";
	    carro1.marca = "BMW";
	    carro1.cor = "Vermelho";
	    carro1.motor = 2.0;
	    // carro1.bancos[2]= scan.next();
	    		
	    
	    System.out.println(carro1.ano);
	    System.out.println(carro1.modelo);
	    System.out.println(carro1.marca);
	    System.out.println(carro1.cor);
	    System.out.println(carro1.motor);
	    
	    carro2.ano = 2022;      
	    carro2.modelo = "Sedan";
	    carro2.marca = "Mercedez-benz";
	    carro2.cor = "Preto";
	    carro2.motor = 4.8;
	    
	    System.out.println(carro2.ano);
	    System.out.println(carro2.modelo);
	    System.out.println(carro2.marca);
	    System.out.println(carro2.cor);
	    System.out.println(carro2.motor);
	    

	}

}
