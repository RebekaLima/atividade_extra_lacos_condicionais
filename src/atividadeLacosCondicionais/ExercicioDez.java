package atividadeLacosCondicionais;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class ExercicioDez {

	public static void main(String[] args) {
		
		int opcao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("                                                ");
		System.out.println("************************************************");
		System.out.println("                                                ");
		System.out.println("       Digite o número de uma das opções:       ");
		System.out.println("       1 - Calculo de idade.                    ");
		System.out.println("       2 - Dias restantes de 2025 ano.          ");
		System.out.println("       3 - Receba uma mensagem de motivação. =) ");
		System.out.println("                                                ");
		System.out.println("************************************************");
		opcao = leia.nextInt();
		
		switch(opcao) {
			case 1:
					int nascimento;
					int ano;
					int idade;
				System.out.println("Qual o ano do seu nascimento?");
				nascimento = leia.nextInt();
			
				System.out.println("Qual o ano vigente?");
				ano = leia.nextInt();
			
				idade = ano - nascimento;
			
				System.out.println("Sua idade é de aproximadamente: " + idade + " anos!");
				break;
			case 2:
				 	LocalDateTime dataHoje = LocalDateTime.now();
				 	LocalDateTime dataFinal = LocalDateTime.of(2025, 12, 30, 23, 59);
				 	long diasDeDiferenca = ChronoUnit.DAYS.between(dataHoje, dataFinal);

			     System.out.println("Faltam " + diasDeDiferenca + " dias para finalizar o ano.");
			     break;
			case 3:
				System.out.println("O homem já foi à Lua e, sendo assim, o céu não é mais o limite. ;)");
		}
			
				

	}

}
