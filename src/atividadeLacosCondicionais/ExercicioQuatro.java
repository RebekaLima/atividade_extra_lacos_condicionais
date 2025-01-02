package atividadeLacosCondicionais;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
				int num1;
				int num2;
				int num3;
				
				Scanner leia = new Scanner(System.in);
				
				System.out.println("Digite um número: ");
				num1 = leia.nextInt();
				
				System.out.println("Digite um segundo número: ");
				num2 = leia.nextInt();
				
				System.out.println("Digite um terceiro número: ");
				num3 = leia.nextInt();
				
				if(num1>num2 && num1>num3) {
					System.out.println("O " + num1 + " é o maior!");
				}else if (num2>num1 && num2>num3) {
					System.out.println("O " + num2 + " é o maior!");
				}else if(num3>num2 && num3>num1) {
					System.out.println("O " + num3 + " é o maior!");
				} else if(num1 == num2 && num2 == num3) {
					System.out.println("Os números tem o mesmo valor!");
				}

	}

}
