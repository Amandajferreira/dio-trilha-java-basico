//ESTRUTURA DE REPETIÇÃO 
 /* 
Laços ou repetições são representados pelas seguintes estruturas:
For (para);
While (enquanto);
Do While (faça enquanto).
O comando for (na tradução literal para a língua portuguesa “para”) permite que uma variável contadora, seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. 
A estrutura de sintaxe do controle de repetição for é exibida abaixo: 

//estrutura do controle de fluxo for
for (bloco de inicialização; expressão booleana de validação; bloco de atualização OU INCREMENTAÇÃO > EXEMPLO = ++ && --)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}*/
public class ExemploFor {
    // ExemploFor.java
	public static void main(String[] args) {
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
        System.out.println("joãozinho dormiu..");
    }
}

/*For position

int carneirinhos = 1; -> O programa entende que a variável carneirinhos, começa com o valor igual a 1 e isso acontece somente uma vez;
carneirinhos < = 20; -> O programa verifica se a variável carneirinhos, ainda é menor que 20;
O programa começa a executar o algoritmo, no nosso caso, imprimir a quantidade de carneirinhos em contagem;
carneirinhos ++ -> O programa aumenta em mais 1, o valor da variável carneirinhos;

O fluxo é finalizado, quando a variável carneirinhos for igual a 20.
// Outras estruturas

//estrutura 1
for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
     System.out.println(carneirinhos + " - Carneirinho(s)");
}

//estrutura 2
//o que importa é somente o bloco condicional
int carneirinhos = 1;
for( ; carneirinhos <=20; ) {
     System.out.println(carneirinhos + " - Carneirinho(s)");
     carneirinhos ++;
}

//for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execuç */