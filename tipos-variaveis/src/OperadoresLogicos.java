public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1=true;

        boolean condicao2=true;

        if(condicao1&&(7>4)){
            System.out.println("as duas condições são verdadeiras");
        }
        if(condicao1||condicao2){
            System.out.println("uma das condições são verdadeiras");
        }
        System.out.println("fim");
        
    }
}



//Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões. Para isso, aplicamos as operações lógicas E (representado por “&&”) e OU (representado por “||”).