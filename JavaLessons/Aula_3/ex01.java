class funcionario{

	String nome;
	String departamento;
	double salario;
	String d_ent_banco;
	String  RG;

	void recebeaumento(double aumento){

		this.salario += aumento;
	}
	double salarioanual(){

		this.salarioanual = salario*12;
	}
}

class Programa{

	public static void main (String[] args) {
	funcionario roberto = new funcionario();
	roberto.nome = "Roberto da Silva Sauro";
	roberto.departamento = "Gráfica";
	roberto.salario = 2000;
	roberto.d_ent_banco = "13/09/2015";
	roberto.RG = "42.323.543-3";

	System.out.println(roberto.salario);
	roberto.recebeaumento(100.0);
	System.out.println(roberto.salario);
	System.out.println(roberto.salarioanual);
}
}
