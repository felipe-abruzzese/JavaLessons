class Turma{
	Aluno[] alunos;

	void imprimeNotas(){

	for (int i = 0; i < this.alunos.length; i++){ // Para abarcar qualquer tamanho de array, o termo length abarca o tamanho total do array
		Aluno aluno = this.alunos[i];
		if (aluno == null) continue; //Evita que o java entregue erros nos objetos não cadastrados
		System.out.println(aluno.nota);
		}
	}
}

class Aluno{
	String nome;
	int nota;

}

class TestedaTurma{

	public static void main(String[] args){

		Turma fj11 = new Turma();// Cria 
		fj11.alunos = new Aluno[10];

		fj11.alunos[0] = new Aluno();
		fj11.alunos[0].nome = "Mauricio";
		fj11.alunos[0].nota = 9;

		fj11.alunos[1] = new Aluno();
		fj11.alunos[1].nome = "Marcelo";
		fj11.alunos[1].nota = 7;

		fj11.imprimeNotas();
	}
}
