// class ExemploBreakContinue.java
/*Break significa quebrar, parar, frear, interromper. E é isso que se faz, quando o Java encontra esse comando pela frente. Continue, como o nome diz, ele 'continua' o laço. O comando (break) interrompe o laço, já o (continue) interrompe somente a iteração atual.*/

public class ExemploBreakContinue {
	/*public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			break; --> COM O BREAK A CINTAGEM E INTERROMPIDA.
		System.out.println(numero);
	}
	//Qual a saída no console ? 1 e 2

    }*/

    // class ExemploBreakContinue.java
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			continue; //O CONTINUE A CONTAGEM E INTERROMPIDA NO 3 OU SEJA PULA O NUMERO 3, PORÉM CONTINUA A CONTAGEM ATÉ 5.
		
		System.out.println(numero);
	}
	//Qual a saída no console ? 1 2 (3 break)4 5

    }
}

