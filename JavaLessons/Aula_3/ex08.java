class Data{

 	int dia;
	int mes;
	int ano;

	void preencherdata(int dia, int mes, int ano){

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}
class funcionario{

	String nome;
	String departamento;
	double salario;
	int dia;
	int mes;
	int ano;
	Data datadeentrada;

	void recebeaumento(double aumento){

		this.salario += aumento;
	}
	double salarioanual(){

		return this.salario*12;
	}
	void mostra(){

		System.out.println("Nome: " +this.nome);
		System.out.println("Departamento: " +this.departamento);
		System.out.println("Data de Entrada: "+this.datadeentrada.dia+"/"+this.datadeentrada.mes+"/"+this.datadeentrada.ano);
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
	f1.datadeentrada = new Data();
	f1.datadeentrada.preencherdata(1,9,1986);

	f1.mostra();

	funcionario.salario = 1234;
	funcionario.salarioanual();
	}
}
