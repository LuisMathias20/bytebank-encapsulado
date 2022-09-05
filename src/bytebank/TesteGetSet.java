package bytebank;

public class TesteGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24426);
		
		Cliente paulo = new Cliente();
		paulo.setNome("Luis Mathias");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
	}
}
