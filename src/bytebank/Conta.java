package bytebank;

public class Conta {

	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;

	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é "+Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma nova conta: "+this.numero);
		
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 

		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			destino.deposita(valor);
			this.saca(valor);
			return true;
		}

		return false;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero >= 0) {
			System.out.println("Conta não pode ter número negativo");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia >= 0) {
			System.out.println("Conta não pode ter número negativo");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}
