class Funcionario {

	private String nome;
	private String departamento;
	private double salario;
	private String rg;

	public void add_funcionario(String nome, String departamento,double salario, String rg){
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

		Funcionario f1 = new Funcionario();
		f1.add_funcionario("João", "Contabilidade", 1250, "43.675.785-0");

		System.out.println(f1.getSalario());

		f1.aumento(1000);

		System.out.println(f1.getSalario());

		f1.mostra();

	}
}
