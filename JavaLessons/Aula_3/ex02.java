class funcionario{

	String nome;
	String departamento;
	double salario;

	void recebeaumento(double aumento){

		this.salario += aumento;
	}
	double salarioanual(){

		return this.salario*12;
	}
}

class Programa{

	public static void main (String[] args) {

	funcionario f1 = new funcionario();
	f1.nome = "Roberto da Silva Sauro";
	f1.departamento = "Gráfica";
	f1.salario = 100;


	System.out.println("O salário do funcionário " +f1.nome+ " é " +f1.salario);
	f1.recebeaumento(50.0);
	System.out.println("O salário do funcionário " +f1.nome+ " é, depois do aumento " +f1.salario);
	System.out.println("Ganho anual: " +f1.salarioanual());
}
}
