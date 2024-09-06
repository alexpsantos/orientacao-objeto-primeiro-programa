//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Filme: Top  Gun: Maverick");

        int anoDeLancamento = 2022;

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 9.3 + 8) / 3;
        System.out.println("a media é: " + media);

        System.out.println("o ano de lançamento é: " + anoDeLancamento);

        String sinopse = "Um filme de aventura que foi lançado no ano de " + anoDeLancamento + " com uma nota de " + notaDoFilme;

        // e isso aqui é só um comentario mesmo
        System.out.println(sinopse);

        int classificacao = (int) (media/2);

        System.out.println("classificação do file: " + classificacao + " estrelas");
    }
}