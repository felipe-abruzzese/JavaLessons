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
	void mostra(){

		System.out.println("Nome: " +this.nome);
		System.out.println("Departamento: " +this.departamento);
		System.out.println("Salário: " +this.salario);
		System.out.println("Ganho Anual: " +this.salarioanual());
	}
}

class Programa{

	public static void main (String[] args) {

	funcionario f1 = new funcionario();
	f1.nome = "Roberto da Silva Sauro";
	f1.departamento = "Gráfica";
	f1.salario = 100;
	f1.recebeaumento(50.0);

	f1.mostra();
	}
}
