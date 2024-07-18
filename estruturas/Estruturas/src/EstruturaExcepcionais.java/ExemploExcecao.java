
import java.text.NumberFormat;
import java.text.ParseException;

/*Hierarquia das exceções
A linguagem Java, dispõe de uma variedade de classes, que representam exceções e estas classes, são organizadas em uma hierarquia denominadas Checked and Unchecked Exceptions ou Exceções Checadas e Não Checadas. */

public class ExemploExcecao {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Number valor;
        try{
        //valor = Double.valueOf("a1.75");
        valor = NumberFormat.getInstance().parse("a1.75");
        System.out.println(valor);
        
        }catch(ParseException e){
            extracted(e);
        }
       
    }
    private static void extracted(ParseException e) {
        e.printStackTrace(System.err);
    }
}