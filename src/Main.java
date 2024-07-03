
public class Main {

	public static void main(String[] args) {
		Cliente Felipe = new Cliente();
		Felipe.setNome("Felipe");
		
		Conta cc = new ContaCorrente(Felipe);
		Conta poupanca = new ContaPoupanca(Felipe);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
