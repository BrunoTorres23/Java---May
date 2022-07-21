package fundamentos;

import java.util.Scanner;

public class ProgramaRevisao {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		funcionario Funcionario = new funcionario();
		
		System.out.println("Digite o seu nome: ");
		Funcionario.setNome(entrada.next());
		
		System.out.println("Digite o seu salario: ");
		Funcionario.setSalario(entrada.nextInt());
		
		funcionario Funcionario2 = new funcionario();
		
		System.out.println("Digite o seu nome: ");
		Funcionario2.setNome(entrada.next());
		
		System.out.println("Digite o seu salario: ");
		Funcionario2.setSalario(entrada.nextInt());
		
		System.out.println(".....................");
		
		System.out.println(Funcionario);
		
		System.out.println(Funcionario2);
		
		int x;
		
		x = Funcionario.getSalario() - Funcionario2.getSalario();
		
		System.out.println("....................");
		
		System.out.println("a diferenca entre os dois salarios e de: " + x + "reais");
		
		
		
	}

}
