import org.w3c.dom.ls.LSOutput;

public class Exercio01 {

    public static void main(String[] args) {

        System.out.println("Conversao de C para F:");
        int temperaturaEmCelsiu= 45;
        System.out.println("temperatura em Celsius: " + temperaturaEmCelsiu);
        System.out.println("Conversao para Fahrenheit  ");

        double conversao =(temperaturaEmCelsiu * 1.8)+ 32;
        System.out.println( "O valor convertido é: " + conversao);

        String conversor;
        conversor = """
                 O valor de 45 Graus Celsius
                  equivale à """ + conversao;
        System.out.println(conversor);



           /*
        Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula com o seguinte desafio:

    Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.

    Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é:(temperatura * 1.8) + 32.

    Depois de finalizar, testar e conferir que seu programa foi executado com sucesso, crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais. Lembre-se que provavelmente você precisará fazer um casting de valores.*/

    }
}
