import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do filme");
        String nomeFilme = leitura.nextLine();

        System.out.println("Digite o ano de lançamento do filme");
        Integer anoLancamentoFilme = leitura.nextInt();

        System.out.println("Digite a nota do filme");
        Double notaFilme = leitura.nextDouble();

        System.out.println("Nome do filme: " + nomeFilme);
        System.out.println("Ano de laçamento do filme: " + anoLancamentoFilme);
        System.out.println("Nota do filme: " + notaFilme);


    }



}


