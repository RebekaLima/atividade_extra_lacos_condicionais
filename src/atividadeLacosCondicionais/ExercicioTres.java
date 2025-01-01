package atividadeLacosCondicionais;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
			int idade;
			int cidadao;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Você tem cidadania? Responda com 1 para 'sim' ou 2 para 'não': ");
			cidadao = leia.nextInt();
			
			if(idade >= 18 && cidadao == 1){
				System.out.println("Você pode votar!");
			}else {
				System.out.println("Você não pode votar!");
			}
		
	}

}
