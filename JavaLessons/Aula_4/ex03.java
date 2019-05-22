class Empresa{

	String nome_fantasia;
	int CNPJ;
	Funcionario[] funcionarios;

	void imprime(){

		for (int i = 0; i < this.funcionarios.length; i++){
		Funcionario funcionario = this.funcionarios[i];
		if (funcionario == null) continue;
		System.out.println(funcionario.nome);
		System.out.println(funcionario.salario);
		}
	}
}

class Funcionario{

	String nome;
	int salario;
	long  RG;

	void add_funcionario(String nome, int salario, long RG){

		this.nome = nome;
		this.salario = salario;
		this.RG = RG;

	}

}

class Programa{

	public static void main(String[] args){

	Empresa bg = new Empresa();
	bg.funcionarios = new Funcionario[20];

	bg.funcionarios[0] = new Funcionario();
	bg.funcionarios[0].add_funcionario("Roberto", 1000, 12345678);

	bg.funcionarios[1] = new Funcionario();
	bg.funcionarios[1].add_funcionario("Leticia", 2000, 553213);

	bg.imprime();
	}
}
