import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		List <Funcionario> listadeFuncionario = new ArrayList <Funcionario>();
		
		for (int x = 0; x < 2; x++) {
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o seu nome: ");
		funcionario.setNome(entrada.next());
		
		System.out.println("Digite o seu CPF: ");
		funcionario.setCpf(entrada.nextInt());
		
		System.out.println("Digite o seu turno: ");
		funcionario.setTurno(entrada.next());
		
		System.out.println("Digite o seu salario: ");
		funcionario.setSalario(entrada.nextInt());
		
		lista.add(funcionario);
		
		
	}
		
		for (Funcionario funcionario : listadeFuncionario) {
			System.out.println(funcionario.toString());
		
}
}
}
