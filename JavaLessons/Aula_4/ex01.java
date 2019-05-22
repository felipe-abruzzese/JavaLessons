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

}

class Programa{

	public static void main(String[] args){

	Empresa bg = new Empresa();
	bg.funcionarios = new Funcionario[20];

	bg.funcionarios[0] = new Funcionario();
	bg.funcionarios[0].nome = "Alfredo";
	bg.funcionarios[0].salario = 1000;
	bg.funcionarios[0].RG = 8989898;

	bg.funcionarios[1] = new Funcionario();
	bg.funcionarios[1].nome = "Leticia";
	bg.funcionarios[1].salario = 2000;
	bg.funcionarios[1].RG = 553213;

	bg.imprime();
	}
}
