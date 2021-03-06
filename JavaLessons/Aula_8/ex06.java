class Conta {
	protected double saldo;

	public double getSaldo(){
		return this.saldo;
	}

	public void deposita(double valor){

		this.saldo += valor;
	}

	public void saca(double valor){

		if (this.saldo < valor){
			System.out.println("Valor de Saque não permitido");
		}else{
			this.saldo -= valor;
		}
	}

	public void atualiza (double taxa){

		this.saldo += this.saldo*taxa;
	}
}

class ContaCorrente extends Conta{

	public void atualiza(double taxa){

	this.saldo += this.saldo*2*taxa;

	}
}

class ContaPoupanca extends Conta{

	public void atualiza(double taxa){

	this.saldo += this.saldo*3*taxa;

	}
}

class AtualizadorDeContas extends Conta{

	private double saldoTotal = 0;
	private double selic = 0.1;

	public void roda(Conta c){

		System.out.println(this.getSaldo());
		this.atualiza(selic);
		System.out.println(this.getSaldo());
		saldoTotal = saldoTotal + saldo;
	}

}

class TestaConta {

	public static void main (String args[]){

		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		c.atualiza(0.1);
		cc.atualiza(0.1);
		cp.atualiza(0.1);

		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

		roda(c);
	}
}
