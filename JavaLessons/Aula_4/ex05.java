class Empresa{

	String nome_fantasia;
	int CNPJ;
	Funcionario[] funcionarios;
	
	}

	void adiciona(Funcionario f){

	this.funcionarios[this.livre] = f
	this.livre++

	}

	boolean contem(Funcionario f) {

	for (int i = 0; i < this.livre; i++) {
		if (this.funcionarios[i] == f){
			return true;
		}
	}
	return false;
}

	void MostraEmpregados(){

		for (int i = 0; i < this.funcionarios.length; i++){

			Funcionario funcionario = this.funcionarios[i];

		if (funcionario == null) continue;

			System.out.println("Funcionario na posição: " +i);
			System.out.println(funcionario.nome);
		}
	}

	void MostraTodasInformacoes(){

		for (int i = 0; i < this.funcionarios.length; i++){

			Funcionario funcionario = this.funcionarios[i];

		if (funcionario == null) continue;

			System.out.println("Funcionario na posição: " +i);
			System.out.println("Nome do Funcionario(a): " +funcionario.nome);
			System.out.println("Salario: R$"+funcionario.salario);
			System.out.println("Docuemnto de identidade: " +funcionario.RG);
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

class TestaEmpresa{

	public static void main(String[] args){

	Empresa bg = new Empresa();
	bg.funcionarios = new Funcionario[20];

	bg.funcionarios[0] = new Funcionario();
	bg.funcionarios[0].add_funcionario("Roberto", 1000, 12345678);

	bg.funcionarios[1] = new Funcionario();
	bg.funcionarios[1].add_funcionario("Leticia", 2000, 553213);

	bg.MostraEmpregados();
	bg.MostraTodasInformacoes();
	System.out.println(bg.contem(Funcionario f));
	}
}
