class Empresa {

	private String nomeEmpresa;
	public Funcionario[] funcionarios;




}

class Funcionario {

	private String nome;
	private String departamento;
	private double salario;
	private String rg;

	public void setFuncionario(String nome, String departamento,double salario, String rg){
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
	}


}
class TesteFuncionario {

	public static void main (String args[]){

		Empresa bg = new Empresa();
		bg.funcionarios = new Funcionario[1];
		bg.funcionarios[0].setFuncionario("João", "Contabilidade", 1250, "43.675.785-0");

		

		bg.funcionarios[0].setSalario(2000);

		System.out.println(bg.funcionarios[0].getSalario());

		bg.funcionarios[0].aumento(1000);

		System.out.println(bg.funcionarios[0].getSalario());

		bg.funcionarios[0].mostra();

	}
}
