import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite um numero: ");

	int numero1 = sc.nextInt();

		System.out.print("digite outro numero: ");
	
	int numero2 = sc.nextInt();
	
		System.out.print("selecione uma opera��o: (*, /, +, -) ");
	
			String operacao = sc.next();
	
	if(operacao.equals("+")) {
		
		System.out.println("o resultado de " + numero1 + " + " + numero2 + " � igual �: "+ (numero1 + numero2));
	}
	
	if(operacao.equals("-")) {
		
		System.out.println("o resultado de " + numero1 + " - " + numero2 + " � igual �: "+ (numero1 - numero2));
	}
	
	if(operacao.equals("/")) {
		
		System.out.println("o resultado de " + numero1 + " / " + numero2 + " � igual �: "+ (numero1 / numero2));
	}
	
	if(operacao.equals("*")) {
	
		System.out.println("o resultado de " + numero1 + " * " + numero2 + " � igual �: "+ (numero1 * numero2));
	}
	
		
	else {
	
		System.out.println("opera��o invalida");
	
		System.out.println("selecione uma opera��o: (*, /, +, -) ");
	
	operacao = sc.next();
			
			}
	sc.close();
		}
	}