class Empresa{

	Funcionario[] empregados;
	String cnpj;
	int livre = 0;

	void adiciona(Funcionario f){

		this.empregados[this.livre] = f;
		this.livre++;
	}

	void mostraTodasAsInformacoes() {
	for (int i = 0; i < this.livre; i++) {
		System.out.println("Funcionário na posição: " + i);
		this.empregados[i].mostra();
    	
		}
	}

}

class Data{

	int dia;
	int mes;
	int ano;

	void preencherdata(int dia, int mes, int ano){

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String  getformatada(){
	
	return (this.dia+"/"+this.mes+"/"+this.ano);

	}
}

class Funcionario{

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
		System.out.println("Data de Entrada: "+this.datadeentrada.getformatada());
		System.out.println("Salário: " +this.salario);
		System.out.println("Ganho Anual: " +this.salarioanual());

	}
	
}


class TestaEmpresa {

		public static void main (String[] args) {
                Empresa empresa = new Empresa();
                empresa.empregados = new Funcionario[10];

                Funcionario f1 = new Funcionario();
		f1.nome = "Marcos";
		f1.departamento = "Marketing";
                f1.salario = 1000;
                f1.datadeentrada = new Data();
                empresa.adiciona(f1);

                Funcionario f2 = new Funcionario();
		f2.nome = "Leticia";
		f2.departamento = "Pedagogia";
		f2.salario = 1700;
		f2.datadeentrada = new Data();
		empresa.adiciona(f2);


		mostraTodasAsInformacoes();
		}
}
