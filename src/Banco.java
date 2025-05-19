import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void listarContas() {
		for (Conta conta : contas) {
			System.out.println("Titular: " + conta.getCliente().getNome() +
					" | Agência: " + conta.getAgencia() +
					" | Número: " + conta.getNumero());
		}
	}

	public String getNome() {
		return nome;
	}
}
