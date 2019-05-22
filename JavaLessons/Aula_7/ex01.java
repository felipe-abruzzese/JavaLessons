class Funcionario {

	private String nome;
	private String departamento;
	private double salario;
	private String rg;
	private static int identificador = 1;
	private int registroFuncionario;

	public Funcionario(String nome, String departamento, double salario, String rg) {

		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.rg = rg;
		this.registroFuncionario = identificador;
		identificador++;
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
		System.out.println(this.registroFuncionario);
	}


}
class TesteFuncionario {

	public static void main (String args[]){

		Funcionario f1 = new Funcionario("João", "Contabilidade", 1250, "43.675.785-0");
		Funcionario f2 = new Funcionario("Helena", "Contabilidade", 1250, "32.643.732-0");
		f1.mostra();
		f2.mostra();
	}
}
