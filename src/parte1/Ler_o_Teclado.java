package parte1;

import java.util.Scanner;

public class Ler_o_Teclado {
    public  static String leitura_Do_Teclado(){
        Scanner texto=new Scanner(System.in);
        String str;
        System.out.println("Digite o nome que quer cadastrar separando-os com virgula: ");
        str= texto.nextLine();

//texto.close();  //se habilitar da erro na segunda leitura de console

        return str;


    }
}
