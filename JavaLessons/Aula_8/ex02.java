class Conta {
	private double saldo;

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

		this.saldo = this.saldo*(1+taxa);
	}

}
class TestaConta {

	public static void main (String args[]){

		Conta c1 = new Conta();
		c1.deposita (1000);

		System.out.println(c1.getSaldo());

		c1.saca (1500);
		c1.saca (500);
		
		c1.atualiza(0.15);

		System.out.println(c1.getSaldo());

	}
}
