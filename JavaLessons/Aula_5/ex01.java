class Funcionario {

	public String nome;
	private double salario;


	public void setSalario(double novoSalario){
		this.salario = novoSalario;
	}

	public void aumento(double valor){
		this.salario = this.salario + valor;

	}
	public double getSalario(){
		return this.salario;
	}

}
class TesteFuncionario {

	public static void main (String args[]){

		Funcionario f1 = new Funcionario();
		f1.nome = "Joao";
		f1.setSalario(1250);

		System.out.println(f1.getSalario());

		f1.aumento(1000);

		System.out.println(f1.getSalario());

	}
}
