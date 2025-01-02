package atividadeLacosCondicionais;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
			int nota;
		
			Scanner leia = new Scanner(System.in);
		
			System.out.println("Digite a nota (valores de 0 à 100): ");
			nota = leia.nextInt();
			
			if (nota >= 90) {
				System.out.println("A");
			} else if (nota >=80){
				System.out.println("B");
			} else if (nota >= 70) {
				System.out.println("C");
			} else if (nota >= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");	
			}

	}

}
