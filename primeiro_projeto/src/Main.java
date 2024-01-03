//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Scren Match!");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.5;
        System.out.println("Nota do filme IMDB: " + notaDoFilme);

        double media = 9.8 + 8.5 + 8.0 / 3;
        System.out.println("média: " + media);
        String sinopse;
        //Comentar com barra ou comentar bloco grande /* e finaliza com */
        sinopse = """
                Filme de ação
                Top
                Ótimo
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }

}