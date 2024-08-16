
public class Main {

	public static void main(String[] args) {
		Banco banco1 = new Banco("Banco do Povo");
		Cliente cliente1 = new Cliente("Rodrigo");

		Conta cc = banco1.criarConta(cliente1, "CC");
		Conta poupanca = banco1.criarConta(cliente1, "CP");

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.sacar(100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
