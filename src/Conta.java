public abstract class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente ou valor inválido.");
		}
	}

	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		} else {
			System.out.println("Valor inválido.");
		}
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if (valor > 0 && saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("Transferência não realizada. Verifique o saldo ou valor.");
		}
	}

	@Override
	public void imprimirExtrato() {
		System.out.printf("=== Extrato da Conta %d ===%n", numero);
		System.out.println("Titular: " + cliente.getNome());
		System.out.printf("Agência: %d%n", agencia);
		System.out.printf("Número: %d%n", numero);
		System.out.printf("Saldo: %.2f%n", saldo);
		System.out.println();
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getCliente() {
		return cliente;
	}
}
