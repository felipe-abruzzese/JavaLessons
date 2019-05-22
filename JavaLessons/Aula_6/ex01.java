class Empresa {

	private String name;
	private String cnpj;
	private Funcionario[] funcionarios;
	
	public Empresa(String name, String cnpj, funcionarios){

		this.name = name;
		this.cnpj = cnpj;
		this.funcionarios = funcionarios;
}
class Funcionario {

	private String nome;
	private String departamento;
	private double salario;
	private String rg;

	public Funcionario(String nome, String departamento, double salario, String rg) {

		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.rg = rg;
	}

	
	public double getGanhoAnual(){
		return this.salario * 12;
	}
	public void setSalario(double novoSalario){
		this.salario = novoSalario;
	}

	public void aumento(double valor){
		this.salario = this.salario + valor;

	}
	public double getSalario(){
		return this.salario;
	}
	public void mostra(){
		System.out.println(this.nome);
		System.out.println(this.departamento);
		System.out.println(getSalario());
		System.out.println(this.rg);
	}


}
class TesteFuncionario {

	public static void main (String args[]){

		Funcionario f1 = new Funcionario("João", "Contabilidade", 1250, "43.675.785-0");
		f1.mostra();
	}
}
