public class OperadoresRelacionais {
   public static void main(String[] args) {
      String nomeUm="Amanda";
      String nomeDois="Amanda";
      
      System.out.println(nomeUm == nomeDois);

      int numero1 = 1;
      int numero2= 2; 

      boolean simNao = numero1 == numero2; 

      if(numero1 == numero2){
       System.out.println("a nossa condição e verdadeira");
     }// false

      simNao = numero1 != numero2;
      System.out.println("numeroUm é igual ao numeroDois?" + simNao); // true

      simNao = numero1 > numero2; 

      System.out.println("numeroUm é maior que o numeroDois?" + simNao); // false
   } 
}
