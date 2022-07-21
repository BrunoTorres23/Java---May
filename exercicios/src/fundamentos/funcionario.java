package fundamentos;

public class funcionario {
	
	String nome;
	int salario;

	@Override
	public String toString() {
		return "funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	

	
	
	
	
	
	
}
