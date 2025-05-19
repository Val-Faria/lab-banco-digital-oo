public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco("Banco Digital Java");

		Cliente joao = new Cliente();
		joao.setNome("João");

		Conta ccJoao = new ContaCorrente(joao);
		Conta cpJoao = new ContaPoupanca(joao);

		banco.adicionarConta(ccJoao);
		banco.adicionarConta(cpJoao);

		ccJoao.depositar(1000);
		ccJoao.transferir(200, cpJoao);

		ccJoao.imprimirExtrato();
		cpJoao.imprimirExtrato();

		System.out.println("\n--- Todas as contas cadastradas ---");
		banco.listarContas();
	}
}
