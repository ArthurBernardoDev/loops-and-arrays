// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.
        int num = leitor.nextInt();
        pesquisarNumero(num, elementos);

    }
    public static void pesquisarNumero(int x, int[] numeros) {
        int cont = 0;

        for(cont = 0; cont < numeros.length; cont++) {
            if (numeros[cont] == x) {
                System.out.println("Achei " + x + " na posicao " + cont);
                break;
            }
        }


        if(cont >= numeros.length)
            System.out.println("Numero " + x + " nao encontrado!");
    }
}