package atividadeLacosCondicionais;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		
			int opcao;
			int num1;
			int num2;
			int resultado;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("*********************************************************");
			System.out.println("Digite o número referente a operação que será realizada: ");
			System.out.println("*********************************************************");
			System.out.println("             1 - Subtração(-).                           ");
			System.out.println("             2 - Adição(+).                              ");
			System.out.println("             3 - Multiplicação(*).                       ");
			System.out.println("             4 - Divisão(/).                             ");
			System.out.println("*********************************************************");
			opcao = leia.nextInt();
			
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o primeiro número: ");
				num1 = leia.nextInt();
				
				System.out.println("Digite o segundo número: ");
				num2= leia.nextInt();
				
				resultado = num1 - num2;
				
				System.out.println("O resultado da subtração é: " + resultado);
				
				break;
			case 2:
				System.out.println("Digite o primeiro número: ");
				num1 = leia.nextInt();
				
				System.out.println("Digite o segundo número: ");
				num2 = leia.nextInt();
				
				resultado = num1 + num2;
				
				System.out.println("O resultado da adição é: " + resultado);
				
				break;
			case 3:
				System.out.println("Digite o primeiro número: ");
				num1 = leia.nextInt();
				
				System.out.println("Digite o segundo número: ");
				num2 = leia.nextInt();
				
				resultado = num1 * num2;
				
				System.out.println("O resultado da multiplicação é: " + resultado);
			
				break;
			case 4:
				System.out.println("Digite o primeiro número: ");
				num1 = leia.nextInt();
				
				System.out.println("Digite o segundo número: ");
				num2 = leia.nextInt();
				
				resultado = num1 / num2;
				
				System.out.println("O resultado da multiplicação é: " + resultado);
				
				break;
			
			}
	}

}
