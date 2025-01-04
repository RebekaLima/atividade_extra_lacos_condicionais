package atividadeLacosCondicionais;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
			int opcao;
		
			Scanner leia = new Scanner(System.in);
		
			System.out.println("*************************************************************************");
			System.out.println("Digite um número e será exibido o dia da semana correspondente ao mesmo: ");
			System.out.println("*************************************************************************");
			opcao = leia.nextInt();
		
				if(opcao <= 7) {
			switch (opcao) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			}

			}else {
				System.out.println("Dia da semana inexistente!");
			}
			
	}
}
