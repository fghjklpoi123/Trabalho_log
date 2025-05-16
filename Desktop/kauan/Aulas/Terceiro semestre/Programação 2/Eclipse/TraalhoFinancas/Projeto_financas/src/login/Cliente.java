package login;

public class Cliente extends Pessoa {
	private String cpf;
	private Double emprestimo;
	
	public Cliente(String nome, String cpf, Double emprestimo) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEmprestimo(emprestimo);
		}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Double emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	
}
