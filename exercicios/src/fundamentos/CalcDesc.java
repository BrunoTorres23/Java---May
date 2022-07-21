package fundamentos;

import java.util.Scanner;

public class CalcDesc {

	public static void main(String[] args) {
		
		Double valor;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o valor da sua compra: ");
		valor = entrada.nextDouble();
		
		if (valor > 200 * 0.9) {
			System.out.println("Parabéns! Você ganhou 10% de desconto");
			System.out.println("O seu valor ficou de: " + valor);
		}
		
		else (valor * 0.)

	}

}
