package atividadeLacosCondicionais;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
    	
    		int idade;
    		int faixaIdade;
    		
    		Scanner leia = new Scanner(System.in);
    	
    		System.out.println("Digite a sua idade: ");
    		idade = leia.nextInt();
    		
    			if(idade <= 12) {
    				faixaIdade = 1;
    			} else if(idade >=13 && idade < 20){
    				faixaIdade = 2;
    			} else if(idade >= 20 && idade < 59 ) {
    				faixaIdade = 3;
    			} else {
    				faixaIdade = 4;
    			}
    
    		switch(faixaIdade) {
    		 case 1:
    			 System.out.println("Criança");
    			 break;
    		 case 2:
    			 System.out.println("Adolescente");
    			 break;
    		 case 3:
    			 System.out.println("Adulto");
    			 break;
    		 case 4:
    			 System.out.println("Idoso");
    			 break;
    		}
    	
    	
    }
}
