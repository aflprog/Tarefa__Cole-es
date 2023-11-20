package parte2;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collection_P2 {
    public static void main(String[] args) {
        List<String> listaNome = new ArrayList<>();
        List<String> listaDeHomens = new ArrayList<>();
        List<String> listaDeMulheres = new ArrayList<>();
        Ler_o_Teclado_P2 teclado = new Ler_o_Teclado_P2();
        String nome=" ";
        boolean a=true;




        while (a) {
            System.out.println("****** Tarefa collectin__Parte2 ******");

            nome = teclado.leitura_Do_Teclado();



            if (nome.equalsIgnoreCase("sair")) {


                Collections.sort(listaDeHomens);

                Collections.sort(listaDeMulheres);


                Collections.sort(listaDeHomens);
                Collections.sort(listaDeMulheres);
                System.out.println(" Lista de Homens " + listaDeHomens);
                System.out.println(" Lista de Mulheres " + listaDeMulheres);

                a=false;


            } else {


                String[] partes = nome.split("-");


                if (partes.length == 2) {

                    String nome1 = partes[0];


                    String genero = partes[1];


                    if (genero.equalsIgnoreCase("M")) {

                        listaDeHomens.add(nome1);

                    }


                    if (genero.equalsIgnoreCase("F")) {

                        listaDeMulheres.add(nome1);


                    }


                }
            }
        }
    }
}






