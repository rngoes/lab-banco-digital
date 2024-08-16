import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public Conta criarConta(Cliente cliente, String tipoConta) {
		Conta novaConta = null;
		if (tipoConta.equalsIgnoreCase("CC")) {
			novaConta = new ContaCorrente(cliente);
		} else {
			novaConta = new ContaPoupanca(cliente);
		}
		this.contas.add(novaConta);
		return novaConta;
	}

}
