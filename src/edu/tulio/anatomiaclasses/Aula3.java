package edu.tulio.anatomiaclasses;

public class Aula3 {

    public static void main(String[] args) {

        /*
        Declarando variáveis:

        ° Declaração de variável em java segue a estrutura abaixo:

            Tipo NomeVariavel = Atribuição (opicional em alguns casos)

            Exemplo:

            int idade = 23;
            double altura = 1.70;
         */

        String nome;
        int anoFrabicacao = 2022;
        boolean ativo = true;

        /*
        Declarando métodos:

        ° Declaração de método em java segue a estrutura abaixo:

            TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

            Exemplo:

            int somar (int numero1, int numero2)
         */
        
        int numero1 = 5,numero2 = 10;

        // Return do método somar()
        System.out.println(somar (numero1,numero2));
    }

    // Declaração do Método somar

    public static int somar(int numero1, int numero2){
        
        return numero1 + numero2;
        
    }

}
