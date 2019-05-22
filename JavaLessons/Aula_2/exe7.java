class exe7{
	public static void main(String[] args){
		
		int fator_1 = 1;
		long fator_2 = 1;
		for(int i=1; i<=40;i++){
			
			fator_1 = fator_1*i;
			fator_2 = fator_2*i;
			System.out.println("O fatorial de "+ i +" com a variável int é " +fator_1);
			System.out.println("o fatorial de "+ i +" com a variável long é " +fator_2);

		}
	}
}
