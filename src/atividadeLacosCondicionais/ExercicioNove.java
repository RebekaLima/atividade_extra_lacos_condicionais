package atividadeLacosCondicionais;

import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) {
		
			String nota;
			int resultadoNota;
			
			Scanner leia = new Scanner(System.in);
	    	
    		System.out.println("Digite a nota e a descrição será exibida: ");
    		nota = leia.next();
    		
    		if(nota.equals ("A")) { //para Strings não se usa "==" e sim "nota.equals ("")"
    			resultadoNota = 1;
    		}else if(nota.equals ("B")) {
    			resultadoNota = 2;
    		}else if(nota.equals ("C")) {
    			resultadoNota = 3;
    		}else if(nota.equals ("D")) {
    			resultadoNota = 4;
    		}else if(nota.equals ("E")) {
    			resultadoNota = 5;
    		}else {
    			resultadoNota = 0;
    		}
    		
    		switch(resultadoNota) {
    		case 1:
    			System.out.println("Excelente.");
    			break;
    		case 2:
    			System.out.println("Bom.");
    			break;
    		case 3:
    			System.out.println("Médio.");
    			break;
    		case 4:
    			System.out.println("Ruim.");
    			break;
    		case 5:
    			System.out.println("Insuficiente!");
    			break;
    		default:
    			System.out.println("Valor digitado inválido!");
    		break;
    		
    		}

	}

}
