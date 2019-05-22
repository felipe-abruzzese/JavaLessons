class Empresa {

	private String name;
	private String cnpj;
	private Funcionario[] funcionarios;
	
	public Empresa(String name, String cnpj, Funcionario[] funcionarios){

		this.name = name;
		this.cnpj = cnpj;
		this.funcionarios = funcionarios;
	}
}

//Você pode fazer a validação das datas válidas ser 
//chamada já no construtor da classe Data, ao passarmos 
//o dia, o mês e o ano. Nesse momento, a única forma de 
//indicar que houve um erro que você aprendeu é imprimir 
//uma mensagem no terminal avisando, mas, mais para a 
//frente, veremos uma forma muito mais elegante de 
//tratar esses casos.
´
class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (! isDataViavel(dia, mes, ano)) {
            System.out.println("A data " + formata() + " não existe!");
        }
    }

    public String formata() {
        return this.dia+"/"+this.mes+"/"+this.ano;
    }

    private boolean isDataViavel(int dia, int mes, int ano) {
        if (dia <= 0 || mes <= 0) {
            return false;
        }

        int ultimoDiaDoMes = 31; // por padrao são 31 dias
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
            ultimoDiaDoMes = 30;
        } else if (mes == 2) {
            ultimoDiaDoMes = 28;
            if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
                ultimoDiaDoMes = 29;
            }
        }
        if (dia > ultimoDiaDoMes) {
            return false;
        }

        return true;
    }
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
