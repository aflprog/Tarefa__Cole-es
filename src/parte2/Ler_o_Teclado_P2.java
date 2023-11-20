package parte2;
import java.util.Scanner;

public class Ler_o_Teclado_P2 {
    public  static String leitura_Do_Teclado(){
        Scanner texto=new Scanner(System.in);
        String str;
        System.out.println("Digite o nome que quer cadastrar indicando se masculico com '-M' ou femenino com '-F'(Exemplo:Pamela-F ) ou digite 'sair' se não quiser cadastrar nada ou para finalizar o cadastro ");
        str= texto.nextLine();

   //texto.close();  //se habilitar da erro na segunda leitura de console

        return str;


    }
}

