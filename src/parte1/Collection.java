package parte1;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collection {
    public static void main(String[] args) {

        List<String> listaNome = new ArrayList<>();
        Ler_o_Teclado teclado = new Ler_o_Teclado();





        System.out.println("****** Tarefa collectin__Parte1 ******");

       String nome=teclado.leitura_Do_Teclado();
       String nomes[]=nome.split(",");

       for(int i=0;i< nomes.length;i++){
       //System.out.println(nomes[i]);
           listaNome.add(nomes[i]);
       }
        Collections.sort(listaNome);
        System.out.println(listaNome);


            }


        }




