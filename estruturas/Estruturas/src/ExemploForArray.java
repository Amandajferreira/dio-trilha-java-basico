// ExemploFor.java
public class ExemploForArray {
    public static void main(String[] args) {
        /*  Observe que, como os arrays começam com índice igual a 0 (zero), iniciamos a nossa variável x
também com valor zero e validamos a quantidade de repetições, a partir da quantidade de elementos do array.

        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    
    }*/

    /*For Each
    O uso do 
    for / each
     está fortemente relacionado, com um cenário onde contenha um array ou coleção, e assim , a interação é baseada nos elementos da coleção.*/
   
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
            //Forma abreviada
        for(String aluno : alunos) {
          System.out.println("Nome do aluno é:" + aluno);
        }
    
    }
    }

    /*String aluno : alunos -> De forma abreviada, é criada uma variável nome obtendo um elemento do vetor a cada ocorrência;
    A impressão de cada aluno é realizada.*/

