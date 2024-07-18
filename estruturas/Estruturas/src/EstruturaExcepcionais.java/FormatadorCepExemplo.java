/*Exceções customizadas
Nós podemos criar nossas próprias exceções baseadas em regras de negócio e assim melhor direcionar quem for utilizar os recursos desenvolvidos no projeto, exemplo:
Imagina que como regra de negócio, para formatar um cep necessita sempre de ter 8 dígitos, caso contrário lançará uma exceção que denominamos de CepInvalidoException. */

public class FormatadorCepExemplo{
 
   public static void main(String[] args) {
     try {
        String cepFormatado = formatarCep("23765064", "23.765064"); 
        System.out.println("cepFormatado");

     } catch(CepInvalidoException e){
     System.out.println("O cep não pode corresponde com as regras de negócios");
   }
}

   static String formatarCep(String cep, String string) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
          //simulando um cep formatado
          return string;
    }}
