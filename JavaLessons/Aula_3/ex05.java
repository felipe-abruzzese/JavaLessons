class funcionario{

	String nome;
	int salario;

}
class Programa{

	public static void main (String[] args) {

	funcionario f1 = new funcionario();
	f1.nome = "Ana";
	f1.salario = 100;

	funcionario f2 = f1;

 
	if (f1 == f2){

		System.out.println("iguais");

	}else{

		System.out.println("diferentes");

		} 
	}
}
// O programa retorna "iguais"
