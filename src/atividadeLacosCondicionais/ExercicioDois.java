package atividadeLacosCondicionais;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
			int num;
			int calculo;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite um número inteiro: ");
			num = leia.nextInt();
			
			calculo = num % 2;
			
			if(calculo == 0) {
				System.out.println("O número é par.");
			}else {
				System.out.println("O número é impar.");
			}

	}

}
